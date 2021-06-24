package com.swufe.javaee.beerV1.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<Beer> getBeer(String color) {
        List<Beer> beers = new ArrayList<>();
        if (color.equals("amber")) {
            beers.add(new Beer("一杯就倒",45,2000,"江湖老王"));
            beers.add(new Beer("千杯不倒",88,1500,"江湖小王"));
        } else {
            beers.add(new Beer("想不出了",100,120,"很牛的牌子"));
            beers.add(new Beer("乱编一个",900,3542,"更牛的牌子"));
        }
        return(beers);
    }
}
