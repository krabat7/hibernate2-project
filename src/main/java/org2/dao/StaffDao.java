package org2.dao;

import org.hibernate.SessionFactory;
import org2.domain.Rental;
import org2.domain.Staff;

public class StaffDao extends GenericDAO<Staff> {
    public StaffDao(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}