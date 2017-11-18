GO
USE master
GO
GO
DROP DATABASE RAOVAT
GO
GO
CREATE DATABASE RAOVAT
GO
GO
USE RAOVAT
GO
GO
CREATE TABLE tblUserTier
(
	UserTierId INT IDENTITY PRIMARY KEY,
	Name varchar(50) not null,
	Balance int not null,
	NumberOfPost int not null,
	NumberOfDay int not null
)
GO
GO
CREATE TABLE tblUser
(
	UserId INT IDENTITY PRIMARY KEY,
	Account varchar(50) unique not null,
	Password varchar(50) not null,
	FullName nvarchar(100),
	Phone varchar(30),
	Email varchar(50),
	TypeOfUser int references tblUserTier(UserTierId),
	DateIn datetime default GETDATE(),
	Balance float not null
)
GO
GO
INSERT INTO tblUserTier VALUES
('Admin',0,0,0),
('Moderate',0,0,0),
('Free',0,1,5),
('Vip1',100000,20,10),
('Vip2',250000,50,15),
('Vip3',500000,200,20),
('Vip4',100000,1000,30),
('Vip5',2000000,5000,60),
('Vip6',5000000,50000,100)
GO

GO
CREATE TABLE tblCatalog
(
	CatalogId INT IDENTITY PRIMARY KEY,
	Title nvarchar(50) not null,
	Description nvarchar(100)
)
GO
GO
CREATE TABLE tblPost
(
	PostId INT IDENTITY PRIMARY KEY,
	Content nvarchar(500) not null,
	UserId INT REFERENCES tblUser(UserId),
	CatalogId INT REFERENCES tblCatalog(CatalogId),
)
GO
GO
CREATE TABLE tblPostDetails
(
	PostDetailsId INT IDENTITY PRIMARY KEY,
	PostId INT REFERENCES tblPost(PostId),
	Img VARCHAR(500),
	CreatedDate DATETIME DEFAULT GETDATE(),
	ExpiryDate DATETIME,
	Prices FLOAT,
	Quantity INT
)
GO
GO
CREATE TABLE tblComment
(
	CommentId INT IDENTITY PRIMARY KEY,
	UserId INT REFERENCES tblUser(UserId),
	PostId INT REFERENCES tblPost(PostId),
	Content NVARCHAR(500) NOT NULL,
	CreatedDate DATETIME DEFAULT GETDATE(),
)
GO
GO
INSERT INTO tblUser(Account,Password,FullName,Email,Phone,TypeOfUser,Balance) VALUES
('admin','admin','admin','admin','admin',1,0),
('mod','mod','moderate','moderate','moderate',2,0),
('free','1','freeuser','hayda@gmail.com','0917514377',3,0),
('premium','1','premium user','hayda3@gmail.com','01672701149',4,200000),
('Vip3','1','Vip','Vip','Vip',6,100000)
GO
GO
INSERT INTO tblCatalog VALUES 
(N'Trà chanh',''),
(N'Chém gió',''),
(N'Rau',''),
(N'Xôi thịt','')
GO
GO
INSERT INTO tblPost(Content,UserId,CatalogId) VALUES 
(N'Tìm người đẹp',3,3),
(N'Buôn rau',4,4),
(N'Tổng thống Obama sang thăm FPT',5,1),
(N'Mua BMV6 giá 60 triệu',3,2)
GO
GO
INSERT INTO tblPostDetails(PostId,Img,Prices,Quantity,ExpiryDate) VALUES
(1,'',2324,123,GETDATE()+5),
(2,'',2501,100,GETDATE()+5),
(3,'',2472,200,GETDATE()+5),
(4,'',2232,300,GETDATE()+5)
GO
GO
INSERT INTO tblComment(UserId,PostId,Content) VALUES
(1,3,N'Thăm má tao bán xôi cạnh cổng ấy chứ'),
(4,2,N'Rau mùng tơi bao tiền em ơi'),
(5,1,N'Inbox anh share sđt cho nhé')
GO
GO
SELECT * FROM tblUser
GO
GO
SELECT * FROM tblCatalog
GO
GO
SELECT * FROM tblPost a JOIN tblUser c ON a.UserId=c.UserId JOIN tblCatalog v ON a.CatalogId=v.CatalogId JOIN tblComment x ON x.PostId=a.PostId JOIN tblPostDetails z ON a.PostId=z.PostId
GO
GO
SELECT * FROM tblComment
GO





