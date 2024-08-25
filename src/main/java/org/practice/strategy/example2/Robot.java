package org.practice.strategy.example2;

public abstract class Robot {

    MoveBehavior moveBehavior;
    TranslationBehavior translationBehavior;

    public abstract void display();
    public void performMove(){
        moveBehavior.move();
    }
    public void performTranslate() {
        translationBehavior.translate();
    }
}
