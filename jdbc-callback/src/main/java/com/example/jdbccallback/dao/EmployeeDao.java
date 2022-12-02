package com.example.jdbccallback.dao;

import com.example.jdbccallback.ds.Employee;
import lombok.SneakyThrows;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public EmployeeDao(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);

    }
    public List<String> listEmail(){
        return jdbcTemplate.queryForList("select email from employee"
                , String.class);
    }
    public List<Employee> listEmployee(){
        return jdbcTemplate.query("select * from employee",
                this::mapEmployee
        );
    }
    class EmployeeAverageResultSetExtractor implements ResultSetExtractor<Double>{

        @Override
        public Double extractData(ResultSet rs) throws SQLException, DataAccessException {
            double total = 0;
            int count = 0;
            while (rs.next()){
                total += rs.getDouble("salary");
                count++;
            }
            return total / count;
        }
    }
    public void createEmployee(int id, String firstName,String lastName, String email, double salary){
        jdbcTemplate.update("insert into employee(id, first_name, last_name, email, salary)values" +
                        "(?,?,?,?,?)",
                id,
                firstName,
                lastName,
                email,
                salary);
    }
    public void createEmployeeV2(){
        jdbcTemplate.execute("insert into employee values (8,'Lwin Lwin','Than','than@gmail.com',4000)");
    }
    public void deleteEmployeeById(int id){
        jdbcTemplate.update("delete from employee where id = ?",
                new Object[]{id});
    }
    public double averageEmployeeSalaryResultSetExtractor(){
        EmployeeAverageResultSetExtractor obj =
                new EmployeeAverageResultSetExtractor();
        return jdbcTemplate.query("select salary from employee",
                obj);
    }
    public int findEmployeeIdByEmail(String email){
        return jdbcTemplate.query(
                new PreparedStatementCreator() {
                    @Override
                    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                        return con.prepareStatement("select id from employee where email = ?");
                    }
                },
                new PreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement ps) throws SQLException {
                        ps.setString(1, email);
                    }
                },
                new ResultSetExtractor<Integer>() {
                    @Override
                    public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
                        if(rs.next()){
                            return rs.getInt("id");
                        }else
                            throw new IllegalArgumentException(email + "Not Found!");
                    }
                }
        );
    }
    class EmployeeAverageSalaryRowCallBackHandler implements RowCallbackHandler{
        double total;
        int count;
        @Override
        public void processRow(ResultSet rs) throws SQLException {
            total += rs.getDouble("salary");
            count++;
        }
        public double averageSalary(){
            return total / count;
        }
    }
    public double averageDatabaseLevel(){
        return jdbcTemplate.queryForObject("select avg(salary) from employee",Double.class);
    }
    public double averageModernWay(){
        return jdbcTemplate.queryForList("select salary from employee",Double.class)
                .stream()
                .mapToDouble(s -> s)
                .average().getAsDouble();
    }
    public double averageEmployeeSalaryRowCallBackHandler(){
        EmployeeAverageSalaryRowCallBackHandler obj =
                new EmployeeAverageSalaryRowCallBackHandler();
         jdbcTemplate.query("select salary from employee",
                 obj);
        return obj.averageSalary();
    }
    @SneakyThrows
    private Employee mapEmployee(ResultSet rs, int i){
        return new Employee(
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getDouble("salary")
        );
    }
}
