package com.mackittipat.designpattern.behavioural.templateMethod;

public abstract class Email {

    public final void sendEmail() {

        openEmailClient();

        writeEmail();

        clickSend();

    }

    public abstract void openEmailClient();

    public abstract void writeEmail();

    public abstract void clickSend();

}
