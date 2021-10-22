drop database if exists college;

create database college;

use college;

create table CourseList
(
   courseno varchar(15) primary key,
   duration int,
   startDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   endDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   HOD varchar(30)
);


create table subjects
(
   year int,instructor varchar(28),
subject varchar(150),
theory int,
practical int
);

create table Feedback
(
   FID int primary key,
   StudentName varchar(30),
   instructor varchar(30),
   subject varchar(30),
   FbValue varchar(20)
);