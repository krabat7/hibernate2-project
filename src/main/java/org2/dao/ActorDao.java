package org2.dao;

import org.hibernate.SessionFactory;
import org2.domain.Actor;

public class ActorDao extends GenericDAO<Actor>{
    public ActorDao(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
