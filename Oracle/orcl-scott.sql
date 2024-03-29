create table member (
    id varchar2(50) primary key,
    pw varchar2(50) not null,
    age number default 1,
    reg date default sysdate
);
commit;

select * from member;

update member set age =? where id =? and pw =?;

delete from member where id = ? and pw =?;

//번호/대화명/메시지/시간
create table chatting(
    no number primary key,
    id varchar2(10),
    msg varchar2(4000),
    reg date
);

create sequence chatting_seq nocache;

//인덱스는 만들어두면 적용
create index idx_chatting_id on chatting(id);
create index idx_chatting_msg on chatting(msg);

commit;
select * from chatting;