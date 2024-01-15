package org2.dao;

import org.hibernate.SessionFactory;
import org2.domain.Actor;
import org2.domain.Address;

public class AddressDao extends GenericDAO<Address>{
    public AddressDao(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
