package com.tests;

import org.junit.jupiter.api.Test;

import com.testclass.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;

public class DogTest {

	@BeforeAll
	static void beforeAll() {
		System.out.println("**--- Executed once before all test methods in this class ---**");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("**--- Executed before each test method in this class ---**");
	}

	@Test
	void testMethod1() {
		System.out.println("**--- Test method1 executed ---**");
	}

	@DisplayName("Test method2 with condition")
	@Test
	void testMethod2() {
		System.out.println("**--- Test method2 executed ---**");
	}

	@Test
	@Tag("regression")
	@Disabled("implementation pending")
	void testMethod3() {
		System.out.println("**--- Test method3 executed ---**");
	}
	
	@Test
	@Tag("smoke")
	public void testBark1() {
		String expectedString = "woof";
		System.out.println("**--- DogTest smoke tag executed ---**");
		assertEquals(expectedString, "woof");
	}

	@Test
	@Tag("regression")
	public void beanMatchertest() {
		Person person = new Person("Jayasankar", "25");
		System.out.println("**--- DogTest regression tag executed ---**");
		assertThat(person, hasProperty("name"));
	}
	@AfterEach
	void afterEach() {
		System.out.println("**--- Executed after each test method in this class ---**");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("**--- Executed once after all test methods in this class ---**");
	}

}
