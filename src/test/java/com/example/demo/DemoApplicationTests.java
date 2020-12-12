package com.example.demo;

import com.example.demo.face.TimeClockService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private TimeClockService timeClockService;

	@Test
	void getAngleTest() {
		int angle = timeClockService.getAngle("03:00");
		System.out.println("int "+angle);
	}

}
