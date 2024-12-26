package com.training.cafeapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Cafe {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cafeId;
	private String cafeName;
	private String location;
	private String manager;

}
