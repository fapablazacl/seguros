import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { CollaboratorsModule } from './quotation/quotation.module';

@Module({
  imports: [CollaboratorsModule],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
