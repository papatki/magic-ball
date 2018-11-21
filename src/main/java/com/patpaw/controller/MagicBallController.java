package com.patpaw.controller;

import com.patpaw.model.MagicBall;
import com.patpaw.util.AttributeNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.patpaw.service.MagicBallService;
import com.patpaw.util.Mappings;
import com.patpaw.util.ViewNames;

@Controller
public class MagicBallController {

    private final MagicBallService magicBallService;
    private  MagicBall magicBall = new MagicBall();

    @Autowired
    public MagicBallController(MagicBallService magicBallService) {
        this.magicBallService = magicBallService;
    }

    @RequestMapping(Mappings.GET_ANSWER)
    public String getAnswer(Model model) {
        model.addAttribute(AttributeNames.RESULT, magicBallService.getAnswer(magicBall.makeABall()));
        return ViewNames.GET_ANSWER;
    }

}
