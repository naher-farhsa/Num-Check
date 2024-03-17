package com.example.com.naher_farhsa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class NumbersAPIController {

    @Autowired
    private NumbersAPIService numbersAPIService;

    @GetMapping("/NumbersAPI/date/{date1}/{date2}")
    public String datefact(@PathVariable("date1") String num1,@PathVariable("date2") String num2) throws IOException, InterruptedException {
         return numbersAPIService.datefactService(num1, num2);
    }
    @GetMapping("/NumbersAPI/math/{math1}/{math2}")
    public String mathfact(@PathVariable("math1") String num1,@PathVariable("math2") String num2) throws IOException, InterruptedException {
        return numbersAPIService.mathfactService(num1, num2);
    }
    @GetMapping("/NumbersAPI/trivia/{trivia1}/{trivia2}")
    public String triviafact(@PathVariable("trivia1") String num1,@PathVariable("trivia2") String num2) throws IOException, InterruptedException {
        return numbersAPIService.triviafactService(num1, num2);
    }
    @GetMapping("/NumbersAPI/year/{year1}/{year2}")
    public String yearfact(@PathVariable("year1") String num1,@PathVariable("year2") String num2) throws IOException, InterruptedException {
        return numbersAPIService.yearfactService(num1, num2);
    }

}
