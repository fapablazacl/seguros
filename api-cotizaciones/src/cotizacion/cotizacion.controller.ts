import { Controller, Post, Body, ValidationPipe } from '@nestjs/common';
import { Cliente } from './cliente';
import { CotizacionService } from './cotizacion.service';
import { ClienteDto } from './dto/cliente.dto';

@Controller('cotizacion')
export class CotizacionController {
  constructor(private readonly cotizacionService: CotizacionService) {}

  @Post()
  create(@Body(new ValidationPipe()) dto: ClienteDto) {
    const cliente = new Cliente(
      dto.rut,
      new Date(Date.parse(dto.fechaNacimiento)),
      dto.correo,
      dto.telefono,
    );
    return this.cotizacionService.generar(cliente);
  }
}
