package com.genesys.queueanalyser.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
 

/*
 * ApplicationContextProvider.java
 * Class description goes here.
 * 
 * @author suresh
 */

public class ApplicationContextProvider implements ApplicationContextAware {  
   
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {  
        // Wiring the ApplicationContext into a static method  
        AppContext.setApplicationContext(ctx);  
    }  
}