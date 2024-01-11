package lauragallace.BEW4D4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name= "beverages")
public class Beverage extends MenuItem{
    public Beverage(String name, int calories, double price) {
        super(name, calories, price);
    }
}