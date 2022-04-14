import { Test, TestingModule } from '@nestjs/testing';
import { CollaboratorsController } from './cotizacion.controller';
import { CotizacionService } from './cotizacion.service';

describe('CollaboratorsController', () => {
  let controller: CollaboratorsController;

  beforeEach(async () => {
    const module: TestingModule = await Test.createTestingModule({
      controllers: [CollaboratorsController],
      providers: [CotizacionService],
    }).compile();

    controller = module.get<CollaboratorsController>(CollaboratorsController);
  });

  it('should be defined', () => {
    expect(controller).toBeDefined();
  });
});
