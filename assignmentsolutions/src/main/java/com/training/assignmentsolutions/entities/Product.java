package com.training.assignmentsolutions.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name="product_details")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long productId;
	private String name;
	private String category;
	private Double price;
	@ManyToMany(mappedBy="products",cascade=CascadeType.ALL)
	private List<Order> orders;
}
