package com.cognizant.account.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.AccountApplication;
import com.cognizant.account.model.Account;

@RestController

public class AccountController {
	private static Logger LOGGER = LoggerFactory.getLogger(AccountApplication.class);
	@GetMapping("accounts/{number}")
	public Account getAccountDetails(@PathVariable String number) {
		Account account=new Account(number,"savings",234343);
		return account;
		
	}
}
