package com.demo.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Knight {

    @Autowired @Qualifier("dragon")
    private Quest quest;

    public String goQuest(){
        return quest.goQuest();
    }

}
