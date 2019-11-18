<!DOCTYPE html>
<html>
<head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
   
</head>
<body>
    <form action="updateans">
            <table cellspacing="20" align="center">
                    <br> <br> <br> <br> <br> <br> <br>
                <tr><td>username:</td>
                    <td><input type="text" name="username"  value="${update}"  id="username"></td>
                   </tr>
                   <tr><td>email:</td>
                    <td>  <input type="email" name="email" id="email"></td>
                </tr>
                <tr><td>password:</td>
                    <td> <input type="password" name="password"  id="password"></td>
                </tr>
                <tr><td>phone number:</td>
                    <td> <input type="number" name="phonenumber" id="phonenumber"></td>
                </tr>
                <tr><td>City</td>
                    <td><select name="city">
                            <option value="kovai">kovai</option>
                            <option value="madurai">madurai</option>
                            <option value="selam">selam</option>
                            <option value="chennai">chennai</option>
                          </select></td>
                    </tr>
                    <tr><td>Gender:</td>
                        <td>  <input type="radio" name="gender" value="male"> Male
                           </td>
                    </tr>
                    <tr><td></td>
                        <td>  <input type="radio" name="gender" value="female"> Female</td>
                    </tr>
                <tr></tr>
                <tr></tr>
                <tr ><td colspan="2"> <button  class="w3-button w3-deep-purple w3-round-xxlarge"  type="submit">  &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;Submit  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;</button></td></tr>
            </table>


    </form>
    
</body>
</html>