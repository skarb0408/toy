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
	
	// �߰�
	@Override
	public void addList(Room room) {
		roomMapper.insertList(room);
	}
	// ����
	@Override
	public void removeList(Room room) {
		roomMapper.deleteList(room);
	}
	// ����
	@Override
	public void modifyList(Room room) {
		roomMapper.updateList(room);
	}
	// ��ü ����Ʈ
	@Override
	public List<Room> getRoomList() {
		return roomMapper.selectAllList();
	}
	// �ϳ��˻�(�۹�ȣ)
	@Override
	public Room getNumberList(int num) {
		return roomMapper.selectList(num);
	}
	// ��ü �� ����
	@Override
	public int getListCount() {
		return roomMapper.selectCountList();
	}
	// ����¡
	@Override
	public List<Room> getListPage(Map<String, Object> map) {
		return roomMapper.selectPageList(map);
	}
}
