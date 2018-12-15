package com.exam;

public class Ticket {
	String origin;
	String destination;
	int price;
	int quantity;
	public Ticket(String origin, String destination, int price,int quantity) {
		 this.origin = origin;
		 this.destination = destination;
		 this.price = price;
		 this.quantity = quantity;
	}
	public int get_total_price() {
		return this.price * this.quantity;
	}
	public String get_result() {
		return this.origin + " " + this.destination + " "
			  +this.price + " " + this.quantity + " " + get_total_price();
	}
}
