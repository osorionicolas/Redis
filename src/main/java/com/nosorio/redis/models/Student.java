package com.nosorio.redis.models;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;

@RedisHash("Student")
@Data
@AllArgsConstructor
public class Student implements Serializable {
   
	private static final long serialVersionUID = 4801056489453501067L;
	
	public enum Gender { 
        MALE, FEMALE
    }
 
    private String id;
    private String name;
    private Gender gender;
    private int grade;

}