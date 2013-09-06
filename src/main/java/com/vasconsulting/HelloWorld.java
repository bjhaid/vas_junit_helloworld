package com.vasconsulting;

public class HelloWorld {
  private String name;

  public String sayHelloWorld()
    {
      if (name == null){
        return "Hello World!";
      }else
        return "Hello World! " + name;
    }

    public void setName(String name){
      this.name = name;
    }
}
