package com.niravchaudhary.senderservice.service;

import com.niravchaudhary.senderservice.dto.Transaction;

public interface TransactionService {
	
	public void sendToQueue(Transaction transaction);

}
