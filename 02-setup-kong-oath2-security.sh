
echo "\nHabilitar plugin de seguridad\n"
curl --location --request POST 'localhost:8001/services/cotizaciones/plugins' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "oauth2",
    "config": {
        "scopes": [ "cotizaciones" ],
        "mandatory_scope": true,
        "enable_client_credentials": true
    },
    "protocols": ["https"]
}
'

echo "\nCrear Consumidor\n"
curl --location --request POST 'localhost:8001/consumers' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "falabella"
}
'

echo "\nCrear Llave para el Consumidor\n"
curl --location --request POST 'localhost:8001/consumers/falabella/key-auth' \
--header 'Content-Type: application/json' \
--data-raw '{
    "key": "123"
}
'

echo "\nProvisionar Credenciales OAUTH2 para el Consumidor\n"
curl --location --request POST 'localhost:8001/consumers/falabella/oauth2' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Cliente de API del Cotizador de Seguros",
    "client_id": "456",
    "client_secret": "789",
    "redirect_uris": ["https://www.falabella.cl/oauth_return"]
}
'

