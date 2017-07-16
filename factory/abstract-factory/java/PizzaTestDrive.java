public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza;
        // Order New York Cheese Pizza
        pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        // Order Chicago Cheese Pizza
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }
}