package com.mackittipat.designpattern.behavioural.templateMethod;

public class Hotmail extends Email {

    @Override
    public void openEmailClient() {
        System.out.println("Open Hotmail");
    }

    @Override
    public void writeEmail() {
        System.out.println("Write email message in Hotmail");
    }

    @Override
    public void clickSend() {
        System.out.println("Send send in Hotmail");
    }
}
