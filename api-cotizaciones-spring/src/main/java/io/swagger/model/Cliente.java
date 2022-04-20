package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cliente
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-20T16:20:48.774Z[GMT]")


public class Cliente   {
  @JsonProperty("rut")
  private String rut = null;

  @JsonProperty("fechaNacimiento")
  private LocalDate fechaNacimiento = null;

  @JsonProperty("correo")
  private String correo = null;

  @JsonProperty("telefono")
  private Integer telefono = null;

  public Cliente rut(String rut) {
    this.rut = rut;
    return this;
  }

  /**
   * Get rut
   * @return rut
   **/
  @Schema(example = "12123123-1", required = true, description = "")
      @NotNull

  @Pattern(regexp="^(\\d{1,3}(?:\\.\\d{1,3}){2}-[\\dkK])$")   public String getRut() {
    return rut;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }

  public Cliente fechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

  /**
   * Get fechaNacimiento
   * @return fechaNacimiento
   **/
  @Schema(example = "Thu Feb 10 00:00:00 GMT 29", required = true, description = "")
      @NotNull

    @Valid
    public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Cliente correo(String correo) {
    this.correo = correo;
    return this;
  }

  /**
   * Get correo
   * @return correo
   **/
  @Schema(example = "cuenta@correo.com", required = true, description = "")
      @NotNull

    public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public Cliente telefono(Integer telefono) {
    this.telefono = telefono;
    return this;
  }

  /**
   * Get telefono
   * @return telefono
   **/
  @Schema(example = "911112222", required = true, description = "")
      @NotNull

    public Integer getTelefono() {
    return telefono;
  }

  public void setTelefono(Integer telefono) {
    this.telefono = telefono;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cliente cliente = (Cliente) o;
    return Objects.equals(this.rut, cliente.rut) &&
        Objects.equals(this.fechaNacimiento, cliente.fechaNacimiento) &&
        Objects.equals(this.correo, cliente.correo) &&
        Objects.equals(this.telefono, cliente.telefono);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rut, fechaNacimiento, correo, telefono);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cliente {\n");
    
    sb.append("    rut: ").append(toIndentedString(rut)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    correo: ").append(toIndentedString(correo)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
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
