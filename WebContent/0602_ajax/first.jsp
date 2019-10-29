<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   <%
      request.setCharacterEncoding("UTF-8");
      String name = request.getParameter("name");
      String age = request.getParameter("age");
   
   %>
   
   <%=  age %>세인 <%= name %>님 환영합니다 <br>
   Ajax를 공부 해 봅시다 
