package com.dt.learningtrial.learningtrialbookingjpa.july02.service;

import com.dt.learningtrial.learningtrialbookingjpa.july02.entity.Answer;
import com.dt.learningtrial.learningtrialbookingjpa.july02.repository.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    @Autowired
    AnswerRepo answerRepo;

    public List<Answer> addAnswer(List<Answer> answer) {
        return answerRepo.saveAll(answer);
    }
}
