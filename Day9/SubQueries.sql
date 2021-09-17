select max(sal) from Emp;

select ename from Emp where sal=
(select max(sal) from Emp); 

-- Display the 2nd maximum Salary 

select max(sal) from emp where sal < 
(select max(sal) from Emp);

-- IF subqery returns more than one value. 
-- we have 2 operators as 

-- ALL acts as AND operator
	-- EMPNO = ALL(10,20,30)means
		-- EMPNO=10 AND Empn=20 AND Empno=30
        
-- ANY acts as OR operator 
	-- EMPNO=ANY(10,20,30) means
		-- EMPNO <> 10 OR EMPNO <> 20 OR EMPNO <> 30
-- Display IDLE Agents 

-- Which is there in Agent table, but not there in AgentPolicy table. 

select * from Agent Where AgentID <> ALL(select AgentID From AgentPolicy);

-- Display the IDLE policies 

-- Which is there in Policy Table, but not there in AgentPolicy Table 

select * from Policy where PolicyID <> ALL(select PolicyID from AgentPolicy); 



