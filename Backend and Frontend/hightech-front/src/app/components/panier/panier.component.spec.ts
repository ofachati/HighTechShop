import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PanierComponent } from './panier.component';

describe('PanierListeComponent', () => {
  let component: PanierComponent;
  let fixture: ComponentFixture<PanierComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PanierComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PanierComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
