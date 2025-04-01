<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹툰연습</title>
<style>
.pp {
	/* border: 1px solid red; */
	width: 100px;
	height: 100px;
}
</style>
</head>
<body>
	<h1>이달의 신작</h1>
	<form method="get" action="addwebtoon.do">
		<input type="submit" value="추가">
	</form>
	<form method="get" action="emp">
		<input type="submit" value="조회">
	</form>

	<form method="get" action="addition3">
		<input type="submit" value="추가">
	</form>

	<h1>웹툰 추가 결과</h1>
	<c:forEach var="webtoon" items="${webtoonList}">
		<tr>
			<td>파일: <img class="pp" src="${webtoon.image}" alt="이미지설명"><br>
			<td>제목: ${webtoon.title}</td>
			<br>
			<td>작가: ${webtoon.author}</td>
			<br>
			<td>내용: ${webtoon.detail}</td>
			<br>

		</tr>
	</c:forEach>

	<%-- <form method="post" action="emp">
		<input type="submit" value="emp테이블가져오기">
	</form>

	<c:forEach var="webtoon1" items="${webtoonList1}">
		<tr>
			<td>${webtoon1.empno};</td>
			<td>${webtoon1.ename};</td>
			<td>${webtoon1.job};</td>
			<td>${webtoon1.mgr};</td>
			<td>${webtoon1.hiredate};</td>
			<td>${webtoon1.sal};</td>
			<td>${webtoon1.comm};</td>
			<td>${webtoon1.deptno};</td>
		</tr>

	</c:forEach> --%>
	<tr>
		<td>${select.empno}</td>
	</tr>

	${select1.empno} ${select2.empno}


	<table border="1">
		<thead>
			<tr>
				<th>No.</th>
				<th>empno</th>
				<th>ename</th>
			</tr>
		</thead>
		<tbody></tbody>
		<c:forEach var="dto" items="${list}" varStatus="loop">
			<tr>
				<td>${loop.count}</td>
				<td>${dto.empno}</td>
				<!-- 클릭으로 empno의 줄에 내가emp99.jsp에 적었던거
				가져오기위한 것 <a href="emp99?empno=${dto.empno}">-->
				<td><a href="emp99?empno=${dto.empno}">${dto.ename}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>

	<button type="button" id="btn">진동</button>
	<div id='view'></div>

	<style>
#popup {
	border: 1px solid red;
	width: 300px;
	height: 500px;
	
	position: absolute;
	top: 50px;
	left: 550px;
}

#popup .title {
	background: blue;
	color: white
}
#popup .title:hover{
	/* cursor: all-scroll; */
	cursor: grab;
}
#popup .title:active{
	/* cursor: all-scroll; */
	cursor: grabbing;
}

#popup .content {
	background: white;
}
#idm{
	position: absolute;
	top: 0;
	left: 0;
	
	width: 100vw;
	height: 100vh;
	background: rgba(172,172,172,1)
}
</style>
	<div id='dim'>
		<div id='popup'>
			<div class='title'>
				<div>제목</div>
			</div>
			<div class='content'>
				<div>
					내용<br> 내용
				</div>
			</div>
		</div>
	</div>
	<script>
	document.querySelector('#btn').addEventListener('click', ()=>{
		/* navigator.vibrate(500) */ //ms
		if(navigator.vibrate){}
		navigator.vibrate([300,100,500,100,300]) //ms, 진동, 쉬기, 진동...
		}else{
			alert('navigator.vibrate 없음')
		}
	})
	
	if(screen.orientation){
        screen.orientation.addEventListener('change',()=>{
            document.querySelector('#view').innerHTML = 
            type: \${screen.orientation.type}<br>
            angle:\${screen.orientation.angle}
            orientation: \${window.orientation}
        
    })
		}else{
    	alert('방향 지원 안함')
	}
	
	
	/* 
		타이틀에서 왼쪽 버튼을 누르면
		- 왼쪽 버튼이 눌렸 다는걸 저장
		타이틀에서 왼쪽 버튼을 떼면
		- 왼쪽 버튼이 떨어졌 다는걸 저장
		
		마우스 최초 눌렀을 때
		- 그때 마우스 위치값 저장
	
	*/
	
	let istDragable = false;
	let offsetX = 0;
	let offsetY = 0;
	
	document.querySelector('.title').addEventListener('mousedown', (event)=>{
		istDragable = true;
		
		document.querySelector('#view').innerHTML = `
			x: \${event.clientX}<br>
			y: \${event.clientY}<br>
		`
		
		offsetX = event.clientX
		offsetY = event.clientY
	})
	document.querySelector('.title').addEventListener('mouseup', ()=>{
		istDragable = false;
	})
	document.querySelector('.title').addEventListener('mousemove', ()=>{
		if(istDragable){
			let diff_X = event.clientX - offsetX
			let diff_Y = event.clientY - offsetY
			
			let popup = document.querySelector('#popup')
			
/* 			console.log(popup.style.top) */
			console.log(popup.offsetTop)
			
			popup.style.top = (popup.offsetTop + diff_Y)+'px'
			popup.style.left = (popup.offsetLeft + diff_X)+'px'
			
			
			offsetX = event.clientX
			offsetX = event.clientX
		}
	})
</script>

</body>
</html>