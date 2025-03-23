package com.sanjay.Gemini_Chat.controller;

import com.sanjay.Gemini_Chat.service.QnaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/query")
@AllArgsConstructor
public class Aicontroller {

    private final QnaService qservice;

    @PostMapping("/ask")
    public ResponseEntity<String> fetch(@RequestBody Map<String,String> payload)
    {
            String question=payload.get("question");
            String answer=qservice.getAnswer(question);
            return ResponseEntity.ok(answer);
    }

}
