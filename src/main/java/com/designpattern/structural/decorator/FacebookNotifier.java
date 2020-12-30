package com.designpattern.structural.decorator;

//Facebook Decorator that delegates to baseDecorator and does sendViaFacebook call
public class FacebookNotifier extends BaseDecorator {
    public FacebookNotifier(Notifier notifier) {
        super(notifier);
    }

    public void send(String msg) {
        super.send(msg);
        sendViaFacebook(msg);
    }

    private void sendViaFacebook(String msg){
        System.out.println("sending message via FacebookNotifier:"+ msg);
    }
}
