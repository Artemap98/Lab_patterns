package patterns.observer.subscribers;

import patterns.observer.INotificationSubscriber;

public class EmailSubscriber implements INotificationSubscriber {
    private String appeal;
    private String name;

    @Override
    public void Update(int result) {
        System.out.println(name + " " + appeal + " " + result);
    }

    public EmailSubscriber(String name) {
        this.name = name;
        appeal = "Email message from RusLang@Test.com: test result = ";
    }
}
