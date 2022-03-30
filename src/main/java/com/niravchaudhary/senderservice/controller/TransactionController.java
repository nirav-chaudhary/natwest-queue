package com.niravchaudhary.senderservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niravchaudhary.senderservice.dto.Transaction;
import com.niravchaudhary.senderservice.service.TransactionService;

@RestController
@RequestMapping("sender-service/transaction")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> sendTransactionToQueue(@RequestBody Transaction transaction ){
    	transactionService.sendToQueue(transaction);
        return ResponseEntity.ok().build();
    }
}
