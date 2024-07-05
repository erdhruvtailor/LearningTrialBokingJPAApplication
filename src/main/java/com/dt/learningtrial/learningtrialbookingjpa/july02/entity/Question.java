package com.dt.learningtrial.learningtrialbookingjpa.july02.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Question {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long questionId;
    private String question;
    private String category;


    /*
    // Example of fetch = FetchType.LAZY/EAGER
    // PERSIST: when Question is deleted, answers not impacted
    // All: when Question is deleted, answers also be deleted

    //  If cascade = CascadeType.ALL Or PERSIST,
    //  child entity do not need to special insert.
    */

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Answer> answer;


}
