export class Plan {
  id: string;
  nombre: string;
  aseguradora: string;
  montoPesos: number;
  montoUf: number;
  capitalAsegurado: number;
  promocionCod: string;
  promocionValor: number;

  public constructor(
    id: string,
    nombre: string,
    aseguradora: string,
    montoPesos: number,
    montoUf: number,
    capitalAsegurado: number,
    promocionCod: string,
    promocionValor: number,
  ) {
    this.id = id;
    this.aseguradora = aseguradora;
    this.montoPesos = montoPesos;
    this.montoUf = montoUf;
    this.capitalAsegurado = capitalAsegurado;
    this.promocionCod = promocionCod;
    this.promocionValor = promocionValor;
  }
}
