package com.test.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Room;
import com.test.mapper.RoomMapper;

@Repository
public class RoomDAOImpl implements RoomMapper{
	
	@Autowired
	private SqlSession sqlSession;
	
	// 추가
	@Override
	public int insertList(Room room) {
		return sqlSession.getMapper(RoomMapper.class).insertList(room);
	}
	// 삭제
	@Override
	public int deleteList(Room room) {
		return sqlSession.getMapper(RoomMapper.class).deleteList(room);
	}
	// 수정
	@Override
	public int updateList(Room room) {
		return sqlSession.getMapper(RoomMapper.class).updateList(room);
	}
	// 전체 리스트
	@Override
	public List<Room> selectAllList() {
		return sqlSession.getMapper(RoomMapper.class).selectAllList();
	}
	// 하나 검색
	@Override
	public Room selectList(int num) {
		return sqlSession.getMapper(RoomMapper.class).selectList(num);
	}
	// 전체 갯수 출력
	@Override
	public int selectCountList() {
		return sqlSession.getMapper(RoomMapper.class).selectCountList();
	}
	// 페이징
	@Override
	public List<Room> selectPageList(Map<String, Object> map) {
		return sqlSession.getMapper(RoomMapper.class).selectPageList(map);
	}

}
