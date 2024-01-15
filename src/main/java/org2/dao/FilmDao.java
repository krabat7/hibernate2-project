package org2.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org2.domain.Customer;
import org2.domain.Film;

public class FilmDao extends GenericDAO<Film> {
    public FilmDao(SessionFactory sessionFactory) {
        super(Film.class, sessionFactory);
    }

    public Film getFirstAvailableFilmForRent() {
        Query<Film> query = getCurrentSession().createQuery("select f from Film f " +
                        "where f.id not in (select distinct film.id from Inventory)", Film.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
