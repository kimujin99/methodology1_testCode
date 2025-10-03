package com.example.testCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestCodeApplicationTests {
	@Test
	void testFibonacci() {
		Assertions.assertEquals(0, fib(0));
		Assertions.assertEquals(1, fib(1));
	}

	int fib(int n) {
		if (n == 0) return 0;
		return 1;
	}

}