package org2.dao;

import org.hibernate.SessionFactory;
import org2.domain.Staff;
import org2.domain.Store;

public class StoreDao extends GenericDAO<Store> {
    public StoreDao(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
