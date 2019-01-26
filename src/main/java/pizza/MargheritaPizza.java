package pizza;

import java.util.Arrays;
import java.util.List;

public class MargheritaPizza extends Pizza{

    public MargheritaPizza() {
        super(Arrays.asList("Cheese", "Oregano"), 24.00, PizzaType.MARGHERITA);
    }
}
