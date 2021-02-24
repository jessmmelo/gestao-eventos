import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SalasService {

  constructor(
    private http: HttpClient
  ) { }

  public listar(){
    return this.http.get<any[]>('http://localhost:8080/salasDoEvento');
  }
}