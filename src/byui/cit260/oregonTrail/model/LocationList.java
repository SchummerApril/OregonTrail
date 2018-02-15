package byui.cit260.oregonTrail.model;

/**
 *
 * @author Nastia
 */
public enum LocationList {
     
     Fort Nox, San Antonio; // <-- names of all the locations (25)
     
     private double locationName; 

    private InventoryItemType(point locationName) {
        this.locationName = locationName;
    }

    public double getLocationName() {
        return locationName;
    }
