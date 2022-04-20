package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DetalleValidacion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-20T16:20:48.774Z[GMT]")


public class DetalleValidacion   {
  @JsonProperty("detalle")
  private String detalle = null;

  public DetalleValidacion detalle(String detalle) {
    this.detalle = detalle;
    return this;
  }

  /**
   * Get detalle
   * @return detalle
   **/
  @Schema(example = "El campo XX es invalido", required = true, description = "")
      @NotNull

    public String getDetalle() {
    return detalle;
  }

  public void setDetalle(String detalle) {
    this.detalle = detalle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalleValidacion detalleValidacion = (DetalleValidacion) o;
    return Objects.equals(this.detalle, detalleValidacion.detalle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detalle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalleValidacion {\n");
    
    sb.append("    detalle: ").append(toIndentedString(detalle)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
