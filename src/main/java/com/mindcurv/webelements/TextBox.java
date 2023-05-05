package com.mindcurv.webelements;

import com.mindcurv.framework.Wrapper;
import org.openqa.selenium.By;

public class TextBox extends Wrapper {

    public By locator;

    public TextBox(By by) {
        this.locator = by;
    }


    public void click() {
        System.out.println("Clicking Button with locator " + locator);
        click(locator);
        System.out.println("Clicked Button with locator " + locator);
    }

    public String getText() {
        return getText(locator);
    }
    public void setText(String text) {
        setText(locator,text);
    }

    public void hover() {

    }

}
