package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Plan;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cotizacion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-20T16:20:48.774Z[GMT]")


public class Cotizacion   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("planes")
  @Valid
  private List<Plan> planes = new ArrayList<Plan>();

  public Cotizacion id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Cotizacion planes(List<Plan> planes) {
    this.planes = planes;
    return this;
  }

  public Cotizacion addPlanesItem(Plan planesItem) {
    this.planes.add(planesItem);
    return this;
  }

  /**
   * Get planes
   * @return planes
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<Plan> getPlanes() {
    return planes;
  }

  public void setPlanes(List<Plan> planes) {
    this.planes = planes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cotizacion cotizacion = (Cotizacion) o;
    return Objects.equals(this.id, cotizacion.id) &&
        Objects.equals(this.planes, cotizacion.planes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, planes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cotizacion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    planes: ").append(toIndentedString(planes)).append("\n");
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
