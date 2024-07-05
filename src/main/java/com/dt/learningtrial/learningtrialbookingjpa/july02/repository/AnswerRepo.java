package com.dt.learningtrial.learningtrialbookingjpa.july02.repository;

import com.dt.learningtrial.learningtrialbookingjpa.july02.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepo extends JpaRepository<Answer, Long> {
}
