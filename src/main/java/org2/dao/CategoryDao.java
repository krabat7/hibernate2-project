package org2.dao;

import org.hibernate.SessionFactory;
import org2.domain.Address;
import org2.domain.Category;

public class CategoryDao extends GenericDAO<Category>{
    public CategoryDao(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
