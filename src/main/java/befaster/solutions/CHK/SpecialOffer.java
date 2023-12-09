package befaster.solutions.CHK;

import java.util.List;
import java.util.Map;

public class SpecialOffer {

    private List<OfferForQuantity> offerForQuantityList;

    private List<OfferForFreeItem> offerForFreeItemList;

    public SpecialOffer(List<OfferForQuantity> offerForQuantityList, List<OfferForFreeItem> offerForFreeItemList) {
        this.offerForQuantityList = offerForQuantityList;
        this.offerForFreeItemList = offerForFreeItemList;
    }

    public List<OfferForQuantity> getOfferForQuantityList() {
        return offerForQuantityList;
    }

    public List<OfferForFreeItem> getOfferForFreeItemList() {
        return offerForFreeItemList;
    }
}
