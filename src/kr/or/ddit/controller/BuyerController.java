package kr.or.ddit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.service.BuyerService;
import kr.or.ddit.service.BuyerServiceImpl;
import kr.or.ddit.vo.BuyerVO;

@WebServlet("/buyer")
public class BuyerController  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
				
		BuyerService  service  = BuyerServiceImpl.getService();
		List<BuyerVO> list = service.selectNameList();
		
		req.setAttribute("list", list);
		
		RequestDispatcher disp = req.getRequestDispatcher("0607_ajax/buyerNameList.jsp");
		disp.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//id값을 가져온다 
		String idvalue=  req.getParameter("id");
		//service객체 얻기 
		BuyerService  service = BuyerServiceImpl.getService();
		//메소드 호출 
		BuyerVO  vo =  service.selectByDetail(idvalue);
		
		//jsp로 forward 시켜서 json 데이타를 만들기를 위임 
		req.setAttribute("vo", vo);
		
		RequestDispatcher  disp = req.getRequestDispatcher("0607_ajax/detail.jsp");
		disp.forward(req, resp);
		
		
		
		
	}
}













