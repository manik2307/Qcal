/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crio.qcalc;

public class App {

  public String getGreeting()
  {
    return "app should have a greeting";
  }
    public static void main(String[] args) {
     


      LogicCalculator calc = new LogicCalculator();

      calc.AND(8, 6);
      
      calc.printResult();
      


    }
}
