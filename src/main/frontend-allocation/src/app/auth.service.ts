import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {AngularFireAuth} from '@angular/fire/auth';
import {Router} from "@angular/router";
import * as firebase from "firebase";
/*
Authentication service
 */
@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private user: Observable<firebase.User>;
  public userDetails: firebase.User = null;
  // Initialise user with null
  // If logged in, store state in instance variable
  constructor(public _firebaseAuth: AngularFireAuth, private router: Router) {
    this.user = this._firebaseAuth.authState;

    this.user.subscribe(
      (user) => {
        if (user) {
          this.userDetails = user;
          console.log(this.userDetails);
        } else {
          this.userDetails = null;
        }
      }
    )
  }
  // Sign in using Google provider for OAuth
  signInWithGoogle() {
    return this._firebaseAuth.auth.signInWithPopup(
      new firebase.auth.GoogleAuthProvider()
    )
  }
  // Determine login status
  isLoggedIn() {
    if (this.userDetails == null) {
      return false;
    } else {
      return true;
    }
  }
  // Logout current user
  logout() {
    this._firebaseAuth.auth.signOut()
      .then((res) => this.router.navigate['/login']);
  }
}
