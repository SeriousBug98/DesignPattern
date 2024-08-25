package org.practice.strategy.example2;

public class Walking implements MoveBehavior{
    @Override
    public void move() {
        System.out.println("걷습니다");
    }
}
