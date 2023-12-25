package com.springHiberNate.crud.DAL;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springHiberNate.crud.ogrenciler;

import jakarta.persistence.EntityManager;


// JPA 
@Repository
@Component
public class HibernateOgrencilerDAL implements IOgrenciDAL{

	
	private EntityManager entityManager;
	@Autowired
	public HibernateOgrencilerDAL(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}
	
	
	@Override
	@Transactional
	public List<ogrenciler> listele() {
		Session session =  entityManager.unwrap(Session.class);
		
		return session.createQuery("from ogrenciler", ogrenciler.class).getResultList();
	}

	@Override
	public void add(ogrenciler ogrenci) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ogrenciler ogrenci) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ogrenciler ogrenci) {
		// TODO Auto-generated method stub
		
	}

}
