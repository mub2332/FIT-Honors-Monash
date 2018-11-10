import { Component, OnInit } from '@angular/core';
import {AuthService} from "../auth.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private authService: AuthService, private router: Router) { }

  ngOnInit() {
  }

  signInWithGoogle() {
    this.authService.signInWithGoogle()
      .then((res) => {
        if (this.authService.userDetails.email.endsWith('student.monash.edu')) {
          this.router.navigate(['projects']);
        } else if (this.authService.userDetails.email.endsWith('monash.edu')) {
          this.router.navigate(['allocation']);
        } else {
          this.router.navigate(['login']);
        }
      });
  }

}
