package com.demo.dao;

import com.demo.ds.FormattedReport;
import com.demo.ds.Report;

public interface ReportDao {
    Report save(FormattedReport formattedReport);
}