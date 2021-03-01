package com.cognizant.loan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.loan.LoanApplication;
import com.cognizant.loan.model.Loan;

@RestController
public class LoanController {
	private static Logger LOGGER = LoggerFactory.getLogger(LoanApplication.class);
	@GetMapping("loans/{number}")
	public Loan getAccountDetails(@PathVariable String number) {
		Loan loan=new Loan(number, "house", 2000000, 10000, 20);
		return loan;
	}

}
