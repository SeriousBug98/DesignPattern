package org.practice.strategy.example2;

public class Client {
    public static void main(String[] args) {
        Robot robot = new KRobot();
        robot.display();
        robot.performMove();
        robot.performTranslate();
    }
}
