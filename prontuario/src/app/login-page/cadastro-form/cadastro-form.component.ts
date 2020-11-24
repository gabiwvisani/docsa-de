import { fadeStateTrigger } from 'src/app/animations/animation';
import { MatSnackBar, MatSnackBarConfig } from '@angular/material/snack-bar';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';
import { AuthService } from 'src/app/auth/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cadastro-form',
  templateUrl: './cadastro-form.component.html',
  styleUrls: ['./cadastro-form.component.scss'],
  animations: [fadeStateTrigger]
})

export class CadastroFormComponent implements OnInit {
  cadastroForm = this.fb.group({
    user: [null, [Validators.required, Validators.email]],
    password: [null, [Validators.required, Validators.minLength(8)]],
    nome: [null, Validators.required],
    sobreNome: [null, Validators.required],
    passwordCheck: [null, Validators.required]
  });

  loading: boolean = false;

  constructor(private fb: FormBuilder, public authService: AuthService, public route: Router, private snackBar: MatSnackBar) { }

  ngOnInit(): void {
  }

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

  checkPassword(password, samePass) {
    let pass = password;
    let confirmPass = samePass;

    return pass === confirmPass ? null : { notSame: true }

  }

  onSubmit() {
    this.loading = true;
    if (this.cadastroForm.value.password != this.cadastroForm.value.passwordCheck) {
      this.openSnackBar('As senhas são diferentes, por favor confira', 'fechar')
      this.loading = false
      return
    }
    else {
      if (this.cadastroForm.status == 'VALID') {
        this.openSnackBar('Você receberá um e-mail para confirmar seu cadastro, obrigado por se cadastrar', 'Fechar')
        this.route.navigate(['/login'])
      }
      else {
        this.openSnackBar('uhu', 'obrigado')
        this.loading = false;
      }
    }

  }
}
