
import { Injectable } from '@nestjs/common';
import { CreateCollaboratorDto } from './dto/create-collaborator.dto';
import { Collaborator } from './interfaces/collaborator.interface';

@Injectable()
export class QuotationService {
  
  generate(): any {
    return {};
  }

  create(createCollaboratorDto: CreateCollaboratorDto) {
    const collaborator: Collaborator = {
      identifierNumber: createCollaboratorDto.identifierNumber,
      firstName: createCollaboratorDto.firstName,
      lastName1:createCollaboratorDto.lastName1,
      lastName2: createCollaboratorDto.lastName2,
      personalEmail: createCollaboratorDto.personalEmail,
      email: createCollaboratorDto.personalEmail,
      birthDate: createCollaboratorDto.birthDate,
      accounts: []
    };

    this.collaborators.push(collaborator);
  }

  findAll(): Collaborator[] {
    return this.collaborators;
  }

  findOne(id: number) : Collaborator {
    return this.collaborators.find( (collaborator: Collaborator) => {
      collaborator.identifierNumber === id.toString();
    });
  }

  private collaborators: Collaborator[] = [
    {
      identifierNumber: '1',
      firstName: 'string',
      lastName1: 'string',
      lastName2: 'string',
      email: 'string',
      personalEmail: 'string',
      birthDate: 'string',
      accounts: []
    }, {
      identifierNumber: '2',
      firstName: 'string',
      lastName1: 'string',
      lastName2: 'string',
      email: 'string',
      personalEmail: 'string',
      birthDate: 'string',
      accounts: []
    }, {
      identifierNumber: '3',
      firstName: 'string',
      lastName1: 'string',
      lastName2: 'string',
      email: 'string',
      personalEmail: 'string',
      birthDate: 'string',
      accounts: []
    }
  ];
}
