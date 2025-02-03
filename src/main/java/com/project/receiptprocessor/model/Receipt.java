package com.project.receiptprocessor.model;

import java.util.List;


public class Receipt {
	 private String retailer;
	    private String purchaseDate;
	    private String purchaseTime;
	    private List<Item> items;
	    private String total;
		/**
		 * @return the retailer
		 */
		public String getRetailer() {
			return retailer;
		}
		/**
		 * @param retailer the retailer to set
		 */
		public void setRetailer(String retailer) {
			this.retailer = retailer;
		}
		/**
		 * @return the purchaseDate
		 */
		public String getPurchaseDate() {
			return purchaseDate;
		}
		/**
		 * @param purchaseDate the purchaseDate to set
		 */
		public void setPurchaseDate(String purchaseDate) {
			this.purchaseDate = purchaseDate;
		}
		/**
		 * @return the purchaseTime
		 */
		public String getPurchaseTime() {
			return purchaseTime;
		}
		/**
		 * @param purchaseTime the purchaseTime to set
		 */
		public void setPurchaseTime(String purchaseTime) {
			this.purchaseTime = purchaseTime;
		}
		/**
		 * @return the items
		 */
		public List<Item> getItems() {
			return items;
		}
		/**
		 * @param items the items to set
		 */
		public void setItems(List<Item> items) {
			this.items = items;
		}
		/**
		 * @return the total
		 */
		public String getTotal() {
			return total;
		}
		/**
		 * @param total the total to set
		 */
		public void setTotal(String total) {
			this.total = total;
		}
		
}
