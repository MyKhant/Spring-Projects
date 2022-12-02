package com.demo.provider;

import com.demo.annotation.PerformanceLogger;
import com.demo.ds.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportProvider {
    @PerformanceLogger
    public Report provide(){
        System.out.println(this.getClass().getSimpleName()+" provided Report.");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return new Report();
    }
}
