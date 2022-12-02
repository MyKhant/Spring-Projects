package com.demo.format;

import com.demo.annotation.DbProfile;
import com.demo.ds.FormattedReport;
import com.demo.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @DbProfile
public class DbReportFormatter implements ReportFormatter{
    @Override
    public FormattedReport format(Report report) {
        System.out.println(this.getClass().getSimpleName()+ " Format Report :");
        return new FormattedReport();
    }
}
