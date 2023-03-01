package com.example.Score.service;

import com.example.Score.model.Score;

public interface ScoreService {

    Score getScore(int sid);

    Score save(Score score);

    String delete(int sid);
}
