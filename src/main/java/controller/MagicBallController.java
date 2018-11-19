package controller;

import model.MagicBall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.MagicBallService;


@Controller
public class MagicBallController {

    private final MagicBallService magicBallService;
    private  MagicBall magicBall = new MagicBall();

    @Autowired
    public MagicBallController(MagicBallService magicBallService) {
        this.magicBallService = magicBallService;
    }

    // TODO: 11/19/18 1.controllers for home view and answer view
    // TODO: 11/19/18 2.thymeleaf templates for controllers
    // TODO: 11/19/18 3.css stylesheet for templates





}
