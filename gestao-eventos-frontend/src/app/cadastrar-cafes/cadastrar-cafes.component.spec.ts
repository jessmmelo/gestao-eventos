import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarCafesComponent } from './cadastrar-cafes.component';

describe('CadastrarCafesComponent', () => {
  let component: CadastrarCafesComponent;
  let fixture: ComponentFixture<CadastrarCafesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CadastrarCafesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastrarCafesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
