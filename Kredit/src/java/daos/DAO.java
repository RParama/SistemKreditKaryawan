/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class DAO<E> implements DAOInterface<E> {

    private Session session;
    private Transaction transaction;
    private SessionFactory sessionFactory;

    public DAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * Overriding method function from DAO Interface with function to save or
     * update, delete, getAll, getById
     *
     * @param s entity variable input
     * @param t option, save or update if = 1, delete if = 2, getAll if = 3,
     * getById if = 4, search if = 5
     * @param category search category for search purpose
     * @param search input string for getById purpose
     * @return list with entity variable with content varying with option
     */
    @Override
    public List<E> function(E s, int t, String category, String search) {
        List<E> data = new ArrayList<E>();
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            switch (t) {
                case 1:
                    session.saveOrUpdate(s);
                    break;
                case 2:
                    session.delete(s);
                    break;
                case 3:
                    data = session.
                            createQuery("from " + s.getClass()
                                    .getName() + " order by id ").list();
                    break;
                case 4:
                    data = session.createCriteria(s.getClass())
                            .add(Restrictions.eq("id", search)).addOrder(Order.asc("id")).list();
                    break;
                case 5:
                    data = session.createCriteria(s.getClass())
                            .add(Restrictions.ilike(category, search, MatchMode.ANYWHERE))
                            .addOrder(Order.asc("id")).list();
                    break;
                default:
                    break;
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

    /**
     * Overriding function getMaxId from DAO Interface with function to retrieve
     * highest id value from entity variable
     *
     * @param t entity variable input
     * @return entity variable with highest id value
     */
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
