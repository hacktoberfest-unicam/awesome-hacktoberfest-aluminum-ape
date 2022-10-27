<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>redirect</title>
</head>


<body>
    <div class="container">
        <div class="content">
            <h1>Redirect hacktoberfest</h1>
            <form action="index.php" method="post">
                <input type="text" name="url" placeholder="Enter URL">
                <input type="submit" value="Submit">
            <?php
            if(isset($_POST['url'])){
                $url = $_POST['url'];
                $url = filter_var($url, FILTER_SANITIZE_URL);
                header("Location: $url");
            }
            
            ?>
        </div>
    </div>
</body>
