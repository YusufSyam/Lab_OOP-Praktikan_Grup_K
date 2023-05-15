class FoodFactory {
    static Food getFood(String food) {  
        if (food.equals("burger")) {
            return new Burger();
        } else if (food.equals("pizza")) {
            return new Pizza();
        } else if (food.equals("steak")) {
            return new Steak();
        } else {
            return null;
        }
    }
}