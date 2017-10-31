CREATE DATABASE ProductDB
go 
use ProductDB
go
create table Product(
prodID int primary key,
prodName varchar(50),
prodPrice float(50),
prodQuantity int,
)
