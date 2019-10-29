/**
 * 
 */

function aa(){
	
	
}
//  prod라는 이름을 이용해서 함수를 호출한다 
//호출시 urls에 대입할 파리미터값이 필요하다
//urls는 실행되어질 페이지의 주소이다
var prod = function(urls){
	$('.text-left #subtext').load(urls);
}