public class Restaurant {
    public static void main (String [] args){
        RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer();

        RestaurantAbstractFactory restaurantAbstractFactory = new RestaurantFactoryProducer().getRestaurantAbstractFactory(1);
        RestaurantAbstractFactory restaurantAbstractFactory2 = new RestaurantFactoryProducer().getRestaurantAbstractFactory(2);

        System.out.print(restaurantAbstractFactory.getFastFoodFactory("hamburger"));
        System.out.print(restaurantAbstractFactory.getDrink("soda"));

        System.out.print(restaurantAbstractFactory2.getFastFoodFactory("pizza"));
        System.out.print(restaurantAbstractFactory2.getDrink("beer"));

    }
}
