package com.demo.dao;

import com.demo.annotation.DbProfile;
import com.demo.ds.FormattedReport;
import com.demo.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @DbProfile
public class DbReportDao implements ReportDao{
    @Override
    public Report save(FormattedReport formattedReport) {
        System.out.println(this.getClass().getSimpleName()+ " save FormattedReport :");
        return new Report();
    }
}
