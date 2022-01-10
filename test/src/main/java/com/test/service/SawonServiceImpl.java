package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.SawonDAO;
import com.test.dto.Sawon;

@Service
public class SawonServiceImpl implements SawonService {
	@Autowired
	private SawonDAO sawonDAO;

	@Override
	public void addSawon(Sawon sawon) {
		sawonDAO.insertSawon(sawon);
	}

	@Override
	public void removeSawon(int no) {
		sawonDAO.deleteSawon(no);
	}

	@Override
	public void modifySawon(Sawon sawon) {
		sawonDAO.updateSawon(sawon);
	}

	@Override
	public List<Sawon> getSawonList() {
		return sawonDAO.selectSawonList();
	}

	@Override
	public Sawon getSawonCateSelect(Sawon sawon) {
		return sawonDAO.selectSawonCate(sawon);
	}

	@Override
	public Sawon getSawonSelect(int no) {
		return sawonDAO.selectSawon(no);
	}
	
	
}
