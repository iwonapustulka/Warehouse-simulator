package com.company;
import java.util.ArrayList;
import java.util.List;


public class FulfillmentCenter {
    private String designation;
    private String place;
    private List<Item> listProduct=new ArrayList<>();
    private double max;
    private double weight;


    public FulfillmentCenter(String designation,String place,double max){
        this.designation=designation;
        this.place=place;
        this.max=max;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPlace(){
        return place;
    }

    public List<Item> getListProduct() {
        return listProduct;
    }

    public double getWeight(){
        return weight;
    }

    public double getMax() {
        return max;
    }

    public List<Item> addProduct(Item item){
        if(max<weight+item.getWeight()){
            System.err.println("This warehouse is full");
        }else{
            listProduct.add(item);
            weight+=item.getWeight();
        }
        return listProduct;
    }

    public List<Item> removeProduct(Item item){
        listProduct.remove(item);
        return listProduct;
    }

    public List<Item> filterByState(SaleState state){
        List<Item> newList=new ArrayList<>();
        for(Item item:listProduct){
            if(item.getState()==state){
                newList.add(item);
            }
        }
        return newList;
    }

    public List<Item> filterByProduct(Item item){
        List<Item> list=new ArrayList<>();
        for(Item product:listProduct){
            if(item.getName()==product.getName()){
                list.add(item);
            }
        }
        return list;
    }

    public void summary(){//wypisuje info o magazynie
        System.out.println("The warehouse: ");
        double percent=0;
        for(Item item:listProduct){
            percent+=item.getWeight();
        }
        percent/=max;
        percent*=100;
        System.out.println("NAME:"+designation+" PLACE:"+place+" MAX WEIGHT:"+max+" PERCENT:"+percent);
    }

}
