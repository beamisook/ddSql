<%@page import="kr.or.ddit.vo.ProdVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
    ProdVO  vo = (ProdVO)request.getAttribute("vo");

%>    
 {
  "id"    : "<%= vo.getProd_id() %>",
  "name"  : "<%= vo.getProd_name() %>",
  "lgu"   : "<%= vo.getProd_lgu() %>",
  "cost"  : "<%= vo.getProd_cost() %>",
  "detail" : "<%= vo.getProd_detail() %>",
  "buyer"  : "<%= vo.getProd_buyer() %>",
  "outline" : "<%= vo.getProd_outlinse() %>",
  "price"   : "<%= vo.getProd_price() %>",
  "sale"    : "<%= vo.getProd_sale() %>"
}