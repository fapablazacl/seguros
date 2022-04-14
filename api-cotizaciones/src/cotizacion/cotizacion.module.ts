import { Module } from '@nestjs/common';
import { CotizacionService } from './cotizacion.service';
import { CollaboratorsController } from './cotizacion.controller';

@Module({
  controllers: [CollaboratorsController],
  providers: [CotizacionService]
})
export class CollaboratorsModule {}
