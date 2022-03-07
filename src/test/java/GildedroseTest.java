import com.gildedrose.*;

public class GildedroseTest {

    public static void main(String[] args) {
        Item sulfuras = new Sulfuras("sulfuras1", ItemType.Sulfuras);
        Item agedBrie = new AgedBrie("agedBrie1", ItemType.AgedBrie, 8,3,2);
        Item item1 = new Item("item1",ItemType.Normal, 5,5);
        Item item2 = new Item("item2",ItemType.Normal, 10,34);
        item2.setConjured(true);
        Item bp = new BackstagePasses("backstagePasses1",ItemType.BackstagePasses,5,10,1);
        Item[] items = new Item[]{sulfuras, item1,item2,agedBrie, bp};

        GildedRose gr = new GildedRose(items);

        int days = 2;
        while(days >=0){
            for(Item item: gr.getItems()){
                System.out.println("name:"+item.getName()+" type:"+item.getType()+" sellIn:"+ item.getSellIn()+" quality:"+item.getQuality());
                gr.updateQuality(item);
              //  System.out.println("name:"+item.getName()+" type:"+item.getType()+" sellIn:"+ item.getSellIn()+" quality:"+item.getQuality());
            }
            System.out.println("------------Next Day-------------------------");
            days--;
        }
    }
}
