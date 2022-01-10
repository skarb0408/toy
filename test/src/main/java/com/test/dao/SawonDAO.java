package com.test.dao;

import java.util.List;

import com.test.dto.Sawon;

public interface SawonDAO {
	int insertSawon(Sawon sawon);
	int deleteSawon(int no);
	int updateSawon(Sawon sawon);
	// ��ü
	List<Sawon> selectSawonList();
	// �ϳ� �˻�
	Sawon selectSawonCate(Sawon sawon);
	
	Sawon selectSawon(int no);
}
