// *****
// SERVICE APENAS DE AUTENTICAÇÃO
// *****
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CanActivate, Router } from '@angular/router';
import { environment } from 'src/environments/environment';
import { Observable, Subject } from 'rxjs';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient, private router: Router) { }

  userInfo = undefined
  perfil = undefined
  public currentUser: Observable<any>

  public isAuthenticated(): boolean {
    const token = localStorage.getItem('token');
    // Check whether the token is expired and return
    // true or false
    if (!token) {
      return false
    }
  }

  loginUsuario(user) {
    if (user.value.user == 'Jorge') {
      return this.perfil = 'medico'
    } else {
      return this.perfil = 'paciente'
    }
  }
  _userActionOccured: Subject<void> = new Subject();
  get userActionOccured(): Observable<void> { return this._userActionOccured.asObservable() };

  notifyUserAction() {
    this._userActionOccured.next();
  }



  logoutUser() {
    localStorage.removeItem('token');
    this.router.navigate(['/login'])
  }


}
