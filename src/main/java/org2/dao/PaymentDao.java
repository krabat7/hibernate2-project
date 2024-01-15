package org2.dao;

import org.hibernate.SessionFactory;
import org2.domain.Language;
import org2.domain.Payment;

public class PaymentDao extends GenericDAO<Payment> {
    public PaymentDao(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
