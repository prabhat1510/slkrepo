package com.training.cafeapp.manytomany;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author UD SYSTEMS Order is the owning entity, owning entity should
 *         have @JoinTable
 */

@Entity
@Table(name = "order_master")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	private Date orderDate;

	@ManyToMany(cascade = CascadeType.ALL)
	/**
	 * Columns orderId and productId implicitly be composite primary key of the JOin
	 * table product_orders
	 */
	@JoinTable(name = "product_orders", joinColumns = { @JoinColumn(name = "orderId") }, inverseJoinColumns = {
			@JoinColumn(name = "productId") })
	private Set<Product> products;//owning

}
