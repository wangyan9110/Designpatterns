package org.yywang;

import java.util.ArrayList;
import java.util.List;

/**
 * 基础的Element
 */
public abstract class Element {

    protected int top;

    protected int left;

    protected int width;

    protected int height;

    protected List<Element> children = new ArrayList<Element>();

    protected Element(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    protected abstract void display();

    protected abstract void add(Element element);

    public void show() {
        show(this);
    }

    private void show(Element element) {
        for (Element element1 : element.children) {
            element1.display();
            if (!element1.children.isEmpty()) {
                show(element1);
            }
        }
    }
}
