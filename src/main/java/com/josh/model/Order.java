package com.josh.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order extends Product {
	private int orderId;//Primary key for Order table.
	private double amount;
	private String date;
	private boolean status;
	private String billingAddress;
	private String shippingAddress;
	
	
	
	
	public String toString() {
		return "Order Id: "+orderId+" amount: "+amount+" date: "+date+" status: "+status+" billing address: "+billingAddress+
				" shipping address: "+shippingAddress;
	}

}
