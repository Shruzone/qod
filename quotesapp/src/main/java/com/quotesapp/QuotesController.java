package com.quotesapp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class QuotesController {

    @RequestMapping("/")
    String getQuoteOfTheDay() {
        // Create a RestTemplate instance
        RestTemplate restTemplate = new RestTemplate();

        // Make a GET request to the API
        String apiUrl = "https://zenquotes.io/api/today";      //To generate Quote of the day.
        // String apiUrl = "https://zenquotes.io/api/random";  //To generate Random Quotes.
        String response = restTemplate.getForObject(apiUrl, String.class);

        // System.out.println(response.toString());

        return response;
    }

}
