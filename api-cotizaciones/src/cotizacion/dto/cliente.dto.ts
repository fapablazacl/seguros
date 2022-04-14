import { IsAlpha, IsDate, IsEmail, IsString } from 'class-validator';

export class ClienteDto {
  @IsString()
  public rut: string;

  @IsString()
  public fechaNacimiento: string;

  @IsString()
  public correo: string;

  @IsString()
  public telefono: string;
}
