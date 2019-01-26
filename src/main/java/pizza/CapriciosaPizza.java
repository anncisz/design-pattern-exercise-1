package pizza;

import java.util.Arrays;
import java.util.List;

public class CapriciosaPizza extends Pizza{

    public CapriciosaPizza() {
        super(Arrays.asList("Cheese", "Ham", "Champignons"), 29.00, PizzaType.CAPRICIOSA);
    }
}
