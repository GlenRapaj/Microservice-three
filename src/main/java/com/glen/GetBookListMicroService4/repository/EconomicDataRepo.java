package com.glen.GetBookListMicroService4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glen.GetBookListMicroService4.model.EconomicData;

public interface EconomicDataRepo extends JpaRepository<EconomicData, Integer>{

	EconomicData findByIsbn(int isbn);
}
