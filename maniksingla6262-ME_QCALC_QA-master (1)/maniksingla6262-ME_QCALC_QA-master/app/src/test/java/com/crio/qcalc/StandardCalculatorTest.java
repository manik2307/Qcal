package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }

    @Test
    @DisplayName("Test Multiplication Overflow of Two Doubles")
    void testMultiplicationOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.multiply(Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }
    @Test
    @DisplayName("Test Multiplication Overflow of Two Doubles in which One is Positive and Other is Negative")
    void testMultiplicationOverflowForDoublesOnePosOtherNeg(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.multiply(-Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }

    @Test
    @DisplayName("Test Addition Overflow of Two Doubles")
    void testAdditionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
            }
        });
    }
    @Test
    @DisplayName("Test Subtraction Overflow of Two Doubles")
    void testSubtractionOverflowForDoubles(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                standardCalculator.subtract(-Double.MAX_VALUE,Double.MAX_VALUE);
            }
        });
    }

    @Test
    @DisplayName("Test Addition of Two Doubles")
    void testAdditionOperationForDoubles(){
        standardCalculator.add(1.0,1.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2.5, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Doubles")
    void testSubtractionOperationForDoubles(){
        standardCalculator.subtract(10.0,20.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(-10.5, actualResult);
    }


    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        standardCalculator.add(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation(){
        standardCalculator.subtract(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(0, actualResult);
    }

    @Test

    @DisplayName("Test Division of Two Integers")
    
    void testDivisionOperation()
    {
        standardCalculator.divide(4, 2);
        double actualresult=standardCalculator.getResult();
        Assertions.assertEquals(2, actualresult);
    }
    
    
    @Test
    
    @DisplayName("Test Multiplication of Two Integers")
    
    void testMultiplicationOperation()
    {
        standardCalculator.multiply(2, 4);
        double actualresult=standardCalculator.getResult();
        Assertions.assertEquals(8,actualresult);
    }
    
@Test

@DisplayName("Test Multiplication of Two Doubles")

void testMultiplicationOperationForDoubles()
{
    standardCalculator.multiply(2.5,2.5);
    double actualresult=standardCalculator.getResult();
    Assertions.assertEquals(6.25, actualresult);
}


@Test

@DisplayName("Test Division of Two Doubles")

void testDivisionOperationForDoubles()
{
    standardCalculator.divide(1.0, 1.0);
    double actualresult=standardCalculator.getResult();
    Assertions.assertEquals(1.0, actualresult);
}

@Test

@DisplayName("Test Division Divide By Zero Scenario")

void testDivisionDivideByZero(){
    Assertions.assertThrows(ArithmeticException.class,new Executable(){
        @Override
        public void execute() throws Throwable{
            standardCalculator.divide(10,0);
        }
    });

}


   
    }



