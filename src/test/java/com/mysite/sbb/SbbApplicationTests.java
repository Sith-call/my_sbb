package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void contextLoads() {
		List<Question> all = this.questionRepository.findAll();
		assertEquals(2,all.size());
		
		Question q = all.get(0);
		assertEquals("sbb�� �����ΰ���?",q.getSubject());
	}

}
