import javax.sound.midi.Soundbank;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Deep Dish Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato sauce";

        toppings.add("Shredded Mozzarella Pepperoni");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}