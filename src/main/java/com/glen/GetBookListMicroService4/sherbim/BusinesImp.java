package com.glen.GetBookListMicroService4.sherbim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.glen.GetBookListMicroService4.model.EconomicData;
import com.glen.GetBookListMicroService4.repository.EconomicDataRepo;

@Component
@ConfigurationProperties(prefix="com.glen")
public class BusinesImp implements Busines{

	
	@Autowired
	private EconomicDataRepo economicDataRepo;
	
	int[] kostoLibrash = new int[2];
	int[] trLibrash = new int[2];
	
	private int kostolibrash0;
	private int kostolibrash1;
	
	private int trbrash0;
	private int trbrash1;
	

	public BusinesImp() {
		super();
	}




	@Override
	public void economy(int isbn) {
		
		kostoLibrash[0] = kostolibrash0;
		kostoLibrash[1] = kostolibrash1;
		
		trLibrash[0] = trbrash0;
		trLibrash[1] = trbrash1;
		
		
		
		EconomicData ed = economicDataRepo.findByIsbn(isbn);
		System.out.println(ed);
	
		double tr = ed.getTeardhura() + trLibrash[isbn-1];
		ed.setTeardhura(tr);
		
		tr = ed.getShpenzime() + kostoLibrash[isbn-1];
		ed.setShpenzime(tr);
		
		tr = ed.getTeardhura();
		double tc= ed.getShpenzime();
		tr = tr - tc ;
		ed.setDiferenca(tr);
		
		economicDataRepo.save(ed);
	}
	
	
	
	
	public int getKostolibrash0() {
		return kostolibrash0;
	}





	public void setKostolibrash0(int kostolibrash0) {
		this.kostolibrash0 = kostolibrash0;
	}





	public int getKostolibrash1() {
		return kostolibrash1;
	}





	public void setKostolibrash1(int kostolibrash1) {
		this.kostolibrash1 = kostolibrash1;
	}





	public int getTrbrash0() {
		return trbrash0;
	}





	public void setTrbrash0(int trbrash0) {
		this.trbrash0 = trbrash0;
	}





	public int getTrbrash1() {
		return trbrash1;
	}





	public void setTrbrash1(int trbrash1) {
		this.trbrash1 = trbrash1;
	}

}
