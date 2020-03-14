package unittesting;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Junit1Class {
	@Test
	public void test1() {
		System.out.println("Inside test1");
	}
	@BeforeEach
	public void test2() {
		System.out.println("Inside the test1 before method");
	}
	@AfterEach
	public void test3() {
		System.out.println("Inside the test1 before method");
	}
}
