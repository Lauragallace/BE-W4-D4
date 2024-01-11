package lauragallace.BEW4D4.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@AllArgsConstructor
public class Menu {
    List<Pizza> pizzas;
    List<Topping> toppings;
    List<Beverage> beverages;
    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzas.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppings.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.beverages.forEach(System.out::println);
        System.out.println();

    }
}