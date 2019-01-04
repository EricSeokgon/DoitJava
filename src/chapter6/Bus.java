package chapter6;

public class Bus {
    int busnumber;
    int passengerCount;
    int money;

    public Bus(int busnumber) {
        this.busnumber = busnumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println("버스 " + busnumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
    }
}
