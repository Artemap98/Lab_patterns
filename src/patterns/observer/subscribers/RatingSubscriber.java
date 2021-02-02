package patterns.observer.subscribers;

import patterns.observer.INotificationSubscriber;

public class RatingSubscriber implements INotificationSubscriber {

    private String appeal;
    private String name;
    private int rating = 50;

    @Override
    public void Update(int result) {

        //compute rating for student
        rating = (int)((float)rating*0.7f + result * 0.3f);

        System.out.println(name + " " + appeal + " " + rating);
    }

    public RatingSubscriber(String name){
        this.name = name;
        appeal = "Your rating is = ";
    }
}
