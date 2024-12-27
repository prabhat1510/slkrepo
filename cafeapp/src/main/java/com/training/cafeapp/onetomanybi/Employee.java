package com.training.cafeapp.onetomanybi;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="emp_info")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="empno")
	private Integer empNo;
	@Column(name="empname")
	private String empName;
	@Column(name="hiredate")
	private Date hireDate;

	@ManyToOne(cascade = CascadeType.ALL)//Owning side
	@JoinColumn(name = "deptNo")
	private Department department;	
}
