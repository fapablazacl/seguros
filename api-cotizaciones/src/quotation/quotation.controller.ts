import { Controller, Get, Post, Body, Param, ValidationPipe } from '@nestjs/common';
import { QuotationService } from './quotation.service';
import { CreateCollaboratorDto } from './dto/create-collaborator.dto';

@Controller('collaborators')
export class CollaboratorsController {
  constructor(private readonly collaboratorsService: QuotationService) {}

  @Post()
  create(@Body(new ValidationPipe()) createCollaboratorDto: CreateCollaboratorDto) {
    return this.collaboratorsService.create(createCollaboratorDto);
  }

  @Get()
  findAll() {
    return this.collaboratorsService.findAll();
  }

  @Get(':id')
  findOne(@Param('id') id: string) {
    return this.collaboratorsService.findOne(+id);
  }
}
