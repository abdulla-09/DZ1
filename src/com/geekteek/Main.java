package com.geekteek;

public class Main {

    public static void main(String[] args) {
	SmartPhone objectA = new SmartPhone(2021, Color.RED, new Model("iPhone", 6),"12.05.2021");
	objectA.getInfo();
	objectA.getInfo("12.05.2021");
	Iphone objectB = new Iphone(2020, Color.BLACK, new Model("iPhone 11", 7), "18.08.2020",false);
	objectB.getInfo();
	objectB.getInfo("18.08.2020");
	Iphone objectC = new Iphone(2017, Color.WHITE, new Model("iPhone X", 5), "17.04.2017", true);
	objectC.getInfo();
	objectA.getInfo("17.04.2017");
    }
}
