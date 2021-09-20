desc Dept;
desc emp;

-- Display records using Inner Join from Dept and Emp table(s) and in that Deptno is primary key in Dept table
-- and foreign key in the Emp table, we need to join on those field(s)


select D.Deptno,Dname, Empno, Ename,Job,Sal
from Dept D INNER JOIN Emp E 
ON D.DeptNo = E.DeptNo;

-- Joining 3 tables 

-- Agent and Policy are parentTable(s) AgentID+, PolicID+
-- AgentPolicy is the Child table for both (AgentID-, PolicyID-)

select A.AgentId,FirstName,LastName,City,State,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
from Agent A INNER Join AgentPolicy AP 
ON A.AgentID=AP.AgentID
INNER Join Policy P ON
P.PolicyID=AP.PolicyID;

-- INNER JOIN

select D.Deptno,Dname, Empno, Ename,Job,Sal
from Dept D INNER JOIN Emp E 
ON D.DeptNo = E.DeptNo;

-- LEFT OUTER JOIN

select D.Deptno,Dname, Empno, Ename,Job,Sal
from Dept D LEFT JOIN Emp E 
ON D.DeptNo = E.DeptNo;

-- LEFT OUTER JOIN

select A.AgentId,FirstName,LastName,City,State,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
from Agent A LEFT Join AgentPolicy AP 
ON A.AgentID=AP.AgentID
LEFT Join Policy P ON
P.PolicyID=AP.PolicyID;

-- RIGHT OUTER JOIN

select A.AgentId,FirstName,LastName,City,State,
P.PolicyID,AppNumber,ModalPremium,AnnualPremium
from Agent A RIGHT Join AgentPolicy AP 
ON A.AgentID=AP.AgentID
RIGHT Join Policy P ON
P.PolicyID=AP.PolicyID;

-- Cross join 

-- generates cartician product of two table records. Table A contains n records
-- and table B contains m records, then it generates n*m records

select * from Agent Cross Join AgentPolicy;

-- Each record in Agent table, multiplies Each records in AgentPolicy table. 

-- self join 

-- if a table joins with itself known as self join 

select empno,ename,job,sal,mgr from Emp;

select E1.Empno, E1.Ename,
	   E2.Empno,E2.Ename
from Emp E1 INNER JOIN Emp E2 ON 
E1.Empno=E2.Mgr
order by E1.Empno;