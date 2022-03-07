package com.gildedrose;

public class AgedBrie extends Item {

    public static int AGEDBRIEQUALITYRATING = 1;

    public AgedBrie(String name, ItemType type, int sellIn, int quality, int qualityRating) {
        super(name,type, sellIn, quality);
        if (qualityRating <= 0) {
            qualityRating = AGEDBRIEQUALITYRATING;
        }
        super.setQualityRating(qualityRating);
    }
}
