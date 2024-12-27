package com.training.cafeapp.onetomanybi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="dept_info")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="deptno")
	private Integer deptNo;
	@Column(name="deptname")
	private String deptName;
	@Column(name="location")
	private String location;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL, orphanRemoval = true) //inverse side
	@JsonIgnore
	private List<Employee> employees;
}
