package com.strings;

import static org.junit.Assert.*;

import org.junit.*;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }

    @Before
    public void setup() {
        System.out.println("before test");
    }

    @Test
    public void test1() {
        System.out.println("test1 executed");
    }

    @Test
    public void test2() {
        System.out.println("test2 executed");
    }

    @After
    public void teardown() {
        System.out.println("after test");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }

}
