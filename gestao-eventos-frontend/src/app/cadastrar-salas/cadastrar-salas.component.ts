import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { PessoaService } from '../core/api/pessoa/pessoa.service';
import { SalasService } from '../core/api/salas/salas.service';

@Component({
  selector: 'app-cadastrar-salas',
  templateUrl: './cadastrar-salas.component.html',
  styleUrls: ['./cadastrar-salas.component.css']
})
export class CadastrarSalasComponent implements OnInit {
  
  public form: FormGroup;

  constructor(
    private formbuilder: FormBuilder,
    private salasService: SalasService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.form = this.formbuilder.group({
      nomeDaSala: [],
      lotacaoDaSala: []
    })
  }

  public salvar() {
    this.salasService.salvar(this.form.getRawValue()).subscribe(() => {
      this.router.navigate(['/']);
    })
  }

}
