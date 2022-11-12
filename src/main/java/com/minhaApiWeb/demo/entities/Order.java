package com.minhaApiWeb.demo.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.minhaApiWeb.demo.enums.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Order")
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant moment;
	
	private Integer status;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private User client;
	
	public Order() {}

	public Order(Long id, Instant moment,OrderStatus orderStatus ,User client) {
		Id = id;
		this.moment = moment;
		this.client = client;
		setStatus(orderStatus);
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Instant getData() {
		return moment;
	}

	public void setData(Instant data) {
		this.moment = data;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}
	public OrderStatus getStatus() {
		return OrderStatus.valueOf(status);
	}
	public void setStatus(OrderStatus orderStatus) {
		if(orderStatus != null) {
			this.status = orderStatus.getCode();
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(Id, other.Id);
	}
	
}
