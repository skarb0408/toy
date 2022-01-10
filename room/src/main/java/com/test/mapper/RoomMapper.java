package com.test.mapper;

import java.util.List;
import java.util.Map;

import com.test.dto.Room;

public interface RoomMapper {
	// �߰�
	int insertList(Room room);
	// ����
	int deleteList(Room room);
	// ����
	int updateList(Room room);
	// ��ü ����Ʈ ���
	List<Room> selectAllList();
	// �ϳ� �˻�(�۹�ȣ)
	Room selectList(int num);
	// ��ü ī��Ʈ
	int selectCountList();
	// ����¡ ó����
	List<Room> selectPageList(Map<String, Object> map);
}
