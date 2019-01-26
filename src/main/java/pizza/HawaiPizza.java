package pizza;

import java.util.Arrays;
import java.util.List;

public class HawaiPizza extends Pizza {

    public HawaiPizza() {
        super(Arrays.asList("Cheese", "Ham", "Pineapple"), 28.00, PizzaType.HAWAII);
    }
}
