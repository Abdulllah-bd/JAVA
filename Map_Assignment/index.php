<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>

        <script
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC1tkRi8rNvsK_ubMqZQ6huE2z7KF_5GwA&callback">
        </script>

        <script>
            var myCenter = new google.maps.LatLng(23.780168, 90.407191);
            function initialize()
            {
                var mapProp = {
                    center: myCenter,
                    zoom: 14,
                    mapTypeId: google.maps.MapTypeId.TERRAIN
                };

                var map = new google.maps.Map(document.getElementById("googleMap"), mapProp);


                google.maps.event.addDomListener(window, 'load', initialize);


                var marker = new google.maps.Marker({
                    position: myCenter,
                    animation: google.maps.Animation.BOUNCE
                });

                marker.setMap(map);
                var infowindow = new google.maps.InfoWindow({
                    content: "<h1>Brac University</h1>\n\
                Main-Campus"
                });
                infowindow.open(map, marker);
                google.maps.event.addListener(marker, 'click', function () {
                    map.setZoom(9);
                    map.setCenter(marker.getPosition());
                });

                google.maps.event.addListener(map, 'center_changed', function () {
                    window.setTimeout(function () {
                        map.panTo(marker.getPosition());
                    }, 3000);
                });
            }
            google.maps.event.addDomListener(window, 'load', initialize);
        </script>
        <meta charset="UTF-8">
        <title>My MAP</title>
    </head>
    <body background="back.jpg">
    <center><h1 style="color: white">Brac University</h1></center>

    <center><div id="googleMap" style="width:800px;height:540px;"></div></center>
</body>
</html>
