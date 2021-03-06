import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { PessoaService } from '../core/api/pessoa/pessoa.service';

@Component({
  selector: 'app-cadastrar-pessoa',
  templateUrl: './cadastrar-pessoa.component.html',
  styleUrls: ['./cadastrar-pessoa.component.css']
})
export class CadastrarPessoaComponent implements OnInit {

  public form: FormGroup;

  constructor(
    private formbuilder: FormBuilder,
    private pessoaService: PessoaService,
    private router: Router

  ) { }

  ngOnInit(): void {

    this.form = this.formbuilder.group({
      nome: [],
      sobrenome: []
    })
  }

  public salvar() {
    this.pessoaService.salvar(this.form.getRawValue()).subscribe(() => {
      this.router.navigate(['/']);
    })
  }

}
