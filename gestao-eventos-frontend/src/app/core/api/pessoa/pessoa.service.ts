import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PessoaService {

  constructor(
    private http: HttpClient
  ) { }

  public listar(){
    return this.http.get<any[]>('http://localhost:8080/pessoa');
  }

  public apagar(id: number) {
    return this.http.delete('http://localhost:8080/pessoa/' + id);
  }
  public salvar(pessoa: any){
    return this.http.post('http://localhost:8080/pessoa', pessoa);
  }
}
