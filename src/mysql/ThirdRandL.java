package mysql;

public class ThirdRandL {
	create database e_commerceSystemdb;
	use e_commerceSystemdb;
	create table products(
	product_id int,
	product_name varchar(50),
	category varchar(30),
	price int,
	stock int,
	reorder_level int,
	is_verified boolean);

	insert into products values
	(201,'Laptop','Electronics',60000,5,10,True),
	(202,'Chair','Furniture',5000,20,15,True),
	(203,'Mobile','Electronics',25000,2,5,False),
	(204,'Table','Furniture',12000,3,8,True);

	-- select * from products where stock<reorder_level;
	insert into products values(205,'Desk','Furniture',25000,3,9,True);
	-- select * from products where price>20000 and category!= 'Electronics';
	-- select * from products where is_verified<>true;
	-- select * from products where category like 'Furniture' or price<6000;


}
