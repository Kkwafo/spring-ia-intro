package kkawua.spring_ia.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OpenAIServiceImplTest {

    @Autowired
    OpenAiService openAiService;

    @Test
    void getAnswer() {
        String answer = openAiService.getAnswer("Tell me a dad joke");
        System.out.println("Got the answer: ");
        System.out.println(answer);
    }
}
