package com.geekteek;

public class SmartPhone extends Gadget {
    private String productionDate;

    public SmartPhone(int year, Color color, Model model, String productionDate) {
        super(year, color, model);
        this.productionDate = productionDate;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public final void getInfo(String productionDate){
        System.out.println("Production date:"+productionDate);
    }

    public void getInfo(){
        System.out.println("Year:" + getYear() + " Color:" + getColor() + " Name:"
                + getModel().getName() + " Generation:"
                + getModel().getGeneration() + " Production date:" + getProductionDate());
    }
}
