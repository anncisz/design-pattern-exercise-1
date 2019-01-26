package pizza;

import java.util.Arrays;
import java.util.List;

public class MarinaraPizza extends Pizza {
    public MarinaraPizza() {
        super(Arrays.asList("Tomato sos", "Oregano", "Garlic"), 20.00, PizzaType.MARINARA);
    }
}
