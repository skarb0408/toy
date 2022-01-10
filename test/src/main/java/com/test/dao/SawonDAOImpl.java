package com.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.Sawon;
import com.test.mapper.SawonMapper;

@Repository
public class SawonDAOImpl implements SawonDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertSawon(Sawon sawon) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(SawonMapper.class).insertSawon(sawon);
	}

	@Override
	public int deleteSawon(int no) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(SawonMapper.class).deleteSawon(no);
	}

	@Override
	public int updateSawon(Sawon sawon) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(SawonMapper.class).updateSawon(sawon);
	}

	@Override
	public List<Sawon> selectSawonList() {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(SawonMapper.class).selectSawonList();
	}

	@Override
	public Sawon selectSawonCate(Sawon sawon) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(SawonMapper.class).selectSawonCate(sawon);
	}

	@Override
	public Sawon selectSawon(int no) {
		return sqlSession.getMapper(SawonMapper.class).selectSawon(no);
	}
}
