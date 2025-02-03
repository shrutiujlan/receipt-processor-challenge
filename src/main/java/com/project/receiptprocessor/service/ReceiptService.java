package com.project.receiptprocessor.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.receiptprocessor.model.Receipt;
import com.project.receiptprocessor.util.ReceiptPointsCalculator;


@Service
public class ReceiptService {
	  private final Map<String, Receipt> idToReceiptsMap = new HashMap<>();
	   
	  @Autowired
	  private ReceiptPointsCalculator pointsCalculator;

	    public String processReceipt(Receipt receipt) {
	        String id = UUID.randomUUID().toString();
	        idToReceiptsMap.put(id, receipt);
	        return id;
	    }

	    public int getPoints(String id) {
	        Receipt receipt = idToReceiptsMap.get(id);
	        if (receipt == null) {
	            throw new IllegalArgumentException("Receipt not found");
	        }
	        return pointsCalculator.calculatePoints(receipt);
	    }
}
