package com.test.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dto.Room;
import com.test.mapper.RoomMapper;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomMapper roomMapper;
	
	// 추가
	@Override
	public void addList(Room room) {
		roomMapper.insertList(room);
	}
	// 삭제
	@Override
	public void removeList(Room room) {
		roomMapper.deleteList(room);
	}
	// 수정
	@Override
	public void modifyList(Room room) {
		roomMapper.updateList(room);
	}
	// 전체 리스트
	@Override
	public List<Room> getRoomList() {
		return roomMapper.selectAllList();
	}
	// 하나검색(글번호)
	@Override
	public Room getNumberList(int num) {
		return roomMapper.selectList(num);
	}
	// 전체 글 갯수
	@Override
	public int getListCount() {
		return roomMapper.selectCountList();
	}
	// 페이징
	@Override
	public List<Room> getListPage(Map<String, Object> map) {
		return roomMapper.selectPageList(map);
	}
}
