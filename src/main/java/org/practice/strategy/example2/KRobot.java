package org.practice.strategy.example2;

public class KRobot extends Robot{

    public KRobot() {
        moveBehavior = new Walking();
        translationBehavior = new Korean();
    }

    @Override
    public void display() {
        System.out.println("저는 K로봇입니다.");
    }
}
