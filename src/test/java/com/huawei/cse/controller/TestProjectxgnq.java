package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectxgnq {

        ProjectxgnqDelegate projectxgnqDelegate = new ProjectxgnqDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectxgnqDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}