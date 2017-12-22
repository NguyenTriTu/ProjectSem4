Create Database LoginMVC
use LoginMVC


Create table tblUser(
	_username varchar(50) primary key,
	_password varchar(50)
)

insert into tblUser values ('admin','123123')

create table tblBook(
	_bookId int NOT NULL primary key identity(1,1),
	_title [nvarchar](100) NULL,
	_price float NULL,
	_description nvarchar(max) NULL,
	_dateTime varchar(100) NULL,
	_image nvarchar(max) NULL,
)


INSERT into tblBook  VALUES (N'Sketchup & Vray Trong Thiết Kế 1 Kiến Trúc', 85000 , N'SketchUp Pro là một chương trình đồ họa kiến trúc tuyệt vời, dễ học cũng như dễ sử dụng. Ngay từ khi xuất hiện vào năm 2000, SketchUp giúp cho việc phác thảo và thiết kế ý tưởng được thuận tiện, chương trình tập hợp nhiều công cụ tiện ích giúp cho việc thể hiện ý tưởng cho việc phác thảo những phối cảnh trong kiến trúc. Ứng dụng trong Sketchup rất linh hoạt. Chương trình đoạt nhiều giải thưởng về thiết kế sáng tạo và được nhiều người công nhận. ', N'2014-11-09T00:00:00.000' , N'000001.jpg')
INSERT into tblBook VALUES ( N'3DS Max-Thủ Thuật Render Phối Cảnh kiến Trúc Ban Ngày Và Đêm Với V-Ray 1.50 RC3', 75000 , N'Cuốn sách 3DS Max giới thiệu đến các bạn những kỹ năng sử dụng phần mềm hỗ trợ V-ray mới nhất đang được nhiều người trên thế giới quan tâm. ', N'2012-03-31T00:00:00.000' , N'000002.jpg')
INSERT into tblBook  VALUES (N'Tự Học InDesign CS3', 55000 , N'InDesign CS3 là chương trình dàn trang rất hiện đại và tiện dụng dành cho việc trình bày sách, báo, tạp chí...', N'2012-03-31T00:00:00.000' , N'000003.jpg')
INSERT into tblBook VALUES ( N'Đắc Nhân Tâm - Cuốn Sách Hay Nhất Của Mọi Thời Đại Đưa Bạn Đến Thành Công!', 60000 , N'Đắc nhân tâm – How to win friends and Influence People của Dale Carnegie là quyển sách nổi tiếng nhất, bán chạy nhất và có tầm ảnh hưởng nhất của mọi thời đại. ', N'2012-03-31T00:00:00.000' , N'000004.jpg')
INSERT into tblBook  VALUES ( N'Tự Học Photoshop CS5 Qua Hình Ảnh Minh Họa (Sách Kèm CD)', 62000 , N'Nhằm đáp ứng nhu cầu tự học Photoshop, một phần mềm xử lý ảnh ngày càng nhiều. Sách " Tự Học Photoshop CS5 Qua Hình Ảnh Minh Họa" được chia thành 11 chương kèm với hình ảnh minh họa và CD bài tập được kèm theo sách. ', N'2012-03-31T00:00:00.000' , N'000005.jpg')
INSERT into tblBook  VALUES ( N'180 Thủ Thuật Và Mẹo Hay Trong Flash CS4', 71000 , N'Adobe Flash Professional CS4 là phiên bản mới nhất của công cụ thiết kế Web đang rất thịnh hành hiện nay. ', N'2012-03-31T00:00:00.000' , N'000006.jpg')
INSERT into tblBook  VALUES ( N'Microsoft Office 2010 - Dành Cho Người Tự Học', 18000 , N'Trong lĩnh vực tin học văn phòng, Microsoft Word, Excel, PowerPoint, Visio là những chương trình thuộc bộ Microsoft Office đã và đang được ứng dụng rộng rãi trong nhiều lĩnh vực: kinh tế, kế toán, thương mại, quản lý, vẽ kỹ thuật và nhiều hơn nữa. Với Office 2010, bạn có trong tay đầy đủ các công cụ và lệnh để thực hiện các tiện ích trong diện toán văn phòng .', N'2012-03-31T00:00:00.000' , N'000007.jpg')
INSERT into tblBook  VALUES ( N'Tự học Microsoft Excel 2010', 37000 , N'Sách được chia thành 11 bài, từ căn bản đến nâng cao kèm theo CD bài tập thực hành nhằm giúp bạn học một cách nhanh chóng và dễ hiểu như:', N'2012-03-31T00:00:00.000' , N'000008.jpg')
INSERT into tblBook  VALUES ( N'C# Dành Cho Người Tự Học - Tập 1', 67000 , N'Sách được chia thành 11 bài, từ căn bản đến nâng cao kèm theo CD bài tập thực hành nhằm giúp bạn học một cách nhanh chóng và dễ hiểu như:', N'2012-03-31T00:00:00.000' , N'000009.jpg')
INSERT into tblBook  VALUES ( N'C# Dành Cho Người Tự Học - Tập 2', 69000 , N'Trong tập 2 này, các bạn sẽ tìm hiểu ứng dụng C# trong Windows Form qua 2 phần, mỗi phần là một bài tập lớn xây dựng lên ứng dụng Quản lý bán hàng và Quản lý tuyển sinh để bạn đọc hiểu rõ và khai thác có hiệu quả những công cụ và lệnh của C# đã trình bày trong tập 1.', N'2012-03-31T00:00:00.000' , N'000010.jpg')
INSERT into tblBook  VALUES ( N'Nghệ Thuật Sống An Lạc ', 69000 , N'"Nghệ thuật sống An lạc là tuyển tập các bài giảng liên quan tới chủ đề nghệ thuật sống của Đức Nhiếp Chính Vương Khamtrul Rinpoche đời thứ IX Jigme Pema Nyinjadh . ', N'2012-03-31T00:00:00.000' , N'000011.jpg')
INSERT into tblBook  VALUES ( N'Phương Pháp Quản Lý Nhân Sự Trong Công Ty', 69000 , N'Những người sử dụng lao động đã hiểu dần các giá trị mà con người tạo ra cho tổ chức của họ. ', N'2012-03-31T00:00:00.000' , N'000012.jpg')



