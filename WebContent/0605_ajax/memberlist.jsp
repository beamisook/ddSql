<%@page import="kr.or.ddit.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

[
    <%
      List<MemberVO> list = (List<MemberVO>)request.getAttribute("list"); 
      for(int i=0; i<list.size(); i++){
    	  MemberVO  vo = list.get(i);
    	  if(i > 0) out.print(",");
    %>
       {
         "id"   : "<%= vo.getMem_id() %>",
         "name" : "<%= vo.getMem_name() %>",
         "mail" : "<%= vo.getMem_mail() %>",
         "hp"   : "<%= vo.getMem_hp() %>",
         "addr" : "<%= vo.getMem_add1() %>"
        }
    
   <%	  
      }
    %>
 ]