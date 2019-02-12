/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author gandol
 */
public class DAO<E> implements InterfaceDAO<E>{
    private Session session;
    private Transaction transaction;
    private SessionFactory sessionFactory;

    public DAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public List<E> function(E s, int t, String category, String search) {
        List<E> data = new ArrayList<E>();
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            if (t == 1) {
                session.saveOrUpdate(s);
            } else if (t == 2) {
                session.delete(s);
            } else if (t == 3) {
                data = session.
                        createQuery("from " + s.getClass()
                                .getName() + " order by id ").list();
            } else if (t == 4) {
                data = session.createCriteria(s.getClass())
                        .add(Restrictions.eq("id", search)).addOrder(Order.asc("id")).list();

            } else if (t == 5) {
                data = session.createCriteria(s.getClass())
                        .add(Restrictions.ilike(category, search, MatchMode.ANYWHERE))
                        .addOrder(Order.asc("id")).list();
            }

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return data;
    }

    @Override
    public E getMaxId(E t) {
        E i = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            i = (E) session.createQuery("from " + t.getClass().getName() + " "
                    + "where id = (select max(id) from  " + t.getClass().
                            getName() + " ) ").list().get(0);
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return i;
    }
    
    
}
