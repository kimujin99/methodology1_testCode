package com.example.testCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestCodeApplicationTests {
	@Test
	void testFibonacci() {
		int cases[][] = {{0,0}, {1,1}};

		for(int i = 0; i < cases.length; i++) {
			Assertions.assertEquals(cases[i][0], fib(cases[i][1]));
		}
	}

	int fib(int n) {
		if (n == 0) return 0;
		return 1;
	}

}