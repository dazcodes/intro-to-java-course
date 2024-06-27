//Attempted on 26th June 2024
package com.cbfacademy.shapes;

public class Paint extends Shape {

  protected double coverage;


  public Paint(double coverage){

    this.coverage = coverage; 
  }
  
  public double getAmount(Shape shape) {
    return (0.01 * (shape));
  }

  
}
