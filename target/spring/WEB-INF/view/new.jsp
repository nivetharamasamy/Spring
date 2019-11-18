<!DOCTYPE html>
<html>
<head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
       
</head>
<body>
    <form action="newpage">
        <table cellspacing="20" align="center">
            <br> <br> <br> <br> <br> <br> <br>
        <tr><td>Username:</td>
            <td><input type="text" name="username" id="username"></td>
           </tr>
           <tr><td>Email:</td>
            <td>  <input type="email" name="email" id="email"></td>
        </tr>
        <tr><td>Password:</td>
            <td> <input type="password" name="password"  id="password"></td>
        </tr>
        <tr><td>Phone number:</td>
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
        <tr ><td colspan="2"> <button   class="w3-button w3-pink w3-round-xxlarge " type="submit">  &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;Submit  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;</button></td></tr>
    </table>
    
      
   
    </form>
</body>
</html>