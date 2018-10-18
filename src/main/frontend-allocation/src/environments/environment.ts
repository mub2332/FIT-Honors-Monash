// This file can be replaced during build by using the `fileReplacements` array.
// `ng build ---prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.

export const environment = {
  production: false,
  firebase: {
    apiKey: "AIzaSyD4anpJlBFxV6e_9Q2G4K-mEE1z_bLIzU4",
    authDomain: "allocation-auth.firebaseapp.com",
    databaseURL: "https://allocation-auth.firebaseio.com",
    projectId: "allocation-auth",
    storageBucket: "",
    messagingSenderId: "1071360021696"
  }
};

/*
 * In development mode, for easier debugging, you can ignore zone related error
 * stack frames such as `zone.run`/`zoneDelegate.invokeTask` by importing the
 * below file. Don't forget to comment it out in production mode
 * because it will have a performance impact when errors are thrown
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.
