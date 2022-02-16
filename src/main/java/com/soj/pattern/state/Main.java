package com.soj.pattern.state;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger= LogManager.getLogger(Main.class.getName());
    public static void main(String[] args){

        LightBulb lightBulb=new LightBulb();
        String display1=lightBulb.displayState();
       logger.debug(display1);
       lightBulb.toggle();
       String display2=lightBulb.displayState();
       logger.debug(display2);

    }

//gradle sonarqube
//            -Dsonar.projectKey=StatePattern
//            -Dsonar.host.url=http://localhost:9000
//            -Dsonar.login=b9aaf0b840472f4242635c3f29e7a7ea35ba2fab
}
