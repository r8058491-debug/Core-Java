package mysql;

public class RelationalandLogicalOperator {
	
	create database hrsystemdb;
	use hrsystemdb;
	create table employees(
	emp_id int,
	emp_name varchar(50),
	department varchar(30),
	role varchar(30),
	salary int,
	experience int,
	joining_date date,
	is_active boolean,
	performance_rating int,
	on_pip boolean,
	bonus int);

	insert into employees values
	(1,'Amit','IT','Developer',70000,4,'2019-06-10',True,4,False,5000),
	(2,'Neha','HR','Manager',90000,8,'2017-03-15',True,5,False,10000),
	(3,'Rahul','Finance','Analyst',45000,2,'2021-01-20',True,2,True,0),
	(4,'Priya','IT','Intern',20000,1,'2023-07-01',True,3,False,0),
	(5,'Suresh','Operations','Supervisor',60000,6,'2018-11-05',False,3,False,8000);

	-- select * from employees where department like 'It' and experience>3;
	-- select * from employees where role like 'manager' and salary>80000;
	-- select * from employees where is_active <>True;
	-- select * from employees where performance_rating <3 and on_pip<>true;
	-- select * from employees where year(joining_date) <2020 and salary>50000;
	-- select * from employees where bonus !=0;
	-- select * from employees where role<>'intern' and experience>=5;


}
