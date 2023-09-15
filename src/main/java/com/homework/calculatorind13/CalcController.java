package com.homework.calculatorind13;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    private final CalculatorService calculatorService;

    public CalcController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calcGreeting() {
        return calculatorService.calcGreeting();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.divide(num1, num2);
    }
}
