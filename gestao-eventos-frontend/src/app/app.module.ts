import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {TabMenuModule} from 'primeng/tabmenu';
import { HttpClientModule } from '@angular/common/http';

import {TableModule} from 'primeng/table';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CadastrarPessoaComponent } from './cadastrar-pessoa/cadastrar-pessoa.component';

@NgModule({
  declarations: [
    AppComponent,
    CadastrarPessoaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    TabMenuModule,
    TableModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
