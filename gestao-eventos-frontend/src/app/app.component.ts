import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';
import { PessoaService } from './core/api/pessoa/pessoa.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  public items = [] as  MenuItem[];
  public activeItem: MenuItem;
  public pessoas = [] as any[];

  constructor(
    private pessoaService: PessoaService
  ){

  }
  ngOnInit() {
    this.items = [
      { label: 'Pessoas', icon: 'pi pi-fw pi-users' },
      { label: 'Salas', icon: 'pi pi-fw pi-home' },
      { label: 'Cafés', icon: 'pi pi-fw pi-heart' }
    ];

    this.activeItem = this.items[0];
    this.pessoaService.listar().subscribe(pessoas =>
      {
        this.pessoas = pessoas;
      })
  }


}
