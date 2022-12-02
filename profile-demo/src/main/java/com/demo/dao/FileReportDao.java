package com.demo.dao;

import com.demo.ds.FormattedReport;
import com.demo.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @Profile("file")
public class FileReportDao implements ReportDao{
    @Override
    public Report save(FormattedReport formattedReport) {
        System.out.println(this.getClass().getSimpleName()+ " save FormattedReport :");
        return new Report();
    }
}
