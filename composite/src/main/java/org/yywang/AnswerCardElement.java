package org.yywang;


public class AnswerCardElement extends Element{

    public AnswerCardElement(int top, int left, int width, int height){
        super(top, left, width, height);
    }

    @Override
    protected void display() {

    }

    @Override
    protected void add(Element element) {
        children.add(element);
    }
}
