package com.cos.book.board.model.service;

import java.util.List;

import com.cos.book.board.model.dto.Board;

public interface BoardService {
	
	List<Board> selectAll();
	
	int insertBoard(Board b);
	
	int updateBoard(Board b);
	
	int deleteBoard(int num);
	
}
