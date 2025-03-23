package com.sanjay.Gemini_Chat.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Service
public class QnaService {
    private final WebClient webClient;
    @Value("${gemini.api.url}")
    private String geminiApiUrl;
    @Value("${gemini.api.key}")
    private String gaminiApiKey;

    public QnaService(WebClient.Builder webClient) {
        this.webClient = webClient.build();
    }

    public String getAnswer(String question) {
        //we need to access gemini through api url and api key
        Map<String,Object> requestbody =Map.of(
                "contents",new Object[] {
                        Map.of("parts",new Object[]{
                                Map.of("text", question)
                        })
                }
        );





        //pass a question to the google gemini
        //create a payload structure
        //make api call
       String response= webClient.post()
                .uri(geminiApiUrl+gaminiApiKey)
                .header("Content-Type","application/json")
                .bodyValue(requestbody)
                .retrieve()
                .bodyToMono(String.class)
                .block();


        //return response
       /* {
            "contents": [{ "parts":[{"text": "Explain how AI works"}]  }]


        }*/
        return response;
    }
}
