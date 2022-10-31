<?php

    if(isset($_POST['input'])) {
        $input = $_POST['input'];
        $validate = '/^[a-z]+[a-z0-9]*[.-_]*$/i';
        if ((preg_match($validate , $input)==true))
            echo "You are allowed to do things.";
        else
            echo "You've used some characters that aren't allowed.";
    }

?>