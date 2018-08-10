package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {


    @Test
    public void should_decrease_quality_by_two() {
        Item[] items = new Item[]{
          new Item("Aged", 0, 2)
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    public void should_decrease_quality_to_0_and_selling_to_minus_1() {
        Item[] items = new Item[]{
          new Item("Backstage passes to a TAFKAL80ETC concert", 0, 40)
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }


    @Test
    public void should_increase_quality_by_two_and_decrease_selin_by_one() {
        Item[] items = new Item[]{
          new Item("Aged Brie", -10, 40)
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(42, app.items[0].quality);
        assertEquals(-11, app.items[0].sellIn);
    }
}
