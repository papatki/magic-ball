package com.patpaw.service;

import com.patpaw.model.MagicBall;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MagicBallServiceImplTest {

    @Test
    void shouldHaveProperErrorMessage() {
        try {
            new MagicBallServiceImpl().getRandomNumber(20, 1);
            fail("exception wasn't thrown");

        } catch (IllegalArgumentException e) {
            assertEquals("max must be greater than min", e.getMessage());
        }
    }

    @Test
    void getAnswer() {
        assertNotNull(new MagicBallServiceImpl().getAnswer(new MagicBall().makeABall()));
    }
}