package com.patpaw.model;

import java.util.HashMap;
import java.util.Map;

public class MagicBall {

    private  Map<Integer, String> magicBall = new HashMap<>();

    public Map<Integer, String> makeABall() {
        magicBall = new HashMap<>();
        magicBall.put(1, "It is certain.");
        magicBall.put(2,"It is decidedly so.");
        magicBall.put(3, "Without a doubt.");
        magicBall.put(4, "Yes - definitely.");
        magicBall.put(5, "You may rely on it.");
        magicBall.put(6, "As I see it, yes.");
        magicBall.put(7,"Most likely.");
        magicBall.put(8, "Outlook good.");
        magicBall.put(9, "Yes.");
        magicBall.put(10, "Signs point to yes.");
        magicBall.put(11, "Reply hazy, try again.");
        magicBall.put(12,"Ask again later.");
        magicBall.put(13, "Better not tell you now.");
        magicBall.put(14, "Cannot predict now.");
        magicBall.put(15, "Concentrate and ask again.");
        magicBall.put(16, "Don't count on it.");
        magicBall.put(17,"My reply is no.");
        magicBall.put(18, "My sources say no.");
        magicBall.put(19, "Outlook not so good.");
        magicBall.put(20, "Very doubtful.");
        return magicBall;
    }

}
