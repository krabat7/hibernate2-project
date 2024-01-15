package org2.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org2.domain.Payment;
import org2.domain.Rental;

public class RentalDao extends GenericDAO<Rental> {
    public RentalDao(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }

    public Rental getAntUnreturnedRental() {
        Query query = getCurrentSession().createQuery("select r from Rental r where r.returnDate IS NULL");
        query.setMaxResults(1);
        return (Rental) query.getSingleResult();
    }
}