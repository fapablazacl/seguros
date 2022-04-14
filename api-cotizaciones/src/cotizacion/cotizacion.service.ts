import { Injectable } from '@nestjs/common';
import { Cliente } from './cliente';
import { Cotizacion } from './cotizacion';
import { Plan } from './plan';

@Injectable()
export class CotizacionService {
  /**
   * Genera una nueva Cotizacion de Planes de Seguros, en base al Cliente suministrado.
   * @param cliente
   * @returns
   */
  generate(cliente: Cliente): Cotizacion {
    const planes: Plan[] = [];

    return new Cotizacion(planes);
  }

  // planes de ejemplo
  private planes: Plan[] = [
    new Plan('1', 'Plan 1', 'MetLife', 11755, 0.41, 500, '1', 2),
    new Plan('2', 'Plan 2', 'MetLife', 23223, 0.81, 500, '1', 2),
    new Plan('3', 'Plan 3', 'MetLife', 34978, 1.22, 500, '1', 2),
  ];
}
