package org2.dao;

import org.hibernate.SessionFactory;
import org2.domain.Film;
import org2.domain.FilmText;

public class FilmTextDao extends GenericDAO<FilmText> {
    public FilmTextDao(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}