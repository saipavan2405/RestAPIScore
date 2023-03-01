package com.example.Score.controller;

import com.example.Score.model.Score;
import com.example.Score.service.ScoreService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/v1/score")
@Data
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("{sid}")
    public Score get(@PathVariable Integer sid){return scoreService.getScore(sid);}

    @PostMapping()
    public ResponseEntity<Void> add(@RequestBody Score score){
        scoreService.save(score);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{sid}")
    public ResponseEntity<Void> delete(@PathVariable int sid){
        scoreService.delete(sid);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
