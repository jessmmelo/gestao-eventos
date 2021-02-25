import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastrarCafesComponent } from './cadastrar-cafes/cadastrar-cafes.component';
import { CadastrarPessoaComponent } from './cadastrar-pessoa/cadastrar-pessoa.component';
import { CadastrarSalasComponent } from './cadastrar-salas/cadastrar-salas.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'cadastrar-pessoa',
    component: CadastrarPessoaComponent
  },
  {
    path: 'cadastrar-salas',
    component: CadastrarSalasComponent
  },
  {
    path: 'cadastrar-cafes',
    component: CadastrarCafesComponent
  }

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
