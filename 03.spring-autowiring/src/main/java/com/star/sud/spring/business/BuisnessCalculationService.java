package com.star.sud.spring.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
public class BuisnessCalculationService {

  // @Autowired // Type
   // @Qualifier("mySQLDataService")
    public DataService dataService;

    // Constructor
    public BuisnessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

//    public BuisnessCalculationService(@Qualifier("mySQLDataService") DataService dataService) {
//        this.dataService = dataService;
//    }

    // Setter
//    @Autowired
//    public void setDataService(@Qualifier("mySQLDataService") DataService dataService) {
//        this.dataService = dataService;
//    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
