import { Module } from '@nestjs/common';
import { CollaboratorsService } from './quotation.service';
import { CollaboratorsController } from './quotation.controller';

@Module({
  controllers: [CollaboratorsController],
  providers: [CollaboratorsService]
})
export class CollaboratorsModule {}
