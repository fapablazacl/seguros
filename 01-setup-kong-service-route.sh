#!/bin/bash

echo "\nRegistrando Servicio 'Cotizaciones'\n"
curl --location --request POST 'http://localhost:8001/services/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "cotizaciones",
    "url": "http://api-cotizaciones:8080/"
}
'

echo "\nRegistrando Ruta\n"
curl --location --request POST 'http://localhost:8001/services/cotizaciones/routes' \
--header 'Content-Type: application/json' \
--data-raw '{
    "hosts": ["localhost"],
    "paths": ["/fapablazaclx5/seguros/1.0.0/cotizacion"], 
    "strip_path": false,
    "methods": ["POST"]
}
'
