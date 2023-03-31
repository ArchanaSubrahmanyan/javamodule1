package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
  @Test
  public void f() {
	  System.out.println("From test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("From beforetest()");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("From aftertest()");
  }

}
