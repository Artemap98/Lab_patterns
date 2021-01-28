package core;

import interfaces.IAnswer;

public class StandardAnswer implements IAnswer {

    private String textAnswer;

    public StandardAnswer(String textAnswer){
        this.textAnswer = textAnswer;
    }

    @Override
    public String getText() {
        return textAnswer;
    }
}
