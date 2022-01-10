package com.test.service;

import java.util.List;
import java.util.Map;

import com.test.dto.Room;

public interface RoomService {
	// �߰�
	void addList(Room room);
	// ����
	void removeList(Room room);
	// ����
	void modifyList(Room room);
	
	// ��ü����Ʈ
	List<Room> getRoomList();
	// �ϳ��˻�(�۹�ȣ)
	Room getNumberList(int num);
	// ��ü ����
	int getListCount();
	// ����¡
	List<Room> getListPage(Map<String, Object> map);
	
}
