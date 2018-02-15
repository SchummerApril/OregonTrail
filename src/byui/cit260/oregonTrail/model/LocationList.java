package byui.cit260.oregonTrail.model;

/**
 *
 * @author Nastia
 */
public enum LocationList {
     
     Fort Nox(ScenicStop), San Antonio(CityStop), Fort Nile(RiverCrossingStop); // <-- names of all the locations (25)
     
     private string locationName; 
     private abstract locationType; //check this for validity

    private InventoryItemType(point locationName) {
        this.locationName = locationName;
    }

    public double getLocationName() {
        return locationName;
    }
    
    private void locationType() {
        this.locationType = locationType;
    }
}
