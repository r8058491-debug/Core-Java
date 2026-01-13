package mysql;

public class FifthRandL {
	create database securitySystemdb;
	use securitySystemdb;
	create table user_logins(
	user_id int,
	login_attempts int,
	account_status varchar(20));

	insert into user_logins values
	(401,5,'Locked'),
	(402,1,'Active'),
	(403,4,'Locked'),
	(404,2,'Active');

	-- select * from user_logins where login_attempts >3 and account_status like 'Locked';
	-- select * from user_logins where account_status <>'Active';
	-- select * from user_logins where login_attempts<=2;


}
