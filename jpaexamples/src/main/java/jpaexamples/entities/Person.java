package jpaexamples.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
