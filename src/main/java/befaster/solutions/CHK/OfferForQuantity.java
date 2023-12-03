package befaster.solutions.CHK;


public  class OfferForQuantity {
    private int offerQuant;
    private int offerPrice;

    public OfferForQuantity(int offerQuant, int offerPrice) {
        this.offerQuant = offerQuant;
        this.offerPrice = offerPrice;
    }

    public int getOfferQuant() {
        return offerQuant;
    }

    public void setOfferQuant(int offerQuant) {
        this.offerQuant = offerQuant;
    }

    public int getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(int offerPrice) {
        this.offerPrice = offerPrice;
    }

}
