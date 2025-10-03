package com.example.testCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestCodeApplicationTests {
	@Test
	void testFibonacci() {
		Assertions.assertEquals(0, fib(0));
	}

	int fib(int n) {
		return 0;
	}

}