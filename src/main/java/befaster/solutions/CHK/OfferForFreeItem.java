package befaster.solutions.CHK;

public class OfferForFreeItem  {

    private int freeItemQuant;
    private String freeItem;

    public int getFreeItemQuant() {
        return freeItemQuant;
    }

    public void setFreeItemQuant(int freeItemQuant) {
        this.freeItemQuant = freeItemQuant;
    }

    public String getFreeItem() {
        return freeItem;
    }

    public void setFreeItem(String freeItem) {
        this.freeItem = freeItem;
    }

    public OfferForFreeItem(int freeItemQuant, String freeItem) {
        this.freeItemQuant = freeItemQuant;
        this.freeItem = freeItem;
    }

    public int totalPrice(){
        return 0;
    }
}
