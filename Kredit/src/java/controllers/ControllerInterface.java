/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author gandol
 */
public interface ControllerInterface<E> {
    public boolean saveOrEdit(E e);
    public boolean delete(E e);
    public List<E> getAll(E e);
    public E findById(E e, String id);
    public E getMaxId(E e);    
    public List<E> search(E e, String category, String id);
}
