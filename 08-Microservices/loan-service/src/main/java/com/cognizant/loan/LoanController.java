package com.cognizant.loan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/** Loan microservice: exposes loan details by number. */
@RestController
public class LoanController {

    private final Map<String, Loan> loans = new HashMap<>();

    public LoanController() {
        loans.put("L-501", new Loan("L-501", "Home", 500000.0, 240));
        loans.put("L-502", new Loan("L-502", "Car", 800000.0, 60));
    }

    @GetMapping("/loans/{number}")
    public Loan getLoan(@PathVariable String number) {
        return loans.getOrDefault(number,
                new Loan(number, "UNKNOWN", 0.0, 0));
    }
}
