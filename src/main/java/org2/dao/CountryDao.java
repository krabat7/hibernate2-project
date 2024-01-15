package org2.dao;

import org.hibernate.SessionFactory;
import org2.domain.City;
import org2.domain.Country;

public class CountryDao extends GenericDAO<Country> {
    public CountryDao(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}