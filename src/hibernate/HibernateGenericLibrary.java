/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gustavo Vieira
 */
public class HibernateGenericLibrary {
    
    private static Session session = null;
    
    /**
     * Initializes and opens a database session using hibernate
     */
    private static void openSession()
    {
        if(session == null)
        {
            session = HibernateUtil.getSessionFactory().openSession();
        }
    }
    
    /**
     * Retrieves data from database into a list
     * @param hql Query Script
     * @return SQL List
     */
    public static List executeHQLQuery(String hql)
    {
        Transaction transaction = null;
        try
        {
            openSession();
            transaction = session.beginTransaction();
            
            Query query = session.createQuery(hql);
            List list = query.list();
            
            transaction.commit();
            
            return list;
        }
        catch(HibernateException ex)
        {
            if(transaction != null)
            {
                transaction.rollback();
            }
            
            ex.printStackTrace();
        }
        
        return new ArrayList<>();
    }
    
    /**
     * Saves an object into the database using hibernate
     * @param object Data that will be inserted into the database
     */
    public static void saveObject(Object object)
    {
        Transaction transaction = null;
        
        try
        {
            openSession();
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            if(transaction != null)
            {
                transaction.rollback();
            }
        }
    }
    
    /**
     * Updates an object on the database
     * @param object Object to be updated in the database
     */
    public static void updateObject(Object object)
    {
        Transaction transaction = null;
        
        try
        {
            openSession();
            transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
        }
        catch(Exception ex)
        {
            if(transaction != null)
            {
                transaction.rollback();
            }
        }
    }
    
    /**
     * Closes the session connection
     */
    public static void closeSession()
    {
        if(session == null)
        {
            session.close();
        }
    }
}
