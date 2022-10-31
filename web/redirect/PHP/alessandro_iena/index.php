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
            function validateURL($url)
            {
                if (
                    preg_match(
                        '%^(?:(?:https?|ftp)://)(?:\S+(?::\S*)?@|\d{1,3}(?:\.\d{1,3}){3}|(?:(?:[a-z\d\x{00a1}-\x{ffff}]+-?)*[a-z\d\x{00a1}-\x{ffff}]+)(?:\.(?:[a-z\d\x{00a1}-\x{ffff}]+-?)*[a-z\d\x{00a1}-\x{ffff}]+)*(?:\.[a-z\x{00a1}-\x{ffff}]{2,6}))(?::\d+)?(?:[^\s]*)?$%iu',
                        $url
                    ) or
                    preg_match(
                        '%^(?:\S+(?::\S*)?@|\d{1,3}(?:\.\d{1,3}){3}|(?:(?:[a-z\d\x{00a1}-\x{ffff}]+-?)*[a-z\d\x{00a1}-\x{ffff}]+)(?:\.(?:[a-z\d\x{00a1}-\x{ffff}]+-?)*[a-z\d\x{00a1}-\x{ffff}]+)*(?:\.[a-z\x{00a1}-\x{ffff}]{2,6}))(?::\d+)?(?:[^\s]*)?$%iu',
                        $url
                    )
                ) {
                    return $url;
                } else {
                    return false;
                }
            }
            function redirect($url, $statusCode = 303)
            {
                header('Location: ' . $url, true, $statusCode);
                exit();
            }
            if (isset($_POST['url'])) {
                $url = $_POST['url'];
                if ($url = validateURL($url)) {
                    $url = filter_var($url, FILTER_SANITIZE_URL);
                    if (strpos($url, 'http') === false) {
                        $url = 'https://www.' . $url;
                    }
                    redirect($url);
                } else {
                    echo '  Invalid URL';
                }
            }
            ?>
        </div>
    </div>
</body>
