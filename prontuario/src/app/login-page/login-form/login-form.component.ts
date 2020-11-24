import { fadeStateTrigger } from 'src/app/animations/animation';
import { Router } from '@angular/router';
import { AuthService } from './../../auth/auth.service';
import { Component } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { MatSnackBar, MatSnackBarConfig } from '@angular/material/snack-bar';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.scss'],
  animations: [fadeStateTrigger]
})
export class LoginFormComponent {
  loginForm = this.fb.group({
    user: [null, [Validators.required, Validators.email]],
    password: [null, Validators.required],
  });

  hasUnitNumber = false;
  loading: boolean = false;

  constructor(private fb: FormBuilder, public authService: AuthService, public route: Router, private snackBar: MatSnackBar) { }

  // Snackbar indicativo com booleano de erro
  openSnackBar(message: string, action?: string, error?: boolean) {
    const snackConfig = new MatSnackBarConfig();
    if (!error) {
      snackConfig.duration = 3000;
      this.snackBar.open(message, action, snackConfig)
    } else {
      snackConfig.panelClass = ['error-class'];
      snackConfig.duration = 3000;
      this.snackBar.open(message, action, snackConfig)

    }
  }

  onSubmit() {
    this.loading = true;
    if (this.loginForm.status == 'INVALID') {
      this.openSnackBar('Usuário ou senha incorretos', 'Fechar', false)
      this.loading = false;
      return
    } else {
      this.route.navigate(['/home'])
      this.loading = false;
    }
  };
}

