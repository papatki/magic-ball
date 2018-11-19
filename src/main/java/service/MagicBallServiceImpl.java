package service;

import model.MagicBall;

import java.util.Map;
import java.util.Random;

public class MagicBallServiceImpl implements MagicBallService {

//    @Override
//    public Map<Integer, String> getMagicBall() {
//        return (Map<Integer, String>) new MagicBall();
//    }

    @Override
    public String getAnswer(Map<Integer, String> magicBall) {
        int key = getRandomNumber(1, magicBall.size());
        return magicBall.get(key);
    }


    @Override
    public int getRandomNumber(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
