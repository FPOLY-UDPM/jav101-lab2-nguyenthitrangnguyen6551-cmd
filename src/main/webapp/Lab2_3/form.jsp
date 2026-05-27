<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bài 3: Form và Tích hợp EL</title>
</head>
<body>
    <h2>Cập nhật thông tin thành viên</h2>

    <form action="${pageContext.request.contextPath}/form/update" method="POST">

        <label>Họ và tên:</label><br>
        <input type="text" name="fullname" value="${user.fullname}" ${editable ? '' : 'readonly'} /><br><br>

        <label>Giới tính:</label><br>
        <input type="radio" name="gender" value="true" ${user.gender ? 'checked' : ''} /> Nam
        <input type="radio" name="gender" value="false" ${!user.gender ? 'checked' : ''} /> Nữ
        <br><br>

        <label>Quốc tịch:</label><br>
        <select name="country">
            <option value="VN" ${user.country == 'VN' ? 'selected' : ''}>Việt Nam</option>
            <option value="US" ${user.country == 'US' ? 'selected' : ''}>Mỹ</option>
        </select>
        <br><br>

        <button type="submit">Submit (doPost)</button>
    </form>
</body>
</html>