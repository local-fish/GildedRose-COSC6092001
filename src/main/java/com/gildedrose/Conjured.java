package com.gildedrose;

public class Conjured extends Item {
  public Conjured(String name, int sellIn, int quality){
    super(name, sellIn, quality);
  }

  @Override
  public void updateQuality(){
    qualityUpdate(-2);
    sellIn--;
    if(sellIn < 0) qualityUpdate(-2);
  }
}
