package com.demo.format;

import com.demo.ds.FormattedReport;
import com.demo.ds.Report;

public interface ReportFormatter {
    FormattedReport format(Report report);
}
