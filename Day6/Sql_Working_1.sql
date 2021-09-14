use infinite;

-- Display information about Emp table

DESC Emp;

-- Display information about Dept table 

DESC DEPT;

-- Display all records from Emp Table 

select * from Emp;

-- Display all records from Dept Table 

select * from Dept;

-- Projection (Display only the specific fields ) 

-- Display Empno, Ename, Job, Sal from Emp table 

select Empno, Ename, Job, Sal
from Emp;

-- Display Empno,Ename,sal,Comm,Mgr from Emp table 

select Empno, Ename, Sal, Comm, Mgr 
from Emp;

-- RESTRICT Operator 

-- Used to filter data using WHRE clause 

-- Display all records whose sal >= 3000;

select * from Emp 
where sal >= 3000;

-- Display all records whose job is 'CLERK' 

select * from Emp 
where job='CLERK';

-- Display information whose ENAME is 'KING'

select * from Emp 
where ename='KING';

-- Display information whose Comm is null 

select * from Emp 
where comm is NULL;

-- BETWEEN...AND : used to display values w.r.t. Specific range, it works with date and numbers only 

select * from EMp 
where sal between 1000 and 3000;

select * from Emp 
where sal not between 1000 and 3000;

-- IN CLAUSE : Used to display multiple values of particular column 

-- Display information whose ENAME is SMITH or KING or FORD or JONES 

select * from Emp 
where ename in('SMITH','KING','FORD','JONES');

-- Display information whose Job is 'CLERK' or 'ANALYST' 

select * from Emp 
where job in('CLERK','ANALYST');

select * from Emp 
where ENAME NOT in('SMITH','KING','FORD','JONES');

select * from Emp 
where job NOT in('CLERK','ANALYST');

-- LIKE : Used to display data w.r.t. Wild cards 

-- Display all records whose Name starts with 'S'

select * from Emp 
where ENAME LIKE 'S%';

select * from Emp 
where ENAME LIKE '%S';

-- Order By : Used to display data w.r.t. Specific field(s) in ascending or descending order 

select Empno,Ename,Job,Sal from Emp
order By Job;

select Empno, Ename, Job,Sal from Emp
order By Ename;

select Empno,Ename,job,sal from Emp 
Order By Job desc;

select Empno,Ename,job,sal from Emp 
Order By Ename desc;

select empno,ename,job,sal from emp
order by job,ename;

select empno,ename,job,sal from Emp
order by job, ename desc;
