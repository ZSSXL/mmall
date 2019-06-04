<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
        <title>首页</title>
</head>
<body>
        <h2>This is Index.JSP</h2>
        <h2>Spring MVC上传文件</h2>
        <form name="uploadTest1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
                <input type="file" name="upload_file">
                <input type="submit" value="SpringMVC上传文件">
        </form>
        <hr/>
        <h2>富文本图片上传文件</h2>
        <form name="uploadTest2" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">
                <input type="file" name="upload_file">
                <input type="submit" value="富文本图片上传文件">
        </form>
</body>
</html>