/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import models.Employee;
import models.Loan;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import tools.NewHibernateUtil;

/**
 *
 * @author gandol
 */
public class FunctionDAO {

    private final SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    public FunctionDAO() {
        this.sessionFactory = NewHibernateUtil.getSessionFactory();
    }
    
    public List<Employee> function(Employee s, int t, String category, String search) {
        List<Employee> data = new ArrayList<Employee>();
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            if (t == 1) {
                session.saveOrUpdate(s);
            } else if (t == 2) {
                session.delete(s);
            } else if (t == 3) {
                data = session.createQuery("from Employee order by NIK").list();
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
    public List<Loan> function(Loan s, int t, String category, String search) {
        List<Loan> data = new ArrayList<Loan>();
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            if (t == 1) {
                session.saveOrUpdate(s);
            } else if (t == 2) {
                session.delete(s);
            } else if (t == 3) {
                data = session.createQuery("from Loan order by NIK").list();
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

}
