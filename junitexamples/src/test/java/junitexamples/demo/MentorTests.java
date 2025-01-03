package junitexamples.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MentorTests {
	@Test
	@DisplayName("FullName setting in construtor test")
	void testMentorConstructorSetsFullName() {
		//Arrange
	    String expected = "Jane Doe";
		//Act
	    Mentor mentor = new Mentor("Jane", "Doe");
	    String actual = mentor.getFullName();
		//Assert
	    assertEquals(expected, actual, "Full name should be Jane Doe");
	}

	
	
}
