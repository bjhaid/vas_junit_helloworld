package com.vasconsulting;

import org.junit.Test;
import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {
  private HelloWorld helloWorld;

  @Test
  public void testSayHelloWorld() {
    helloWorld = new HelloWorld();
    assertEquals("Hello World!", helloWorld.sayHelloWorld());
  }
}
