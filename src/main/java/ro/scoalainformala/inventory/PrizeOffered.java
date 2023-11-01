package ro.scoalainformala.inventory;

import java.util.Objects;

public class PrizeOffered implements Comparable<PrizeOffered> {
    private String type;
    private int total;

    public PrizeOffered(String type, int total) {
        this.type = type;
        this.total = total;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Toy: " + type + " offered " + total + " times.";
    }

    @Override
    public int compareTo(PrizeOffered s) {
        return this.type != null ?
                (s.type != null ?
                        this.type.compareTo(s.type) :
                        1) :
                -1;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(type);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof PrizeOffered) {
            PrizeOffered other = (PrizeOffered) obj;
            if (this.getType().equals(other.getType())) {
                return true;
            }
        }
        return false;
    }
}
