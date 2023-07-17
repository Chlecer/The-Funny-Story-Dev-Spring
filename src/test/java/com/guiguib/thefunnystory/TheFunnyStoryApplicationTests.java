package com.guiguib.thefunnystory;

import com.guiguib.thefunnystory.model.User;
import com.guiguib.thefunnystory.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TheFunnyStoryApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
		// Add a test case here
		User user = new User();
		user.setEmail("test@example.com");
		user.setPassword("password");

		User savedUser = userRepository.save(user);
		Assertions.assertNotNull(savedUser.getId());
		Assertions.assertEquals("test@example.com", savedUser.getEmail());
	}
}
