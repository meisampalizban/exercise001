<!DOCTYPE html>
<html>
<head>
    <title>main page</title>
    <meta http-equiv="Content-Type" content="text/html;
      charset=utf-8">

    <style>

        * {
            margin: 0;
            padding: 0;
            text-decoration: none;
            list-style: none;
        }

        .nav_container {
            display: flex;
            align-items: center;
            justify-content: space-between;
            background: #000;
            color: #fff;
            padding: 10px;
        }

        ul {
            width:300px;
            display: flex;
            align-items:center;
            justify-content: space-between;
            padding: 5px;
            font-size: 20px;
        }

        li a {
            text-decoration: none;
            color: #fff;
            font-size: 18px;
            font-weight: 500;
            padding: 8px 15px;
            border-radius: 5px;
            transition: all 0.3s ease;
        }
        ul li a:hover{
            background: #fff;
            color: black;
            padding: 5px;
            border-raduis:5px;
        }

        .logo {
            display: flex;
            align-items: center;
        }

        .search {
            padding: 10px;
        }

        input {
            padding: 5px;
            outline: none;
        }

        img {
            width: auto;
            height: 50px;
        }



        button {
            height: 55px;
            width: 170px;
            border-radius: 10px;
            border: 2px solid white;
            font-size: 20px;
            font-weight: 500;
            margin:8px;
            cursor: pointer;
            outline: none;
            transition: all 0.3s ease;
        }
        h2{
            margin:8px;
        }

    </style>
</head>
<body>

<div class="nav_container">
    <div class="logo">
        <p>Logo</p>
    </div>
    <div class="menu">
        <ul>
            <li>login</li>
            <li><a href="/formRegister">register</a></li>
        </ul>
    </div>
    <div class="search">
        <input type="text" placeholder="search">
    </div>

</div>


</body>
</html>