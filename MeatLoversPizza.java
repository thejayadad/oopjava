public class MeatLoversPizza extends Pizza{
    public MeatLoversPizza(boolean veg){
        super(false);
        super.addExtraToppings();
        super.addextraCheese();;
    }
    @Override
    public void addextraCheese(){}

    @Override
    public void addExtraToppings(){}
}
