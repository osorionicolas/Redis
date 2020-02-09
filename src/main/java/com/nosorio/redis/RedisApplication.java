package com.nosorio.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.EventListener;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.nosorio.redis.services.StudentService;

@SpringBootApplication
@PropertySource("application.properties")
public class RedisApplication {

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void studentManager() {
		String studentId = "1";
		this.studentService.saveStudent(studentId);
		this.studentService.getStudent(studentId);
	}

	@Bean
	public RedisTemplate<String, Object> redisTeRedisPropertiesmplate() {
		RedisTemplate<String, Object> template = new RedisTemplate<>();
	    template.setConnectionFactory(new JedisConnectionFactory());
	    return template;
	}
}
