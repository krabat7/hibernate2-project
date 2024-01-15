package org2.dao;

import org.hibernate.SessionFactory;
import org2.domain.Country;
import org2.domain.Customer;

public class CustomerDao extends GenericDAO<Customer> {
    public CustomerDao(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
