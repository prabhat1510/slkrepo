package com.training.cafeapp.manytomany;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author UD SYSTEMS
 *Product is the inverse entity
 * inverse entity maps to owning entity by using mappedBy element
 */

@Entity
@Table(name="product_master")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private double price;
	@ManyToMany(mappedBy="products",cascade=CascadeType.ALL)
	private Set<Order> orders;//inverse side
}
