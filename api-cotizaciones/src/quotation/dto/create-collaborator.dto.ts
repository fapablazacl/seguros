import { IsAlpha, IsDate, IsEmail, IsString } from "class-validator";

export class CreateCollaboratorDto {
  @IsString()
  public identifierNumber: string;
  
  @IsAlpha()
  public firstName: string;
  
  @IsAlpha()
  public lastName1: string;
  
  @IsAlpha()
  public lastName2: string;

  @IsEmail()
  public personalEmail: string;

  @IsDate()
  public birthDate: string;
}
