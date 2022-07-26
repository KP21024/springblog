package com.example.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.ThreadLocalRandom;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String roll() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String rollResult(@PathVariable int n, Model model) {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);

        if (randomNum == n ) {
            model.addAttribute("n", n + " YOU WIN");
        } else {
            model.addAttribute("n", n + "YOU LOSE");
        }
        return "roll-dice-result";
    }
}
