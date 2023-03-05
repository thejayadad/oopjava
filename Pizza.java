public class Pizza {

    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsprice = 150;
    private int backPack = 200;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded  = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;


    public Pizza(Boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addextraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppingsprice;

    }
    public void takeAway(){
        isOptedForTakeAway = true;
        this.price += backPack;

    }
    public void getBill(){
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if(isExtraCheeseAdded ){
            bill += "Extra cheeses added: " + extraCheesePrice + "\n";
        }
         if(isExtraToppingsAdded ){
            bill += "Extra Toppings added: " + extraToppingsprice + "\n";
        }
        if(isOptedForTakeAway){
            bill += "Opted Take out" + backPack + "\n";
        }
        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);

    }



}
