package com.example.Score.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="score")
public class Score {

    @Id
    private int sid;

    @Column(name="value")
    private String value;

    public Score(int i, String s) {
    }

}
