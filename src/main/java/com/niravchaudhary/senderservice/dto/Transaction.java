package com.niravchaudhary.senderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    private Long transactionId;
    private Long accountNumber;
    private String type;
    private Double amount;
    private String currency;
    private Long accountFrom;

}
