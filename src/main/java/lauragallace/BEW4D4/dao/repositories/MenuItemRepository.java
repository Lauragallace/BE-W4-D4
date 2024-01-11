package lauragallace.BEW4D4.dao.repositories;

import lauragallace.BEW4D4.entities.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemRepository extends JpaRepository <MenuItem, Long> {
}
