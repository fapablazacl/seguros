import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { CollaboratorsModule } from './collaborators/collaborators.module';

@Module({
  imports: [CollaboratorsModule],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
