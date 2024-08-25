package org.practice.strategy.example2;

public class Korean implements TranslationBehavior{
    @Override
    public void translate() {
        System.out.println("한국말 합니다");
    }
}
