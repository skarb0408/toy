package com.test.service;

import java.util.List;

import com.test.dto.Sawon;

public interface SawonService {
	void addSawon(Sawon sawon);
	void removeSawon(int no);
	void modifySawon(Sawon sawon);
	
	List<Sawon> getSawonList();

	Sawon getSawonCateSelect(Sawon sawon);
	
	Sawon getSawonSelect(int no);
	
}
