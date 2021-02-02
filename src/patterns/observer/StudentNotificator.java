package patterns.observer;

import java.util.Vector;

public class StudentNotificator {

    private Vector<INotificationSubscriber> subscribers = new Vector<>();

    public void AddSubscriber(INotificationSubscriber newSubscriber){
        subscribers.add(newSubscriber);
    }

    public void NotificySubscribers(int result){
        for (INotificationSubscriber sub:
             subscribers) {
            sub.Update(result);
        }
    }

}
