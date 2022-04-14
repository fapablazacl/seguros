import { IsAlpha, IsDate, IsEmail, IsString } from 'class-validator';

export class ClienteDto {
  @IsString()
  public rut: string;

  @IsDate()
  public fechaNacimiento: string;

  @IsEmail()
  public correo: string;

  @IsAlpha()
  public telefono: string;
}
