package com.devline.ecommerce.model;

import java.util.Date;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String number;
	private Date creationDate, receivedDate;
	private double total;

	@ManyToAny
	private User USER;

	@OneToOne(mappedBy = "ORDER")
	private OrderDetail orderDetail;
	
	// CONSTRUCTORS
	public Order() {
		
	}

	public Order(Integer id, String number, Date creationDate, Date receivedDate, double total) {
		this.id = id;
		this.number = number;
		this.creationDate = creationDate;
		this.receivedDate = receivedDate;
		this.total = total;
	}

	// GETTERS Y SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
    public User getUSER() {
        return USER;
    }

    public void setUSER(User USER) {
        this.USER = USER;
    }

	public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

	// OTROS METHODS
	@Override
	public String toString() {
		return "Order [id=" + id + ", number=" + number + ", creationDate=" + creationDate + ", receivedDate="
				+ receivedDate + ", total=" + total + "]";
	}

}
