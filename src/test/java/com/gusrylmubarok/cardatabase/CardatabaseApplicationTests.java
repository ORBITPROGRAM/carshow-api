package com.gusrylmubarok.cardatabase;

import com.gusrylmubarok.cardatabase.web.CarController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CardatabaseApplicationTests {
	@Autowired
	private CarController carController;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(carController);
	}

}
