-- instr() : Used to display the first occurrence of given char. 

select instr('bhagyashree','a') ;

select Ename,instr(Ename,'A') from Emp;

-- length(): Displays the length of string 

select length('Deepthi');

select Ename, Length(ENAME) from Emp;

select ename,length(ename) from Emp;

-- Reverse() : Displays string in reverse order 

select reverse('HariKrishna'); 

select Ename, Reverse(ENAME) from Emp;

select ename,reverse(ename) from Emp;

-- Left() : Displays no.of left-side chars 

select left('Bhagyashree',4);

-- right() : Displays no.of right-side chars

select right('Bhagyashree',4);

-- lower() : Used to display in lower case 

select lower('Hari Krishna');

-- Upper() : Used to display in upper case 

select upper('Hari Krishna');

select ename,lower(ename),upper(ename) from Emp;

-- concat() : used to concat multiple strings into single

select concat('Goutham',' ','Sekhar');

select concat('Harshit',' ','Chaudhary');

select concat('Bhagyashree',' ','Paikaray');

-- Replace() : used to replace old string with new string in all 
-- occurrence 

select replace('Java Training','Java','MySql');

-- substring() : used to display the part of the string. 

select substring('welcome to mysql',5,10);

select substring('Welcome to MySql',5);

