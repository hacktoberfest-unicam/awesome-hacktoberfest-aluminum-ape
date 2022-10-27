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
            function validateURL($url){
                #add https:// if not present
                if (strpos($url, 'http') === false) {
                    $url = 'https://' . $url;
                }
                #add www if not present
                if (strpos($url, 'www') === false) {
                    $url = 'www.' . $url;
                }
                return $url;
            }
                #add / at the end if not present
                if (substr($url, -1) != '/') {
                    $url .= '/';
                }
                echo $url;
                if(preg_match('%^(?:(?:https?|ftp)://)(?:\S+(?::\S*)?@|\d{1,3}(?:\.\d{1,3}){3}|(?:(?:[a-z\d\x{00a1}-\x{ffff}]+-?)*[a-z\d\x{00a1}-\x{ffff}]+)(?:\.(?:[a-z\d\x{00a1}-\x{ffff}]+-?)*[a-z\d\x{00a1}-\x{ffff}]+)*(?:\.[a-z\x{00a1}-\x{ffff}]{2,6}))(?::\d+)?(?:[^\s]*)?$%iu', $url)){
                    return true;
                }else{
                    return false;
                }

            }
            if (isset($_POST['url'])) {
                $url = $_POST['url'];
                if (validateURL($url)) {
                    $url = filter_var($url, FILTER_SANITIZE_URL);
                    header('Location: ' . $url);
                } else {
                    echo 'Invalid URL';
                }
            }
            ?>
        </div>
    </div>
</body>
