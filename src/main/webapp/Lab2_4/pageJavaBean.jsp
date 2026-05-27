<%@page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Page</title>
</head>
<body>
    <ul>
        <li>Họ và tên: ${user.fullname}</li>
        <li>Giới tính: ${user.gender ? "Nam" : "Nữ"}</li>
        <li>Quốc gia: ${user.country}</li>
    </ul>
</body>
</html>