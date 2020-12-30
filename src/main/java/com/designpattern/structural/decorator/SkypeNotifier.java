package com.designpattern.structural.decorator;

//Skype Decorator that delegates to baseDecorator and does sendViaSkype call
public class SkypeNotifier extends BaseDecorator {
    public SkypeNotifier(Notifier notifier) {
        super(notifier);
    }

    public void send(String msg) {
        super.send(msg);
        sendViaSkype(msg);
    }

    private void sendViaSkype(String msg){
        System.out.println("sending message via SkypeNotifier:"+ msg);
    }
}
