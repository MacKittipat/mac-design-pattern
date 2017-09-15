package com.mackittipat.designpattern.behavioural.templateMethod;

import org.junit.Test;

public class TemplateMethodTest {

    @Test
    public void test() {
        Email gmail = new Gmail();
        gmail.sendEmail();

        Email hotmail = new Hotmail();
        hotmail.sendEmail();
    }

}