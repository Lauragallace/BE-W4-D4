package lauragallace.BEW4D4.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class MenuItem {
    @Id
    @GeneratedValue
    protected long id;
    protected String name;
    protected int calories;
    protected double price;
}