package com.gildedrose;

public class BackstagePass extends Item {
  public BackstagePass(String name, int sellIn, int quality){
    super(name, sellIn, quality);
  }

  @Override
  public void updateQuality(){
    qualityUpdate(1);
    if(this.sellIn <= 10) qualityUpdate(1);
    if(this.sellIn <= 5) qualityUpdate(1);
    this.sellIn--;
    if(this.sellIn < 0) this.quality = 0;
  }
}
