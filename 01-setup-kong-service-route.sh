#!/bin/bash

echo "\nRegistrando Servicio 'Cotizaciones'\n"
curl --location --request POST 'http://localhost:8001/services/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "cotizaciones",
    "url": "http://api-cotizaciones:3000/"
}
'

echo "\nRegistrando Ruta\n"
curl --location --request POST 'http://localhost:8001/services/cotizaciones/routes' \
--header 'Content-Type: application/json' \
--data-raw '{
    "hosts": ["localhost"],
    "paths": ["/cotizacion"], 
    "strip_path": false,
    "methods": ["POST"]
}
'

echo "\Habilitar plugin de seguridad\n"
curl --location --request POST 'localhost:8001/services/cotizaciones/plugins' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "oauth2",
    "config": {
        "scopes": [ "cotizaciones" ],
        "mandatory_scope": true,
        "enable_authorization_code": true
    },
    "protocols": ["https"]
}
'
