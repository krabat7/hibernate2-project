package org2.dao;

import org.hibernate.SessionFactory;
import org2.domain.Inventory;
import org2.domain.Language;

public class LanguageDao extends GenericDAO<Language> {
    public LanguageDao(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}