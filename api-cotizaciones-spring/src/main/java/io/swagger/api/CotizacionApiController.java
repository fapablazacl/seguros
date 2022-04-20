package io.swagger.api;

import io.swagger.model.Cliente;
import io.swagger.model.Cotizacion;
import io.swagger.model.DetalleValidacion;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.Plan;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-20T16:20:48.774Z[GMT]")
@RestController
public class CotizacionApiController implements CotizacionApi {

    private static final Logger log = LoggerFactory.getLogger(CotizacionApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CotizacionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    private final UUID plan1Id = UUID.randomUUID();
    private final UUID plan2Id = UUID.randomUUID();
    private final UUID plan3Id = UUID.randomUUID();

    private Plan createMetLifePlan(UUID id, String nombre, int monto, float montoUf, float capitalAsegurado) {
        Plan plan = new Plan();

        plan
                .id(id)
                .aseguradora("MetLife")
                .capitalAsegurado(BigDecimal.valueOf(capitalAsegurado))
                .nombre(nombre)
                .montoPesos(monto)
                .montoUf(BigDecimal.valueOf(montoUf))
                .promocionId(UUID.randomUUID())
                .promocionValor(2);

        return plan;
    }

    public ResponseEntity<Cotizacion> generarCotizacion(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Cliente body) {
        String accept = request.getHeader("Accept");

        if (accept != null && accept.contains("application/json")) {
            try {
                Cotizacion cotizacion = new Cotizacion();

                cotizacion.setId(UUID.randomUUID());
                cotizacion.addPlanesItem(this.createMetLifePlan(this.plan1Id, "Plan 1", 11755, 0.41f, 500));
                cotizacion.addPlanesItem(this.createMetLifePlan(this.plan2Id, "Plan 2", 23223, 0.81f, 1000));
                cotizacion.addPlanesItem(this.createMetLifePlan(this.plan3Id, "Plan 3", 34978, 1.22f, 1500));

                return new ResponseEntity<Cotizacion>(cotizacion, HttpStatus.CREATED);
            } catch (Exception e) {
                log.error("Error ocurred when performing Cotizacion", e);
                return new ResponseEntity<Cotizacion>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cotizacion>(HttpStatus.NOT_IMPLEMENTED);
    }
}
