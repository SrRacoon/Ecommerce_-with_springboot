package com.devline.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Details")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private double quantity, price, total;

	@OneToOne
	private Order ORDER;

	@ManyToOne
	private Product Product;
	
	// CONSTRUCTORS
	public OrderDetail() {
		
	}

	public OrderDetail(Integer id, String name, double quantity, double price, double total) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
	}

	// GETTERS Y SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Order getORDER() {
        return ORDER;
    }

    public void setORDER(Order ORDER) {
        this.ORDER = ORDER;
    }

	public Product getProduct() {
        return Product;
    }

    public void setProduct(Product Product) {
        this.Product = Product;
    }

	// OTROS METHODS
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", total="
				+ total + "]";
	}
	
}
