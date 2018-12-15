package com.exam;

public class Order {
	Ticket [] ticket_array = new Ticket[100];
	int ticket_idx = 0;
	public void print() {
		System.out.print("Result:\n");
		for (int i = 0; i < ticket_idx; i++) {
			System.out.print(ticket_array[i].get_result() + "\n");
		}
	}
	public void add(Ticket ticket) {
		ticket_array[ticket_idx] = ticket;
		ticket_idx++;
	}
}
