package kr.or.ddit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.service.ProdService;
import kr.or.ddit.service.ProdServiceImpl;
import kr.or.ddit.vo.ProdVO;

@WebServlet("/prodServlet")
public class ProdServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	  
		req.setCharacterEncoding("UTF-8");
	  String lprod_gu = req.getParameter("lprod_gu");
	  String prod_id = req.getParameter("prod_id");
	  
	  ProdService  service = ProdServiceImpl.getService();
	  
	  //요청에서 lprod_gu 를 받아서 prod_lgu같음을 비교 
	  if(lprod_gu != null){
		 
		  List<ProdVO> list = service.selectByLgu(lprod_gu);
		  req.setAttribute("list", list);
		  
		  RequestDispatcher  disp = req.getRequestDispatcher("0612_ajax/prodName.jsp");
		  disp.forward(req, resp);
	  }else if(prod_id != null){
		 //요청에서 prod_id를 받아서 상세정보보기 
		  ProdVO vo =  service.selectDetail(prod_id) ;
		  req.setAttribute("vo", vo);
		  RequestDispatcher  disp = req.getRequestDispatcher("0612_ajax/prodDetail.jsp");
		  disp.forward(req, resp);
	  }
		
	}
}
