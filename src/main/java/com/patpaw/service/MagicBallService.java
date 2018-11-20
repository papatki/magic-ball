package com.patpaw.service;

import com.patpaw.model.MagicBall;

import java.util.Map;

public interface MagicBallService {
    String getAnswer(Map<Integer, String> magicBall);
    int getRandomNumber(int min, int max);
//    Map<Integer, String> getMagicBall();

}
