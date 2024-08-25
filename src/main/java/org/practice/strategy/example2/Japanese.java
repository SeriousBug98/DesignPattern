package org.practice.strategy.example2;

public class Japanese implements TranslationBehavior{
    @Override
    public void translate() {
        System.out.println("일본말 합니다");
    }
}
