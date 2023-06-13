import chapter2.Builder.Calzone;
import chapter2.Builder.NutritionFacts;
import chapter2.Builder.NyPizza;

import static chapter2.Builder.NyPizza.Size.SMALL;
import static chapter2.Builder.Pizza.Topping.*;

public class Main {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .carbohydrate(100)
                .calories(100)
                .sodium(100)
                .fat(100).build();

        System.out.println("cocaCola = " + cocaCola);

        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
        System.out.println("pizza = " + pizza);
        System.out.println("calzone = " + calzone);
    }
}