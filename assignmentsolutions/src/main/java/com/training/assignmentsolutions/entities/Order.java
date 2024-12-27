package com.training.assignmentsolutions.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="order_details")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long orderId;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	@ManyToMany(cascade = CascadeType.ALL)
	/**
	 * Columns orderId and productId implicitly be composite primary key of the JOin
	 * table product_orders
	 */
	@JoinTable(name = "product_orders", joinColumns = { @JoinColumn(name = "orderId") }, inverseJoinColumns = {
			@JoinColumn(name = "productId") })
	private List<Product> products;
	@ManyToOne(cascade=CascadeType.ALL)
	private Customer customer;
	
	
}
