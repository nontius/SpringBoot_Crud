package com.springHiberNate.crud.DAL;

import java.util.List;

import com.springHiberNate.crud.ogrenciler;

public interface IOgrenciDAL {
	
	List<ogrenciler> listele();
	void add(ogrenciler ogrenci);
	void update(ogrenciler ogrenci);
	void delete(ogrenciler ogrenci);
	

}
