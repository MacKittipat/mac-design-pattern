package com.mackittipat.designpattern.behavioural.templateMethod;

public class Gmail extends Email {

    @Override
    public void openEmailClient() {
        System.out.println("Open Gmail");
    }

    @Override
    public void writeEmail() {
        System.out.println("Write email message in Gmail");
    }

    @Override
    public void clickSend() {
        System.out.println("Send send in Gmail");
    }
}
