select * from Emp;

-- write a query as print manager as 
-- if deptno is 10 then print as 'Shashank
--           is 20 then print as 'Gowtham'
--           is 30 then print as 'Praneetha'

select empno,ename,job,sal,deptno,
case deptno
   when 10 then 'Shashank'
   when 20 then 'Gowtham'
   when 30 then 'Praneetha'
   else 'Invalid '
end 'ManagerName'
from Emp;

select * from dept;

-- write a query to display HeadQuearters as 
-- if deptno is 10 then 'Hyderabad'
-- if deptno is 20 then 'Chennai'
-- if deptno is 30 then 'Pune'
-- if deptno is 40 then 'Mumbai' 

select deptno,dname,loc,
case deptno
   when 10 then 'Hyderabad'
   when 20 then 'Chennai'
   when 30 then 'Pune'
   when 40 then 'Mumbai'
   else 'Invalid'
end 'HeadQuarters'
from Dept;

select * from EMp;

select 
   empno, ename, job,sal,comm,
   case 
     when comm is null then sal
     else sal+comm
	end 'TakeHome'
from Emp;
