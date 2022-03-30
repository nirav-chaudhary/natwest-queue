package com.niravchaudhary.senderservice.service.impl;

import com.niravchaudhary.senderservice.dto.Transaction;
import com.niravchaudhary.senderservice.service.TransactionService;

public class TransactionServiceImpl implements TransactionService{

	@Override
	public void sendToQueue(Transaction transaction) {
		//TODO add logic to send the transaction i.e. to call the end point of other API
	}

}
