package pizza;

public class PizzaFactory {

    public Pizza create (PizzaType pizzaType){
        if(PizzaType.CAPRICIOSA.equals(pizzaType)){
            return new CapriciosaPizza();

        } else if (PizzaType.HAWAII.equals(pizzaType)){
            return new HawaiPizza();

        }else if (PizzaType.MARGHERITA.equals(pizzaType)){
            return new MargheritaPizza();

        }else if (PizzaType.MARINARA.equals(pizzaType)){
            return new MarinaraPizza();
        }
        return null;
    }
}
