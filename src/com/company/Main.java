package com.company;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item item1=new Item("desk",SaleState.ORDERED,23);
        Item item2=new Item("bed",SaleState.INAWAREHOUSE,60);
        Item item3=new Item("daisy",SaleState.SOLD,0.34);
        FulfillmentCenter mag1=new FulfillmentCenter("Furniture","Krakow",240);
        FulfillmentCenter mag2=new FulfillmentCenter("Foods","Warszawa",100);
        FulfillmentCenter mag3=new FulfillmentCenter("Flower","Gdynia",120);
        FulfillmentCenter mag4=new FulfillmentCenter("Game","Krakow",50);
        FulfillmentCenter mag5=new FulfillmentCenter("Accessories","Wroclaw",300);
        FulfillmentCenterContainer.addCenter(mag1);
        FulfillmentCenterContainer.addCenter(mag2);
        FulfillmentCenterContainer.addCenter(mag3);
        FulfillmentCenterContainer.addCenter(mag4);
        FulfillmentCenterContainer.addCenter(mag5);
        mag1.addProduct(item1);
        mag1.addProduct(item2);
        mag3.addProduct(item3);
        FulfillmentCenterContainer.summary();



    }
}
