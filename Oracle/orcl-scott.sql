//계정의 전체 테이블 목록 검색
select * from tab;

//테이블 구조 확인
desc emp;

select * from emp;

//테이블 생성
create table member(
    id varchar2(50) primary key,
    pw varchar2(50) not null,
    birth date,
    age number default 1,
    name varchar2(50),
    reg date default sysdate
);

commit;



select * from member;

// 데이터 추가 - insert

insert into member values('java', '0000', '90/01/05', 24, 'oracle', sysdate);
insert into member values('html', '1234', '91/11/23', 23, 'www', sysdate);
insert into member values('test', '0004', '93/05/06', 21, NULL, sysdate);

insert into member(id, pw) values('kor', '134');
insert into member(id, pw, name) values('gildong', '134', 'home');

//3 수정 - UPDATE
    
update member set pw = '0000';
update member set pw = '1234', name='guest', age=20;

update member set pw = '000' where id = 'java';
update member set pw ='111111' where id = 'jaaaavaa';

update member set pw='1212' where age >30;

//4 삭제
delete from member;

delete from member where name is null;

//롤백
select * from member;
commit;
delete from member;
rollback;

//1 테이블 정보변경 alter
drop table member;

//2 테이블 생성
create table test(
    num number primary key,
    name varchar2(50),
    reg date default sysdate
);    
// 추가
alter table test add(age number default 1);

desc test;

alter table emp add( age number default 1);
alter table emp add(pw varchar2(100) not null);
alter table test add(pw varchar2(100) not null);

select * from test;

alter table test rename column name to nick;

alter table test drop column pw;
desc test;

alter table emp drop column age;
alter table emp drop column pw;

desc emp;


select * from dictionary;
select * from dict;

select * from tab;
select table_name from user_tables;

select * from dba_tables;
select * from all_users;
select * from dba_users;


select * from emp where empno=7900;
select * from user_indexes;
select * from user_ind_columns;
select index_name, table_name, column_name from user_ind_columns;

select * from emp where empno=7000; //인덱스 설정된 쪽이 훨씬 빠르다
select * from emp where sal = 3000;

create index idx_emp_sal on emp(sal);

drop index idx_emp_sal;

select empno, job, sal, deptno from emp;

//10번 부서에서 급여가 가장 많은 직원 사원번호 직업 급여를 출력
select empno, job, sal from emp where deptno=10 
    and sal=(select max(sal) from emp where deptno =10);
    
//10번 부서에서 사원번호 7839의 사원번호, 직업, 급여를 출력하시오
select empno, job, sal from emp where deptno=10 and empno=7839;

//자주 사용되는 검색문을 하나씩 쓰기보단 뷰로 저장 
create view vm_emp10
    as (select empno, job, sal from emp where deptno=10);
    
//위의 코드를 뷰로 출력
select * from vm_emp10 where empno = 7839;

//생성된 뷰를 확인
select * from user_views;

drop view vm_emp10;

//rownum이 뒤죽박죽으로 나온다
select rownum, empno, ename, job, sal from emp order by sal;

// *은 단독으로 써야된다(에러)
select *, rownum from 
    (select rownum, empno, ename, job, sal from emp order by sal);
    
select e.*, rownum from 
    (select  empno, ename, job, sal from emp  order by sal) e;    
    
//1~5
select * from 
    (select e.*, rownum as rn from
        (select empno, ename, job, sal from emp order by sal) e)
        where rn>=1 and rn <=5;
        
//이렇게 쓰는 이유 로우넘을 직접적으로 쓰면 중복으로 사용되기 때문에 서브쿼리로 처리        

//시퀀스
create sequence test_seq;

drop table test;
create table test(
    num number primary key,
    name varchar2(50)
);

insert into test values(test_seq.nextval,'java');
insert into test values(test_seq.nextval,'java');
insert into test values(test_seq.nextval,'java');
insert into test values(test_seq.nextval,'java');

select * from test;

delete from test;

select * from seq;

//시퀀스 옵션 
create sequence test1_seq
    start with 10
    increment by 2
    maxvalue 100 
    minvalue 1 
    cycle 
    nocache
    ;
    
select * from seq;

insert into test values(test1_seq.nextval, 'java01');
select * from test ;

create sequence 시퀀스명 nocache;

//현재 시퀀스 값 확인
select test_seq.currval from dual;
select test1_seq.currval from dual;
    