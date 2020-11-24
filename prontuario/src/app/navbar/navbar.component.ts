import { PerfilPageComponent } from './perfil-page/perfil-page.component';
import { Location } from '@angular/common';
import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { fadeStateTrigger } from '../animations/animation';
import { LoadingService } from '../components/loading/loading.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss'],
  animations: [fadeStateTrigger]

})
export class NavbarComponent implements OnInit {

  constructor(public loadingService: LoadingService, private dialog: MatDialog, public route: Router, private cdr: ChangeDetectorRef,
    public location: Location) { }

  ngOnInit(): void {
  }

  isHomeRouteActivated(): boolean {
    return this.location.path().indexOf('/home') > -1;
  }

  openPerfil() {
    this.dialog.open(PerfilPageComponent, {
      width: '350px',
    })
  }


}
