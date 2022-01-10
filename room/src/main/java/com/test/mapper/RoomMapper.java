package com.test.mapper;

import java.util.List;
import java.util.Map;

import com.test.dto.Room;

public interface RoomMapper {
	// 추가
	int insertList(Room room);
	// 삭제
	int deleteList(Room room);
	// 수정
	int updateList(Room room);
	// 전체 리스트 출력
	List<Room> selectAllList();
	// 하나 검색(글번호)
	Room selectList(int num);
	// 전체 카운트
	int selectCountList();
	// 페이징 처리용
	List<Room> selectPageList(Map<String, Object> map);
}
