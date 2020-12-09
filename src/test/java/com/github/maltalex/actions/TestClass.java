package com.github.maltalex.actions;

import org.junit.jupiter.api.Test;

public class TestClass {

	@Test
	public void passing() {
		Code c = new Code();
		c.foobar();
	}

	@Test
	public void failing() {
		Code c = new Code();
		c.foobar();
	}
}
