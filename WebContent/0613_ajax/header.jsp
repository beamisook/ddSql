<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>
 
</style>

<nav class="navLogo">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">
         <img src="../images/image.6.jpg"/>
      </a>
    </div>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-plus"></span>회원가입</a></li>
      </ul>
  
  </div>
</nav>
  
 <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     </div>
     <!-- 드롭다운 메뉴 만들기  -->
     <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
	   	 <a class="dropdown-toggle" type="button" data-toggle="dropdown">마이페이지
	   	 <span class="caret"></span></a>
	    	<ul class="dropdown-menu">
	      	 <li><a href="#">주문배송조회 </a></li>
	      	 <li><a href="#">장바구니 </a></li>
	      	 <li><a href="#">적립금조회 </a></li>
      		</ul> 
        </li>
        
         <li class="dropdown">
	   	 <a class="dropdown-toggle" type="button" data-toggle="dropdown">이벤트
	   	 <span class="caret"></span></a>
	    	<ul class="dropdown-menu">
	      	 <li><a href="#">할인이벤트 </a></li>
	      	 <li><a href="#">1+1 </a></li>
	      	 <li><a href="#">2+1 </a></li>
      		</ul>
        </li>
        
         <li class="dropdown">
	   	 <a class="dropdown-toggle" type="button" data-toggle="dropdown">게시판
	   	 <span class="caret"></span></a>
	    	<ul class="dropdown-menu">
	      	 <li><a href="#">공지게시판 </a></li>
	      	 <li><a href="#">자유게시판 </a></li>
	      	 <li><a href="#">QnA </a></li>
      		</ul>
        </li>
         
     </ul>
   </div>
  </div>
</nav>
     