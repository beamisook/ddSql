<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
[
 <%
    String submenu =  request.getParameter("submenu"); 
    String menus[] = submenu.split(" ");
    
    for(int i=0; i<menus.length ;  i++){
    	if(i > 0) out.print(",");
 %>
   {
     "item"  :  "<%= menus[i] %>"
   
   }
   	
<%  }
 %>
 
 ]