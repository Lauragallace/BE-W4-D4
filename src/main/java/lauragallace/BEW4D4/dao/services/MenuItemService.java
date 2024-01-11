package lauragallace.BEW4D4.dao.services;

import lauragallace.BEW4D4.dao.repositories.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuItemService {
    @Autowired
    private MenuItemRepository itemRepository;
    
}
