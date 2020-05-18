package com.oara.org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oara.org.dto.Restaurant;

public class CommonDao 
{
	public void saveRestaurant(Restaurant restaurant)
	{
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Restaurant.class);
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(restaurant);
		transaction.commit();
	}
	
	public Restaurant getRestaurantDetails(String name)
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Restaurant.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Restaurant restaurant = session.get(Restaurant.class, name);
		return restaurant;
	}
	
	public List<Restaurant> getRestaurants()
	{
		Configuration configuration = new Configuration();	
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "from Restaurant";
		Query query = session.createQuery(hql);
		List<Restaurant> list = query.list();
		return list;
	}
	
	public boolean updateRestrurantDetails(String name,double value)
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory SessionFactory = configuration.buildSessionFactory();
		Session session = SessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Restaurant restaurant = session.get(Restaurant.class,name);
		if(restaurant!=null)
		{
			restaurant.setPrice(value);
		}
		else
		{
			System.out.println("Data not exist");
			return false;
		}
		session.save(restaurant);
		transaction.commit();
		return true;
	}
	
	
	public boolean deleteByName(String name)
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Restaurant restaurant = getRestaurantDetails(name);
		if(restaurant!=null)
		{
		session.delete(name, restaurant);
		}
		else
		{
			System.out.println("Data not exist");
			return false;
		}
		transaction.commit();
		return true;
	}
	
	
	public Restaurant getRestaurantByName(String name)
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql1 = "from Restaurant where name=:n";
		session.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
