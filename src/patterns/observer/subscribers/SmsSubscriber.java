package patterns.observer.subscribers;

import patterns.observer.INotificationSubscriber;

import java.nio.charset.IllegalCharsetNameException;

public class SmsSubscriber implements INotificationSubscriber {
    private String appeal;
    private String name;

    @Override
    public void Update(int result) {
        System.out.println(name + " " + appeal + " " + result);
    }

    public SmsSubscriber(String name) {
        this.name = name;
        appeal = "You got a new sms: test result = ";
    }
}
