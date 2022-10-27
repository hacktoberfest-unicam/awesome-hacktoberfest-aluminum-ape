function getId(){
    return document.getElementById("link");}

function copy(){
    const url = getId().value;
    if(UrlIsValid(url)) {
        window.open(url, "_blank");
    }else alert("Errore: questo sito non esiste");
}

function UrlIsValid(string){
    let url;
    try{
        url = new URL(string);
    }catch (_){
        return false;
    }
    return url.protocol === "http:" || url.protocol === "https:";
}