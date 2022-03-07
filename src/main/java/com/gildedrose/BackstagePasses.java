package com.gildedrose;

public class BackstagePasses extends AgedBrie {

    public BackstagePasses(String name, ItemType type, int sellIn, int quality, int qualityRateing) {
        super(name,type, sellIn, quality, qualityRateing);
        this.setSellIn(sellIn);
    }

    @Override
    public void setSellIn(int sellIn) {
        if (sellIn <= 5) {
            super.setQualityRating(3);
        } else if (sellIn <= 10) {
            super.setQualityRating(2);
        } else if (sellIn <= 0) {  //??Quality drops to 0 after the concert?? What is the concert?
            super.setQuality(0);
        }
        super.setSellIn(sellIn);
    }
}
