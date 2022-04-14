import { Test, TestingModule } from '@nestjs/testing';
import { CollaboratorsController } from './quotation.controller';
import { QuotationService } from './quotation.service';

describe('CollaboratorsController', () => {
  let controller: CollaboratorsController;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      controllers: [CollaboratorsController],
      providers: [QuotationService],
    }).compile();

    controller = module.get<CollaboratorsController>(CollaboratorsController);
  });

  it('should be defined', () => {
    expect(controller).toBeDefined();
  });
});
