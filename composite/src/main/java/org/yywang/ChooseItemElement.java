package org.yywang;

/**
 *
 */
public class ChooseItemElement extends Element{

    public ChooseItemElement(int top, int left, int width, int height){
        super(top, left, width, height);
    }

    @Override
    protected void display() {
            System.out.print("选择题单项：left:" + this.left + " top:" + this.top
                    + " width:" + this.width + " height:" + this.height);
    }

    @Override
    protected void add(Element element) {

    }
}
