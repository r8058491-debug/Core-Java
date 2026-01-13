package mysql;

public class SecondRandL {
	create database bankingSystemdb;
	use bankingSystemdb;
	create table bank_accounts(
	account_id int,
	customer_name varchar(50),
	balance int,
	minimum_balance int,
	kyc_status varchar(20),
	account_open_date date,
	is_active boolean);

	insert into bank_accounts values
	(101,'Ravi',2000,5000,'Pending','2016-05-10',True),
	(102,'Anita',80000,10000,'Approved','2019-02-18',True),
	(103,'Kunal',300000,5000,'Rejected','2015-09-25',False),
	(104,'Meena',15000,10000,'Approved','2022-08-01',True);

	-- select * from bank_accounts where balance >minimum_balance;
	-- select * from bank_accounts where kyc_status='Pending' or 'Rejected';
	-- select * from bank_accounts where is_active<>true;
	-- select * from bank_accounts where year(account_open_date)<2018 and balance >100000;


}
