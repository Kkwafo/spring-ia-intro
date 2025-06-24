package kkawua.spring_ia.controllers;

import kkawua.spring_ia.model.Answer;
import kkawua.spring_ia.model.GetCapitalRequest;
import kkawua.spring_ia.model.Question;
import kkawua.spring_ia.services.OpenAiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final OpenAiService openAiService;
    public QuestionController (OpenAiService openAiService){
        this.openAiService = openAiService;
    }
    @PostMapping("/capital")
    public Answer askQuestion(@RequestBody GetCapitalRequest getCapitalRequest){
        return openAiService.getCapital(getCapitalRequest);
    }
    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question){
        return openAiService.getAnswer(question);
    }
}
