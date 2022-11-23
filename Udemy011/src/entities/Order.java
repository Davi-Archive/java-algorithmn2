package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<OrderItem>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status) {
		super();
		this.moment = moment;
		this.status = status;
	}

	public double total() {
		double sum = 0;
		for (OrderItem item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

}
