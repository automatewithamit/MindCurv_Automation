package com.mindcurv.webelements;

import com.mindcurv.framework.Wrapper;
import org.openqa.selenium.By;

public class Label extends Wrapper {

    public By locator;

    public Label(By by) {
        this.locator = by;
    }


    public String getText() {
        return getText(locator);
    }

    public void hover() {

    }

}
