<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    
       String res = (String)request.getAttribute("res");
    
    if(res != null) {
  %>
    { 
       "status" : "OK",
       "id" : "<%=res %>"
    
    }
    	
    	
 <%  }else {  %>
 
      {
         "status" : "NO"
      }	
 
    	
  <%  } 
    
    %>