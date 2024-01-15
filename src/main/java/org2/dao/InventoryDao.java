package org2.dao;

import org.hibernate.SessionFactory;
import org2.domain.FilmText;
import org2.domain.Inventory;

public class InventoryDao extends GenericDAO<Inventory> {
    public InventoryDao(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}