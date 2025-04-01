select * from emp;
desc emp;

select * from dept;
desc dept;

select * from salgrade;
desc salgrade;

select empno, ename, deptno
from emp;

select empno, ename, sal
from emp;

select deptno
from emp;

select 
    distinct deptno   /*deptno에 중복 데이터 삭제*/
    from emp;
    
    select 
    distinct job
    from emp;  /*job에 중복 데이터 삭제*/

    /* 범위주석 아무거나 심지어 여러줄*/
    --한줄 주석
    
    select
        distinct job, deptno
        from emp;
    
    select
    ename, sal, sal*12+comm, comm
    from emp;
    
    select
    ename as  ㅇㅈㅎ0408, sal as  "올해 연봉", sal*12+comm   as 연봉, comm as  연봉
    from emp;
    
    select * from emp       /*order by는 정렬 기준이 되는 열 이름 지정*/
    order by sal asc;       /*asc 오름차순*/
    
     select * from emp
    order by sal desc;      /*desc 내림차순*/
    
     select * from emp
    order by  job ;
    
    
    select * from emp
    order by  job asc, sal asc; /*만약 job에서 같은것이 있고 sal에서 점수가 마음대로이면 , sal을 해라 */
    
    
     select * from emp
    order by empno desc, job asc, sal asc;     /*첫번째 두번째 세번째를 하면 첫번째가 우선순위가 된다*/
    
    
-- Q2 
    select
        distinct job
        from emp;
-- Q3    
    select * from emp
    order by deptno desc, ename asc;
    
    select * from emp
    WHERE DEPTNO = 30;
    
     select * from emp
    WHERE DEPTNO >10 order by deptno desc;
    
    select * from emp
    where empno = 7782;
    
    select * from emp
    WHERE DEPTNO = 30
    and job = 'SALESMAN';
    
    select * from emp
    WHERE DEPTNO = 30
    or job = 'SALESMAN' order by job desc;
    
    
    select * from emp
    where empno = 7499
    and deptno = 30;
    
    select * from emp
    where deptno= 20
    or job = 'SALESMAN';
    
   select * from emp
   where ename = 'WARD'
   OR job = 'CLERK'
   OR deptno = 20;
   
   select * from emp
   where ename = 'WARD' or (job = 'CLERK' and deptno = 20);
   
select * from emp
where sal > 3000;
   
   select * from emp
where sal <= 2000;
   
   select * from emp
where sal >= 2500
AND job = 'ANALYST';

select * from emp /* 봉급이 2000 이상이고 3000 미만인 사원 출력*/
where sal >= 2000
and  sal < 3000;

select * from emp
where sal != 3000;      

select * from emp
where sal <> 3000;

-- 같다 =, 다르다 != 또는 <> 또는 ^= 이3개가 있다

-- 문제1, 부서번호가 20 아닌 목록
select * from emp
where deptno != 20
order by deptno;

-- 문제2, 부서번호가 20도 아니고 10도 아닌 목록
select * from emp
where deptno != 20 and deptno !=10;

-- 문제3, 부서번호가 30이면서 봉급 2000 이하
select * from emp
where deptno = 30 and  sal <=2000;

select * from emp
where not sal = 3000
order by sal;

-- 2000미만 또는 3000이상 출력
select * from emp
where sal < 2000 or sal>=3000
order by sal;

-- 2000이상 그리고 3000 미만 이 아닌것
select * from emp
where not (sal >=2000 and sal <3000)
order by sal;

-- 여러개의 조건을 출력 상세검색할때 쓰인다.
select * from emp
where job = 'MANAGER'
OR JOB = 'SALESMAN'
OR JOB = 'CLERK'
order by job;

--in을 활용해서 위에와 같은 결과값이 나옴
select * from emp
where job in  ('MANAGER','SALESMAN','CLERK')
order by job;

--not in은 위에 in만 사용했을때 반대의 값들을 출력해줌 
select * from emp
where job not in  ('MANAGER','SALESMAN','CLERK')
order by job;

--10번 부서와 20번 부서만 출력
select * from emp
where deptno = 10 OR deptno = 20 order by DEPTNO;

select * from emp
where deptno in(10,20) order by DEPTNO;
--10번 부서와 20번 부서만 아닌것
select * from emp
where not (deptno = 10 OR deptno = 20); 

select * from emp
where deptno not in(10,20);

--급여가 2000이상 그리고 3000이하 출력
--sal >= 2000 and sal <= 3000이랑 똑같음
select * from emp
where sal between 2000 and 3000 order by sal;

--위에 결과값이랑 반대의 값을 출력
select * from emp
where sal not between 2000 and 3000 order by sal;

--%는 길이에 관계없이 아무거나
select * from emp
where ename like 'F%';

--시작, 끝, 중간에 관계없이 A를 포함한 모든 것이 출력
select * from emp
where ename like '%A%';

--앞에는 아무거나 나와도 되지만 _ 다음것은 출력을 원하는 것이 꼭 나온다.
select * from emp
where ename like '_L%';

select * from emp
where MGR like '77%';

select * from emp
where ename like '____';

select * from emp
where ename NOT like '____';

--사원 이름에 AM이 포함되어 있지 않은 사원 데이터 출력
select * from emp
where ename NOT like '%AM%';

select * from emp
where ename like 'A\_%A' escape '\';

--null은 제외된다.
select * from emp
where comm <= 400;

--null 조회가 안된다.
select * from emp
where comm = null;

--null이 있는 값만 나온다.
select * from emp
where comm is  null;

--null 제외한 나머지가 나온다
select * from emp
where comm is not null;

--보너스와 보너스 +10의 결과값을 출력
select comm, comm + 10 from emp;

--보너스와 보너스 +10의 결과값중에 null을 제외한 결과값만 출력
select comm, comm + 10 from emp
where comm is not null;

--mgr에서 null인 값만 출력
select * from emp
where MGR is  null;

--union으로 파일두개를 합쳐서 출력
select * from emp
where deptno = 10
union
select * from emp
where deptno = 20;

--deptno가 20에서는 안들어가서 오류
select  empno, ename, sal, deptno
from emp
where deptno = 10
union
select  empno, ename, sal 
from emp
where deptno = 20;

--deptno가 20에서 10과 똑같이 들어가서 출력가능
select  empno, ename, sal, deptno
from emp
where deptno = 10
union
select  empno, ename, sal, deptno 
from emp
where deptno = 20;

-- empno와 ename의 위치를 바꿈 그럼 오류나옴
-- 숫자, 문자
select  empno, ename, sal, deptno
from emp
where deptno = 10
union
select  ename, empno, sal, deptno 
from emp
where deptno = 20;

--타입이 같으면 OK
--컬럼의 의미는 신경쓰지 않는다.
select  empno, ename, sal, deptno
from emp
where deptno = 10
union
select  sal, ename, sal, deptno 
from emp
where deptno = 20;

/*union */
--한줄에 모든 내용이 중복되는 경우가 있으면 중복을 제거하고 출력
select  empno, ename, sal, deptno
from emp
where deptno = 10
union
select  empno, ename, sal, deptno 
from emp
where deptno = 10;

/*union all */
-- 중복에 관계없이 모든 줄을 표시
select  empno, ename, sal, deptno
from emp
where deptno = 10
union all
select  empno, ename, sal, deptno 
from emp
where deptno = 10;

--125쪽 Q1
select * from emp
where ename like '%S';
--Q2
select ename, empno,job, sal, deptno from emp
where deptno = 30
and job  = 'SALESMAN';
--Q3.. union
select ename, empno,job, sal, deptno from emp
where deptno in (20,30) and sal > 2000 ;
--Q3.. union2
select ename, empno,job, sal, deptno from emp
where deptno =20
and sal >2000
union
select ename, empno,job, sal, deptno from emp
where deptno =30
and sal >2000  order by sal;
--Q3 union all
select ename, empno,job, sal, deptno from emp
where sal > 2000
and deptno = 20
union all
select ename, empno,job, sal, deptno from emp
where sal > 2000
and deptno = 30;
--Q4
select * from emp
where not (sal >=2000 and sal <= 3000) 
order by sal;
--Q5..
select ename, empno, sal, deptno  from emp
where ename like '%E%' 
AND deptno =30 
and sal not between 1000 and 2000;
--Q6
select * from emp
where comm is null 
and mgr is not null
and job in  ('MANAGER','CLERK')
and ename NOT like '_L%';

--dual은 한칸만 출력
select * from dual;

select upper('a1sd2')
from dual;

select lower('a1sd2')
from dual;
--lower 소문자변환, upper 대문자변환
select lower(ename)from emp;
select upper(ename)from emp;

select upper(lower(ename)) from emp;

--대소문자 구분없이 검색
select * from emp
where ename like '%A%' or ename like '%a%';
--upper, lower는 대소문자 구분 없이 like 검색할때 딱 좋다
select * from emp
where lower(ename) like '%a%';

select * from emp
where lower(ename) like lower('%Mi%');

--length : 문자 개수
select ename, length(ename) from emp;

select length('abc'), length('한글') from dual;
select length('abc'), length('한글') from emp;

--사원이름의 길이가 5이상인 행 출력
select ename, length(ename) from emp
where length(ename) >= 5;

--length앞에b를 쓰면 3바이트가 추가됩니다.
select length('한'), lengthb('한') from dual;


----------------------------------------------------------
--4일차
--substr
--substr(글씨, 시작 위치, 몇개)
--substr(글씨, 시작 위치) : 시작 위치부터 끝까지
select '123456 안녕', substr('123456 안녕', 3, 2) from dual;
select '123456 안녕', substr('123456 안녕', 2, 3) from dual;

--원하는 값에 앞에 2글자만 출력
select job, substr(job,1,2),substr(job,0,2) from emp;
--원하는 값에 앞에 3글자만 출력
select job, substr(job,3,3)from emp;
--원하는 값에 앞에 끝까지 출력
select job, substr(job,4)from emp;
--원하는 값에 앞에 마지막까지 출력해주고 멈춘다 오류가 안난다.
select job, substr(job,4,100)from emp;
--실제 길이보다 시작위치가 큰 경우 null을 출력한다.
select job, substr(job,44,100)from emp;
----원하는 값에 앞에 끝까지 출력 그출력한 것을 숫자로 출력
select job,  length(substr(job,4))from emp;
--원하는 값에 뒤에서 2글자만 출력
select job, substr(job,-3,2)from emp;
--원하는 값에 뒤에서 3글자만 출력
select job, substr(job,-3)from emp;
--숫자도 가능
select substr(1234,2)from dual;

--글씨에서 두번째 값을  모두 찾아서 세번째로 바꿔준다
select '010-1234-5678' 안녕,
replace('010-1234-5678', '-', ' ') as replace_1, --세번째가 생략된 경우 없애준다.
replace('010-1234-5678', '-', '***') as replace_2 
from dual;

select replace(ename, 'A', '*') from emp;

--문제1:ename에서 앞에 두글자만 출력 ; 'SM'
select ename, substr(ename,1,2)as "1" from emp;
--문제2:ename에서 앞에 두글자만 **로 처리 ; '**ITH'
select ename, replace(ename, substr(ename,1,2),'**')as "2" from emp;
--문제3-0:ename의 반절에 해당하는 길이를 출력 ; 
select ename,length(ename) /2 as "3-0" from emp;
--문제3-1:ename의 앞에 반절 모두**로 처리 ;
select ename,replace(ename, substr(ename, 1, length(ename) /2),'*')"3-1" from emp;
--문제3-2:ename의 뒤에 반절 모두**로 처리
select ename,replace(ename, substr(ename,length(ename) /2 + 1),'*')"3-2" from emp;


select 'Oracle',
LPAD('Oracle', 10, '#') AS LPAD_1,
RPAD('Oracle', 10, '*') AS RPAD_1,
LPAD('Oracle', 10) AS LPAD_2,
lPAD('Oracle', 10) AS RPAD_2,
RPAD('Oracle', 3)
FROM DUAL;

select RPAD('971225-', 14, '*') AS RPAD,
RPAD('010-1234', 13, '*') AS LPAD
FRom DUAL;

--이름을 6자리로 만들고 빈공간의 오른쪽을 *로 채웁시다
select ename
,RPAD(ename, 6 ,'*') 
from emp;
--이름을 12자리로 만들고 빈공간의 왼쪽을 *로 채웁시다
select ename
,LPAD(ename, length(ename)*2 ,'*') as sksk 
from emp;
--문제1)뒤 4자리를 *로 바꾸자. 단, replace 쓰지 말고
select length('010-9917-1063')as 자리수,
substr('010-9917-1063', 1,  length('010-9917-1063')-4) as "잘린 글씨",
rpad(
substr('010-9917-1063', 1,  length('010-9917-1063')-4), 
length('010-9917-1063'),'*') "자른곳 * 바꾸기" 
FRom DUAL;

--문제2) 사원의 이름을 앞에 두글자만 보이게하고 나머지 *로 표시 
select ename, rpad(substr(ename, 1, 2), length(ename),'*')  from emp;
--문제3) 사원 이름의 앞글자 하나만 *로 표시
select ename, lpad(substr(ename, 2), length(ename),'*')  from emp;
--심화1) job을 대상으로 20자크기의 공간에서 가운데 정렬
--가운데 정렬 : 앞과 뒤에 동일한 공간이 있는거
select 
job,(20-length(job))/2,
lpad(job,((20-length(job))/2)+length(job),'*'),
rpad(lpad(job,((20-length(job))/2)+length(job),'*'),20,'*') 
from emp;
--심화1)틀린 답변
select job, concat(lPAD(job, 10  ), rpad(job,10))
from emp;   
--심화1) 다른 응용
select
rpad(lpad (substr(job, 0, length(job)/2), 10, '*')
, 20,
rpad(substr(job, length(job)/2+1), 10, '*'))
from emp;

                              
select empno || ' : ' || ename from emp;

-- trim : 앞뒤 공백 문자 제거 단 글씨 사이의 공백은 제거하지 않음
select
'        a b c          ',
trim('        a b c          ')
from dual;

---------------------------------------------
--5일차
select round(14.46) as round, -- 두번쨰 값이 없는 경우 소수점 첮째자리 반올림
       round(14.46, 0) as round_0, 
       round(14.46, 1) as round_1, --두번쨰 값은 소수점 몇번쨰까지 표시할지
       round(14.46, -1) as round_11, --두번째 값이 음수인 경우 정수로 거슬러 올라감
       round(14.46, -2) as round_22
       from dual;
       
select trunc(14.46) as trunc, 
       trunc(14.46, 0) as trunc_0, 
       trunc(14.46, 1) as trunc_1,
       trunc(14.46, -1) as trunc_11, 
       trunc(14.461111, 2) as trunc_22,
       trunc(-14.46)as trunc2
       from dual;     
     
     
select ceil(4.14),--올림 
floor(3.14),--내림
ceil(-3.14),--올리는데 가장 가까운 숫자 
floor(-3.14) --내리는데 가장 가까운 숫자
from dual;

select mod(1652, 6)     --특정 숫자로 나머지를 구할때 사용
from dual;

--지금 오라클에 설치된 pc의 시간이 나온다
--설정에 따라 기본 출력값이 날짜의 일부만 나올 수도 있다
--강사 pc의 오라클은 9시간 차이 남.
select sysdate, sysdate+1, sysdate-1 from dual;

--입사 10주년이 되는 사원들 데이터 출력
select empno, ename, hiredate,
add_months(hiredate,120) as ww
from emp;

--컬럼에 + 를 적으면 모두 숫자로 변경해서 적용
select empno, empno + '500' from emp;
--500쪽에 오른쪽에 영어나 문자를 넣으면 에러가 난다
select empno, empno + '500ㅁ' from emp;
--||를 적으면 모두 문자로 변경해서 적용
select empno, empno  ||'500ㅁ' from emp;

select to_char(sysdate, 'mon yyyy-mm-dd hh24:mi:ss') from dual;
--밑에 년 월 일 시 분 초를 넣을 수 있다.
select to_char(sysdate,  'yyyy"년" mm"월" dd"일" hh24"시":mi"분":ss"초"') from dual;
select sysdate, to_char(sysdate, 'mm') from dual;

select to_date('2049/12/10', 'yyyy-mm-dd hh24:mi:ss') as yy_49,
       to_date('2049/12/10', 'rrrr-mm-dd hh24:mi:ss') as rr_49,
       to_date('2050/12/10', 'yyyy-mm-dd hh24:mi:ss') as yy_50,
       to_date('2050/12/10', 'rrrr-mm-dd hh24:mi:ss') as rr_50,
       to_date('2051/12/10', 'yyyy-mm-dd hh24:mi:ss') as yy_51,
       to_date('2051/12/10', 'rrrr-mm-dd hh24:mi:ss') as rr_51
       from dual;
       
select to_char(
to_date('2049/12/10 15:55', 'yyyy/mm/dd hh24:ss'),'yyyy/mm/dd hh24:ss') from dual;

--지금 날짜애서 원하는 날짜를 빼면 몇일이 지난는지 나온다.
select to_date('2049/12/10','yyyy/mm/dd') - to_date('2049/12/09 18','yyyy/mm/dd hh24')
from dual;

select to_date('2024/11/15','yyyy/mm/dd') - to_date('2024/11/11 ','yyyy/mm/dd hh24')
from dual;

--1981년 6월 1일 이후에 입사한 사원 정보 출력하기
select * from emp
where hiredate > to_date('1981/06/01', 'yyyy/mm/dd');


select to_date('2025/05/02','yyyy/mm/dd') - sysdate
from dual;

/*nvl은 첫번쨰 입력 데이터가 null이 아니면 드 데이터를 그대로 반환하고
null이라면 두번째입력 데이터에 지정한 값을 반환*/
select comm, sal, comm+sal, nvl(comm,0), nvl(comm,0) +sal from emp;


select empno, ename, comm,
nvl2(comm, '널', '아님'),
nvl2(comm, sal*12+comm, sal*12) as annsal
from emp;


select empno, ename, job, sal,
decode(job,
'MANAGER', SAL*1.1,
'SALESMAN', SAL*1.05,
'ANALYST', SAL,
'CLERK',SAL*2,
SAL*1.03) AS UPSAL
FROM EMP;

--이름, 봉급, 추가수당, 봉급+추가수당(decode로) null값은 사라지게 하기
select ename, sal,comm,
sal+comm, sal+ nvl(comm,0),
sal+ decode(comm, null, 0, comm) 
from emp;

--case문을 사용하여 출력
select empno, ename, job, sal,
case job
WHEN 'MANAGER' THEN SAL*1.1
WHEN 'SALESMAN' THEN SAL*1.05
WHEN 'ANALYST' THEN SAL
ELSE SAL*1.03
END AS UPSAL
FROM EMP;


--열 값에 따라서 출력 값이 달라지는 case문
select empno, ename, comm,
CASE 
WHEN COMM IS NULL THEN '해당사항없음'
WHEN COMM = 0 THEN'수당없음'
WHEN COMM > 0 THEN '수당 :' || COMM 
END AS COMM_THEN 
FROM EMP;

--comm이 null인 경우 'N/A' 출력
--NULL이 아닌 경우 COMM 출력
select  comm,
CASE 
WHEN COMM IS NULL THEN 'N/A'
WHEN COMM IS NOT NULL THEN  '*' || COMM
--else "" || comm 같은 말이다
END AS COMM_THEN 
FROM EMP;


--174 q2
select EMPNO, ENAME, SAL,
trunc((sal/ decode(21.5, null, 0, 21.5)),2) AS DAY_PAY,
round((sal/ decode(21.5, null, 0, 21.5))/8,1) AS TIME_PAY
from emp;
--174 q2 두번째 방법
select EMPNO, ENAME, SAL,
trunc (sal/21.5,2) day_pay,
round((sal/21.5)/8,1) time_pay
from emp;
--175 q4
select EMPNO,ENAME, MGR,
CASE 
WHEN MGR IS NULL THEN '0000'
WHEN SUBSTR (MGR,1,2) = 75 THEN '5555'
WHEN SUBSTR (MGR,1,2) = 76 THEN '6666'
WHEN SUBSTR (MGR,1,2) = 77 THEN '7777'
WHEN SUBSTR (MGR,1,2) = 78 THEN '8888'
WHEN COMM IS  NULL THEN  '' || MGR
END AS MGR_THEN 
FROM EMP;
--175 q4 두번째 방법
select empno, ename, mgr,
    case
        when mgr is null then '0000'
        else
            case
                when substr(mgr, 1, 2) = '75' then '5555'
                when substr(mgr, 1, 2) = '76' then '6666'
                when substr(mgr, 1, 2) = '77' then '7777'
                when substr(mgr, 1, 2) = '78' then '8888'
--                else to_char(mgr)
                else '' || mgr
            end
    end chg_mgr1,
    /* in을 사용해서 간단하게 코딩 /
    / 두번째 mgr이 5,6,7,8 일때 처리 */
    case
        when mgr is null then '0000'
        when substr(mgr, 2, 1) in ('5', '6', '7', '8')
--            then trim(lpad(' ', 5, substr(mgr, 2, 1)))
--            then lpad(substr(mgr, 2, 1), 4, substr(mgr, 2, 1))
            then lpad(substr(mgr, 2, 1), length(mgr), substr(mgr, 2, 1))
        else '' || mgr
    end chg_mgr2,
    case
        when mgr is null then '0000'
        when mgr like '75%' then '5555'
        when mgr like '76%' then '6666'
        when mgr like '77%' then '7777'
        when mgr like '78%' then '8888'
        else '' || mgr
    end chg_mgr3,
    case
        when mgr is null then '0000'
        else
            case substr(mgr, 1, 2)
                when '75' then '5555'
                when '76' then '6666'
                when '77' then '7777'
                when '78' then '8888'
                else '' || mgr
            end
    end chg_mgr4,
    case substr(mgr, 1, 2)
        when '75' then '5555'
        when '76' then '6666'
        when '77' then '7777'
        when '78' then '8888'
        else nvl(to_char(mgr), '0000')
    end chg_mgr5,
    case
        when mgr >= 7500 and mgr < 7600 then '5555'
        else '' || mgr
    end chg_mgr6
from emp;

/*sum으로 급여 합계 출력*/
select sum(sal)from emp;
select sum(comm)from emp;
/*sum+sal을 하는데 중간에null들이 있어서 nvl를 해서 출력*/
select  sum(sal+nvl(comm,0))from emp;

/*count(*)를 사용하면 행의 개수를 출력*/
/*countㄹ sum처럼 null은 제외함*/
/*count에는 *를 많이 씀*/
select count(*), count(sal), count(comm) from emp;
--다중행 함수는 다중행 함수끼리만 출력해야 한다
select count(*), count(sal)/*, sal*/ from emp;

select count(*) from emp
where deptno = 30
and comm  is not null;

--이 모든 결과값에 null은 제외하고 출력된다
--max 최대값 반환, min 최솟값 반환
select max(sal), max(ename), min(sal), min(hiredate), min(comm) from emp;

--이름에 a가 포함된 사람의 수는?
select  count(*)  from emp
where ename like '%A%';
select  *  from emp
where ename like '%A%';

--최대 연봉을 받는 사람의 모든 정보 표시
--where에서 다중행 함수(집계 함수)를 사용 할 수 없음
/*select * from emp
where sal = max(sal);*/

--avg는 평균값을 출력
select avg(sal) from emp;


select '10', sum(sal), trunc(avg (sal)) from emp where deptno = 10 union all
select '20', sum(sal), trunc(avg (sal)) from emp where deptno = 20 union all
select '30', sum(sal), trunc(avg (sal)) from emp where deptno = 30 ;

--group를 사용하여 부서별 평균 급여 출력
select deptno,trunc(avg(sal)), trunc(sum(sal)),trunc(count(*))
from emp
group by deptno,job
order by deptno,job;

--count(*)등 집계함수는 where에서 사용할 수 없다
/*select max(sal)
from emp
where count(*) > 2
group by deptno;

select * 
from emp
where sal > avg(sal);
*/

select deptno, job, avg(sal), sum(sal), count(*)
from emp
group by deptno, job
having avg(sal) >=2000
order by deptno, job;

/*having : grooup by 에서만 사용
where에서 표현할 수 있는건 가급적 where에서 사용하는게 좋다
집계함수를 조건으로 주고 싶을때 사용한다*/
select deptno, job, avg(sal), sum(sal), count(*)
from emp
group by deptno, job
having deptno = 20
order by deptno, job;

--순서
/*5*/select job, count(*)as cnt
/*1*/ from  emp
/*2*/where sal >1000 /*and cnt > 3*/
/*3*/group by job
/*4*/having count(*) >= 3
/*6*/order by cnt desc;

--194 1번
select deptno, job,AVG(SAL)
from emp
group by deptno, job
having avg(sal)>=500 
order by deptno, job;
--212 Q1
select deptno,trunc(avg(sal)), max(sal),min(sal),count(*)as cnt
from emp
group by deptno;
--212 Q1 다른풀이
select deptno,floor(avg(sal)), max(sal),min(sal),count(*)as cnt
from emp
group by deptno;
--212 Q2
select job, count(*)
from emp
group by job
having count(*)>=3;


/* 추가문제1
    1981년에 입사한 사원 중에서
    급여가 가장 낮은 사원의 급여를 조회하세요
*/
    select min(sal) from emp
     where hiredate >= to_date('1981-01-01', 'yyyy-mm-dd')
    and hiredate <= to_date('1981-12-31', 'yyyy-mm-dd')
     or to_char(hiredate, 'yyyy') = '1981';
--추가문제1 다른풀이
select min(sal)
from emp
where hiredate like '81%';
     
     
/* 추가문제2
    각 부서별로 급여가
    가장 높은 사원과 가장 낮은 사원의 급여 차이를 조회하세요.
*/
select deptno, max(sal), min(sal),max(sal) - min(sal)
from emp
group by deptno;
--------------------------------------------------------------------------
--7일차
select * from  dept;

--from절에 여러 테이블 출력
select * from emp, dept
order by empno;

--deptno, deptno1이 같은지 확인해보기
select * from emp, dept
where emp.deptno = dept.deptno
order by empno;

--deptno, deptno1이 같은지 확인해보기 그 이후 영어로 a, s처럼 집어 넣으면 간단하게 만들수있다.
select * from emp a, dept s
where a.deptno = s.deptno
order by empno;

--에러가 나오는데 중간에 ambig가 있으면 어떤걸 해야하는지 잘 모르겠다 라는뜻
select ename, deptno 
from emp a, dept s
where a.deptno = s.deptno
order by empno;

-- 만약 *까지 쓸려면 *쓰기전에 줄인거나 원하는걸 적고 쓴다
select ename, e.deptno, e.*, d.* 
from emp e, dept d
where e.deptno = d.deptno
order by empno;


select * from salgrade;
select * from emp;
select * from emp e,salgrade s
where e.sal > s.losal and e.sal <= s.hisal;
select e.ename, e.sal, s.grade from emp e, salgrade s
where e.sal > s.losal and e.sal <= s.hisal;


select * from emp;
--나의 직속상사를 출력
select e1.ename, e1.mgr, e2.ename, e2.empno
from emp e1, emp e2
where e1.mgr = e2.empno;
--나의 직속상사의 상사를 출력
select e1.ename, e1.mgr, e2.ename, e2.empno, e2.mgr, e3.ename, e3.empno
from emp e1, emp e2, emp e3
where e1.mgr = e2.empno 
and e2.mgr = e3.empno;

--(+)을 하면 null값도 포함해서 출력된다
select e1.ename, e1.mgr, e2.ename, e2.empno, e2.mgr
from emp e1, emp e2 
where e1.mgr(+) = e2.empno; 

--using 둘다 같은 컬럼명을 사용하는 경우만 쓸 수 있다
select * 
from emp join dept using(deptno);

--테이블 join 조건을 on으로 분리시킨다
select * 
from emp e join dept d on (e.deptno = d.deptno)
where sal <= 3000;


select * 
from emp e1 join emp e2  on (e1.mgr = e2.empno);

--left outer join왼쪽에 나오는것을 물어보지도 않고 출력 해준다
--right outer join 오른쪽에 나오는것을 모두 보장해준다.
--full outer join 양쪽 모두 보장해준다.
select * 
from emp e1 left outer join emp e2  on (e1.mgr = e2.empno);
--left outer join을 두개 이상 사용할때 쓰인다.
select * from emp e1 
left outer join emp e2  on (e1.mgr = e2.empno)
left outer join emp e3  on (e2.mgr = e3.empno);

--239 Q1
select e.deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
where  e.deptno = d.deptno
and sal > 2000
order by deptno;

--239 Q2
select deptno, d.dname, floor(avg(sal)), max(sal), min(sal), count(*) 
from emp e join dept d using(deptno)
group by deptno, d.dname;
--239 Q3
select *
from dept d left outer join emp e on(d.deptno = e.deptno)
order by d.deptno;

--추가문제1
--사원번호,이름,부서명,급여등급 출력 : 14줄
select e.empno, e.ename, d.dname, s.grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
and e.sal between s.losal and s.hisal;
--추가문제2
--상사 보다 월급이 높은 사원의 이름, 급여, 상사이름, 상사급여
select e1.ename, e1.sal, e2.ename, e2.sal
from emp e1 
left outer join emp e2 on(e1.mgr = e2.empno)
where e1.sal > e2.sal;
 
 select *
 from dept d left outer join emp e on(d.deptno = e.deptno)
 where e.deptno is null;
 
--서브쿼리로 JONES의 급여보다 높은 급여를 받는 사원 정보 출력
 select ENAME, SAL from emp
 where sal > (select sal from emp where ename ='JONES');
 

--서브쿼리 안에서 함수를 사용한 경우
select e.empno, e.ename, e.job, d.deptno, d.dname, d.loc
from emp e, dept d
where e.deptno = d.deptno
and e.deptno = 20
and e.sal > (select avg(sal) from emp);

--급여가 가장 많은 사람의 모든신원을 나오게 하기
select * from emp
where sal = (select max(sal) from emp);


-- BLAKE보다 높은 연봉을 받는 사람들 출력
select * from emp
 where sal >= (select sal from emp where ename ='BLAKE');
-- JONES랑 같은 job을 가진 사람들 출력
select * from emp
 where job = (select job from emp where ename ='JONES');

select  max(sal) from emp
group by deptno;

--sal에서 2850,3000,5000 인것들 출력 수동
select * from emp
where sal in (2850,3000,5000);
--sal에서 2850,3000,5000 인것들 출력 자동
select * from emp
where sal in (select  max(sal) from emp group by deptno);

select *
from(
select empno, ename, deptno from emp
where deptno =10);


--책에 없는거 rownum은 줄번호를 얄려 주는것
select rownum,emp.* from emp;


select rownum as rnum , a.*
from(
select*
from emp
order by ename)a;



select count(*) from emp
group by job
having count(*) >=3;

select *
from(
select job, count(*)cnt from emp
group by job)
where cnt >= 3;



with e10 as(
select * from emp where deptno = 10
)
select * from e10;

with e10 as(
select * from emp where deptno = 10
)
select ename, '핑핑이' from e10;

--262 Q1
select job, empno, ename, sal, deptno, dname
from emp join dept using (deptno)
where job = (
select job from emp
where ename = 'ALLEN'
 )order by sal desc, ename ;
--Q1 JOIN을 안쓰고 다른풀이 
--select에 서브쿼리가 있는 경우 한줄마다 조회하므로 비효율적일 수 있다
select job, empno, ename, sal, deptno, 
(select dname from dept where e.deptno = dept.deptno) as DNAME ----중요
from emp e --- 중요
where job = (select job from emp where ename = 'ALLEN');
--262 Q2
--1. 전체 사원의 평균 급여 확보
--2. 그것보다 높은(초과) 사람들 출력
select empno, ename, dname, hiredate, loc, sal, grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
and e.sal >= s.losal and e.sal <=s.hisal
and e.sal > (select avg(sal) from emp)
order by sal desc, empno;
--272 Q3
--10번 부서 사람 중에서....
--30번 부서에 없는 직책....
--30번 부서의 job들이 not in으로 10부서에 적용?
select * from emp where deptno = 10
union all
select * from emp where deptno = 30;
--272 Q3풀이 정답
select empno, ename,job,e.deptno, dname, loc
from emp e
left outer join dept d on(e.deptno = d.deptno)
where e.deptno = 10
and e.job not in (select job from emp where deptno = 30);

--272 Q4
select empno, ename, sal, grade
from emp e
left outer join salgrade s
on (e.sal >= s.losal and e.sal <= s.hisal)
where e.sal > (
select max(sal) from emp where job = 'SALESMAN');
------------------------select and----------------------------------------

/*
    CRUD
    생성 Create C
    조회 Read   R
    수정 Update U
    삭제 Delete D
*/
desc emp;
--12장
--모든 열의 각 자료형을 정의해서 테이블 생성
create table emp_ddl(
empno       number(4),  -- 숫자 4자리 제한
ename       varchar2(10),   -- 가변형 글씨 10 바이트로 제한
job         varchar2(9),    --제한보다 적은 글씨일 때 공간이 줄어든다
mgr         number(4), 
hiredate    date,           --날짜
sal         number(7,2),    --소수점 둘쨰 자리까지 기록
comm        number(7,2),
deptno      number(2)
);
--생성한 테이블을 출력
desc emp_ddl;
select * from emp_ddl;

--다른 테이블을 복사하여 테이블을 생성
create table dept_ddl
as select * from dept;
--다른 테이블을 복사하여 테이블을 생성한걸 출력
select * from dept_ddl;

--30번 부서에 있는것만 출력하는 테이블을 생성
create table emp_ddl_30
as select * from emp where deptno = 30;
--30번 부서에 있는것만 출력하는 테이블을 생성한 것을 출력
select * from emp_ddl_30;

--다른 테이블을 복사하여 테이블 생성
create table empdept_ddl
as select empno, ename, job, mgr, hiredate, sal, comm, d.deptno,d.loc
from emp e, dept d
where 1 != 1;
--다른 테이블을 복사하여 테이블 생성한 것을 출력
select * from empdept_ddl;
--emp 테이블을 복사하여 emp_alter 테이블로 생성
create table emp_alter
as select * from emp;
--emp 테이블을 복사하여 emp_alter 테이블로 생성한 것을 출력
select * from emp_alter;
--alter명령어로 hp 열 추가를 생성
alter table emp_alter
add hp varchar2(20);
--alter명령어로 hp 열 추가를 생성한 것을 출력
select * from emp_alter;
--rename명령어로 열이름을 변경한 것을 생성
alter table emp_alter
rename column hp to tel;
--rename명령어로 열이름을 변경한 것을 생성한 것을 출력
select * from emp_alter;
--alter명령어로 empno열 길이를 변경해서 생성
--수정할때 타입의 크기가 커지는건 가능하지만
--크기가 줄어드는건 불가능
alter table emp_alter
modify empno number(5);
--alter명령어로 empno열 길이를 변경해서 생성한 것을 출력
desc emp_alter;
--alter명령어로 tel열 삭제하기
alter table emp_alter
drop column tel;
--alter명령어로 tel열 삭제한것을 출력
select * from emp_alter;
--타입을 변경할때는 내용이 모두 null일때만 가능하다
alter table emp_alter
modify mgr number(20);
--rename으로 테이블 이름 변경
rename emp_alter to emp_rename;
--rename으로 테이블 이름 변경한 것을 출력
select * from emp_rename;
--emp_rename테이블의 데이터를 잘른다
truncate table emp_rename;
--emp_rename테이블의 데이터를 잘른것을 출력
select * from emp_rename;
--drop로 emp_rename테이블을 삭제
drop table emp_rename;

--10장
--DEPT테이블을 복사해서 DEPT_TEMP테이블 생성
CREATE TABLE DEPT_TEMP
AS SELECT * FROM DEPT;
--DEPT테이블을 복사해서 DEPT_TEMP테이블 생성한 것을 출력
SELECT * FROM DEPT;

--DEPT_TEMP테이블에 데이터 추가
INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
            VALUES (50, 'DATABASE', 'SEOUL');
--DEPT_TEMP테이블에 데이터 추가한 것을 출력하는데 2개가 나온 이유는 내가 2번 해버려서ㅋㅋ
 SELECT * FROM DEPT_TEMP;           
--DEPT_TEMP테이블에 데이터 추가할려 하는데 적게 적으면 밑에 처럼 오류
 INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
            VALUES (50, 'DATABASE');
--DEPT_TEMP테이블에 데이터 추가할려 하는데  많게 적으면 밑에 처럼 오류            
INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
            VALUES (50, 'DATABASE','SEOUL','SEOULLEE');
--만약 추가될곳의 것을 맞게 했었도 숫자랑 문자를 같이 쓸수는 없다
 INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
            VALUES ('a50', 'DATABASE','SEOUL');
--그리고 자기가 가지고 있는 바이트보다 많을때 에러가 나온다            
 INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
            VALUES (123, 'DATABASE','SEOUL');   

--INSERT문에 열 지정 없이 데이터를 추가            
INSERT INTO DEPT_TEMP
VALUES (60, 'NETWORK', 'BUSAN');
--INSERT문에 열 지정 없이 데이터를 추가한 것을 출력
select * from dept_temp;

--NULL을 지정하여 입력
INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
                    VALUES(70, 'WEB', NULL);
--NULL을 지정하여 입력한 것을 출력                  
select * from dept_temp;

--열 데이터를 넣지 않는 방식으로 NULL 데이터 입력
INSERT INTO DEPT_TEMP (DEPTNO, LOC)
                    VALUES(90, 'INCHEON');
--열 데이터를 넣지 않는 방식으로 NULL 데이터 입력한 것을 출력                    
select * from dept_temp;

--table emp_temp 생성
create table emp_temp
as select * from emp
where 1<>1;
--table emp_temp 생성된 것을 출력
select * from emp_temp;

--table emp_temp 생성된 곳에서 날짜 데이터 생성
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values(2111, '이순신', 'MANAGER', 9999,
to_date('07/01/2001', 'dd/mm/yyyy'), 4000,null,20);
--table emp_temp 생성된 곳에서 날짜 데이터 생성한 것을 출력
select * from emp_temp;

--hiredate에 sysdate를 이용해서 오늘날짜를 입력
insert into emp_temp (empno, ename, hiredate)
values(3111, '이주희', sysdate);
--hiredate에 sysdate를 이용해서 오늘날짜를 입력한 것을 출력
select * from emp_temp;

--emp_temp에 10번 부서인 인원 입력
insert into emp_temp
select * from emp where deptno =10;
--emp_temp에 10번 부서인 인원 입력한 것을 출력
select * from emp_temp;
------------------------------INSERT AND----------------------------------------
--dept테이블을 복사해서 dept_temp2테이블로 만들기
create table dept_temp2
as select * from dept;
--dept테이블을 복사해서 dept_temp2테이블로 만들고 출력
select * from dept_temp2;

--dept_temp2테이블에서 loc안에 있는것을 전체 SEOUL롤 변경
update dept_temp2
set loc = 'SEOUL';
--dept_temp2테이블에서 loc안에 있는것을 전체 SEOUL롤 변경한 것을 출력
select * from dept_temp2;

--deptno에서 40인 것만 보는법
select * from dept_temp2
where deptno = 40;

--한가지 loc를 바꾸고 싶을때 사용
update dept_temp2
set dname = 'DATABASE',
    loc ='seoul'
where deptno = 40;   
--한가지 loc를 바꾸고 싶을때 사용한 것을 출력
select * from dept_temp2;


select * from emp_temp;

select * from emp_temp
where sal <= 2500;

--2500 이하인 사원만 확인
update emp_temp
set sal = sal + 50
where sal <= 2500;
--2500 이하인 사원만 확인하고 출력
select * from emp_temp;

--emp 테이블을 복사한 emp_temp2에서
create table emp_temp2
as select * from emp;
--연봉이 1000 이하인 사원 연봉을 1.3% 인상
update emp_temp2
set sal = sal * (1+0.013)
where sal <= 1000;
--연봉이 1000 이하인 사원 연봉을 1.3% 인상하고 출력
select *from emp_temp2;
------------------------------update and----------------------------------------
--delete로 MANAGER삭제
delete from emp_temp2
where job = 'MANAGER';
--delete로 MANAGER삭제한 것을 출력
select *from emp_temp2;

-----------------------------delete and-----------------------------------------
--commit은 지금까지 트랜잭션에서 데이터 조작 관련 명령어를 통해 변경된 데이터를
--모두 데이터베이스에 영구히 반영
commit;

--emp_temp2를 확인
select *from emp_temp2;
--delete로 emp_temp2를 삭제
delete from emp_temp2;
--rollback로 실수를 했을때 다시 되돌리고 싶을때 쓰는것
rollback;

--emp_temp2에 deptno에서 10을 없애기
delete from emp_temp2
where deptno = 10;
--없어진상태로 emp_temp3이름을 바꾸고
create table emp_temp3
as select * from emp;
--바꾼상태로 롤백
rollback;
--롤백하고 다시 emp_temp2를 실행하는데 롤백이 안되어있음
select * from emp_temp2;
--------------------------------------------------------------------------------
--13장
--user의 테이블 모두 보기
select * from user_tables;
--user의  인덱스정보 보기
select * from user_indexes;

--emp테이블의 sal열에 인덱스를 생성
create index idx_emp_sal
on emp(sal asc);
--emp테이블의 sal열에 인덱스를 생성한 것을 출력
select * from user_indexes;


--강제로 힌트 **(고급 기술)**
select /*+ index(idx_emp_sal)*/
* from emp
where sal = 3000
order by sal asc;
--강제로 힌트2 **(고급 기술)** 
--계획 설명을 클릭 및 f10을 클릭해서 options을 확인
select /*+ index(e)*/
* from emp e
where sal = 3000
order by sal asc;
-----------------------------indexes end----------------------------------------
select * from emp_temp2;


-- empno가 입사 순서대로 발행되는 번호라고 할때
-- 다음 입사자의 empno는?
-- '신입이'를 입사시키자
select max(empno) from emp_temp2;  --empno에 가장큰거 찾기
select max(empno)+1 from emp_temp2;  --empno에 가장큰거+1 찾기
----empno에 가장큰거+1 에 신입이 삽입
insert into emp_temp2 (empno, ename)
values ((select max(empno)+1 from emp_temp2),'신입이2');
----empno에 가장큰거+1 에 신입이 삽입후 출력
select * from emp_temp2;
        
--시퀀스        
create sequence seq_empno2 --시퀀스 생성
start with 8000           --시작 숫자 지정 (기본값: 1)
increment by 10;          --증가숫자 증가/감소 양

--nextval명령어로 계속 실행하면 10씩 오름
--다음 시퀀스 값 가져오기
select seq_empno2.nextval from dual; 
--currval명령어로 현재의 값을 보기
--현재 시퀀스 값 보기
select seq_empno2.currval from dual;
--nextval을 한번도 사용하지 않은 경우 curravl 을 사용해보기

--nextval명령어로 이름과 같이 삽입해서 10이 오른것을 emp_temp2에 삽입
insert into emp_temp2 (empno, ename)
values(seq_empno2.nextval, '신입3');
--nextval명령어로 이름과 같이 삽입해서 10이 오른것을 emp_temp2에 삽입한 것을 출력
select * from emp_temp2;

--seq_empno2 삭제
drop sequence seq_empno2;

--------------------------sequence end------------------------------------------
--14장
--테이블 생성할때 not null설정
create table table_notnull
(login_id varchar2(20) not null,
login_qwd varchar2(20) not null,
tel varchar2(20));
----테이블 생성할때 not null설정한 것에 null값을 넣어서 오류남
insert into table_notnull (login_id, login_qwd, tel)
values ('test_id_01', null, '010-2046-7051');
--위에 오류난 것을 제대로 바꿔준 코드
insert into table_notnull (login_id, login_qwd, tel)
values ('test_id_01', '1234', 'null');
--위에 오류난 것을 제대로 바꿔준 코드를 출력
select * from table_notnull;

select * from user_constraints;

/* tel에 not null 제약을 주려고 헀는데 이미 null이 들어가 있어서 못한다
그래서 tel이 null인 값들을 일괄적으로 0으로 수정후 제약 조건 변경*/
update table_notnull
set tel = '0'
where tel is null;
--not null 바꾸기
alter table table_notnull
modify (tel not null);
--not null 바꾼 것을 출력
desc table_notnull;

--constraint를 통해서 삭제할 수도 있지만
--modify로 해결할 수 있다.
alter table table_notnull
modify (tel  null);

--테이블을 생성할 때 특정 열에 primary key설정
--primary key,pk,주요키, 중요키, 기본키라고 불린다
--not null + unique 조건
--생성과 동시에 index도 생성해줌
/*create table에서 컬럼을 정의하면 primary key를 지정하는 방식으로는
딱 하나만 지정 가능 만약 두개이상을 pk로 지정(복합키)하는 경우 alter나 
primary key방식을 이용*/
create table table_pk(
login_id varchar2(20) primary key,
login_pwd varchar2(20) not null,
tel  varchar2(20));
--테이블을 생성할 때 특정 열에 primary key설정한 것을 출력
--밑에 3코드다 보기
select * from user_constraints;
select * from user_indexes;
desc table_pk;

--table_pk테이블에 데이터 입력
insert into table_pk(login_id, login_pwd, tel)
values('test_id_01','pwd01', '010-1234-5678');
--table_pk테이블에 데이터 입력한 것을 출력
select * from table_pk;
--table_pk테이블에 똑같은 데이터 입력을 두번하면 에러나옴
insert into table_pk(login_id, login_pwd, tel)
values('test_id_01','pwd01', '010-1234-5678');
--table_pk테이블에 null쪽에 ''을 안넣으면 에러나옴
insert into table_pk(login_id, login_pwd, tel)
values(null,null, null);
--table_pk테이블에 개수가 맞지 않게 넣으면 에러나옴
insert into table_pk(login_id, login_pwd, tel)
values('pw','010');

drop table table_name; --table_name테이블 삭제

create table table_name(    --table_name테이블 생성
col1 varchar2(20),
col2 varchar2(20),
col3 varchar2(20),
primary key (col1, col2));--복합키로 2개 지정

insert into table_name
values('idi', 'pw1',null); --table_name테이블 생성한 것에 추가
insert into table_name
values('idi', 'pw2',null); --table_name테이블 생성한 것에 추가

select * from table_name; --table_name 출력

drop table dept_fk;
create table dept_fk(   -- dept_fk테이블 생성
deptno number(2) primary key,
deame varchar2(14),
loc varchar2(13));
drop table emp_fk;
desc emp_fk;
create table emp_fk (
empno   number(4),
ename   varchar2(10),
deptno  number(2) references dept_fk(deptno)
);
insert into dept_fk
values (1, 'a', 10);

select * from dept_fk;
select * from emp_fk;



insert into emp_fk
values (10,10, 1);

insert into emp_fk (deptno, dname, loc)
values (1, 'aaaa', 'AAAA');

insert into emp_fk (emptno, name, deptno)
values (100, '이름', 1);

update dept_fk
set deptno = 3
where deptno =1;


create table dept_fk(
c1 varchar2(200),
c2 varchar2(200),
c3 varchar2(200),
primary key (c1, c2));

create table dept_ck(
c1 varchar2(200),
c2 varchar2(200),
c3 varchar2(200),
foreign key (a2, a3) references dept_ck(c1, c2));


--------------------------------------------------------------------------------
--15장










--1번문제1
select empno, ename from emp;
--1번문제2
select empno, ename 
from emp order by empno desc ;
--1번문제3
select  ename ,
rpad(substr(empno, 1, 2), length(empno),'*')
from emp order by empno desc ;


--2번문제1
select empno, ename, dname, loc from emp, dept;
--2번문제2
select empno, ename, dname, loc from emp join dept using(deptno)
order by dname desc ;

create table todo (
    todo_id number primary key,
    todo varchar2(4000) not null,
    create_date date not null,
    modify_date date,
    done char(1) not null
);

create sequence seq_todo;

select * from todo;


drop table todo;
drop sequence seq_todo;

insert into todo 
values(seq_todo.nextval, 'test',sysdate, null, 'N');

select * from todo;
commit;

update todo
set done = 'Y'
where todo_id = 4;
commit;



-- 시퀀스 생성

CREATE SEQUENCE p_sku_seq
    START WITH 1
    INCREMENT BY 1;


-- 테이블 생성

CREATE TABLE p_sku (
    sku_id NUMBER(10) PRIMARY KEY,
    sku_code VARCHAR2(50) NOT NULL,
    sku_name VARCHAR2(60) NOT NULL,
    sku_size VARCHAR2(50),
    vendor_name VARCHAR2(100),
    price NUMBER(15, 2),
    create_date DATE NOT NULL,
    modify_date DATE,
    category VARCHAR2(50)
);

create sequence seq_p_sku;

select * from p_sku;

insert into p_sku

--테이블에 삽입할거 입력했음 인서트한것임
values(seq_p_sku.nextval, 'text','text','text','text',1,sysdate,null,'text');
--커밋하는법임
commit; 이게 내 오라클에 있는 테이블이야


ALTER TABLE p_sku MODIFY modify_date DEFAULT SYSDATE;



--이게 상품정보관리랑 원자재입출고관리 연결함 +  조회까지임
SELECT *
FROM P_SKU  PS
LEFT JOIN P_MATERIAL_IN_OUT  PMIO ON PS.SKU_ID = PMIO.SKU_ID;
--커밋
COMMIT;

--원자재입출력관리테이블삭제
drop table p_material_in_out;

--원자재입출력관리테이블생성
CREATE TABLE p_material_in_out (
    IB_ID NUMBER(10, 0) NOT NULL,
    MATERIAL_COUNT NUMBER(15, 2) NOT NULL,
    MATERIAL_PRICE NUMBER(15, 2) NOT NULL,
    SKU_TYPE VARCHAR2(20 BYTE) NOT NULL,
    CREATE_DATE DATE NOT NULL,
    MODIFY_DATE DATE,
    REMARKS VARCHAR2(255 BYTE),
    SKU_ID NUMBER(10, 0) NOT NULL,
    BILL_ID NUMBER(10, 0) NOT NULL,
    

    -- 기본 키 제약 조건 추가
    CONSTRAINT PK_P_MATERIAL_IN_OUT PRIMARY KEY (IB_ID),

    -- 외래 키 제약 조건 1 추가
    CONSTRAINT FK_BILL_MAT_1 -- 제약 조건 이름 변경 (길이 제한 고려)
    FOREIGN KEY (BILL_ID)
    REFERENCES P_BILL(BILL_ID),

    -- 외래 키 제약 조건 2 추가
    CONSTRAINT FK_SKU_MAT_1 -- 제약 조건 이름 변경 (길이 제한 고려)
    FOREIGN KEY (SKU_ID)
    REFERENCES P_SKU(SKU_ID)
);
--원자재입출력관리테이블확인
select * from P_MATERIAL_IN_OUT;


--시퀀스 생성 p_material_in_out
CREATE SEQUENCE seq_p_material_in_out
START WITH 1 -- 시작 값
INCREMENT BY 1; -- 증가 값

--원자재입출력관리테이블에 직접입력
insert into p_material_in_out
VALUES (seq_p_material_in_out.nextval, 1, 1, 'text', SYSDATE, NULL,'text',1,67);
insert into p_material_in_out
VALUES (seq_p_material_in_out.nextval, 1, 1, 'text', SYSDATE, NULL,'text',2,67);


--완제품입출고관리테이블삭제
drop table p_product_in_out;

--완제품입출고관리테이블확인
select * from P_PRODUCT_IN_OUT;

--완제품입출고관리테이블에있는 컬럼없애기
alter table P_PRODUCT_IN_OUT drop column SKU_SIZE;

--완제품입출고관리테이블생성
CREATE TABLE p_product_in_out (
    IB_ID NUMBER(10, 0) NOT NULL,
    PRODUCT_COUNT NUMBER(10, 0) NOT NULL,
    PRODUCT_PRICE NUMBER(10, 0) NOT NULL,
    SKU_TYPE VARCHAR2(20 BYTE) NOT NULL,
    CREATE_DATE DATE NOT NULL,
    MODIFY_DATE DATE,
    REMARKS VARCHAR2(255 BYTE),
    SKU_ID NUMBER(10, 0) NOT NULL,
    EMPNO NUMBER(10, 0) NOT NULL
);

--이게 상품정보관리랑 완제품입출고관리 연결함 +  조회까지임
SELECT *
FROM P_SKU  PS
LEFT JOIN P_PRODUCT_IN_OUT  PPIO ON PS.SKU_ID = PPIO.SKU_ID;
--커밋
COMMIT;

SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'P_PRODUCT_IN_OUT';

--시퀀스 생성 p_product_in_out
CREATE SEQUENCE seq_p_product_in_out
START WITH 1 -- 시작 값
INCREMENT BY 1; -- 증가 값

--p_product_in_out에 등록
insert into P_PRODUCT_IN_OUT
VALUES (seq_p_product_in_out.nextval, 1, 1, 'text', SYSDATE, NULL,'text',1,2);

--작업표준서 확인
select * from p_work_method;

--이게 상품정보관리랑 작업표준서 연결함 +  조회까지임
SELECT *
FROM P_SKU  PS
LEFT JOIN P_WORK_METHOD  PWM ON PS.SKU_ID = PWM.SKU_ID;

--시퀀스 생성 작업표준서
CREATE SEQUENCE seq_p_work_method
START WITH 1 -- 시작 값
INCREMENT BY 1; -- 증가 값

--p_work_method에 등록
insert into p_work_method
VALUES (seq_p_work_method.nextval,'text',1,1);

--작업표준서테이블에있는 컬럼없애기
alter table p_work_method drop column sku_name;

--작업표준서테이블에 작업양식사진 컬럼 추가
ALTER TABLE p_work_method ADD work_file VARCHAR2(255);

--bom테이블에있는 컬럼없애기
alter table p_bom drop column sku_code;

select * from p_bom;

--이게 상품정보관리랑 bom 연결함 +  조회까지임
SELECT *
FROM P_SKU  PS
LEFT JOIN P_BOM  PB ON PS.SKU_ID = PB.SKU_ID;

--이게 작업표준서랑 bom 연결함 +  조회까지임
SELECT *
FROM P_WORK_METHOD  PWM
LEFT JOIN P_BOM  PB ON PWM.WORK_METHOD = PB.WORK_METHOD;
--bom에 삽입
insert into p_bom
VALUES (seq_p_bom.nextval,'text',1,1,1);

--시퀀스 생성 bom
CREATE SEQUENCE seq_p_bom
START WITH 1 -- 시작 값
INCREMENT BY 1; -- 증가 값

commit;

select * from p_work_method;

--emp테이블 emp2에 복사했음
create table emp2
as select * from emp;


select * from emp2;

insert into emp2
VALUES (7999,'text','text',7999,DATE '2023-10-27',9999,0,99);

commit;

delete from emp2 where empno = 123;
