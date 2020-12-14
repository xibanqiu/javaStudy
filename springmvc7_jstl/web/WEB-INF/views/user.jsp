<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>


     <form:form  action="${pageContext.request.contextPath}/save.do" method="post"  modelAttribute="user">

         <!-- form:input 相当于一个普通的输入框类型。
         path属性就是生成的表单项的name属性，然后它可以找到表单对象模型中的属性进行输出
         -->
         userName:<form:input path="username"/><br/>
         age:<form:input path="age"/><br/>
         salary:<form:input path="income"/><br/>
         isMarry:<form:checkbox path="isMarry"/><br/>
         interests:<form:checkbox path="interests" value="football1"/>football
         <form:checkbox path="interests" value="basketball"/>basketball
         <form:checkbox path="interests" value="vollyball"/>vollyball
         <input type="submit" />

     </form:form>

</body>
</html>
