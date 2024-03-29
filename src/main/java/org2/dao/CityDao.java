package org2.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org2.domain.Category;
import org2.domain.City;

public class CityDao extends GenericDAO<City> {
    public CityDao(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }

    public City getByName(String name) {
        Query<City> query = getCurrentSession().createQuery("select c from City c where c.city = :NAME", City.class);
        query.setParameter("NAME", name);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}