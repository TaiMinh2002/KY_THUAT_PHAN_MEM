USE [QLSanPham]
GO
/****** Object:  Table [dbo].[LoaiSanPham]    Script Date: 12/6/2022 11:05:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSanPham](
	[MaLoaiSP] [int] IDENTITY(1,1) NOT NULL,
	[TenLoai] [nvarchar](60) NOT NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [FK_LoaiSanPham] PRIMARY KEY CLUSTERED 
(
	[MaLoaiSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 12/6/2022 11:05:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[IDSanPham] [int] IDENTITY(1,1) NOT NULL,
	[MaSP] [varchar](10) NOT NULL,
	[TenSP] [nvarchar](60) NOT NULL,
	[SoLuong] [int] NOT NULL,
	[DonViTinh] [nvarchar](15) NULL,
	[GiaNhap] [money] NOT NULL,
	[GiaBan] [money] NOT NULL,
	[MaLoaiSP] [int] NOT NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [FK_SanPham] PRIMARY KEY CLUSTERED 
(
	[IDSanPham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  View [dbo].[xemThongTin]    Script Date: 12/6/2022 11:05:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[xemThongTin]
as
select MaSP,TenSP,GiaBan,TenLoai,LoaiSanPham.MoTa
From SanPham,LoaiSanPham
where LoaiSanPham.MaLoaiSP = SanPham.MaLoaiSP
GO
/****** Object:  View [dbo].[View_XemThongTinSanPham]    Script Date: 12/6/2022 11:05:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[View_XemThongTinSanPham]
AS
SELECT       TOP (100) PERCENT dbo.SanPham.MaSP, dbo.SanPham.TenSP, dbo.SanPham.GiaBan, dbo.LoaiSanPham.TenLoai, dbo.LoaiSanPham.MoTa
FROM            dbo.LoaiSanPham INNER JOIN
                         dbo.SanPham ON dbo.LoaiSanPham.MaLoaiSP = dbo.SanPham.MaLoaiSP
ORDER BY dbo.SanPham.GiaBan
GO
/****** Object:  View [dbo].[View_2]    Script Date: 12/6/2022 11:05:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[View_2]
AS
SELECT       dbo.KhachHang.TenKhachHang, dbo.KhachHang.DiaChi, dbo.LoaiSanPham.TenLoai, dbo.SanPham.TenSP, dbo.ChiTietHoaDon.SoLuong, dbo.SanPham.GiaBan, dbo.HoaDon.NgayTaoHD, 
                         dbo.LoaiSanPham.MoTa,(dbo.SanPham.GiaBan*dbo.ChiTietHoaDon.SoLuong) as N'Tổng Tiền'
FROM            dbo.SanPham INNER JOIN
                         dbo.LoaiSanPham ON dbo.SanPham.MaLoaiSP = dbo.LoaiSanPham.MaLoaiSP INNER JOIN
                         dbo.ChiTietHoaDon ON dbo.SanPham.IDSanPham = dbo.ChiTietHoaDon.IDSanPham INNER JOIN
                         dbo.HoaDon ON dbo.ChiTietHoaDon.MaHD = dbo.HoaDon.MaHD INNER JOIN
                         dbo.KhachHang ON dbo.HoaDon.MaKhachHang = dbo.KhachHang.MaKH
WHERE        (dbo.KhachHang.TenKhachHang LIKE N'%Nguyên')
GO
/****** Object:  Table [dbo].[LuotDangNhap]    Script Date: 12/6/2022 11:05:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LuotDangNhap](
	[MaLuotDangNhap] [int] NOT NULL,
	[SoLuotDangNhap] [int] NOT NULL,
 CONSTRAINT [PK_LuotDangNhap] PRIMARY KEY CLUSTERED 
(
	[MaLuotDangNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 12/6/2022 11:05:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNhanVien] [int] IDENTITY(1,1) NOT NULL,
	[TenNhanVien] [nvarchar](80) NOT NULL,
	[DiaChi] [nvarchar](255) NULL,
	[SoDienThoai] [varchar](11) NULL,
	[GioiTinh] [bit] NULL,
	[ChucVu] [nvarchar](30) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[NgayVaoLam] [date] NOT NULL,
 CONSTRAINT [FK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Quyen]    Script Date: 12/6/2022 11:05:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quyen](
	[RoleID] [int] IDENTITY(1,1) NOT NULL,
	[TenQuyen] [nvarchar](30) NOT NULL,
	[MoTa] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Quyen] PRIMARY KEY CLUSTERED 
(
	[RoleID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Users]    Script Date: 12/6/2022 11:05:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Users](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](30) NOT NULL,
	[Password] [varchar](30) NOT NULL,
	[RoleID] [int] NULL,
	[Fullname] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Users] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[LoaiSanPham] ON 

INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoai], [MoTa]) VALUES (1, N'Điện thoại', N'Các sản phẩm điện thoại')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoai], [MoTa]) VALUES (2, N'Laptop', N'Các sản phẩm Laptop')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoai], [MoTa]) VALUES (3, N'Linh kiện', N'Các loại linh kiện điện thoại')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoai], [MoTa]) VALUES (9, N'Điện Lạnh', N'các mặt hàng điện tử ')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoai], [MoTa]) VALUES (17, N'Nước uống ', N'Nước giải khát')
SET IDENTITY_INSERT [dbo].[LoaiSanPham] OFF
GO
INSERT [dbo].[LuotDangNhap] ([MaLuotDangNhap], [SoLuotDangNhap]) VALUES (1, 54)
GO
SET IDENTITY_INSERT [dbo].[NhanVien] ON 

INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [DiaChi], [SoDienThoai], [GioiTinh], [ChucVu], [NgaySinh], [NgayVaoLam]) VALUES (1, N'Sơn Tùng MTp', N'Thái Bình', N'1234567890', 1, N'Bồi Bàn', CAST(N'1994-07-05' AS Date), CAST(N'2014-11-20' AS Date))
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [DiaChi], [SoDienThoai], [GioiTinh], [ChucVu], [NgaySinh], [NgayVaoLam]) VALUES (16, N'Quang Linh Vlog', N'Nghệ An', N'0123456789', 1, N'Quản lý cửa hàng', CAST(N'1997-10-02' AS Date), CAST(N'2015-10-02' AS Date))
SET IDENTITY_INSERT [dbo].[NhanVien] OFF
GO
SET IDENTITY_INSERT [dbo].[Quyen] ON 

INSERT [dbo].[Quyen] ([RoleID], [TenQuyen], [MoTa]) VALUES (1, N'ADMIN', N'Được Sử Dụng tất cả các bảng')
INSERT [dbo].[Quyen] ([RoleID], [TenQuyen], [MoTa]) VALUES (2, N'IT', N'Được chỉnh sửa bảng người dùng')
INSERT [dbo].[Quyen] ([RoleID], [TenQuyen], [MoTa]) VALUES (3, N'Nhân Viên', N'Được sử dụng bảng Sản Phẩm')
INSERT [dbo].[Quyen] ([RoleID], [TenQuyen], [MoTa]) VALUES (4, N'Quản Trị Viên', N'Quản trị nhân viên và sản phẩm')
SET IDENTITY_INSERT [dbo].[Quyen] OFF
GO
SET IDENTITY_INSERT [dbo].[SanPham] ON 

INSERT [dbo].[SanPham] ([IDSanPham], [MaSP], [TenSP], [SoLuong], [DonViTinh], [GiaNhap], [GiaBan], [MaLoaiSP], [MoTa]) VALUES (23, N'IP14', N'Iphone 14', 10, N'Cái', 25000000.0000, 30000000.0000, 1, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [MaSP], [TenSP], [SoLuong], [DonViTinh], [GiaNhap], [GiaBan], [MaLoaiSP], [MoTa]) VALUES (24, N'MB14', N'Macbook pro 14', 10, N'Cái', 30000000.0000, 45000000.0000, 2, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [MaSP], [TenSP], [SoLuong], [DonViTinh], [GiaNhap], [GiaBan], [MaLoaiSP], [MoTa]) VALUES (25, N'R8', N'Ram 8G', 20, N'Cái', 700000.0000, 750000.0000, 3, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [MaSP], [TenSP], [SoLuong], [DonViTinh], [GiaNhap], [GiaBan], [MaLoaiSP], [MoTa]) VALUES (26, N'MD1', N'Điều hòa Multi Daikin', 30, N'Cái', 5000000.0000, 6000000.0000, 9, NULL)
INSERT [dbo].[SanPham] ([IDSanPham], [MaSP], [TenSP], [SoLuong], [DonViTinh], [GiaNhap], [GiaBan], [MaLoaiSP], [MoTa]) VALUES (27, N'CC01', N'Coca', 100, N'Chai', 10000.0000, 15000.0000, 17, NULL)
SET IDENTITY_INSERT [dbo].[SanPham] OFF
GO
SET IDENTITY_INSERT [dbo].[Users] ON 

INSERT [dbo].[Users] ([ID], [Username], [Password], [RoleID], [Fullname]) VALUES (1, N'minhphi', N'minhphi', 1, N'Phí Tài Minh')
INSERT [dbo].[Users] ([ID], [Username], [Password], [RoleID], [Fullname]) VALUES (2, N'duchai', N'duchai', 2, N'Nguyễn Đăng Đức Hải')
INSERT [dbo].[Users] ([ID], [Username], [Password], [RoleID], [Fullname]) VALUES (3, N'thanhtung', N'thanhtung', 3, N'Nguyễn Thanh Tùng')
INSERT [dbo].[Users] ([ID], [Username], [Password], [RoleID], [Fullname]) VALUES (4, N'vanhien', N'vanhien', 1, N'Vũ Văn Hiến')
INSERT [dbo].[Users] ([ID], [Username], [Password], [RoleID], [Fullname]) VALUES (5, N'phamtuan', N'phamtuan', 1, N'Phạm Minh Tuấn')
INSERT [dbo].[Users] ([ID], [Username], [Password], [RoleID], [Fullname]) VALUES (32, N'minhphi2112', N'minhphi2112', 4, N'phiminh')
SET IDENTITY_INSERT [dbo].[Users] OFF
GO
ALTER TABLE [dbo].[LoaiSanPham] ADD  CONSTRAINT [DF_LoaiSanPham_MoTa]  DEFAULT ('ko co') FOR [MoTa]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT ((0)) FOR [GioiTinh]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT ((1)) FOR [SoLuong]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT ((0)) FOR [GiaNhap]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT ((0)) FOR [GiaBan]
GO
ALTER TABLE [dbo].[Users] ADD  CONSTRAINT [DF_Users_RoleID]  DEFAULT ((3)) FOR [RoleID]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_LoaiSanPham] FOREIGN KEY([MaLoaiSP])
REFERENCES [dbo].[LoaiSanPham] ([MaLoaiSP])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_LoaiSanPham]
GO
ALTER TABLE [dbo].[Users]  WITH CHECK ADD  CONSTRAINT [FK_Users_Quyen] FOREIGN KEY([RoleID])
REFERENCES [dbo].[Quyen] ([RoleID])
GO
ALTER TABLE [dbo].[Users] CHECK CONSTRAINT [FK_Users_Quyen]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [CK_SanPham_GiaBan_LonHon_GiaNhap] CHECK  (([GiaBan]>[GiaNhap]))
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [CK_SanPham_GiaBan_LonHon_GiaNhap]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [CK_SanPham_GiaNhapPhaiDuong] CHECK  (([GiaNhap]>=(0)))
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [CK_SanPham_GiaNhapPhaiDuong]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [CK_SanPham_SoLuong_PhaiLonHonHoacBang_0] CHECK  (([SoLuong]>=(0)))
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [CK_SanPham_SoLuong_PhaiLonHonHoacBang_0]
GO
EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'So luong phai lon hon hoac bang 0' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'SanPham', @level2type=N'CONSTRAINT',@level2name=N'CK_SanPham_SoLuong_PhaiLonHonHoacBang_0'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[44] 4[15] 2[22] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = -384
         Left = 0
      End
      Begin Tables = 
         Begin Table = "KhachHang"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 221
               Right = 211
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "LoaiSanPham"
            Begin Extent = 
               Top = 6
               Left = 249
               Bottom = 221
               Right = 419
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "SanPham"
            Begin Extent = 
               Top = 6
               Left = 457
               Bottom = 222
               Right = 627
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "ChiTietHoaDon"
            Begin Extent = 
               Top = 251
               Left = 661
               Bottom = 436
               Right = 831
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "HoaDon"
            Begin Extent = 
               Top = 253
               Left = 241
               Bottom = 445
               Right = 411
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
      Begin ColumnWidths = 11
         Width = 284
         Width = 1845
         Width = 1500
         Width = 1500
         Width = 1680
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1455
         Width = 1500
         Width = 1500
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths ' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'View_2'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane2', @value=N'= 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'View_2'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=2 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'View_2'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[41] 4[16] 2[10] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "LoaiSanPham"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 185
               Right = 208
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "SanPham"
            Begin Extent = 
               Top = 6
               Left = 246
               Bottom = 223
               Right = 416
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
      Begin ColumnWidths = 9
         Width = 284
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'View_XemThongTinSanPham'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'View_XemThongTinSanPham'
GO
