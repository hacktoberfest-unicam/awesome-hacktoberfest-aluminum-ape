function escape(query) {
  const mapping = {
    "\x00": '\x00', // carattere NULL
    "\n": '\n', // rimpiazza la nuova linea con i due caratteri \n
    "\r": '\r',
    "\\": '\\\\',
    "'": "\\'",
    '"': '\"',
    "\x1a": '\x1a', // carattere substitute
  };
  
  let escaped = query;

  for (key in mapping) {
    escaped = escaped.replaceAll(key, mapping[key]);
  }
  return escaped;
}

console.log(escape("' OR '1'='1"));
console.log(escape("' OR '1'='1' --"));
console.log(escape("' OR '1'='1' {"));
console.log(escape("' OR '1'='1' /*"));
console.log(escape("' OR '1'='1' #"));
