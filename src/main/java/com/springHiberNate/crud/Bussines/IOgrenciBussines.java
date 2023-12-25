package com.springHiberNate.crud.Bussines;

import java.util.List;

import com.springHiberNate.crud.ogrenciler;

public interface IOgrenciBussines {

	List<ogrenciler> listele();
	void add(ogrenciler ogrenci);
	void update(ogrenciler ogrenci);
	void delete(ogrenciler ogrenci);
}
