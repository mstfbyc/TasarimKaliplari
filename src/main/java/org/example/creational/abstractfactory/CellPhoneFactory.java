package org.example.creational.abstractfactory;

public interface CellPhoneFactory {
     CellPhone getCellPhone(String model, String camera, int weigth, int heigth);
}
