export interface IUsuario {
  id?: string;
  nombre?: string;
  apellido?: string;
  numcel?: string;
  email?: string;
}

export class Usuario implements IUsuario {
  constructor(public id?: string, public nombre?: string, public apellido?: string, public numcel?: string, public email?: string) {}
}
