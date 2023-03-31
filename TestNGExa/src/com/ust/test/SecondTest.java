package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SecondTest {
  @Test(priority=1,description="this is executed first since we have given the priority as 1")
  public void f() {
	  System.out.println("From test method f()");
  }
  
  //TestNg executes method based on the alphabetical order.here we can give priority as 1 in the annotation
  @Test(priority=2,description="this is executed second since the priority is given as 2")
  public void a() {
	  System.out.println("From test method a()");
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
