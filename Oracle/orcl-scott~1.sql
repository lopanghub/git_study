create table test (
    name varchar2(50) default 'guset',
    age number default 1 check(age>0 and age<200),
    jumin varchar2(100) primary key,
    birth date default sysdate
);
drop table test;