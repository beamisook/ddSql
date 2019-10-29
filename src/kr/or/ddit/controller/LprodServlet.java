package kr.or.ddit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
import kr.or.ddit.service.LprodService;
import kr.or.ddit.service.LprodServiceImpl;
import kr.or.ddit.vo.LprodVO;

@WebServlet("/lprodServlet")
public class LprodServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		
		//서비스 객체 얻어 메소드 호출 
		LprodService   service = LprodServiceImpl.getService();
		
		List<LprodVO> list = service.selectLprod();
		
		//jsp에서 json 데이타를 만들도록 위임 한다 
		//list를 request에 저장하고 forward
		
		req.setAttribute("list", list);
		RequestDispatcher  disp = req.getRequestDispatcher("0605_ajax/lprod.jsp");
		disp.forward(req, resp);
		
	}

}







