package com.training.cafeapp.onetoonebi;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name="address_bi")
public class AddressBi {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer addressId;
	private String city;
	private String state;
	@OneToOne(mappedBy = "addressBi")
	@JsonIgnore
	private StudentBi studentBi; // inverse side
}
