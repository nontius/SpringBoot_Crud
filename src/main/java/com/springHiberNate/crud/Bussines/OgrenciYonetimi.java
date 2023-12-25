package com.springHiberNate.crud.Bussines;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springHiberNate.crud.ogrenciler;
import com.springHiberNate.crud.DAL.IOgrenciDAL;
@Service
public class OgrenciYonetimi implements IOgrenciBussines {

	private IOgrenciDAL ogrenciDal;
	
	@Autowired
	public OgrenciYonetimi(IOgrenciDAL ogrenciDal) {
		this.ogrenciDal = ogrenciDal;
	}
	
	
	@Override
	@Transactional
	public List<ogrenciler> listele() {
		// TODO Auto-generated method stub
		return this.ogrenciDal.listele();
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
