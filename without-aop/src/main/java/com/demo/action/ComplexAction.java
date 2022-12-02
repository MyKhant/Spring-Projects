package com.demo.action;

import com.demo.dao.ReportDao;
import com.demo.ds.FormattedReport;
import com.demo.ds.Report;
import com.demo.format.ReportFormatter;
import com.demo.logger.PerformanceLogger;
import com.demo.provider.ReportProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static com.demo.logger.PerformanceLogger.PerformanceLoggerInfo;

@Component
public class ComplexAction {
    @Autowired
    private ReportProvider reportProvider;
    @Autowired
    private ReportFormatter reportFormatter;
    @Autowired
    private ReportDao reportDao;
    public void takeAction(){
        PerformanceLoggerInfo info;
        PerformanceLogger logger= new PerformanceLogger();

        info = logger.startTime("reportProvider.provide()");
        Report report = reportProvider.provide();
        logger.testPerformance(info);

        info = logger.startTime("reportFormatted.format(report)");
        FormattedReport formattedReport = reportFormatter.format(report);
        logger.testPerformance(info);

        info = logger.startTime("reportDao.save(formattedReport)");
        reportDao.save(formattedReport);
        logger.testPerformance(info);
    }
}
