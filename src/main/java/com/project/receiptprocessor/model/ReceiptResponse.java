package com.project.receiptprocessor.model;

public class ReceiptResponse {
	  private String id;

	public ReceiptResponse(String id) {
		super();
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

}
