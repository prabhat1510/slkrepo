package com.training.cafeapp.onetoonebi;
import jakarta.persistence.CascadeType;
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
@Table(name="student_bi")
public class StudentBi {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer studentId;
	private String studentName;
	@OneToOne(cascade = CascadeType.ALL)
	private AddressBi addressBi;//owning side
}
