package com.gildedrose;

public class AgedBrie extends Item {
  public AgedBrie(String name, int sellIn, int quality){
    super(name, sellIn, quality);
  }

  @Override
  public void updateQuality(){
    qualityUpdate(1);
    this.sellIn--;
    if(this.sellIn < 0) qualityUpdate(1);
  }
}
