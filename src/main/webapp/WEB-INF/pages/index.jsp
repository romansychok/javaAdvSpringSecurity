<%@include file="tmp/header.jsp"%>



Index page
<br>
<form action="/save" method="post">
    <input type="text" name="username" placeholder="username"/>
    <input type="password" name="password" placeholder="password"/>
    <input type="email" name="email" placeholder="email"/>
    <input type="submit" value="login"/>
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>
</form>


<%@include file="tmp/footer.jsp"%>