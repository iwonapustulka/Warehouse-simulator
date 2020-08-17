package com.company;

import java.util.*;

public class FulfillmentCenterContainer {

    private static Map<String,FulfillmentCenter> warehouses=new TreeMap<>();

    public Map <String,FulfillmentCenter> getWarehouses(){
        return warehouses;
    }

    public FulfillmentCenterContainer(){

    }

    public String toString(){
        return "container"+warehouses;
    }

    public static FulfillmentCenter addCenter(FulfillmentCenter magazyn){
        warehouses.put(magazyn.getDesignation(),magazyn);
        return magazyn;
    }

    public void removeCenter(String name){
        warehouses.remove(name);
    }

    public static void summary(){//wypisuje info o wszystkich magazynach
        System.out.println("All warehouses:");
        for(FulfillmentCenter center:warehouses.values()){
            System.out.println(center.getDesignation()+" "+center.getPlace()+" "+(center.getWeight()/center.getMax())*100+"%");
        }
    }

}
