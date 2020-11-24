import { Component, OnInit, Injectable } from '@angular/core';
import { Router, ActivatedRoute, RouterStateSnapshot, RouterState, ActivatedRouteSnapshot } from '@angular/router';
import { fadeStateTrigger } from 'src/app/animations/animation';

@Injectable({
  providedIn: 'root'
})
@Component({
  selector: 'app-pagina-nao-encontrada',
  templateUrl: './pagina-nao-encontrada.component.html',
  styleUrls: ['./pagina-nao-encontrada.component.scss'],
    animations: [fadeStateTrigger]
})
export class PaginaNaoEncontradaComponent implements OnInit {

  constructor(public router: Router) {
    const state: RouterState = router.routerState;
    const snapshot: RouterStateSnapshot = router.routerState.snapshot;
    const root: ActivatedRouteSnapshot = snapshot.root;
    const child = root.firstChild;
  }


  ngOnInit() {
  }

}
