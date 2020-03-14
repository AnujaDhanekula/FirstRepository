package unittesting;

import org.junit.Test;
import org.junit.jupiter.api.Nested;

public class Junit2Class {
	@Test
	public void test2() {
		System.out.println("Inside test2");
	}
	@Nested
	class NestedClass
	{
		@Test
		public void test5()
		{
			System.out.println("Nested Class........");
		}
	}

}
