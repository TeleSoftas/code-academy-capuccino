package com.telesoftas.drinkingcappuccino.controllers;

import com.telesoftas.drinkingcappuccino.services.CoffeeMachineService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = CoffeeMachineController.ROUTE)
public class CoffeeMachineController {

    static final String ROUTE = "/cappuccino";

    private final CoffeeMachineService coffeeMachine;

    public CoffeeMachineController(CoffeeMachineService coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @GetMapping
    public String showCappuccinoStatistics(Model model) {
        model.addAttribute("cappuccino", coffeeMachine.showCappuccinoStatistics());
        return "cappuccino";
    }

    @PostMapping(params = "calculate")
    public String incrementCappuccinoCups() {
        coffeeMachine.incrementCappuccinoCups();
        return "redirect:" + ROUTE;
    }

    @PostMapping(params = "reset")
    public String reset() {
        coffeeMachine.reset();
        return "redirect:" + ROUTE;
    }
}
