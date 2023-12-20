package com.cos.book.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cos.book.board.model.dto.Board;

public interface BoardDao {
	List<Board> selectAll(SqlSession session);
	
	int insertBoard(SqlSession session, Board b);
	
	int updateBoard(SqlSession session, Board b);
	
	int deleteBoard(SqlSession session, int num);
}
