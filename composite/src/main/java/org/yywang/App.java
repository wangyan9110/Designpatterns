package org.yywang;

/**
 *
 */
public class App {

    public static void main(String[] args) {
        UserCodeElement userCodeElement = new UserCodeElement(10, 10, 20, 20);
        ChooseItemElement chooseItemElement = new ChooseItemElement(100, 100, 20, 20);
        ChooseElement chooseElement = new ChooseElement(100, 100, 100, 100);
        chooseElement.add(chooseItemElement);
        AnswerCardElement answerCardElement = new AnswerCardElement(0, 0, 1000, 1000);
        answerCardElement.add(userCodeElement);
        answerCardElement.add(chooseElement);
        answerCardElement.show();
    }

}
