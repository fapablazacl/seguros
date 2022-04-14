import { Module } from '@nestjs/common';
import { QuotationService } from './quotation.service';
import { CollaboratorsController } from './quotation.controller';

@Module({
  controllers: [CollaboratorsController],
  providers: [QuotationService]
})
export class CollaboratorsModule {}
