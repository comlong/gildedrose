package com.gildedrose;

public class Sulfuras extends Item {

    final static int SULFURAS_QUALITY = 80;
    private int quality;

    public Sulfuras(String name, ItemType type) {
        super(name, type);
        this.quality = SULFURAS_QUALITY;
        super.setSold(false);
    }

    //no change of the quality
    @Override
    public void setQuality(int quality) {

    }

    @Override
    public int getQuality() {
        return quality;
    }
}
