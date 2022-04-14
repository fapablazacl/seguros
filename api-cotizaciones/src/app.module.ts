import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { CollaboratorsModule } from './cotizacion/cotizacion.module';

@Module({
  imports: [CollaboratorsModule],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
