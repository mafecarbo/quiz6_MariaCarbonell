class Restaurant1Factory extends RestaurantAbstractFactory {
    @Override
    public FastFood getFastFoodFactory(String type) {
        switch (type){
            case "hamburger" : return  new Hamburger();
            case "sandwich" : return  new Sandwich();
            case "hot dog" : return  new HotDog();
            default: return  null;
        }
    }

    @Override
    public Drink getDrink(String type) {
        switch (type){
            case "soda" : return  new Soda();
            default: return  null;
        }
    }
}
