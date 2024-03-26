select add_months('2012/01/01',1) from dual;    

SELECT months_between (sysdate, hiredate),trunc(months_between (sysdate, hiredate)) as month from emp;

select next_day(next_day(sysdate, '월요일'), '월요일') from dual;
select next_day(sysdate, '수요일') from dual;

SELECT last_day(sysdate) from dual;

select sysdate, sysdate+8 from dual;
SELECT to_char(sysdate)+8 from dual;
select to_date('24/03/26')+8 from duaL;
select to_number('ABCD')+100 from dual;

SELECT to_char(sysdate, 'YYYY/MM/DD HH:MI:SS') from dual;

select to_date('0207', 'MM/YY') from dual;

select comm, nvl(comm,0) from emp;
select sum(comm) from emp;
select sal,comm, sal+nvl(comm,0) as 총급여 from emp;

select comm, nvl2(comm, 'o' ,'x') from emp;
//연봉 계산 sal 월급 comm 보너스
// sal *12, sal*12+comm

select sal as 월급 , 
        nvl(comm,0) as 보너스 ,
        nvl2(comm, sal*12+comm, sal*12) as 연봉
        from emp; 
        
select distinct job from emp;                
select decode(job, 
            'MANAGER', sal*1.1,
            'SALESMAN', sal*1.2,
            'ANALYST', sal*1.3) as upsal from emp;        
            
select case job
            when 'MANAGER' then sal*1.1
            when 'SALESMAN' then sal*1.2
            when 'ANALYST' then sal*1.3
            else sal
        end as upsal from emp;    
        
select case
            when comm is null then '해당사항 없음'
            when comm = 0 then '보너스 없음'
            when comm > 0 then '보너스 '|| sal*1.1 // || 연결문자 자바의 +
        end as comm
        from emp;
        
select sal from emp;        
select sum(sal) from emp;
select sum(sal), max(sal), min(sal), count(*) from emp;
select count(comm) from emp;
select sum(sal) from emp where deptno=10;


select deptno, count(*) from emp group by deptno;
//부서번호당 몇명있는지
select deptno, 
    count(*), sum(sal), max(sal),min(sal),trunc(avg(sal))
    from emp group by deptno
    order by deptno;
    
select deptno, trunc(avg(sal)) from emp
    group by deptno having avg(sal)>= 2000;
    
select job, count(*) from emp group by job;


// 전체 월급 5000 초과하는 job, 단 salesman 제외
select job, sum(sal) as 급여합 from emp 
where job !='SALESMAN'
group by job having sum(sal)>5000
order by sum(sal) desc;

select * from emp;

select deptno, job, count(*) from emp 
    group by deptno, job order by deptno;
    //부서별로 묶고 다시 하위에서 직업별로 묶기


select * from emp;

//1번 부서번호가 10번인부서의사람중사원번호, 이름, 급여를출력하라.

select deptno, empno, ename, sal  from emp where deptno=10;

//2번 사원번호가 7639인사람중이름, 입사일자, 부서번호를출력하라.
select empno, ename, hiredate, deptno from emp where empno=7698;

//3번 이름이 ALLEN인사람의모든정보를출력하라.

select * from emp where ename='ALLEN';

//4번 입사일자가 83/01/12인사원의이름, 부서번호, 급여를출력하라.
select ename, deptno, sal, hiredate 
    from emp where hiredate = to_date('1981/11/17','YYYY/MM/DD');
    

//5번 직업이 MANAGER가아닌사람의모든정보를출력하라.
select * from emp where job != 'MANAGER';

//6번  입사일자가 81/04/02 이후에입사한사원의정보를출력하라.
select * from emp where hiredate > '81/04/02';

//7번 급여가 $800이상인사람의이름, 급여, 부서번호를출력하라.
select ename, sal, deptno from emp where sal>=800;

//<<8>>  부서번호가 20번이상인사원의모든정보를출력하라.
select * from emp where deptno>=20;


//9번 성명이 K로시작하는사람보다높은이름을가진사람의모든정보를출력하라. 
select * from emp where ename > 'L%';

//<<10>>  입사일자가 81/12/09 보다먼저입사한사람들의모든정보를출력하라.
select * from emp where hiredate < to_date('1981/12/09', 'YYYY/MM/DD');

//<<11>>  입사번호가 7698 보다작거나같은사람들의입사번호와이름을출력하라.
select empno, ename from emp where empno <=7698;

//<<12>>  입사일자가 81/04/02 보다늦고 82/12/09 보다빠른사원의이름, 월급, 부서번호를출력하라.
select ename, sal, deptno, hiredate from emp where hiredate > '81/04/02' and hiredate <'82/12/09';

//<<13>>  급여가 1,600 보다크고 $3,000보다작은사람은이름, 직무, 급여를출력하라.
select ename, job, sal from emp where sal between 1600 and 3000;

//<<14>>  사원번호가 7654와 7782 사이이외의사원의모든정보를출력하라.
select * from emp where not (empno between 7654 and 7782);

//<<15>>이름이 B와 J 사이의모든사원의정보를출력하라.
select * from emp where ename >= 'B%' and ename<='J%';

//<<16>>  입사일자가 81년이외에입사한사람의모든정보를출력하라.
select * from emp where not (to_char(hiredate) like '81%');

//<<17>>  직무가 MANAGER와 SALESMAN인사람의모든정보를출력하라.
select * from emp where job = 'MANAGER' or job= 'SALESMAN';

//<<18>>  부서번호와 20,30번을제외한모든사람의이름, 사원번호, 부서번호를출력하라.
select ename, empno, deptno from emp where deptno not in(20,30);

//<<19>>  이름이 S로시작하는사원의사원번호, 이름, 입사일자, 부서번호를출력하라.
select ename, hiredate, deptno from emp where ename like 'S%';



//20번 입사일자가 81년도인사람의모든정보를출력하라.
select * from emp where hiredate > '80/12/31' and hiredate<'82/01/01';

select * from emp
    where to_char(hiredate) like '81%';
    

//<<21>>  이름중 S자가들어가있는사람만모든정보를출력하라.
select * from emp where REGEXP_LIKE(ename, 'S+');

//<<22>>  이름이 S로시작하고마지막글자가 T인사람의모든정보를출력하라 (단, 이름은전체 5자리이다.>>
select * from emp where ename like 'S___T';

//<<23>>  첫번째문자는관계없고두번째문자가 A인사람의정보를출력하라.
select * from emp where ename like '_A%';

//<<24>>  커미션이 NULL인사람의정보를출력하라.
select * from emp where comm is null;

//<<25>>  커미션이 NULL이아닌사람의모든정보를출력하라.
select * from emp where comm is not null;

//<<26>>  부서가 30번부서이고급여가 $1,500 이상인사람의이름, 부서, 월급을출력하라.
select ename, deptno, sal from emp where deptno = 30 and sal>=1500;

//<<27>>  이름의첫글자가 K로시작하거나부서번호가 30인사람의사원번호, 이름, 부서번호를출력하라.
select empno, ename, deptno from emp where ename like 'K%' or deptno =30;

//<<28>>  급여가 $1,500이상이고부서번호가 30번인사워중직업이 MANAGER인사람의정보를출력하라.
select * from emp where sal >= 1500 and deptno=30 and job = 'MANAGER';

//<<29>>  부서번호가 30인사람중사원번호를 SORT 하라.
select * from emp where deptno=30 order by empno;

//<<30>>  급여가많은순으로 정렬 하라.
select * from emp order by sal desc;

    
//31번 부서번호로 정렬 한후 급여가많은사람순으로출력하라.
select * from emp
    order by deptno, sal desc;
    
//<<32>>  부서번호로 내림차순 정렬 하고이름순으로 오름차순, 급여순으로 내림차순 정렬하라.    
select * from emp order by deptno desc, ename, sal desc;


select upper(ename), lower(ename), initcap(ename) from emp;
select * from emp where upper(ename) = upper('scott');
select * from emp where upper(ename) like upper ('%s%');

select ename, length(ename) from emp;
select ename, sal, deptno from emp where length(ename)=4;

select length('한글'), lengthb('한글') from dual;

select job, substr(job,1,3) from emp;// 인덱스 1번부터 시작
select job, substr(job,3,2) from emp;
select job, substr(job,3) from emp;

select job, substr(job,-1) from emp;
select job, substr(job,-3) from emp;
select job, substr(job,-3,2) from emp;

select instr('hello, oracle' , 'l' , 5) from dual;
select instr('hello, oracle', 'l',1,2) from dual;

select replace('010-1234-0000','-',' ') from dual;
select job, replace(job,'M','-') from emp;

select lpad ('oracle',10) from dual;
select rpad ('oracle',10,'*') from dual;
select lpad ('oracle',10,'*') from dual;
select rpad('930101-1',14,'*') from dual;

select concat(ename, job) from emp;
select concat(empno, ename) from emp;
select ename||'_'||job from emp;

select trim ('     korea     ') from dual;
select ltrim('<korea>','<') from dual;

select round(1234.5678) from dual;
select round(1234.5678,0) from dual;
select round(1234.5678,1) from dual;
select round(1234.5678,2) from dual;

select ceil(1234.5678) from dual; //올림

select trunc(1234.5678) from dual;
select trunc(1234.5678,1) from dual;
select trunc(1234.5678,2) from dual;

select sal, trunc(sal/12) from emp;

select trunc(-3.14) from dual;

select floor (-3.14)from dual;
//소수점 아래 자리 버리고 정수부분을 다음 음수로 변환

select mod(15,6) from dual;
select mod(15,5) from dual;

select sysdate from dual;
select sysdate , sysdate-1, sysdate+8 from dual;