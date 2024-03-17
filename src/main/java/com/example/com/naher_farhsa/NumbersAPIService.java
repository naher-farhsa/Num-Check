package com.example.com.naher_farhsa;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;


@Service
public class NumbersAPIService {


    public String datefactService(String num1, String num2) throws IOException, InterruptedException {
        String x = "https://numbersapi.p.rapidapi.com/" + num1 + "/" + num2 + "/date?fragment=true&json=true";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(x))
                .header("X-RapidAPI-Key", "e9f830996bmsh1f1da821e7faa45p1c1f5bjsn3e67a7482f3a")
                .header("X-RapidAPI-Host", "numbersapi.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public String mathfactService(String num1, String num2) throws IOException, InterruptedException {
        String x = "https://numbersapi.p.rapidapi.com/" + num1 + "/" + num2 + "/date?fragment=true&json=true";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(x))
                .header("X-RapidAPI-Key", "e9f830996bmsh1f1da821e7faa45p1c1f5bjsn3e67a7482f3a")
                .header("X-RapidAPI-Host", "numbersapi.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();

    }


    public String triviafactService(String num1, String num2) throws IOException, InterruptedException {
        String x = "https://numbersapi.p.rapidapi.com/" + num1 + "/" + num2 + "/date?fragment=true&json=true";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(x))
                .header("X-RapidAPI-Key", "e9f830996bmsh1f1da821e7faa45p1c1f5bjsn3e67a7482f3a")
                .header("X-RapidAPI-Host", "numbersapi.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
         return response.body();

    }

    public String yearfactService(String num1, String num2) throws IOException, InterruptedException {
        String x = "https://numbersapi.p.rapidapi.com/" + num1 + "/" + num2 + "/date?fragment=true&json=true";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://numbersapi.p.rapidapi.com/1492/year?fragment=true&json=true"))
                .header("X-RapidAPI-Key", "e9f830996bmsh1f1da821e7faa45p1c1f5bjsn3e67a7482f3a")
                .header("X-RapidAPI-Host", "numbersapi.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
         return response.body();

    }


}
