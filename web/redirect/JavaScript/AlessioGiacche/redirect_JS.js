function copia(){
    const url = parola().value;
    if(isValidHttpUrl(url)) {
        window.open(url, "_blank");
    }else alert("Error: the link not exists.");
}

function parola(){
    return document.getElementById("testoLink");

}

function isValidHttpUrl(string){
    let url;
    try{
        url = new URL(string);
    }catch (_){
        return false;
    }
    return url.protocol === "http:" || url.protocol === "https:";
}