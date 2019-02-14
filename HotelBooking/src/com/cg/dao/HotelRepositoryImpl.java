package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entity.hoteldetails;
@Repository
public class HotelRepositoryImpl implements HotelRepository{
@PersistenceContext
private EntityManager entityManager;


@Override
public List<hoteldetails> loadAll() {
	TypedQuery<hoteldetails> query=entityManager.createQuery("SELECT e FROM hoteldetails e",hoteldetails.class);
	
	return query.getResultList();
}
	}


