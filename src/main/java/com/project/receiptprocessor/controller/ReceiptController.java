package com.project.receiptprocessor.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.receiptprocessor.model.Receipt;
import com.project.receiptprocessor.model.ReceiptResponse;
import com.project.receiptprocessor.service.ReceiptService;

@RestController
@RequestMapping("/receipts")
public class ReceiptController {
	@Autowired
    private ReceiptService receiptService;

    @PostMapping("/process")
    public ResponseEntity<ReceiptResponse> processReceipt(@RequestBody Receipt receipt) {
        String id = receiptService.processReceipt(receipt);
        return ResponseEntity.ok(new ReceiptResponse(id));
    }

    @GetMapping("/{id}/points")
    public ResponseEntity<Map<String, Integer>> getPoints(@PathVariable String id) {
        int points = receiptService.getPoints(id);
        return ResponseEntity.ok(Map.of("points", points));
    }
}
