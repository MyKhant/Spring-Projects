package com.demo.dao;

import com.demo.ds.FormattedReport;
import org.springframework.stereotype.Component;

@Component
public class ReportDao {
    public void save(FormattedReport formattedReport){

        System.out.println(this.getClass().getSimpleName()+" save FormattedReport.");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
