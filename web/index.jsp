
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Registration</title>
</head>
<style>
  h4 {
    font-family: 'Times New Roman', Times, serif; /* Гарнитура текста */
    font-size: 250%; /* Размер шрифта в процентах */
  }

</style>
<h4 style="text-align: center;"><b><var>J.U.D код от Души....</var></b></h4>
<p align="center"><var><img alt="" height="348" src="http://judteam.xyz/gallery_gen/8ff3c8d2412b9655cbeb0151f7c8ec6a_1040x696.90721649485.jpg" width="520"></var></p>
<h1 align="center"><var><a href="/SIGN_IN.jsp"><span style="color: #FF0000; ">SIGN IN &nbsp;</span></a><img alt="" height="25" src="http://www.free-icons-download.net/images/login-94857.png" width="36"></var></h1>

<form action="Servlet" method="post" target="_blank">
  <h1 style="text-align: center;"><var>Registration</var></h1>
  <p align="center"><var>Nickname : <input name="nickname"  type="text"> </var></p>
  <p align="center"><var>First : <input name="name"  type="text"> </var></p>
  <p align="center"><var>Last : <input name="lastname" type="text"> </var></p>
  <p align="center"><var>Birthday : <input name="birthday" type="text"> </var></p>
  <p align="center"><var>Phone : <input name="phone" type="text"> </var></p>
  <p align="center"><var>E-mail : <input name="mail" type="email"> </var></p>
  <p align="center"><var>Password <input name="password"  type="password"> </var></p>
  <p align="center"><var><input checked="checked" name="ser" title="O_o" type="radio" value="male">Male<br>
    <input name="ser" title="O_o" type="radio" value="female">Female<br>
    <input title="Kataka anum , chhavatas" type="submit" value="Registration"><br>
    <input type="reset" value="RESET"> </var></p>
  <p align="center">&nbsp;</p>
  <p hidden="true" align="center"><var>SR : <input name="SR"  type="text" value="reg" > </var></p>
</form>
<p align="center">&nbsp;</p>


</form></p>
</html>

