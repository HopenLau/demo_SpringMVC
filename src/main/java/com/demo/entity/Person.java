package com.demo.entity;

import java.io.Serializable;

public class Person implements Serializable {
	// ���Finterface java.io.Serializable���Է����ݔ��������ԡ�

	private Integer id;
	private String name;
	private Integer age;

	public Person() { // ���x�Ӆ�constructor��
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}