package com.company;

public class Item implements Comparable <Item>{
    private String name;
    private SaleState state;
    private double weight;


    public Item(String name, SaleState state, double weight) {
        this.name=name;
        this.state=state;
        this.weight=weight;
    }

    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }

    public SaleState getState(){
        return state;
    }

    public void summary(){
        System.out.println("PRODUCT:"+name+ " STATE:"+state+ " WEIGHT:"+weight);
    }

    public String toString(){
        return "PRODUCT:"+name+ " STATE:"+state+ " WEIGHT:"+weight;
    }

    @Override
    public int compareTo(Item item) {
        return name.compareTo(item.name);
    }
}
