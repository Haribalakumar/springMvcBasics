<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
      body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
      }
      .container {
        width: 400px;
        margin: 0 auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px #999;
      }
      h1 {
        text-align: center;
      }
      input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
      }
      button {
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        width: 100%;
      }
      button:hover {
        background-color: #45a049;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <h1>Login</h1>
      <form action="logindetails" method="get">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" placeholder="Your username...">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Your password...">
        <button type="submit">Login</button>
      </form>
      <p>Don't have an account yet? <a href="register">Create one here.</a></p>  
    </div>
   
  </body>
</html>
