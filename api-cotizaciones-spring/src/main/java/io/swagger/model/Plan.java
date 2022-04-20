package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Plan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-20T16:20:48.774Z[GMT]")


public class Plan   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("aseguradora")
  private String aseguradora = null;

  @JsonProperty("montoPesos")
  private Integer montoPesos = null;

  @JsonProperty("montoUf")
  private BigDecimal montoUf = null;

  @JsonProperty("capitalAsegurado")
  private BigDecimal capitalAsegurado = null;

  @JsonProperty("promocionId")
  private UUID promocionId = null;

  @JsonProperty("promocionValor")
  private Integer promocionValor = null;

  public Plan id(UUID id) {
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

  public Plan nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
   **/
  @Schema(example = "Plan 1", required = true, description = "")
      @NotNull

    public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Plan aseguradora(String aseguradora) {
    this.aseguradora = aseguradora;
    return this;
  }

  /**
   * Get aseguradora
   * @return aseguradora
   **/
  @Schema(example = "MetLife", required = true, description = "")
      @NotNull

    public String getAseguradora() {
    return aseguradora;
  }

  public void setAseguradora(String aseguradora) {
    this.aseguradora = aseguradora;
  }

  public Plan montoPesos(Integer montoPesos) {
    this.montoPesos = montoPesos;
    return this;
  }

  /**
   * Get montoPesos
   * @return montoPesos
   **/
  @Schema(example = "11755", required = true, description = "")
      @NotNull

    public Integer getMontoPesos() {
    return montoPesos;
  }

  public void setMontoPesos(Integer montoPesos) {
    this.montoPesos = montoPesos;
  }

  public Plan montoUf(BigDecimal montoUf) {
    this.montoUf = montoUf;
    return this;
  }

  /**
   * Get montoUf
   * @return montoUf
   **/
  @Schema(example = "0.41", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getMontoUf() {
    return montoUf;
  }

  public void setMontoUf(BigDecimal montoUf) {
    this.montoUf = montoUf;
  }

  public Plan capitalAsegurado(BigDecimal capitalAsegurado) {
    this.capitalAsegurado = capitalAsegurado;
    return this;
  }

  /**
   * Get capitalAsegurado
   * @return capitalAsegurado
   **/
  @Schema(example = "500", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getCapitalAsegurado() {
    return capitalAsegurado;
  }

  public void setCapitalAsegurado(BigDecimal capitalAsegurado) {
    this.capitalAsegurado = capitalAsegurado;
  }

  public Plan promocionId(UUID promocionId) {
    this.promocionId = promocionId;
    return this;
  }

  /**
   * Get promocionId
   * @return promocionId
   **/
  @Schema(description = "")
  
    @Valid
    public UUID getPromocionId() {
    return promocionId;
  }

  public void setPromocionId(UUID promocionId) {
    this.promocionId = promocionId;
  }

  public Plan promocionValor(Integer promocionValor) {
    this.promocionValor = promocionValor;
    return this;
  }

  /**
   * Get promocionValor
   * @return promocionValor
   **/
  @Schema(example = "2", required = true, description = "")
      @NotNull

    public Integer getPromocionValor() {
    return promocionValor;
  }

  public void setPromocionValor(Integer promocionValor) {
    this.promocionValor = promocionValor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plan plan = (Plan) o;
    return Objects.equals(this.id, plan.id) &&
        Objects.equals(this.nombre, plan.nombre) &&
        Objects.equals(this.aseguradora, plan.aseguradora) &&
        Objects.equals(this.montoPesos, plan.montoPesos) &&
        Objects.equals(this.montoUf, plan.montoUf) &&
        Objects.equals(this.capitalAsegurado, plan.capitalAsegurado) &&
        Objects.equals(this.promocionId, plan.promocionId) &&
        Objects.equals(this.promocionValor, plan.promocionValor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, aseguradora, montoPesos, montoUf, capitalAsegurado, promocionId, promocionValor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    aseguradora: ").append(toIndentedString(aseguradora)).append("\n");
    sb.append("    montoPesos: ").append(toIndentedString(montoPesos)).append("\n");
    sb.append("    montoUf: ").append(toIndentedString(montoUf)).append("\n");
    sb.append("    capitalAsegurado: ").append(toIndentedString(capitalAsegurado)).append("\n");
    sb.append("    promocionId: ").append(toIndentedString(promocionId)).append("\n");
    sb.append("    promocionValor: ").append(toIndentedString(promocionValor)).append("\n");
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
