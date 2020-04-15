package package2;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LeapYearTest {
	
	@Test
	public void isLeapYearTest() throws IOException {
		LeapYear check = new LeapYear();
		int inputYear = 2016; 
		assertTrue("Leap Year", check.isLeapYear(inputYear));  //note:  this statement will not compile without below in pom.xml:
			//		<dependency>
			//        <groupId>junit</groupId>
			//        <artifactId>junit</artifactId>
			//        <version>4.13</version>
			//        </dependency>
	}
	
	@Test
	public void isLeapYearKeyboardTest() throws IOException {
		LeapYear leapYear = new LeapYear();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year(yyyy):");
		int year = sc.nextInt();
		assertTrue("Leap Year", leapYear.isLeapYear(year));
		sc.close();
		
	}

}
