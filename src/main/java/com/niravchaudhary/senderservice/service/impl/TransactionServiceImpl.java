package com.niravchaudhary.senderservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.niravchaudhary.senderservice.dto.Transaction;
import com.niravchaudhary.senderservice.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void sendToQueue(Transaction transaction) {
		restTemplate.postForEntity("http://localhost:8080/receiver-service/transaction", transaction,ResponseEntity.class );
	}

}
