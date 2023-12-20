package com.cos.book.board.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.book.board.model.dto.Board;
import com.cos.book.board.model.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {

	private final BoardService service;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<List<Board>> selectAll(){
		List<Board> list = service.selectAll();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
}
