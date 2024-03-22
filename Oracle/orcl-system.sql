--create user  scott identified by 1234;

--오라클 12c이상부터 계정명에 C##계정명 
--주석이 막 사라져 제발 좀 

--C##제거 적용하기

alter session set "_ORACLE_SCRIPT"=true;
create user scott identified by tiger;
grant resource, connect, dba to scott;
