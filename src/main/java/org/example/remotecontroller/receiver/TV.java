package org.example.remotecontroller.receiver;

public class TV {
    String location;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV가 켜졌습니다");
    }

    public void off() {
        System.out.println(location + " TV가 꺼졌습니다");
    }
}
