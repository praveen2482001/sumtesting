package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Apptest {
	Sumadd sum=new Sumadd();
	@Test
	@DisplayName("Assert equal test Case")
	public void assertEqual() {
		assertEquals(4,sum.add(2, 2));

	}
}
