package com.springHiberNate.crud.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springHiberNate.crud.ogrenciler;
import com.springHiberNate.crud.Bussines.IOgrenciBussines;
import com.springHiberNate.crud.DAL.IOgrenciDAL;

@RestController
@RequestMapping("/api")
public class OgrenciKontrolu {

	
	private IOgrenciBussines ogrenciBus;
	
	@Autowired
	public OgrenciKontrolu(IOgrenciBussines ogrenciBus) {
		this.ogrenciBus = ogrenciBus;
	}
	
	@GetMapping("/ogrenciler")
	public List<ogrenciler> list(){
		
		return ogrenciBus.listele();	
	}
}
