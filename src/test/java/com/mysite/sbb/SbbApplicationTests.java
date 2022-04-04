package com.mysite.sbb;

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
		Question q1 = new Question();
		q1.setSubject("sbb�� �����ΰ���?");
		q1.setContent("sbb�� ���ؼ� �˰� �ͽ��ϴ�.");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1); // ù ��° ���� ����
		
		Question q2 = new Question();
		q2.setSubject("��������Ʈ �� �����Դϴ�.");
		q2.setContent("id�� �ڵ����� �����ǳ���?");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2); // �ι�° ���� ����
	}

}
