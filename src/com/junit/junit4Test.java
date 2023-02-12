package com.junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class junit4Test {


    @BeforeClass
    public static void beforeClass(){
        System.out.println("before all classes");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after all classes");
    }

    @Before
    public void before(){
        System.out.println("before each class");
    }

    @After
    public void after(){
        System.out.println("after each class");
    }

    @Test
    public void test1(){
        String ExpectedResult = "hello";
        String ActualResult = "world";
        assertEquals(ExpectedResult,ActualResult);
        //System.out.println("test 1");
    }

    @Test
    public void test2(){
        System.out.println("test 2");
    }

    @Test
    public void test3(){
        System.out.println("test 3");

    }

    @Test
    public void test4(){
        System.out.println("test 4");

    }



}
