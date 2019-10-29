<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
    
       String id = (String)request.getAttribute("res"); //입력한  id
       String res = (String)request.getAttribute("idres");  //검색 결과 
    
    if(res != null) {  //사용불가능
  %>
  
  <%--     --%>
    { 
       "status" : "NO",
       "id" : "<%=id %>"
    
    }
    	
    	
 <%  }else {    // null   사용가능 %>
 
      {
         "status" : "OK",
         "id" : "<%=id %>"
      }	
 
    	
  <%  } 
    
    %>