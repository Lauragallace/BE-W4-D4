package lauragallace.BEW4D4.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name= "pizzas")
public class Pizza extends MenuItem{
    private List<Topping> toppings;
    private boolean isXL;

    public Pizza(String name, List<Topping> toppings, boolean isXL) {
        super(name, 1000, 5.00);
        this.toppings = toppings;
        this.isXL = isXL;
        this.calories = countCalories();
        this.price = calculatePrice();
    }
    public int countCalories() {
        int baseCals = 1000;
        int toppingsCals = this.toppings.stream()
                .map(Topping::getCalories)
                .reduce(0, Integer::sum);
        int tot = baseCals + toppingsCals;
        return this.isXL ? (int) (tot * 1.7) : tot;
    }
    public double calculatePrice(){
        double basePrice = 5.00;
        double toppingsPrice = this.toppings.stream()
                .map(Topping::getPrice)
                .reduce(0.0, Double::sum);
        double tot = basePrice + toppingsPrice;
        return this.isXL ? tot*1.7 : tot;
    }
}