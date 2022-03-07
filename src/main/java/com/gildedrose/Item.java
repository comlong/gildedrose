package com.gildedrose;

public class Item {
    private String name;

    private ItemType type;

    private int sellIn;

    private int quality;

    private int qualityRating = -1;

    private boolean isConjured = false;

    private boolean isSold = true;

    final static int CONJURED_RATING = 2;


    public Item(String name, ItemType type) {
        this.name = name;
        this.type = type;
    }

    public Item(String name,ItemType type, int quality) {
        this.name = name;
        this.type = type;
        this.quality = quality;
    }

    public Item(String name,ItemType type, int sellIn, int quality) {
        this.name = name;
        this.type = type;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public Item(String name,ItemType type, int sellIn, int quality, Boolean isConjured) {
        this.name = name;
        this.type = type;
        this.sellIn = sellIn;
        this.quality = quality;
        this.isConjured = isConjured;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public int getQualityRating() {
        return qualityRating;
    }

    public void setQualityRating(int qualityRating) {
        this.qualityRating = qualityRating;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public boolean isConjured() {
        return isConjured;
    }

    public void setConjured(boolean conjured) {
        if (conjured == true && qualityRating < 0) {
            qualityRating = qualityRating * CONJURED_RATING;
        }
        isConjured = conjured;
    }

    //easy for UpdateQuality change in the future.
    public void setQualityWithNoCondition(int quality) {
        this.quality = quality;
    }

    public void setQuality(int quality) {
        if (quality >= 50) {
            quality = 50;
        }
        if (quality <= 0) {
            quality = 0;
        }
        this.quality = quality;
    }
}
