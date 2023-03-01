package com.example.Score.service;

import com.example.Score.jpa.ScoreRepository;
import com.example.Score.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImp implements ScoreService{

    @Autowired
    private ScoreRepository scoreRepository;

    @Override
    public  Score getScore(int sid) {
        return scoreRepository.findById(sid).orElse(null);
    }

    @Override
    public Score save(Score score) {
        return scoreRepository.save(score);
    }

    @Override
    public String delete(int sid) {
        scoreRepository.deleteById(sid);
        return "Deleted"+sid;
    }
}
