export class Cliente {
  rut: string;
  fechaNacimiento: Date;
  correo: string;
  telefono: string;

  public constructor(
    rut: string,
    fechaNacimiento: Date,
    correo: string,
    telefono: string,
  ) {
    this.rut = rut;
    this.fechaNacimiento = fechaNacimiento;
    this.correo = correo;
    this.telefono = telefono;
  }
}
