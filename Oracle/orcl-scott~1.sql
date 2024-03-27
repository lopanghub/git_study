select * from emp, dept;
//15*4 만큼의 결과 크로스 조인 - 잘안쓴다

select * from dept;
select * from emp, dept where emp.deptno = dept.deptno;
//등가 조인 where 절로 묶임
select * from emp, dept where emp.deptno(+) = dept.deptno;
//외부 조인 null값도 출력


//사원의 이름, 직무, 부서명, 부서 위치를 출력
select e.ename, e.job, d.dname, d.loc from emp e , dept d where e.deptno=d.deptno;

select e.*, d.dname from emp e, dept d 
    where e.deptno = d.deptno;
    
//이름이 'FORD'인 사원의 이름, 부서명을 출력하시오    
select e.ename, d.dname from emp e, dept d 
where e.deptno=d.deptno and e.ename = 'FORD'; 

//급여가 3000 이상인
//사원번호, 이름, 급여, 부서이름, 부서위치 출력
select e.empno, e.ename, e.sal, d.dname, d.loc from emp e, dept d
    where e.deptno = d.deptno and e.sal>=3000;
    
    
    
//natural join 현재의 데이터베이스는 관계를 맺지 않고 무작위로 테이블를 만들기 때문에
//등가조인 위주로 사용한다 
select * from emp e natural join dept d ;

// 사원 이름 'JONES'보다 많이 받는 사원 정보 출력
select * from emp 
    where sal> (select sal from emp where ename='JONES');
    
    
select ename as name, deptno as no from emp;
select no from 
    (select ename as name, deptno as no from emp);
    //테이블 자리에 셀렉문을 넣을 수 있다
    
//전체 사원의 평균급여 보다 많이 받는 사원의 이름, 급여 출력
select ename, sal from emp
    where sal > (select avg(sal) from emp); //복습할때 따로 체크
    
 //전체 사원의 평균급여 보다 많이 받는 사원의 이름, 급여, 부서이름 출력
select e.ename, e.sal, d.dname from emp e, dept d
    where e.deptno = d.deptno and sal > (select avg(sal) from emp);
    
//10번 부서 사람과 20분 부서 사원이 같은 직무
select job from emp where deptno=20;
select * from emp
    where deptno= 10 and job in (select job from emp where deptno=20);
    //서브쿼리의 값이 여러개일땐 in 연산자를 쓴다
    
//'MARTIN'이나 'SCOTT'의 급여가 같은 사원의 이름, 급여를 출력
select ename, sal from emp
    where sal in (select sal from emp where ename in('MARTIN','SCOTT'))
    AND ename not in('MARTIN','SCOTT');
    
//10번 부서 중에서 30번 부서에 없는 업무를 하는 사원의 이름, 업무, 부서명 출력
select e.ename, e.job, d.dname from emp e, dept d
    where e.deptno =d.deptno 
        and e.deptno =10
        and e.job not in (select job from emp where deptno=30);