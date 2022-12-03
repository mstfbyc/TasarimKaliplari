package org.example.creational.abstractfactory;

public class Iphone11 implements CellPhone {
    private String model;
    private String cemare;
    private int heigth;
    private int weigth;

    public Iphone11(String model, String cemare, int heigth, int weigth) {
        this.model = model;
        this.cemare = cemare;
        this.heigth = heigth;
        this.weigth = weigth;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getCemare() {
        return this.cemare;
    }

    @Override
    public int heigth() {
        return this.heigth;
    }

    @Override
    public int weigth() {
        return this.weigth;
    }

    @Override
    public String toString() {
        return "Iphone11{" +
                "model='" + model + '\'' +
                ", cemare='" + cemare + '\'' +
                ", heigth=" + heigth +
                ", weigth=" + weigth +
                '}';
    }
}
