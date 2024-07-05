package com.dt.learningtrial.learningtrialbookingjpa.july02.service;

import com.dt.learningtrial.learningtrialbookingjpa.july02.entity.Question;
import com.dt.learningtrial.learningtrialbookingjpa.july02.repository.QuestionRepo;
import jakarta.persistence.CascadeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    @Autowired
    AnswerService answerService;

    public Question addQuestion(Question question) {

        /*
        //  If cascade = CascadeType.ALL Or PERSIST,
        //  below line do not need to especially declare.
        */

        // answerService.addAnswer(question.getAnswer());
        return questionRepo.save(question);
    }

    public List<Question> getAllQuestion(){
        return questionRepo.findAll();
    }

    public Optional<Question> getQandAById(Long id) {
        return questionRepo.findById(id);
    }

    public void deleteQuestionAndAnswer(Long id) {
        questionRepo.deleteById(id);
    }

}
