console.log(121414);

window.addEventListener("load", function () {
    let login = document.querySelector('#login');
    console.log('login', login);
    login.addEventListener('click', function () {
        console.log('로그인버튼 클릭');

        // 아이디 값 가져오기
        const id = document.querySelector('#id');
        console.log(id, id.value);
        // 비밀번호 값 가져오기
        const pw = document.querySelector('#pw');
        console.log(pw, pw.value);

        // if (id.value == "admin" && pw.value == 1234) {
        //     location.href = "http://naver.com";
        // }

        // 아이디가 없을때
        if (id.value == ""){
            console.log("id 안썻음");
            // 색깔입힘
            document.querySelector('#login_msg').style.color = '#f00';
            // 아이디를 입력안했을때 나오는 문자
            document.querySelector('#login_msg').textContent = '아이디는 필수입니다'

            // 비밀번호가 없을때
        } else if (pw.value == ""){
            console.log("id 안썻음");
            // 색깔입힘
            document.querySelector('#login_msg').style.color = '#f00';
            document.querySelector('#login_msg').textContent = '비밀번호는 필수입니다'

            // 아이디와 비밀번호를 적을때
        }else{
            document.querySelector('#login_msg').textContent = '';
        }


    })
        // div에 있는걸 가져온다
        // 받아온것을 0.3초단위로 넘어가게한다
        // 그 3초단위에 넘어가는것을 html에 옮긴다


        // 시계를 본다
        // 시,분,초만 
        // #id1에 적는다
        // 1초에 한번씩 갱신을 한다 

        let now = new Date();
        console.log(now);
        let n = (""+now).split(" ");
        console.log(n);
        console.log(n[4]);


    //  document.querySelector("")
   
});