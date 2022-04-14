import { Test, TestingModule } from '@nestjs/testing';
import { CollaboratorsController } from './quotation.controller';
import { CollaboratorsService } from './quotation.service';

describe('CollaboratorsController', () => {
  let controller: CollaboratorsController;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      controllers: [CollaboratorsController],
      providers: [CollaboratorsService],
    }).compile();

    controller = module.get<CollaboratorsController>(CollaboratorsController);
  });

  it('should be defined', () => {
    expect(controller).toBeDefined();
  });
});
