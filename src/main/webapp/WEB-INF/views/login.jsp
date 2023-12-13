<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Đăng nhập</title>
    
  </head>
  <body>
  
    <div class="wrapper fadeInDown">
      <div id="formContent">
        <!-- Tabs Titles -->
        
        <c:if test="${param.incorrectAccount != null}">
        	<div class="alert alert-danger">
  				Username or password incorrect
			</div>
        </c:if>
        <c:if test="${param.accessDenied != null}">
        	<div class="alert alert-danger">
  				You do not have permission to access this site
			</div>
        </c:if>

        <!-- Login Form -->
        <form action="/j_spring_security_check" method="post">
          <input type="text" id="userName" class="fadeIn second" name="j_username" placeholder="Tên đăng nhập"/>
          <input type="text" id="password" class="fadeIn third" name="j_password" placeholder="Mật khẩu"/>
          <input type="submit" class="fadeIn fourth" value="Đăng nhập" />
        </form>

        <!-- Remind Passowrd -->
        <div id="formFooter">
          <a class="underlineHover" href="#">Quên mật khẩu?</a>
        </div>
      </div>
    </div>
  </body>
</html>
