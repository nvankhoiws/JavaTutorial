package core.com.udemy.timbuchalka.oopTest.burgerComposition.classes;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/3/20174:45 PM.
 */
public class CheckPrices {
    public static double checkPrices(BaseBurger baseBurger, Additionals additionals, String item){
        switch (item) {
            case "baseBurger":  return baseBurger.getBasePrice();
            case "additionals":  return additionals.getAdditionalPrice();
            case "bread":  return baseBurger.getPriceOfBread();
            case "meat":  return baseBurger.getPriceOfMeat();
            case "lettuce":  return additionals.getPriceOfLettuce();
            case "tomato":  return additionals.getPriceOfTomato();
            case "carrot":  return additionals.getPriceOfCarrot();
            case "cheese":  return additionals.getPriceOfCheese();
            case "broccoli":  return additionals.getPriceOfBroccoli();
            case "binna": return additionals.getPriceOfBinna();
            case "drinks": return additionals.getPriceOfDrinks();
            case "chips": return additionals.getPriceOfChips();
            default: return baseBurger.getBasePrice() + additionals.getAdditionalPrice();
        }
    }
}
