package mysql;

public class UpdateCommands {
	show databases;
	use questiondb;
	create table employeee(
	emp_id int primary key,
	name varchar(50),
	dept varchar(30),
	salary int,
	experience int,
	city varchar(30),
	status varchar(20),
	email varchar(50),
	last_increment int,
	joining_date date);

	insert into employeee values
	(101,'Amit','Java',75000,4,'Delhi','active','amit@gmail.com',2023,'2021-06-10'),
	(102,'Rohit','Java',90000,6,'Pune','active','rohit@gmail.com',2022,'2019-03-12'),
	(103,'Neha','Angular',65000,3,'Delhi','inactive','neha@gmail.com',2021,'2022-01-05'),
	(104,'Pooja','HR',40000,2,'Noida','active','pooja@gmail.com',2023,'20230201'),
	(105,'Karan','Java',120000,8,'Delhi','active','karan@gmail.com',2020,'20170818'),
	(106,'Vikas','Python',55000,2,'Pune','inactive','vikas@gmail.com',2021,'20230411'),
	(107,'Ankit','Python',60000,3,'Delhi','active','ankit@gmail.com',2022,'20220909'),
	(108,'Riya','HR',45000,4,'Noida','active','riya@gmail.com',2022,'20200520'),
	(109,'Sahil','Java',30000,1,'Delhi','inactive','sahil@gmail.com',2023,'20240101'),
	(110,'Mohit','Angular',70000,5,'Pune','active','mohit@gmail.com',2021,'20200707');

	-- update employeee set salary=(salary*100.1) where city like 'Delhi';
	select * from employeee;
	-- update employeee set status='inactive' where experience<2;
	-- update employeee set salary=salary+5000 where last_increment<2022;
	-- update employeee set salary=(salary-3/20) where email like '%gmail.com' and salary>80000;
	-- update employeee set city='Gurgaon' where city like 'Delhi' and salary<50000;
	-- update employeee set salary=60000 where dept like 'HR' and experience between 2 and 4;
	-- update employeee set salary=(salary+1/5) where experience>4;
	-- update employeee set status='active' where joining_date>'20230101';
	-- update employeee set email=lower(email) ;
	-- update employeee set experience=experience+1 where joining_date<'20200101';
	-- alter table  employeee
	-- add column  Average int ;

	-- <<<<<<<<<<<<SUBQUERY>>>>>>>
	-- update employee  
	-- set salary= (Select avg(salary) from Employee)
	-- where salary <40000;
	-- update employeee set dept='support' where name like'%a';
	-- update employeee set salary=(salary+5000) where length(name)>5;
	-- update employeee set last_increment=2024 where last_increment<year(joining_date);
	-- update employeee set salary=salary+(experience*1000);
	select * from employeee;
	-- update employeee set dept='Java-Core' where dept like 'Java' and salary<800000;
	-- update employeee set status='inactive' where last_increment<2024;
	-- update employeee set salary=(salary*12/100) where city like 'pune' <>dept like 'HR';
	update employeee set salary=50000 where city like 'delhi';
	select salary from employeee;
	-- update employeee set salary=35000 where city<>'Delhi' and salary=(select min(salary) from(select min(salary) as Min_salary from employeee)as temp);
	-- update employeee set status='active' where status like 'inactive' and dept like'Angular';










}
