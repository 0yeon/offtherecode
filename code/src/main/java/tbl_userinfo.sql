drop table tbl_userinfo;

create table tbl_userinfo (
	userinfo_user_fno number(10) unique not null,
	userinfo_lang varchar(100),
	userinfo_pofol varchar(100),
	userinfo_photo varchar(200),
	userinfo_other varchar(500),
	userinfo_phone varchar(13) unique,
	constraint userinfo_user_fno foreign key (userinfo_user_fno) references tbl_user(user_pno) on delete cascade
)

select * from tbl_userinfo;

commit
