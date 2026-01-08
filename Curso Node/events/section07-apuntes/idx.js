const http = require('http');
const fs = require('fs');
const { abort } = require('process');

const html = fs.readFileSync('./index.html');
const about = fs.readFileSync('./about.html');

http.createServer((request, response) => {
    const { url } = request;
    console.log(url);
    
    if(url === '/') {
        response.writeHead(200, {"content-type": "text/html"});
        response.write(html);
    } else if(url === '/about') {
        response.writeHead(200, {"content-type": "text/html"});
        response.write(about);
    } else {
        response.writeHead(404, {"content-type": "text/html"});
        response.write("Page not found!!!");
    }
    
    response.end();
})
.listen(8080);