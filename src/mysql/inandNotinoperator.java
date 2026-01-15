package mysql;

public class inandNotinoperator {
	create database opdb;
	use opdb;
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

	-- select * from employee where department in ('IT','HR','Finance');
	-- select * from employee where city in ('Delhi','Pune','Mumbai');
	-- select * from employee where salary in (60000,75000,85000);
	-- select * from employee where department in ('audit');
	select * from employee where email in ('Tcs','Infosys','Yahoo','Gmail','Deloitte','Accenture','tcs','wipro');
	-- select * from employee where year(joining_date) in(2019,2020,2021);
	-- select * from employee where city in('Delhi','Mumbai','Hyderabad');
	select * from employee where phone in(+91);
	insert into employee values(117,'satyam don ', 'satyajkumar658@gmail.com','+91_56575755678','java','delhi',1000000,'20190512');
	 select*from employee where department in('manager');
	 
	 	insert into employee values
	 (118,'kalu dada', 'kaludada@5353gmaile.com', '91_456787676','manager','delhi',100000,'20190612');
	select * from employee where salary =100000 and emp_id=118;
	alter table employee
	add column project_id int;
	create table project(
	project_id int,
	project_name varchar(50));
	insert into project values(201,'File_Handling'),
	(202,'Data_Handling');
	delete from employee where emp_id=117;
	delete from employee where emp_id=118;
	select * from employee;
	alter table employee
	add constraint primary key(emp_id);
	alter table project
	add constraint primary key(project_id);
	alter table employee
	add constraint foreign key (project_id) references project(project_id);
	update employee set project_id=201
	where emp_id=101;
	update employee set project_id=202 where emp_id=102;
	update employee set project_id=201 where emp_id=103;
	update employee set project_id=202 where emp_id=104;
	update employee set project_id=201 where emp_id=105;
	update employee set project_id=202 where emp_id=106;
	update employee set project_id=201 where emp_id=107;
	update employee set project_id=202 where emp_id=108;
	update employee set project_id=201 where emp_id=109;
	update employee set project_id=201 where emp_id=110;
	-- select emp_name,department,project_id from employee where project_id in(201,202);
	-- select*from employee where city in('Uttar Pradesh','Uttarakhand','Punjab','Haryana','Himachal Pradesh','Rajasthan','Delhi','Jammu & Kashmir');
	-- select * from employee where salary in(50000,75000,60000) and department in('IT','Marketing') 
	-- select * from employee where month(joining_date)in(01,02,03,04);
	-- select * from employee where department in('IT','Finance') and project_id in(202);
	-- select * from employee where email like '%tcs%' or email like '%wipro%' or email like '%accenture%' or email like '%infosys%' or email like '%yahoo%' or email like '%gmail%' or email like '%deloitte%';
	-- select emp_id from employee where department in('HR','Finance') or emp_name in('Amit sharma','Rohit meena');
	-- select * from employee where city in ('Delhi','Haryana');

	-- NOT IN OPERATOR
	-- select * from employee where department not in('it','hr');
	-- select * from employee where city not in('mumbai','delhi','bengaluru','kolkata','chennai','hyderabad','ahmedabad','pune','surat','jaipur');
	-- select * from employee where salary not between 50000 and 70000;
	-- select * from employee where year(joining_date) not in(2019,2020,2021);
	-- select * from employee where salary between 30000 and 50000;
	-- select * from employee where month(joining_date) not in(01,02,03,04,05,06,07,08);
	-- select * from employee where project_id not in(201);
	update employee 
	set project_id=null where emp_id=108;
	-- select * from employee where project_id not in (201,202) or project_id is null;


}
