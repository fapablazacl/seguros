
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
