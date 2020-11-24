import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { PaginaNaoEncontradaComponent } from './pagina-nao-encontrada/pagina-nao-encontrada.component';


const routes: Routes = [
  {
    path: '',
    children: [
      { path: 'home', component: HomeComponent },
    ]
  },
  { path: 'login', component: LoginPageComponent, pathMatch: 'full' },
  { path: 'cadastro', component: LoginPageComponent, pathMatch: 'full'},
  { path: '404', component: PaginaNaoEncontradaComponent, pathMatch: 'full' },
  { path: '**', redirectTo: '/404'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
