package org.practice.strategy.example2;

public class Running implements MoveBehavior{
    @Override
    public void move() {
        System.out.println("뜁니다");
    }
}
