package com.cognizant.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/** Account microservice: exposes account details by number. */
@RestController
public class AccountController {

    private final Map<String, Account> accounts = new HashMap<>();

    public AccountController() {
        accounts.put("1001", new Account("1001", "Savings", 25000.0));
        accounts.put("1002", new Account("1002", "Checking", 8500.0));
    }

    @GetMapping("/accounts/{number}")
    public Account getAccount(@PathVariable String number) {
        return accounts.getOrDefault(number,
                new Account(number, "UNKNOWN", 0.0));
    }
}
