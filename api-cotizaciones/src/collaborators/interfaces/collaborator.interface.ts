import { Account } from "./account.interface";

export interface Collaborator {
  identifierNumber: string;
  firstName: string;
  lastName1: string;
  lastName2: string;
  email: string;
  personalEmail: string;
  birthDate: string;
  accounts: Account[]
}
