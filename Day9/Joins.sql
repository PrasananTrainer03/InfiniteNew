-- DeptNo is the primary key in Dept table and Foreign Key in Emp table. 

select D.Deptno, Dname, Empno, Ename, Job, Sal
from Dept D INNER JOIN Emp E ON D.Deptno=E.Deptno;

-- Join more than 3 tables

select * from Agent;

desc Agent;

desc Policy;

desc AgentPolicy;

select A.AgentID,FirstName,LastName,City,State,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
from Agent A INNER JOIN AgentPolicy AP ON 
A.AgentID=AP.AgentID 
INNER JOIN Policy P ON 
P.PolicyID=Ap.PolicyID;

-- LEFT OUTER JOIN

select D.Deptno, Dname, Empno, Ename, Job, Sal
from Dept D LEFT JOIN Emp E ON D.Deptno=E.Deptno;

select A.AgentID,FirstName,LastName,City,State,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
from Agent A LEFT JOIN AgentPolicy AP ON 
A.AgentID=AP.AgentID 
LEFT JOIN Policy P ON 
P.PolicyID=Ap.PolicyID;


-- RIGHT OUTER JOIN 

select D.Deptno, Dname, Empno, Ename, Job, Sal
from Dept D RIGHT JOIN Emp E ON D.Deptno=E.Deptno;

select A.AgentID,FirstName,LastName,City,State,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
from Agent A RIGHT JOIN AgentPolicy AP ON 
A.AgentID=AP.AgentID 
RIGHT JOIN Policy P ON 
P.PolicyID=Ap.PolicyID;

select * from Agent Cross Join AgentPolicy;

select * from Policy cross join AgentPolicy;

select * from Emp;

select empno,ename,mgr from Emp;

select E1.Empno "Manager Code", E1.Ename "Manager Name",
	   E2.Empno "Employ Code", E2.Ename "Employ Name"
from Emp E1 INNER JOIN Emp E2 
On E1.Empno = E2.Mgr
Order By E1.Ename;

