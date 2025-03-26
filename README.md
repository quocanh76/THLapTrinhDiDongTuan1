# Ứng Dụng Quản Lý Thông Tin Sinh Viên

## 📌 Giới Thiệu  
Ứng dụng này cho phép người dùng nhập và gửi thông tin sinh viên từ `MainActivity` sang `SecondActivity`.  
Các thông tin bao gồm:  
- **Họ và tên**  
- **Mã số sinh viên (MSSV)**  
- **Lớp**  
- **Số điện thoại (SDT)**  
- **Sinh viên năm mấy** (Lựa chọn qua RadioButton)  
- **Chuyên ngành** (Lựa chọn qua CheckBox)  
- **Kế hoạch phát triển bản thân**  

## 🚀 Tính Năng  
✅ Nhập thông tin sinh viên từ `MainActivity`  
✅ Gửi dữ liệu sang `SecondActivity`  
✅ Hiển thị thông tin đã nhập tại `SecondActivity`  
✅ Hỗ trợ lựa chọn năm học và chuyên ngành  

## 📂 Cấu Trúc Dự Án  
── activity_main.xml # Giao diện màn hình nhập thông tin │ <br>
── activity_second.xml # Giao diện màn hình hiển thị thông tin │ <br>
── MainActivity.java # Xử lý nhập và gửi dữ liệu │ <br>
── SecondActivity.java # Xử lý nhận và hiển thị dữ liệu │ <br>

## 📌 Hướng Dẫn Sử Dụng  
1. **Nhập thông tin sinh viên** vào các ô nhập liệu.  
2. **Chọn năm học** bằng cách chọn một RadioButton.  
3. **Chọn chuyên ngành** bằng cách tick vào CheckBox.  
4. **Nhập kế hoạch phát triển bản thân**.  
5. **Nhấn "GỬI THÔNG TIN"** để chuyển đến màn hình hiển thị dữ liệu.  
6. **Xem lại thông tin** tại `SecondActivity`.  
7. **Nhấn "BACK"** để quay lại `MainActivity`.  

## 📝 Ghi Chú  
- Nếu không chọn năm học hoặc chuyên ngành, ứng dụng sẽ hiển thị "Không chọn".  
- Dữ liệu được truyền qua `Intent` giữa các Activity.  

## Hình ảnh minh họa  
📷 <br>
<img src = "https://github.com/user-attachments/assets/f9b237f0-5a3a-4b5c-b3b3-c7973b2eff98" width ="200"/>
<img src = "https://github.com/user-attachments/assets/6e090c4f-a3b6-4323-86eb-71cf6f50f497" width ="200"/>

<br>

## Tác Giả
Ứng dụng được phát triển bởi:
<br>
**21200027 - Hà Quốc Anh**.   
