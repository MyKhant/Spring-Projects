package com.demo.service;

import com.demo.dao.ReportDao;
import com.demo.ds.Report;
import com.demo.format.ReportFormatter;
import org.springframework.stereotype.Service;

@Service
public class ComplexAction {
    private final ReportFormatter reportFormatter;
    private final ReportDao reportDao;

    public ComplexAction(ReportFormatter reportFormatter, ReportDao reportDao) {
        this.reportFormatter = reportFormatter;
        this.reportDao = reportDao;
    }
    public void makeAction(){
       reportDao.save(reportFormatter.format(new Report()));
    }
}
