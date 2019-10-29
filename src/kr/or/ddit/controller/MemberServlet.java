package kr.or.ddit.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import kr.or.ddit.service.MemberSeriveImpl;
import kr.or.ddit.service.MemberService;
import kr.or.ddit.vo.MemberVO;
import kr.or.ddit.vo.ZipVO;

@WebServlet("/memberServlet")
public class MemberServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 407794549906272587L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//서비스 객체 얻어오기
		MemberService service = MemberSeriveImpl.getMemberService();
		
		List<MemberVO> list = service.selectMember();
		
		request.setAttribute("list", list);

		RequestDispatcher rd = request.getRequestDispatcher("0605_ajax/memberlist.jsp");
		rd.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		// TODO Auto-generated method stub
		MemberService  service = MemberSeriveImpl.getMemberService();
		
		String id = req.getParameter("id");
		String dong = req.getParameter("dong");
		
		if(id != null) {
			//아이디 중복검사
		     String idres = service.selectById(id);  //검색한 id의 결과 - null or 값
			 req.setAttribute("res", id); //클라이언트가 요청시에 html에서 입력한 id 
			 req.setAttribute("idres", idres); //사용가능(null) 또는 불가능(값)을 비교 하기 위함 
		    
			 RequestDispatcher  disp = req.getRequestDispatcher("0607_ajax/idcheck.jsp");
		     disp.forward(req, resp);
			
		}else if(dong != null) {
			//우편번호 검색 
			List<ZipVO> list =  service.selectByDong(dong);
			req.setAttribute("list", list);
			
			RequestDispatcher  disp = req.getRequestDispatcher("0607_ajax/zip.jsp");
		    disp.forward(req, resp);
			
		}else {
			 MemberVO  vo = new MemberVO();
			  //입력된 모든값을 가져온다 
			//vo에 setter를 이용해서 값을 저장
			try {
				BeanUtils.populate(vo, req.getParameterMap());
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//vo를 매개변수로 해서 DB에 저장 (service-> dao- >mapper ->)
		     String res = service.insertMember(vo); //res는 DB에 저장 id
		     
			//DB 저장 성공 결과값(json형식)을 ajax로 보낸다 
			//json데이타는 jsp에서 만들도록 위임한다
		     req.setAttribute("res", res);
		     RequestDispatcher  disp = req.getRequestDispatcher("0607_ajax/joinok.jsp");
		     disp.forward(req, resp);
		}
		
	}
	
	
}
