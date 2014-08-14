package org.yywang;

/**
 *
 */
public class UserCodeElement extends Element {

    public UserCodeElement(int top, int left, int width, int height) {
        super(top, left, width, height);
    }

    @Override
    protected void display() {
            System.out.print("学号区域：left:" + this.left + " top:" + this.top
                    + " width:" + this.width + " height:" + this.height);
    }

    @Override
    protected void add(Element element) {
        children.add(element);
    }
}
