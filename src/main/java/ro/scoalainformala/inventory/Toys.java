package ro.scoalainformala.inventory;

public class Toys {
    private String type;
    private int stock;
    private int offered = 0;

    public Toys(String type, int stock) {
        this.type = type;
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStock() {
        return stock;
    }

    public int getOffered() {
        return offered;
    }

    public void setOffered(int offered) {
        this.offered = offered;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Toy: " + type + " - available stock: " + stock;
    }
}
