package com.gildedrose;

public class Sulfuras extends Item {
  public Sulfuras(String name, int sellIn, int quality){
    super(name, sellIn, quality);
  }

  @Override
  public void updateQuality(){
    // As this is a legendary item, it does not decrease in value, nor has a sellIn property that decreases. Therefore, the updateQuality function is quite literally nothing.
  }
}
