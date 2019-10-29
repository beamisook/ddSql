<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="${pageContext.request.contextPath}/js/commons.js"></script>
  
 <script>
   $(function(){
	   
	   //header의 드롭다운 메뉴를 클릭시 주메뉴와 부메뉴를 기져온다
	   $('.dropdown').click(function(e){
		    e.preventDefault();
		    
		    menu = $('.dropdown-toggle', this).text(); //주메뉴 - 이벤트 
		    submenu = $('.dropdown-menu li a', this).text(); //부메뉴  - 할인이벤트 1+1 2+1
		    
		    $('.text-left h1').text(menu);
		    $('.text-left p:eq(0)').text(submenu);
		    
		    //content의 왼쪽 sidenav에 list-group을 새롭게 생성한다 
		     $.ajax({
		    	 url :'menu.jsp',
		    	 type :'post',
		    	 data : {"submenu"  : submenu},  //"submenu=" + submenu,
		    	 success : function(res){
		    		var code =" <div class='list-group'>";
		    		code += "<a href='#' class='list-group-item  active disabled'>" + menu + "</a>";
		    		$.each(res, function(i,v){
		    			 code += "<a href='#' class='list-group-item'>" + v.item + "</a>"; 
		    		 })
		    		 code += "</div>";
		    		 $('.sidenav').html(code);
		    	 },
		    	 error : function(){
		    		 
		    	 },
		    	 dataType : 'json'
		    }) 
			   
	   })
	   
	   //header의 부메뉴를 클릭했을때 content의 오른쪽에 출력
	   $('.dropdown-menu li a').click(function(){
	         sub =  $(this).text().trim();
 	         $('.text-left #subtext').text(sub); 
	         $('.text-left span').text(sub); 
	       
	         //각각 서브메뉴에 따라서  function을 수행
	         //function작성은 script부분에 작성 한다 
	         //function부분을 별도의 javascript파일에 작성하고 
	         //여기에 포함시켜서 실행 
	         prourl();
	   })
	   //content의 왼쪽 sidenav의 부메뉴를 클릭했을때 content의 오른쪽에 출력
	   //delegate를 이용해서 등록 
	  $('.sidenav').on('click', '.list-group-item', function(){
		    sub = $(this).text();
		    $('.text-left #subtext').text(sub); 
	        $('.text-left span').text(sub); 
	       
	        prourl();
 	  })
  })
  
   function prourl(){
	    if(sub == "할인이벤트"){
       	// prod("${pageContext.request.contextPath}/0612_ajax/test_lprod_prod.html");
        //prod("${pageContext.request.contextPath}/0601/test_event_sale.html");
        prod("${pageContext.request.contextPath}/0531/test_dblclick.html");
        }
	   
   }
  
  
  </script>

  <style>
  
  /* ///// header  style ///// */
  	
  .navLogo{
    background-color : #f9cd48;
    height: 50px;
   }
   .navbar-brand{
     padding-top : 0px;
   }
   .navbar-brand img{
      width : 100px;
      height : 50px;
    }
    .navLogo .nav li a:hover{
      background : #f9cd48 ;
      font-size : 1.2em;
   }
  /*  ///////////////////    */
  
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>


</head>
<body>
     <jsp:include page="header.jsp"/>
     <jsp:include page="main.jsp"/>
     <jsp:include page="content.jsp" />
     <jsp:include page="footer.jsp"/>
  
   
   
</body>
</html>







