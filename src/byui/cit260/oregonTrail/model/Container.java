package byui.cit260.oregonTrail.model;

/**
 *
 * @author aschummer
 */
public class Container {
    private int weight;
    private int maxCarryWeight;
    private Inventory contents;

    public Container() {
        this.contents = new Inventory();
    }

    public Inventory getContents() {
        return contents;
    }

    public void setContents(Inventory contents) {
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxCarryWeight() {
        return maxCarryWeight;
    }

    public void setMaxCarryWeight(int maxCarryWeight) {
        this.maxCarryWeight = maxCarryWeight;
    }
    
}
