package mysql;

public class LikeOperator {
	create database operatordb;
	use operatordb;
	create table employee(
	emp_id int,
	emp_name varchar(50),
	email varchar(100),
	phone varchar(15),
	department varchar(30),
	city varchar(30),
	salary int,
	joining_date date);

	insert into employee values
	(101,'Amit Sharma','amit.sharma@tcs.com','9876543210','IT','Delhi',75000,'2021-03-15'),
	(102,'Anita Verma','anita_v@infosys.com','9876501234','HR','Pune',52000,'2020-07-10'),
	(103,'Rahul Singh','rahul.singh@wipro.com','9123456789','Finance','Mumbai',68000,'20191125'),
	(104, 'Rohit Meena','rohit.meena@tcs.com','9812345678','IT','Jaipur',82000,'20220112'),
	(105,'Neha Gupta','neha.gupta@gmail.com','9998887776','Marketing','Delhi',60000,'20210601'),
	(106,'Arjun Patel','arjun_p@accenture.com','9001234567','IT','Ahmedabad',91000,'20180919'),
	(107,'Sneha Roy','sneha.roy@deloitte.com','9123987654','Audit','Kolkata',73000,'20171205'),
	(108,'Sanjay Kumar','sanjay.kumar@yahoo.com','8887776665','HR','Delhi',48000,'20230420'),
	(109,'Ankit Jain','ankit.jain@tcs.com','7776665554','Finance','Indore',67000,'20200214'),
	(110,'Pooja Malhotra','pooja.m@infosys.com','9991112223','IT','Chandigarh',85000,'20190808');

	-- select * from employee where emp_name like 'a%a';
	-- select * from employee where email like '%@tcs.com%';
	-- select * from employee where emp_name like '_n%';
	select * from employee where emp_name like '_____';
	-- select * from employee where email regexp '[_]';
	-- select * from employee where phone like '9%0';
	-- select * from employee where emp_name like '%ee%';
	select * from employee where email not like 'emp_name%';
	-- select * from employee where city like '______';
	select * from employee where email ;

	-- RegularExpress (Regexp) :
	-- 1. (caret)^ example : name regexp '^A' ---> Name A se start ho..
	-- 2. $ example : name regexp 'r$' ----> Name R pe end ho...
	-- 3. [](character set) example : name regexp '[AEIOU]' ----> Name mein kahin bhi vowel...
	-- Example : name regexp '^[AEIOU]' -----> Name vowel se start....
	-- 4. [^] (not) Example : name regexp '^[^AEIOUaeiou]' ----> Name consonant se start...
	-- select * from employee where   emp_name regexp '^[^AIEOUaieou].*r$';
	-- [[[[^ --> Name Start , [^AEIOUaieou] ---> Vowel nahi consonant , .* --> beech mein kuch bhi , r$ --> end mein r.......]]]]
	 -- select * from employee where email like '%.@%';
	 select * from employee;
	 insert into employee values(111,'Rajat','rajat.@tax.com','65565656262','IT','Delhi',1000000,'20210315');
	 -- select * from employee where city like '__t%';
	 insert into employee values(112,'Khushi','khushi.hsf@shs.com','655656665','IT','Katra',565666,'20210315');
	 -- select * from employee where email like '_______________@%';
	 insert into employee values(113,'Satyam','satyamkushwashs@hs.com','6565656656','IT','Delhi',659566,'20210315');
	 select * from employee where emp_name like '____';
	--  select * from employee where email not like '%\_%';
	-- \ yeh saath mein lagakar batadiya exact underscore hi hai question mein??
	-- select * from employee where city like 'D____%';
	-- select * from employee where emp_name regexp '^[A-Za-z]+ [A-Za-z]+$';
	-- select * from employee where email regexp'[.com$]+[^@gmail.com$]';
	select * from employee where emp_name like '%\a\i\e\o\u%';

	 
	-- 4,8,10,15,20 
	 
	 
	 








}
