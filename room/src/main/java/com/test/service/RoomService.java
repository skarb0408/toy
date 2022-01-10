package com.test.service;

import java.util.List;
import java.util.Map;

import com.test.dto.Room;

public interface RoomService {
	// 추가
	void addList(Room room);
	// 삭제
	void removeList(Room room);
	// 수정
	void modifyList(Room room);
	
	// 전체리스트
	List<Room> getRoomList();
	// 하나검색(글번호)
	Room getNumberList(int num);
	// 전체 갯수
	int getListCount();
	// 페이징
	List<Room> getListPage(Map<String, Object> map);
	
}
