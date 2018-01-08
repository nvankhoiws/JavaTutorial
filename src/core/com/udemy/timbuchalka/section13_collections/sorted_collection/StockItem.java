package core.com.udemy.timbuchalka.section13_collections.sorted_collection;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 1/8/201812:15 PM.
 */
public final class StockItem implements Comparable<StockItem> {
    private String name;
    private Double price;
    private Integer quantity = 0;

    public StockItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public StockItem(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer adjust(Integer quantity){
        this.quantity += quantity;
        return new Integer(this.quantity);
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    // Sort all stock items in alphabet order
    @Override
    public int compareTo(StockItem o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockItem stockItem = (StockItem) o;

        return name.equals(stockItem.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
