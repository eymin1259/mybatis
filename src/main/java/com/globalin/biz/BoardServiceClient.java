package com.globalin.biz;

import java.util.List;

import com.globalin.biz.board.BoardVO;
import com.globalin.biz.board.impl.BoardDAO;

public class BoardServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("run BoardServiceClient ");
		
		BoardDAO boardDAO = new BoardDAO();
		BoardVO vo = new BoardVO();
		
		vo.setTitle("mybatis test title");
		vo.setWriter("tester");
		vo.setContent("mybatis test content");
		boardDAO.insertBoard(vo);
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
		for(int idx = 0; idx<boardList.size(); idx++) {
			
			System.out.println("# " + idx + " board => " + boardList.get(idx).toString());
		}

	}

}
