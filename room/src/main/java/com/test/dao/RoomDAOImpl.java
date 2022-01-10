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
	
	// �߰�
	@Override
	public int insertList(Room room) {
		return sqlSession.getMapper(RoomMapper.class).insertList(room);
	}
	// ����
	@Override
	public int deleteList(Room room) {
		return sqlSession.getMapper(RoomMapper.class).deleteList(room);
	}
	// ����
	@Override
	public int updateList(Room room) {
		return sqlSession.getMapper(RoomMapper.class).updateList(room);
	}
	// ��ü ����Ʈ
	@Override
	public List<Room> selectAllList() {
		return sqlSession.getMapper(RoomMapper.class).selectAllList();
	}
	// �ϳ� �˻�
	@Override
	public Room selectList(int num) {
		return sqlSession.getMapper(RoomMapper.class).selectList(num);
	}
	// ��ü ���� ���
	@Override
	public int selectCountList() {
		return sqlSession.getMapper(RoomMapper.class).selectCountList();
	}
	// ����¡
	@Override
	public List<Room> selectPageList(Map<String, Object> map) {
		return sqlSession.getMapper(RoomMapper.class).selectPageList(map);
	}

}
