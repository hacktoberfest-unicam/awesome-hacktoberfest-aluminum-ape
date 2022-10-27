<?php 

    $url = $_POST['url'];

    function fieldValidator($url) {
        $url_validation_regex = "/^https?:\/\/(?:www\.)?[-a-zA-Z0-9@:%.\+~#=]{1,256}\.[a-zA-Z0-9()]{1,6}\b(?:[-a-zA-Z0-9()@:%_\+.~#?&\/=]*)$/"; 
        return preg_match($url_validation_regex, $url);
    }

    if(fieldValidator($url)) {
        header('Location: ' . $url);
        exit();
    }else {
        echo "Errore nell'inserimento del link";
    }

?>