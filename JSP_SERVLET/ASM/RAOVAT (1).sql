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
INSERT INTO tblUserTier VALUES
('Admin',0,0,0),
('Moderate',0,0,0),
('Vip6',100000,20,10),
('Vip5',250000,50,15),
('Vip4',500000,200,20),
('Vip3',100000,1000,30),
('Vip2',2000000,5000,60),
('Vip1',5000000,50000,100),
('Free',0,1,5)
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
INSERT INTO tblUser(Account,Password,FullName,Email,Phone,TypeOfUser,Balance) VALUES
('admin','admin','admin','admin','admin',1,0),
('mod','mod','moderate','moderate','01233200126',2,0),
('Vip3','1','Vip','Vip','0123443232',6,100000),
('premium','1','premium user','hayda3@gmail.com','01672701149',7,200000),
('free','1','freeuser','hayda@gmail.com','0917514377',9,0)
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
INSERT INTO tblCatalog VALUES 
(N'ELECTRONICS',''),
(N'VEHICLES',''),
(N'ESTATE',''),	
(N'SERVICES',''),
(N'JOBS',''),
(N'FASHION/BEAUTY',''),
(N'ENTERTAINMENT',''),
(N'FOOD',''),
(N'OTHER','')
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
INSERT INTO tblPost(Content,UserId,CatalogId) VALUES 
(N'Mobiles',3,1),
(N'DeskTop',2,1),
(N'Laptop',5,1),
(N'Tablets',2,1),
(N'TV/Audio/Videos/Camera',3,1),
(N'Computer Compoments',3,1),
(N'Cars',4,2),
(N'Bike',4,2),
(N'Spare Parts',4,2),
(N'Buy Home',4,3),
(N'Sell Home',2,3),
(N'Event Services',3,4),
(N'Law Services',3,4),
(N'Jobseekers',2,5),
(N'Male Fashion',2,6),
(N'Underwear',3,6),
(N'Tourism',5,7),
(N'SeaFood',4,8),
(N'ForestFood',4,8),
(N'Toy',4,9),
(N'Gifts',3,9)
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
INSERT INTO tblPostDetails(PostId,Img,Prices,Quantity,ExpiryDate) VALUES
(1,'',2324,123,GETDATE()+5),
(2,'',2501,100,GETDATE()+5),
(3,'',2472,200,GETDATE()+5),
(4,'',2232,300,GETDATE()+5),
(5,'',2324,123,GETDATE()+5),
(6,'',2501,100,GETDATE()+5),
(7,'',2472,200,GETDATE()+5),
(8,'',2232,300,GETDATE()+5),
(9,'',2324,123,GETDATE()+5),
(10,'',2501,100,GETDATE()+5),
(11,'',2472,200,GETDATE()+5),
(12,'',2232,300,GETDATE()+5),
(13,'',2324,123,GETDATE()+5),
(14,'',2501,100,GETDATE()+5),
(15,'',2472,200,GETDATE()+5),
(16,'',2232,300,GETDATE()+5),
(17,'',2324,123,GETDATE()+5),
(18,'',2501,100,GETDATE()+5),
(19,'',2472,200,GETDATE()+5),
(20,'',2232,300,GETDATE()+5),
(21,'',2232,300,GETDATE()+5)
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
GO
INSERT INTO tblComment(UserId,PostId,Content) VALUES
(1,3,N'Ngày hôm qua em chợt mang nắng tới'),
(4,2,N'Để làm anh ngất ngây'),
(5,1,N'Tình đơn phương, đôi khi thấy em cười vui lòng anh xao xuyến'),
(1,3,N'Nàng đâu hay biết chăng anh đã yêu từ lâu'),
(4,2,N'Đôi khi anh muốn nói'),
(5,1,N'Mà ngập ngừng chẳng nói ra '),
(1,3,N'Để con tim thơ ngây'),
(4,2,N'Em dạo này có '),
(5,1,N'Còn xem phim một mình'),
(1,3,N'Em dạo này có đồ ăn'),
(4,2,N'Ngày xuân em có xuống phố'),
(5,1,N'Và mùa xuân và mùa xuân tới'),
(1,3,N'Dạo này người ta có khiến em cười'),
(4,2,N'Xin nhớ thay nuông chiều làm ta lười hơn'),
(5,1,N'Anh dù không muốn tình cờ gặp lại nhau lần nữa')
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





