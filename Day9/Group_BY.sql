-- Group By : Used to generate summary reports on the field specified. 

select sum(sal) from EMp;

-- Display salary paying to each job 

select distinct job from Emp;

select job, sum(sal)
from Emp group by job;

-- Display total employees working in each job

select job,count(*)
from Emp group by job;

-- Display max.salary paid to each job 

select job, max(sal) 
from Emp group by job;

-- Display min.salary paid to each job  

select job, sum(sal),avg(sal),max(sal),min(sal),count(*)
from Emp group by job;


select job,min(sal)
from Emp group by job;