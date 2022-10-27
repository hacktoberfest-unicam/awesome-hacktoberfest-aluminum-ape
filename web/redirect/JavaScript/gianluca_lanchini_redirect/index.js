function searchUrl() {
    let check = true;
    let input = document.getElementById('input_url').value;
    try {
        new URL(input);
        window.location.replace(input);
        return true;
    }
    catch(err) {
        console.log("url non appropriato");
        check = false;
        return false;
    }
}