import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CafesService } from '../core/api/cafes/cafes.service';

@Component({
  selector: 'app-cadastrar-cafes',
  templateUrl: './cadastrar-cafes.component.html',
  styleUrls: ['./cadastrar-cafes.component.css']
})
export class CadastrarCafesComponent implements OnInit {

  public form: FormGroup;

  constructor(
    private formbuilder: FormBuilder,
    private cafesService: CafesService,
    private router: Router
  ) { }

  ngOnInit(): void {

    this.form = this.formbuilder.group({
      nomeEspacoCafe: [],
      lotacaoEspacoCafe: []
    })
  }
  public salvar() {
    this.cafesService.salvar(this.form.getRawValue()).subscribe(() => {
      this.router.navigate(['/']);
    })
  }

}
