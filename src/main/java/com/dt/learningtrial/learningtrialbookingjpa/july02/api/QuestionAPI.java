package com.dt.learningtrial.learningtrialbookingjpa.july02.api;

import com.dt.learningtrial.learningtrialbookingjpa.july02.entity.Answer;
import com.dt.learningtrial.learningtrialbookingjpa.july02.entity.Question;
import com.dt.learningtrial.learningtrialbookingjpa.july02.service.AnswerService;
import com.dt.learningtrial.learningtrialbookingjpa.july02.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("july02")
public class QuestionAPI {

    @Autowired
    QuestionService questionService;

    @Autowired
    AnswerService answerService;

    @PostMapping("addQuestion")
    public Question addQuestion(@RequestBody Question question ) {
        return questionService.addQuestion(question);

    }

    @GetMapping("getAllQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestion();
    }

    /*
    //   Example of FetchType.LAZY:
    //   Just returning answers so made hit on Answers table
    */
    @GetMapping("/getQandAById")
    public List<Answer> getQandAById(@RequestParam("id") Long id){
        Optional<Question> qandADetailById = questionService.getQandAById(id);
        return qandADetailById.get().getAnswer();
    }

    /*
    //   Example of FetchType.LAZY:
    //   Just returning question so no hit for answer table
    */
    @GetMapping("/getOnlyQuestionDetailsById")
    public String getOnlyQuestionDetailsById(@RequestParam("id") Long id){
        Optional<Question> question = questionService.getQandAById(id);
        return question.get().getQuestion();

        //EAGER:Hibernate: select q1_0.question_id,q1_0.category,q1_0.question,a1_0.question_question_id,a1_1.answer_id,a1_1.answer from question q1_0 left join question_answer a1_0 on q1_0.question_id=a1_0.question_question_id left join answer a1_1 on a1_1.answer_id=a1_0.answer_answer_id where q1_0.question_id=?
        //Lazy:Hibernate: select q1_0.question_id,q1_0.category,q1_0.question from question q1_0 where q1_0.question_id=?
    }

    /*
    //   Example of CascadeType.PERSIST and All:
    //   PERSIST: when Question is deleted, answers not impacted
    //   All: when Question is deleted, answers also be deleted
    */
    @DeleteMapping("/deleteQuestionAndAnswer")
    public void deleteQuestionAndAnswer(@RequestParam("id") Long id){
        questionService.deleteQuestionAndAnswer(id);
    }

}
