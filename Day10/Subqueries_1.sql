select max(sal) from Emp;

-- select ename from emp where sal=max(sal);

select ename from Emp where sal=(select max(sal) from Emp);

-- Display the 2nd max. salary 

select max(sal) from Emp where sal < (select max(sal) from Emp);

-- Display the name of person who is getting min. salary

-- Display 2nd min. salary 

-- Display the name of person who is getting 2nd max. salary 

select ename from emp where sal=(
select max(sal) from Emp where sal < (select max(sal) from Emp));

-- if subquery return more than one value...How to handle

-- Display records who did Policies from Agent and AgentPolicy Tables 

-- Which exists in both tables that details i need 

select * from Agent where agentid =ANY (select agentId from AgentPolicy);

-- Display records for which polices business happend 
-- which is in Policy and AgentPolicy tables

select * from Policy where policyID = ANY(select policyId from AgentPolicy);

-- Display i

-- Display Idle Agents 

-- which is in Agent table, but not in AgentPolicy table 

select * from Agent where agentID <> ALL(select agentId from AgentPolicy);

-- DIsplay Idle poliies, which in Policy table and not in AgentPolicy Table

select * from Policy where PolicyID <> ALL(select PolicyID from AgentPolicy);