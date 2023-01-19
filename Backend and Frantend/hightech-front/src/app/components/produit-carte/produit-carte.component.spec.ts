import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProduitCarteComponent } from './produit-carte.component';

describe('ProduitCarteComponent', () => {
  let component: ProduitCarteComponent;
  let fixture: ComponentFixture<ProduitCarteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProduitCarteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProduitCarteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
