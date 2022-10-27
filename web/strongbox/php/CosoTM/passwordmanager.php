<?php
    //Get Password
    $pass = $_POST['password'];

    //Open File
    $myfile = fopen("password.txt", "r") or die("Unable to open file!");
    $encrypted_data = fread($myfile,filesize("password.txt"));

    //Decrypt data 
    $decrypted_data = openssl_decrypt($encrypted_data, "AES-128-CBC", $pass);
    if(empty($decrypted_data))
        echo "Wrong Password";
    else{
        echo "Decrypted Text: " . "<br>";
        $pieces = explode(" ", $decrypted_data);
        $i = 0;
        foreach($pieces as $piece){
            echo $piece . " ";
            if($i%2!=0)
                echo "<br>";
            $i++;
        }     
        
    } 
    fclose($myfile);

?>