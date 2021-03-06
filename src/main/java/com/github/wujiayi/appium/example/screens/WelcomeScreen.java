package com.github.wujiayi.appium.example.screens;

import com.github.wujiayi.appium.screen.Screen;

/**
 * @author chris.wu
 */
public abstract class WelcomeScreen extends Screen {

    public abstract void clickStart();

    public abstract String getTitle(int screenIdx);

    public abstract String getDescription(int screenIdx);

}