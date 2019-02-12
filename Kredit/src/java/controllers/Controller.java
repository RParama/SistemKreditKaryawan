/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAO;
import daos.DAOInterface;
import java.util.List;
import org.hibernate.SessionFactory;

public class Controller<E> implements ControllerInterface<E> {

    private DAOInterface dao;

    public Controller(SessionFactory sessionFactory) {
        this.dao = new DAO(sessionFactory);
    }

    @Override
    public boolean saveOrEdit(E e) {
        boolean status = false;
        try {
            dao.function(e, 1, "", "");
            status = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return status;
    }

    @Override
    public boolean delete(E e) {
        boolean status = false;
        try {
            dao.function(e, 2, "", "");
            status = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return status;
    }

    @Override
    public List<E> getAll(E e) {
        return dao.function(e, 3, "", "");
    }

    @Override
    public E findById(E e, String id) {
        return (E) dao.function(e, 4, "", id).get(0);
    }

    @Override
    public E getMaxId(E e) {
        return (E) dao.getMaxId(e);
    }

    @Override
    public List<E> search(E e, String category, String id) {
        return (List<E>) dao.function(e, 5, category, id);
    }

}
