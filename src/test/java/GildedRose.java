import com.gildedrose.Item;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public Item[] getItems(){
        return this.items;
    }

    public void updateQuality(Item item){
        int itemSellIn = item.getSellIn();
        itemSellIn--;
        item.setSellIn(itemSellIn);

        int newQuality = 0;
        if(itemSellIn >=0){
            newQuality = item.getQuality() + item.getQualityRating();
        }else{
            newQuality = 2 * item.getQuality() + item.getQualityRating();
        }
        item.setQuality(newQuality);
    }


}
