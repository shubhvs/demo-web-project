package edu.cpp.cs580;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import edu.cpp.cs580.data.provider.JDBCConnManager;
import edu.cpp.cs580.data.provider.JDBCManager;
import edu.cpp.cs580.data.provider.PatientManager;
import edu.cpp.cs580.data.provider.UCPatientManager;
import edu.cpp.cs580.data.provider.URLlinkManager;

import edu.cpp.cs580.data.provider.urlInfo;

@Configuration
@EnableAutoConfiguration
@ComponentScan

public class App {

	//private static final Logger logger = LoggerFactory.getLogger(App.class.getName());
    /**
     * This is a good example of how Spring instantiates
     * objects. The instances generated from this method
     * will be used in this project, where the Autowired
     * annotation is applied.
     
    @Bean
    public UserManager userManager() {
        UserManager userManager =  new FSUserManager();
        return userManager;
    }
    
    @Bean
    public GpsProductManager gpsProductManager() {
    		GpsProductManager gpsManager = new EBayGpsProductManager();
    		return gpsManager;
    }

    @Bean
    public URLlinkManager urllinkManager() {
    	URLlinkManager urlInfo2Manager = new urlInfo();
    		return urlInfo2Manager;
    }
    
  
   ********************************************************
    * ******************************************************
    * *******************************************************
    ********************************************************
  @Bean 
   
   public JDBCConnManager jdbcManager(){
	   JDBCConnManager jconnection = new JDBCManager();
	   return jconnection;
   }
  */
    
    @Bean
    public PatientManager ucpatientManager(){
    	PatientManager patientManager = new UCPatientManager();
    	return patientManager;
    }
    /**
     * This is the running main method for the web application.
     * Please note that Spring requires that there is one and
     * ONLY one main method in your whole program. You can create
     * other main methods for testing or debugging purposes, but
     * you cannot put extra main method when building your project.
     */
    public static void main(String[] args) throws Exception {
        // Run Spring Boot
        SpringApplication.run(App.class, args);
    }
}
