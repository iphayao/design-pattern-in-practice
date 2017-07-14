public class NYPizzaIngradientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDought();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni creatPepperoni() {
        return new SlicedPeperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}