package com.springHiberNate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springHiberNate.crud.DAL.HibernateOgrencilerDAL;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
		
		
		
		
		
	}
	
	
	
	@GetMapping("/")
	public List<ogrenciler> ogrenciler(){
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(ogrenciler.class).buildSessionFactory();
		Session session = sf.getCurrentSession();
		
		HibernateOgrencilerDAL listele = new HibernateOgrencilerDAL(session);
		
		return listele.listele(); 
	}
	
	

	
	


}
