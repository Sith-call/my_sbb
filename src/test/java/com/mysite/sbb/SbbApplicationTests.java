package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void contextLoads() {
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		q.setSubject("������ ����");
		this.questionRepository.save(q);
	}

}
