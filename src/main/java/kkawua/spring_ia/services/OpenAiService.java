package kkawua.spring_ia.services;

import kkawua.spring_ia.model.Answer;
import kkawua.spring_ia.model.GetCapitalRequest;
import kkawua.spring_ia.model.Question;

public interface OpenAiService {
    // Define method signatures for the service

    String getAnswer(String question);
    Answer getAnswer(Question question);

    Answer getCapital(GetCapitalRequest getCapitalRequest);
}
