app.service('myserv', function() {
          this.getServiceList = function () {
    return [];
}
this.getISEndpoint = function() { 
 return 'http://VMNX-CSCQAAUTO.eur.ad.sag:1101/';
}
this.getAPIList = function() { 
 return [];
}
this.getCreatedTime = function() { 
 return "08-09-2023 18:00:24 IST";
}
this.getPackageInfo = function(){
 return{"packageName":"ConnectorTest","createdDate":"19-06-2023 14:27:30 IST","version":"1.0"};
}
});
