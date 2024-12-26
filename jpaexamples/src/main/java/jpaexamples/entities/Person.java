package jpaexamples.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="person_details")
public class Person {
	@Id //Unqiue Identifier for our entity
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pid")
	private Integer personId;
	@Column(name="pname")
	private String personName;
		
}
