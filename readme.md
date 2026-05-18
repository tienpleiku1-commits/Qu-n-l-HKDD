# ✈ Hệ Thống Quản Lý Hàng Không

Ứng dụng desktop Java quản lý chuyến bay, hành khách, đặt vé và nhân viên hãng hàng không.  
Giao diện **Swing**, lưu trữ **MySQL**, kết nối **JDBC**.

![Java](https://img.shields.io/badge/Java-17-blue) ![MySQL](https://img.shields.io/badge/MySQL-8.0-blue) ![Swing](https://img.shields.io/badge/UI-Swing-informational) ![IDE](https://img.shields.io/badge/IDE-IntelliJ_IDEA-orange)

---

## Mục Lục

1. [IntelliJ IDEA](#1-intellij-idea)
2. [Java Syntax](#2-java-syntax)
3. [OOP — Lập trình hướng đối tượng](#3-oop--lập-trình-hướng-đối-tượng)
4. [Camel Case — Quy ước đặt tên](#4-camel-case--quy-ước-đặt-tên)
5. [JDBC — Kết nối MySQL](#5-jdbc--kết-nối-mysql)
6. [Swing — Giao diện desktop](#6-swing--giao-diện-desktop)
7. [MySQL — Cơ sở dữ liệu](#7-mysql--cơ-sở-dữ-liệu)
8. [Git & GitHub](#8-git--github)

---

## 1. IntelliJ IDEA

IDE chính để phát triển dự án. Yêu cầu **JDK 17+**.  

### Cấu trúc project(có thể tham khảo cx cx)

```
AirlineManagementSystem/
├── src/
│   ├── model/
│   │   ├── login.java
│   │   ├── Flight.java
│   │   ├── aircraft.java
│   │   ├── Passenger.java
│   │   ├── mananger.java
│   │   └── admin.java 
│   │
│   ├── dao/
│   │   ├── FlightDAO.java
│   │   ├── PassengerDAO.java
│   │   ├── loginDAO.java
│   │   └── bookingDAO.java
│   │
│   ├── ui/
│   │   ├── LoginFrame.java
│   │   ├── MainFrame.java
│   │   ├── FlightPanel.java
│   │   └── BookingPanel.java
│   │
│   └── util/
│       ├── DBConnection.java
│       └── DateUtils.java(neu can)
│
├── db/
│   └── airline.sql
├── Main.java
└── .gitignore

```
## 2. Java Syntax

Các kiểu dữ liệu và cấu trúc điều khiển thường dùng trong hệ thống.

### Khai báo biến

### Điều kiện & vòng lặp

## 3. OOP — Lập trình hướng đối tượng

Mô hình hoá các thực thể hàng không bằng class, kế thừa và interface.

### Lớp cha trừu tượng

### Lớp con — kế thừa & đa hình

### Interface

### Sơ đồ class chính

## 4. Camel Case — Quy ước đặt tên

## 5. JDBC — Kết nối MySQL

### DBConnection.java

## 6. Swing — Giao diện desktop

Giao diện chính dùng `JFrame` với `CardLayout` để chuyển giữa các màn hình.  
Mọi cập nhật UI phải chạy trên **Event Dispatch Thread (EDT)**.

### MainFrame.java

### Các panel chính

| Panel | Chức năng |
|---|---|
| `FlightPanel` | JTable danh sách chuyến bay, nút thêm / sửa / xoá |
| `BookingPanel` | Form đặt vé, chọn chỗ ngồi |
| `PassengerPanel` | Quản lý hành khách, tìm kiếm |
| `StaffPanel` | Quản lý nhân viên hãng bay |

---

## 7. MySQL — Cơ sở dữ liệu

### Tạo schema

### Bảng chuyến bay

### Bảng hành khách

### Bảng vé

### Dữ liệu mẫu

## 8. Git & GitHub

### Khởi tạo repository

### Workflow hàng ngày

```bash
git status                            # kiểm tra thay đổi
git add .                             # stage tất cả
git commit -m "feat: thêm BookingPanel"
git pull origin main                  # đồng bộ từ remote
git push origin main                  # đẩy lên GitHub
```
### Quy ước commit

| Prefix | Dùng khi |
|---|---|
| `feat:` | Thêm tính năng mới |
| `fix:` | Sửa lỗi |
| `ui:` | Thay đổi giao diện Swing |
| `db:` | Thay đổi schema / câu SQL |
| `refactor:` | Cải thiện code, không thêm tính năng |
| `docs:` | Cập nhật tài liệu / README |

*README này được tạo cho dự án Hệ thống quản lý hàng không — Java Desktop Application.*
