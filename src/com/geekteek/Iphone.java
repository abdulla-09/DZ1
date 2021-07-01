package com.geekteek;

public final class Iphone extends SmartPhone {
    private boolean isHaveMiniJack;

    public Iphone(int year, Color color, Model model, String productionDate, boolean isHaveMiniJack) {
        super(year, color, model, productionDate);
        this.isHaveMiniJack = isHaveMiniJack;
    }

    public boolean isHaveMiniJack() {
        return isHaveMiniJack;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println(" MiniJack:" + isHaveMiniJack());
    }
}
