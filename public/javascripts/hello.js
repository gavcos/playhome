var http = require("http");
setInterval(function() {
    http.get("http://powerful-brook-12866.herokuapp.com");
}, 300000); // every 5 minutes (300000)
