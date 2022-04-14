import { Plan } from './plan';

export class Cotizacion {
  planes: Plan[];

  public constructor(planes: Plan[]) {
    this.planes = planes || [];
  }
}
