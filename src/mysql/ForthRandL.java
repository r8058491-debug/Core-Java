package mysql;

public class ForthRandL {
	create database logistics_Systemdb;
	use logistics_Systemdb;
	create table shipments(
	shipment_id int,
	expected_date date,
	delivery_date date,
	payment_status varchar(20));

	insert into shipments values
	(301,'2024-01-10','2024-01-12','Paid'),
	(302,'2024-01-15','2024-01-14','Paid'),
	(303,'2024-01-20',null,'Paid'),
	(304,'2024-01-18',null,'Pending');

	-- select * from shipments where delivery_date>expected_date;
	-- select * from shipments  where delivery_date is null and payment_status like 'Paid';
	-- select * from shipments where payment_status like 'Pending'; 




}
