package myCode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import jdk.nashorn.internal.objects.Global;
import myCode.CalculatorImp;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author user
 */
public class CalculatorTestNGTest {
    private CalculatorImp calculator;
    @BeforeClass
    public void setUp() {
        calculator = new CalculatorImp();
    }
    
    public CalculatorTestNGTest() {
    }
    @Test
    public void zeroTest() {
        double result = calculator.calculate("1");
        assertEquals(result,1.0 , "Ошибка! Тест на ноль не проходит!");
    }
    @Test
    public void floatingPointTest() {
        double result =  calculator.calculate("-3000.02");
        assertEquals(result,-3000.02, "Ошибка! Тест на отрицательное число с плавающей запятой");
    }
    @Test
    public void addTest_1() {
        double result =  calculator.calculate("30.4/2");
        assertEquals(result,15.2, "Ошибка! Тест на деление");
    }
    @Test
    public void addTest_2() {
        double result = calculator.calculate("(2+2)*1.5/10-444");
        assertEquals(result,-443.4, "Ошибка! Тест на сложение");
         
    }
    @Test
    public void functionTest() {
        double result = calculator.calculate("sin(1)*sin(1)+cos(1)*cos(1)");
        assertEquals(result,1.0, "Ошибка! Тест на функции");
  
    }
      @Test
    public void divisionByZeroTest() {
        double result = calculator.calculate("10/0");
        assertEquals(result,Global.Infinity, "Ошибка! Тест деление на ноль");
  
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
