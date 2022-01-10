package com.test.mapper;

import java.util.List;

import com.test.dto.Sawon;

public interface SawonMapper {
	int insertSawon(Sawon sawon);
	int deleteSawon(int no);
	int updateSawon(Sawon sawon);
	// 전체
	List<Sawon> selectSawonList();
	// 하나 검색
	Sawon selectSawonCate(Sawon sawon);
	
	Sawon selectSawon(int no);
}
