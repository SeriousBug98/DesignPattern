package org.example.remotecontroller.receiver;

public class CeilingFan {
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        System.out.println(location + " 선풍기 속도가 HIGH로 설정되었습니다.");
    }

    public void medium() {
    }

    public void low() {
    }

    public void off() {
        System.out.println(location + " 선풍기가 꺼졌습니다.");
    }

    public int getSpeed() {
        return speed;
    }
}
