use bankInfinite;

drop table if exists UserAuth;

create table UserAuth
(
   userName varchar(30) primary key,
   password varchar(30) NOT NULL
);

insert into UserAuth(username,password) 
values('Murali','Krishna'),('Krishna','Shashank'),
('Arty','Yadav');

select count(*) from UserAuth where username='Murali' 
and password='Krishna';