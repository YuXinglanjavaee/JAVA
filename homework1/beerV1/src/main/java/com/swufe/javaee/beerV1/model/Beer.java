package com.swufe.javaee.beerV1.model;

public class Beer {
    private String name;
    private int age;
    private int price;
    private String brand;

    Beer(String name,int age,int price,String brand){
        this.name = name;
        this.age = age;
        this.price = price;
        this.brand = brand;
    }
    public String toString(){
        return(name+"<br>"+"age is:"+age+"<br>"+"price is:"+price+"<br>"+"brand is"+brand);
    }
}
