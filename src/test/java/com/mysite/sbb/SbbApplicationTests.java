package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void contextLoads() {
		Question q = this.questionRepository.findBySubjectAndContent(
				"sbb�� �����ΰ���?", "sbb�� ���ؼ� �˰� �ͽ��ϴ�.");
		assertEquals(1,q.getId());
	}

}
