import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';
import { CafesService } from './core/api/cafes/cafes.service';
import { PessoaService } from './core/api/pessoa/pessoa.service';
import { SalasService } from './core/api/salas/salas.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  public items = [] as MenuItem[];
  public activeItem: MenuItem;
  public pessoas = [] as any[];
  public salasDoEvento = [] as any[];
  public espacosDeCafe = [] as any[];

  constructor(
    private pessoaService: PessoaService,
    private salasDoEventoService: SalasService,
    private espacosDeCafesService: CafesService

  ) {

  }
  ngOnInit() {
    this.items = [
      {
        label: 'Pessoas', icon: 'pi pi-fw pi-users', command: () => {
          this.activeItem = this.items[0];

        }
      },
      {
        label: 'Salas', icon: 'pi pi-fw pi-home', command: () => {
          this.activeItem = this.items[1];
          this.salasDoEventoService.listar().subscribe(dt => this.salasDoEvento = dt);

        }
      },
      {
        label: 'Cafes', icon: 'pi pi-fw pi-heart', command: () => {
          this.activeItem = this.items[2];
          this.espacosDeCafesService.listar().subscribe(dt => this.espacosDeCafe = dt);
        }
      }
    ];

    this.activeItem = this.items[0];
    this.pessoaService.listar().subscribe(pessoas => {
      this.pessoas = pessoas;
    })
  }

}
