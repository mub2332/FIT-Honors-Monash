(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _projects_project_list_project_list_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./projects/project-list/project-list.component */ "./src/app/projects/project-list/project-list.component.ts");
/* harmony import */ var _projects_short_list_short_list_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./projects/short-list/short-list.component */ "./src/app/projects/short-list/short-list.component.ts");
/* harmony import */ var _projects_allocation_allocation_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./projects/allocation/allocation.component */ "./src/app/projects/allocation/allocation.component.ts");
/* harmony import */ var _login_login_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./login/login.component */ "./src/app/login/login.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};






var routes = [
    { path: '', redirectTo: '/login', pathMatch: 'full' },
    { path: 'projects', component: _projects_project_list_project_list_component__WEBPACK_IMPORTED_MODULE_2__["ProjectListComponent"] },
    { path: 'shortlist', component: _projects_short_list_short_list_component__WEBPACK_IMPORTED_MODULE_3__["ShortListComponent"] },
    { path: 'allocation', component: _projects_allocation_allocation_component__WEBPACK_IMPORTED_MODULE_4__["AllocationComponent"] },
    { path: 'login', component: _login_login_component__WEBPACK_IMPORTED_MODULE_5__["LoginComponent"] }
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            imports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"].forRoot(routes)],
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\nmain {\n  width: 80%;\n  margin: auto;\n  margin-top: 100px;\n}\n"

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n<app-header></app-header>\n\n<main>\n  <router-outlet></router-outlet>\n</main>\n\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'frontend-allocation';
    }
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/platform-browser/animations */ "./node_modules/@angular/platform-browser/fesm5/animations.js");
/* harmony import */ var _header_header_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./header/header.component */ "./src/app/header/header.component.ts");
/* harmony import */ var ngx_pagination__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ngx-pagination */ "./node_modules/ngx-pagination/dist/ngx-pagination.js");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../environments/environment */ "./src/environments/environment.ts");
/* harmony import */ var angularfire2__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! angularfire2 */ "./node_modules/angularfire2/index.js");
/* harmony import */ var angularfire2__WEBPACK_IMPORTED_MODULE_7___default = /*#__PURE__*/__webpack_require__.n(angularfire2__WEBPACK_IMPORTED_MODULE_7__);
/* harmony import */ var angularfire2_database__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! angularfire2/database */ "./node_modules/angularfire2/database/index.js");
/* harmony import */ var angularfire2_database__WEBPACK_IMPORTED_MODULE_8___default = /*#__PURE__*/__webpack_require__.n(angularfire2_database__WEBPACK_IMPORTED_MODULE_8__);
/* harmony import */ var angularfire2_auth__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! angularfire2/auth */ "./node_modules/angularfire2/auth/index.js");
/* harmony import */ var angularfire2_auth__WEBPACK_IMPORTED_MODULE_9___default = /*#__PURE__*/__webpack_require__.n(angularfire2_auth__WEBPACK_IMPORTED_MODULE_9__);
/* harmony import */ var _angular_material__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! @angular/material */ "./node_modules/@angular/material/esm5/material.es5.js");
/* harmony import */ var _projects_project_list_project_list_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./projects/project-list/project-list.component */ "./src/app/projects/project-list/project-list.component.ts");
/* harmony import */ var _projects_short_list_short_list_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./projects/short-list/short-list.component */ "./src/app/projects/short-list/short-list.component.ts");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ./app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var angular_sortablejs__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! angular-sortablejs */ "./node_modules/angular-sortablejs/dist/index.js");
/* harmony import */ var angular_sortablejs__WEBPACK_IMPORTED_MODULE_14___default = /*#__PURE__*/__webpack_require__.n(angular_sortablejs__WEBPACK_IMPORTED_MODULE_14__);
/* harmony import */ var _projects_allocation_allocation_component__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! ./projects/allocation/allocation.component */ "./src/app/projects/allocation/allocation.component.ts");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_16__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _auth_service__WEBPACK_IMPORTED_MODULE_17__ = __webpack_require__(/*! ./auth.service */ "./src/app/auth.service.ts");
/* harmony import */ var _login_login_component__WEBPACK_IMPORTED_MODULE_18__ = __webpack_require__(/*! ./login/login.component */ "./src/app/login/login.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



















var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_2__["AppComponent"],
                _header_header_component__WEBPACK_IMPORTED_MODULE_4__["HeaderComponent"],
                _projects_project_list_project_list_component__WEBPACK_IMPORTED_MODULE_11__["ProjectListComponent"],
                _projects_short_list_short_list_component__WEBPACK_IMPORTED_MODULE_12__["ShortListComponent"],
                _projects_allocation_allocation_component__WEBPACK_IMPORTED_MODULE_15__["AllocationComponent"],
                _login_login_component__WEBPACK_IMPORTED_MODULE_18__["LoginComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_3__["BrowserAnimationsModule"],
                _app_routing_module__WEBPACK_IMPORTED_MODULE_13__["AppRoutingModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatToolbarModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatExpansionModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatButtonModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatListModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatCardModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatFormFieldModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatInputModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatTabsModule"],
                _angular_material__WEBPACK_IMPORTED_MODULE_10__["MatSelectModule"],
                angular_sortablejs__WEBPACK_IMPORTED_MODULE_14__["SortablejsModule"].forRoot({ animation: 150 }),
                ngx_pagination__WEBPACK_IMPORTED_MODULE_5__["NgxPaginationModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_16__["FormsModule"],
                angularfire2__WEBPACK_IMPORTED_MODULE_7__["AngularFireModule"].initializeApp(_environments_environment__WEBPACK_IMPORTED_MODULE_6__["environment"].firebase, 'angular-auth-firebase'),
                angularfire2_database__WEBPACK_IMPORTED_MODULE_8__["AngularFireDatabaseModule"],
                angularfire2_auth__WEBPACK_IMPORTED_MODULE_9__["AngularFireAuthModule"]
            ],
            providers: [_auth_service__WEBPACK_IMPORTED_MODULE_17__["AuthService"]],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_2__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/auth.service.ts":
/*!*********************************!*\
  !*** ./src/app/auth.service.ts ***!
  \*********************************/
/*! exports provided: AuthService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AuthService", function() { return AuthService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_fire_auth__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/fire/auth */ "./node_modules/@angular/fire/auth/index.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var firebase__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! firebase */ "./node_modules/firebase/dist/index.cjs.js");
/* harmony import */ var firebase__WEBPACK_IMPORTED_MODULE_3___default = /*#__PURE__*/__webpack_require__.n(firebase__WEBPACK_IMPORTED_MODULE_3__);
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var AuthService = /** @class */ (function () {
    function AuthService(_firebaseAuth, router) {
        var _this = this;
        this._firebaseAuth = _firebaseAuth;
        this.router = router;
        this.userDetails = null;
        this.user = this._firebaseAuth.authState;
        this.user.subscribe(function (user) {
            if (user) {
                _this.userDetails = user;
                console.log(_this.userDetails);
            }
            else {
                _this.userDetails = null;
            }
        });
    }
    AuthService.prototype.signInWithGoogle = function () {
        return this._firebaseAuth.auth.signInWithPopup(new firebase__WEBPACK_IMPORTED_MODULE_3__["auth"].GoogleAuthProvider());
    };
    AuthService.prototype.isLoggedIn = function () {
        if (this.userDetails == null) {
            return false;
        }
        else {
            return true;
        }
    };
    AuthService.prototype.logout = function () {
        var _this = this;
        this._firebaseAuth.auth.signOut()
            .then(function (res) { return _this.router.navigate['/login']; });
    };
    AuthService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_angular_fire_auth__WEBPACK_IMPORTED_MODULE_1__["AngularFireAuth"], _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"]])
    ], AuthService);
    return AuthService;
}());



/***/ }),

/***/ "./src/app/header/header.component.css":
/*!*********************************************!*\
  !*** ./src/app/header/header.component.css ***!
  \*********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\na {\n  color: white;\n  text-decoration: none;\n}\n\n.spacer {\n  flex: 1 1 auto;\n}\n\n.brand {\n  margin-left: 2rem;\n}\n\nmat-toolbar {\n  position: fixed;\n  top: 0;\n  z-index: 999;\n}\n"

/***/ }),

/***/ "./src/app/header/header.component.html":
/*!**********************************************!*\
  !*** ./src/app/header/header.component.html ***!
  \**********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n<mat-toolbar color=\"primary\">\n  <mat-toolbar-row>\n    <a *ngIf=\"this.authService.userDetails.email.endsWith('student.monash.edu')\"  routerLink=\"/projects\">Projects</a>\n    <a *ngIf=\"this.authService.userDetails.email.endsWith('student.monash.edu')\" mat-button routerLink=\"/shortlist\" routerLinkActive=\"mat-accent\">Shortlist</a>\n    <a *ngIf=\"this.authService.userDetails.email.endsWith('monash.edu') && !this.authService.userDetails.email.includes('student')\" mat-button routerLink=\"/allocation\" routerLinkActive=\"mat-accent\">Allocate students</a>\n    <a *ngIf=\"this.authService.isLoggedIn()\" mat-button (click)=\"this.authService.logout()\">Logout</a>\n  </mat-toolbar-row>\n</mat-toolbar>\n"

/***/ }),

/***/ "./src/app/header/header.component.ts":
/*!********************************************!*\
  !*** ./src/app/header/header.component.ts ***!
  \********************************************/
/*! exports provided: HeaderComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HeaderComponent", function() { return HeaderComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _auth_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../auth.service */ "./src/app/auth.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var HeaderComponent = /** @class */ (function () {
    function HeaderComponent(authService) {
        this.authService = authService;
    }
    HeaderComponent.prototype.ngOnInit = function () {
    };
    HeaderComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-header',
            template: __webpack_require__(/*! ./header.component.html */ "./src/app/header/header.component.html"),
            styles: [__webpack_require__(/*! ./header.component.css */ "./src/app/header/header.component.css")]
        }),
        __metadata("design:paramtypes", [_auth_service__WEBPACK_IMPORTED_MODULE_1__["AuthService"]])
    ], HeaderComponent);
    return HeaderComponent;
}());



/***/ }),

/***/ "./src/app/login/login.component.css":
/*!*******************************************!*\
  !*** ./src/app/login/login.component.css ***!
  \*******************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/login/login.component.html":
/*!********************************************!*\
  !*** ./src/app/login/login.component.html ***!
  \********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<button mat-raised-button color=\"primary\" (click)=\"signInWithGoogle()\">Google Login</button>\n"

/***/ }),

/***/ "./src/app/login/login.component.ts":
/*!******************************************!*\
  !*** ./src/app/login/login.component.ts ***!
  \******************************************/
/*! exports provided: LoginComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LoginComponent", function() { return LoginComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _auth_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../auth.service */ "./src/app/auth.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var LoginComponent = /** @class */ (function () {
    function LoginComponent(authService, router) {
        this.authService = authService;
        this.router = router;
    }
    LoginComponent.prototype.ngOnInit = function () {
    };
    LoginComponent.prototype.signInWithGoogle = function () {
        var _this = this;
        this.authService.signInWithGoogle()
            .then(function (res) {
            if (_this.authService.userDetails.email.endsWith('student.monash.edu')) {
                _this.router.navigate(['projects']);
            }
            else if (_this.authService.userDetails.email.endsWith('monash.edu')) {
                _this.router.navigate(['allocation']);
            }
            else {
                _this.router.navigate(['login']);
            }
        });
    };
    LoginComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-login',
            template: __webpack_require__(/*! ./login.component.html */ "./src/app/login/login.component.html"),
            styles: [__webpack_require__(/*! ./login.component.css */ "./src/app/login/login.component.css")]
        }),
        __metadata("design:paramtypes", [_auth_service__WEBPACK_IMPORTED_MODULE_1__["AuthService"], _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"]])
    ], LoginComponent);
    return LoginComponent;
}());



/***/ }),

/***/ "./src/app/projects/allocation/allocation.component.css":
/*!**************************************************************!*\
  !*** ./src/app/projects/allocation/allocation.component.css ***!
  \**************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\nbutton {\n  position: absolute;\n  right: 1em;\n}\n\nmat-tab-group, mat-tab {\n  border-radius: 2px;\n  box-shadow: 0 3px 6px rgba(0,0,0,0.16), 0 3px 6px rgba(0,0,0,0.23);\n}\n\nbutton {\n  background-color: limegreen;\n  color: white;\n}\n\n"

/***/ }),

/***/ "./src/app/projects/allocation/allocation.component.html":
/*!***************************************************************!*\
  !*** ./src/app/projects/allocation/allocation.component.html ***!
  \***************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n<h1>Allocations</h1>\n\n<mat-tab-group>\n  <mat-tab label=\"Unallocated students\">\n\n    <mat-card>\n      <mat-card-content>\n        <mat-accordion [multi]=\"true\">\n          <mat-expansion-panel *ngFor=\"let student of unallocatedStudents; let unallocatedIndex = index;\">\n            <mat-expansion-panel-header>\n              <mat-panel-title>\n                <h3>{{student.username}}</h3>\n              </mat-panel-title>\n            </mat-expansion-panel-header>\n\n            <mat-list>\n              <mat-list-item *ngFor=\"let project of student.preferences\">\n                <h4>{{project.title}}</h4>\n                <button mat-raised-button (click)=\"allocate(student, project, unallocatedIndex)\">Allocate</button>\n              </mat-list-item>\n            </mat-list>\n\n          </mat-expansion-panel>\n        </mat-accordion>\n      </mat-card-content>\n    </mat-card>\n\n  </mat-tab>\n  <mat-tab label=\"Allocated students\">\n    <mat-card>\n      <mat-card-content>\n        <mat-accordion [multi]=\"true\">\n          <mat-expansion-panel *ngFor=\"let student of allocatedStudents; let allocatedIndex = index\">\n            <mat-expansion-panel-header>\n              <mat-panel-title>\n                <h3>{{student.username}}</h3>\n              </mat-panel-title>\n            </mat-expansion-panel-header>\n\n            <mat-list>\n              <mat-list-item>\n                <h4>{{student.allocatedProject.title}}</h4>\n                <button mat-raised-button color=\"warn\" (click)=\"remove(student, allocatedIndex)\">Remove</button>\n              </mat-list-item>\n            </mat-list>\n\n          </mat-expansion-panel>\n        </mat-accordion>\n      </mat-card-content>\n    </mat-card>\n  </mat-tab>\n</mat-tab-group>\n"

/***/ }),

/***/ "./src/app/projects/allocation/allocation.component.ts":
/*!*************************************************************!*\
  !*** ./src/app/projects/allocation/allocation.component.ts ***!
  \*************************************************************/
/*! exports provided: AllocationComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AllocationComponent", function() { return AllocationComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _students_student_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../students/student.service */ "./src/app/students/student.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var AllocationComponent = /** @class */ (function () {
    function AllocationComponent(studentService) {
        this.studentService = studentService;
        this.unallocatedPage = 1;
        this.allocatedPage = 1;
        this.allocatedStudents = [];
        this.unallocatedStudents = [];
    }
    AllocationComponent.prototype.ngOnInit = function () {
        this.getAllocatedStudents();
        this.getUnallocatedStudents();
    };
    AllocationComponent.prototype.allocate = function (student, project, index) {
        this.studentService.allocate(student, project);
        this.unallocatedStudents.splice(index, 1);
        this.allocatedStudents.push(student);
    };
    AllocationComponent.prototype.remove = function (student, index) {
        this.studentService.remove(student);
        this.allocatedStudents.splice(index, 1);
        this.unallocatedStudents.push(student);
    };
    AllocationComponent.prototype.getAllocatedStudents = function () {
        var _this = this;
        this.studentService.getAllocatedStudents().subscribe(function (students) { return _this.allocatedStudents = students; });
    };
    AllocationComponent.prototype.getUnallocatedStudents = function () {
        var _this = this;
        this.studentService.getUnallocatedStudents().subscribe(function (students) { return _this.unallocatedStudents = students; });
    };
    AllocationComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-allocation',
            template: __webpack_require__(/*! ./allocation.component.html */ "./src/app/projects/allocation/allocation.component.html"),
            styles: [__webpack_require__(/*! ./allocation.component.css */ "./src/app/projects/allocation/allocation.component.css")]
        }),
        __metadata("design:paramtypes", [_students_student_service__WEBPACK_IMPORTED_MODULE_1__["StudentService"]])
    ], AllocationComponent);
    return AllocationComponent;
}());



/***/ }),

/***/ "./src/app/projects/project-list/project-list.component.css":
/*!******************************************************************!*\
  !*** ./src/app/projects/project-list/project-list.component.css ***!
  \******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\nmat-form-field {\n  width: 100%;\n}\n\n.search-btn {\n  background-color: limegreen;\n  color: white;\n}\n\nbutton {\n  margin-right: 1rem;\n}\n\npagination-controls {\n  text-align: center;\n}\n\n.container {\n  display: flex;\n  width: 100%;\n}\n\nmat-card-title {\n  flex: 3;\n  width: 80%;\n}\n\nmat-card-subtitle {\n  flex: 1;\n  width: 20%;\n  position: relative;\n  top: 1rem;\n}\n"

/***/ }),

/***/ "./src/app/projects/project-list/project-list.component.html":
/*!*******************************************************************!*\
  !*** ./src/app/projects/project-list/project-list.component.html ***!
  \*******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n<mat-card class=\"search-card\">\n  <mat-card-header>\n    <div class=\"container\">\n      <mat-card-title>\n        <h1>Search and Filter</h1>\n      </mat-card-title>\n    </div>\n  </mat-card-header>\n  <mat-form-field>\n    <input matInput placeholder=\"Search by project title, any text in the body, supervisor name or field of study\" [(ngModel)]=\"term\">\n  </mat-form-field>\n  <mat-action-row>\n    <button class=\"search-btn\" mat-raised-button (click)=\"search()\">Search</button>\n    <button mat-raised-button color=\"primary\" (click)=\"getAll()\">List All</button>\n  </mat-action-row>\n</mat-card>\n\n<mat-card class=\"projects-card\">\n\n    <mat-card-header>\n      <div class=\"container\">\n        <mat-card-title>\n          <h1>List of Projects</h1>\n        </mat-card-title>\n        <mat-card-subtitle>\n          <mat-form-field>\n            <mat-select placeholder=\"Items per page\" [(ngModel)]=\"items\">\n              <mat-option value=\"1\">1</mat-option>\n              <mat-option value=\"5\">5</mat-option>\n              <mat-option value=\"10\">10</mat-option>\n              <mat-option value=\"20\">20</mat-option>\n              <mat-option value=\"50\">50</mat-option>\n            </mat-select>\n          </mat-form-field>\n        </mat-card-subtitle>\n      </div>\n    </mat-card-header>\n  <mat-card-content>\n    <mat-accordion [multi]=\"true\">\n      <mat-expansion-panel *ngFor=\"let project of projects | paginate: {itemsPerPage: items, currentPage: pageNumber}; let i = index\">\n        <mat-expansion-panel-header>\n          <mat-panel-title>\n            <h3>{{ project.title }}</h3>\n          </mat-panel-title>\n        </mat-expansion-panel-header>\n\n        <h4>Credit Points</h4>\n\n        <span *ngFor=\"let point of project.creditPoints; let i = index;\">\n          <span *ngIf=\"!(i == project.creditPoints.length - 1)\">{{ point }}, </span>\n          <span *ngIf=\"i == project.creditPoints.length - 1\">{{ point }}</span>\n        </span>\n\n        <h4>Description</h4>\n        <p>{{ project.description }}</p>\n\n        <h4>Aim and Outline</h4>\n        <p>{{ project.aimsAndOutlines }}</p>\n\n        <div *ngIf=\"project.urlsAndReferences.length > 0\">\n          <h4>URLs and References</h4>\n          <p *ngFor=\"let url of project.urlsAndReferences\">\n            {{ url }}\n          </p>\n        </div>\n\n        <h4>Pre- and Co-requisite Knowledge</h4>\n        <p>{{ project.preAndCoReqKnowledge }}</p>\n\n        <h4>Supervisors</h4>\n        <span *ngFor=\"let supervisor of project.supervisors; let i = index;\">\n          <span *ngIf=\"!(i == project.supervisors.length - 1)\">{{ supervisor.name }}, </span>\n          <span *ngIf=\"i == project.supervisors.length - 1\">{{ supervisor.name }}</span>\n        </span>\n\n        <mat-action-row>\n          <button *ngIf=\"project.inShortlist\" mat-raised-button color=\"warn\" (click)=\"remove(project)\">Remove from shortlist</button>\n          <button *ngIf=\"!project.inShortlist\" mat-raised-button color=\"accent\" (click)=\"select(project)\">Add to shortlist</button>\n        </mat-action-row>\n\n      </mat-expansion-panel>\n    </mat-accordion>\n  </mat-card-content>\n\n  <pagination-controls (pageChange)=\"pageNumber = $event\" [autoHide]=\"true\" previousLabel=\"\" nextLabel=\"\"></pagination-controls>\n</mat-card>\n\n"

/***/ }),

/***/ "./src/app/projects/project-list/project-list.component.ts":
/*!*****************************************************************!*\
  !*** ./src/app/projects/project-list/project-list.component.ts ***!
  \*****************************************************************/
/*! exports provided: ProjectListComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ProjectListComponent", function() { return ProjectListComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _project_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../project.service */ "./src/app/projects/project.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ProjectListComponent = /** @class */ (function () {
    function ProjectListComponent(projectService) {
        this.projectService = projectService;
        // Pagination page indicator
        this.pageNumber = 1;
        // Items displayed per page
        this.items = 5;
        this.projects = [];
        // Search term
        this.term = '';
    }
    ProjectListComponent.prototype.ngOnInit = function () {
        this.getAll();
    };
    ProjectListComponent.prototype.getAll = function () {
        var _this = this;
        this.projectService.getProjects().subscribe(function (projects) { return _this.projects = projects; });
    };
    ProjectListComponent.prototype.select = function (project) {
        this.projectService.addToShortlist(project);
        project.inShortlist = true;
    };
    ProjectListComponent.prototype.remove = function (project) {
        this.projectService.removeFromShortlist(project);
        project.inShortlist = false;
    };
    ProjectListComponent.prototype.search = function () {
        var searchResults = [];
        for (var _i = 0, _a = this.projects; _i < _a.length; _i++) {
            var project = _a[_i];
            if (project.title.toLowerCase().includes(this.term.toLowerCase())) {
                searchResults.push(project);
            }
            else if (project.description.toLowerCase().includes(this.term.toLowerCase())) {
                searchResults.push(project);
            }
            else if (project.aimsAndOutlines.toLowerCase().includes(this.term.toLowerCase())) {
                searchResults.push(project);
            }
            else if (project.preAndCoReqKnowledge.toLowerCase().includes(this.term.toLowerCase())) {
                searchResults.push(project);
            }
            else if (project.urlsAndReferences.toString().toLowerCase().includes(this.term.toLowerCase())) {
                searchResults.push(project);
            }
            else if (project.fieldsOfStudy.toString().toLowerCase().includes(this.term.toLowerCase())) {
                searchResults.push(project);
            }
            else if (JSON.stringify(project.supervisors).toLowerCase().includes(this.term.toLowerCase())) {
                searchResults.push(project);
            }
        }
        this.projects = searchResults;
        this.term = '';
    };
    ProjectListComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-project-list',
            template: __webpack_require__(/*! ./project-list.component.html */ "./src/app/projects/project-list/project-list.component.html"),
            styles: [__webpack_require__(/*! ./project-list.component.css */ "./src/app/projects/project-list/project-list.component.css")]
        }),
        __metadata("design:paramtypes", [_project_service__WEBPACK_IMPORTED_MODULE_1__["ProjectService"]])
    ], ProjectListComponent);
    return ProjectListComponent;
}());



/***/ }),

/***/ "./src/app/projects/project.model.ts":
/*!*******************************************!*\
  !*** ./src/app/projects/project.model.ts ***!
  \*******************************************/
/*! exports provided: Project */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Project", function() { return Project; });
var Project = /** @class */ (function () {
    function Project(title, description, aimsAndOutlines, preAndCoReqKnowledge, creditPoints, supervisors, urlsAndReferences, fieldsOfStudy) {
        this.title = '';
        this.description = '';
        this.aimsAndOutlines = '';
        this.preAndCoReqKnowledge = '';
        this.inShortlist = false;
        this.title = title;
        this.description = description;
        this.aimsAndOutlines = aimsAndOutlines;
        this.preAndCoReqKnowledge = preAndCoReqKnowledge;
        this.creditPoints = creditPoints;
        this.supervisors = supervisors;
        this.urlsAndReferences = urlsAndReferences;
        this.fieldsOfStudy = fieldsOfStudy;
    }
    return Project;
}());



/***/ }),

/***/ "./src/app/projects/project.service.ts":
/*!*********************************************!*\
  !*** ./src/app/projects/project.service.ts ***!
  \*********************************************/
/*! exports provided: ProjectService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ProjectService", function() { return ProjectService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _shared_mockdata__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./shared/mockdata */ "./src/app/projects/shared/mockdata.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var ProjectService = /** @class */ (function () {
    function ProjectService() {
        this.shortlist = [];
        this.projects = _shared_mockdata__WEBPACK_IMPORTED_MODULE_2__["projects"];
    }
    ProjectService.prototype.getProjects = function () {
        return Object(rxjs__WEBPACK_IMPORTED_MODULE_1__["of"])(this.projects);
    };
    ProjectService.prototype.addToShortlist = function (project) {
        if (!this.shortlist.includes(project)) {
            this.shortlist.push(project);
        }
    };
    ProjectService.prototype.removeFromShortlist = function (project) {
        for (var i = this.shortlist.length - 1; i >= 0; i--) {
            if (project.title === this.shortlist[i].title) {
                this.shortlist.splice(i, 1);
            }
        }
    };
    ProjectService.prototype.getShortlist = function () {
        return Object(rxjs__WEBPACK_IMPORTED_MODULE_1__["of"])(this.shortlist);
    };
    ProjectService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [])
    ], ProjectService);
    return ProjectService;
}());



/***/ }),

/***/ "./src/app/projects/shared/mockdata.ts":
/*!*********************************************!*\
  !*** ./src/app/projects/shared/mockdata.ts ***!
  \*********************************************/
/*! exports provided: supervisors, projects, students */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "supervisors", function() { return supervisors; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "projects", function() { return projects; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "students", function() { return students; });
/* harmony import */ var _supervisors_supervisor_model__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ../../supervisors/supervisor.model */ "./src/app/supervisors/supervisor.model.ts");
/* harmony import */ var _students_student_model__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../students/student.model */ "./src/app/students/student.model.ts");
/* harmony import */ var _project_model__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../project.model */ "./src/app/projects/project.model.ts");



var supervisors = [
    new _supervisors_supervisor_model__WEBPACK_IMPORTED_MODULE_0__["Supervisor"]('td2345', 'Tom Denison'),
    new _supervisors_supervisor_model__WEBPACK_IMPORTED_MODULE_0__["Supervisor"]('go1234', 'Gillian Oliver'),
    new _supervisors_supervisor_model__WEBPACK_IMPORTED_MODULE_0__["Supervisor"]('plb123', 'Pierre Le Bodic'),
    new _supervisors_supervisor_model__WEBPACK_IMPORTED_MODULE_0__["Supervisor"]('dh4356', 'Daniel Harabor'),
    new _supervisors_supervisor_model__WEBPACK_IMPORTED_MODULE_0__["Supervisor"]('je2343', 'Joanne Evans'),
    new _supervisors_supervisor_model__WEBPACK_IMPORTED_MODULE_0__["Supervisor"]('gr4567', 'Greg Rolan')
];
var projects = [
    new _project_model__WEBPACK_IMPORTED_MODULE_2__["Project"]('Digital repositories for Art Archives', 'How can a living archive be created that not only documents the Monash University Prato Centre (MUPC) Visual Residency Program but also engages artists-in-residence in a direct and active way as part of their residency experience in Prato? In collaboration with Monash University Museum of Art and Monash University Prato Centre, this project aims to help realise the creative possibilities inherent in cross-fertilizing artistic processes with archival theory. It will establish a prototype archival platform that complements contemporary art practices and supports the ability to record, relate and re-vision ephemera and events associated with transformative, creative experience as artefacts themselves.', 'To develop a prototype digital repository suitable for use by artists participating in the Monash University Prato Artists in Residence Program.', 'Familiarity with digital repositories and/or open source software and/or archival principles.', [18, 24], [supervisors[0], supervisors[1]], [], ['Digital Repositories', 'Open Source']),
    new _project_model__WEBPACK_IMPORTED_MODULE_2__["Project"]('Approximation algorithms in the Branch-and-Bound algorithm', 'The Branch-and-Bound algorithm solves optimisation problems by recursively dividing and exploring the space of solutions, using bounds computed on each of them to prune entire subspaces of solutions. The bounds are often computed using a linear program, and the efficiency of the whole procedure depends on the quality of these bounds and the efficiency with which they can be computed.', 'In this project you will analyse theoretically and experimentally the benefits of using approximation algorithms (i.e. heuristics with a performance guarantee) to compute the bound, compared to a bound computed using linear programming.', 'A strong background in computational complexity is necessary. Knowledge of integer programming is a plus.', [18, 24], [supervisors[2]], ['https://en.wikipedia.org/wiki/Branch_and_bound',
        'https://en.wikipedia.org/wiki/Approximation_algorithm',
        'http://dx.doi.org/10.1007/978-3-319-11008-0',
        'https://www.cc.gatech.edu/fac/Vijay.Vazirani/book.pdf',
        'http://www.designofapproxalgs.com/book.pdf'], ['Algorithms', 'Integer Programming']),
    new _project_model__WEBPACK_IMPORTED_MODULE_2__["Project"]('Automated Warehouse Optimisation', 'Warehouses are becoming increasingly automated and optimised. A great example is Amazon fulfilment centres (see https://www.youtube.com/watch?v=tMpsMt7ETi8 ). Many computer science problems, ranging from pathfinding to scheduling and facility layout, need to be solved to design efficient warehouses and their systems. These individual problems are not all well formalised and solved yet, and contributions in these directions are bound to have a high scientific and societal impact.', 'The aim of this project is to formalise one of the problems related to warehouse automation, design methods to solve the problem, and run experiments to assess their performance.', 'Strong general background in CS, both in theory and practice, and interest in pathfinding and/or optimisation.', [18, 24], [supervisors[3], supervisors[2]], ['The videos https://www.youtube.com/watch?v=YSrnV0wZywU and https://www.youtube.com/watch?v=lT4X3cuIHK8 provide further background.'], []),
    new _project_model__WEBPACK_IMPORTED_MODULE_2__["Project"]('A Child Protection Recordkeeping App for Parents and Family Members', "Within the faculty\u2019s Centre for Organisational and Community Informatics, the Archives and the Rights of the Child Research Program is investigating ways to re-imagine recordkeeping systems in support of responsive and accountable child-centred and family focused out-of-home care. Progressive child protection practice recognises the need, where possible, to support and strengthen parental engagement in the system in order to ensure the best interests of the child.\n    '\u2018No single strategy is of itself effective in protecting children. However, the most important factor contributing to success is the quality of the relationship between the child\u2019s family and the responsible professional\u2019 (Dartington, 1995 quoted in Qld Department of Communities, Child Safety and Disability Services 2013).\n    'Child protection and court processes generate a mountain of documentation that can be overwhelming and confusing to navigate, hard to manage and keep track of, especially if parents are also dealing with health and behavioural issues. Being on top of the paperwork handed out by workers, providing the documentation the system demands in a timely fashion and ensuring that records are created to document interactions, etc. could be one way in which child protection outcomes could be improved.", 'In this exploratory project, we would like to investigate how digital and networked information technologies could be used to support the recordkeeping needs of parents in child protection cases. It will involve the use of a design science approach to develop a model the information architecture of a recordkeeping system for parents. This may entail the creation of a prototype utilising existing and/or new open source components as a demonstrator for further research and development.\n' +
        '\n' +
        'Challenges include investigating and dealing with the digital, recordkeeping, and other literacies of families involved in child protection.  The other challenge is that there will not be time to form the deep, trusted relationships that are required to do this in a truly participatory manner.  The project will rely on secondary sources such as literature and subject matter experts --- rather than interacting with parents and families directly.', 'The ideal candidate will have a background in one or more of software development, data analytics, and recordkeeping metadata modelling, with a keen desire to expand their knowledge and skills into the other areas encompassed by this research project. They will have.\n' +
        '\n' +
        'This is not so much a technical projects as one that engages with the societal and community needs of the target audience. It would suit someone from an MBIS background with an interest in community informatics, recordkeeping metadata modelling and/or value sensitive research and design, coupled with a keen desire to expand their existing knowledge and skills into the other areas encompassed but this research project.', [24], [supervisors[4], supervisors[5]], ['Assistant Director Child Protection. (2017). Child Protection Manual. Retrieved February 8, 2018, from http://www.cpmanual.vic.gov.au/',
        'Burstein, F. (2002). System development in information systems research. In K. Williamson (Ed.), Research Methods for Students and Professionals: Information Management and Systems (pp. 147–158). Wagga Wagga, N.S.W.: Centre for Information Studies, Charles Sturt University.\n',
        'Gurstein, M. (2003). Effective use: A community informatics strategy beyond the Digital Divide. First Monday, 8(12). Retrieved from http://firstmonday.org/ojs/index.php/fm/article/view/1107',
        'Hinton, T. (2013). Parents in the child protection system. Social Action and Research Centre, Anglicare Tasmania. Retrieved from https://www.socialactionresearchcentre.org.au/wp-content/uploads/Parents-in-the-child-protection-system.pdf\n',
        'Hersberger, J. A. (2013). Are the economically poor information poor? Does the digital divide affect the homeless and access to information? Presented at the Proceedings of the Annual Conference of CAIS/Actes du congrès annuel de l’ACSI.',
        'Western Suburbs Legal Service. (2008). Child protection : a guide for parents and family members. Newport, Vic.: Western Suburbs Legal Service.'], [])
];
var students = [
    new _students_student_model__WEBPACK_IMPORTED_MODULE_1__["Student"]('27738965', 'mmah65', [projects[0], projects[1]]),
    new _students_student_model__WEBPACK_IMPORTED_MODULE_1__["Student"]('24376122', 'lyon23', [projects[1], projects[2]]),
    new _students_student_model__WEBPACK_IMPORTED_MODULE_1__["Student"]('12315451', 'jlim43', [projects[2], projects[3]])
];


/***/ }),

/***/ "./src/app/projects/short-list/short-list.component.css":
/*!**************************************************************!*\
  !*** ./src/app/projects/short-list/short-list.component.css ***!
  \**************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\nh1 {\n  text-align: center;\n  margin-top: 2rem;\n}\n\nmat-list-item:hover {\n  background-color: lightgray;\n}\n\nmat-list-item {\n  width: 100%;\n}\n\nbutton {\n  position: absolute;\n  right: 1rem;\n}\n\n.badge {\n  display: inline-block;\n  font-size: medium;\n  color: black;\n  padding: 0.8em 0.7em 0 0.7em;\n  background-color: #ffcc00;\n  line-height: 1em;\n  position: relative;\n  left: -1px;\n  top: 2px;\n  height: 1.8em;\n  margin-right: .8em;\n  border-radius: 4px 0 0 4px;\n}\n\ndiv {\n  display: flex;\n}\n"

/***/ }),

/***/ "./src/app/projects/short-list/short-list.component.html":
/*!***************************************************************!*\
  !*** ./src/app/projects/short-list/short-list.component.html ***!
  \***************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n<h1 *ngIf=\"shortlist.length === 0\">No items in shortlist yet</h1>\n\n<mat-card *ngIf=\"shortlist.length > 0\">\n  <mat-card-header>\n    <mat-card-title><h2>Edit Ranking of Preferences (Drag and Drop)</h2></mat-card-title>\n  </mat-card-header>\n  <mat-card-content>\n    <mat-list role=\"list\" [sortablejs]=\"shortlist\">\n      <div *ngFor=\"let item of shortlist; let i = index;\">\n        <span class=\"badge\">{{ i+1 }}</span>\n        <mat-list-item role=\"listitem\" >\n          <span class=\"list-item-text\">{{ item.title }}</span>\n          <button mat-raised-button color=\"warn\" (click)=\"remove(item)\">Remove</button>\n        </mat-list-item>\n      </div>\n    </mat-list>\n  </mat-card-content>\n</mat-card>\n"

/***/ }),

/***/ "./src/app/projects/short-list/short-list.component.ts":
/*!*************************************************************!*\
  !*** ./src/app/projects/short-list/short-list.component.ts ***!
  \*************************************************************/
/*! exports provided: ShortListComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ShortListComponent", function() { return ShortListComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _project_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../project.service */ "./src/app/projects/project.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ShortListComponent = /** @class */ (function () {
    function ShortListComponent(projectService) {
        this.projectService = projectService;
    }
    ShortListComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.projectService.getShortlist().subscribe(function (shortlist) { return _this.shortlist = shortlist; });
    };
    ShortListComponent.prototype.remove = function (project) {
        this.projectService.removeFromShortlist(project);
        project.inShortlist = false;
    };
    ShortListComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-short-list',
            template: __webpack_require__(/*! ./short-list.component.html */ "./src/app/projects/short-list/short-list.component.html"),
            styles: [__webpack_require__(/*! ./short-list.component.css */ "./src/app/projects/short-list/short-list.component.css")]
        }),
        __metadata("design:paramtypes", [_project_service__WEBPACK_IMPORTED_MODULE_1__["ProjectService"]])
    ], ShortListComponent);
    return ShortListComponent;
}());



/***/ }),

/***/ "./src/app/students/student.model.ts":
/*!*******************************************!*\
  !*** ./src/app/students/student.model.ts ***!
  \*******************************************/
/*! exports provided: Student */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Student", function() { return Student; });
var Student = /** @class */ (function () {
    function Student(id, username, preferences) {
        this.id = '';
        this.username = '';
        this.preferences = [];
        this.allocatedProject = null;
        this.id = id;
        this.username = username;
        this.preferences = preferences;
    }
    return Student;
}());



/***/ }),

/***/ "./src/app/students/student.service.ts":
/*!*********************************************!*\
  !*** ./src/app/students/student.service.ts ***!
  \*********************************************/
/*! exports provided: StudentService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "StudentService", function() { return StudentService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _projects_shared_mockdata__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../projects/shared/mockdata */ "./src/app/projects/shared/mockdata.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var StudentService = /** @class */ (function () {
    function StudentService() {
    }
    StudentService.prototype.getStudents = function () {
        return Object(rxjs__WEBPACK_IMPORTED_MODULE_1__["of"])(_projects_shared_mockdata__WEBPACK_IMPORTED_MODULE_2__["students"]);
    };
    StudentService.prototype.allocate = function (student, project) {
        if (student.preferences.includes(project)) {
            student.allocatedProject = project;
        }
    };
    StudentService.prototype.remove = function (student) {
        student.allocatedProject = null;
    };
    StudentService.prototype.getAllocatedStudents = function () {
        return Object(rxjs__WEBPACK_IMPORTED_MODULE_1__["of"])(_projects_shared_mockdata__WEBPACK_IMPORTED_MODULE_2__["students"].filter(function (student) { return student.allocatedProject !== null; }));
    };
    StudentService.prototype.getUnallocatedStudents = function () {
        return Object(rxjs__WEBPACK_IMPORTED_MODULE_1__["of"])(_projects_shared_mockdata__WEBPACK_IMPORTED_MODULE_2__["students"].filter(function (student) { return student.allocatedProject === null; }));
    };
    StudentService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [])
    ], StudentService);
    return StudentService;
}());



/***/ }),

/***/ "./src/app/supervisors/supervisor.model.ts":
/*!*************************************************!*\
  !*** ./src/app/supervisors/supervisor.model.ts ***!
  \*************************************************/
/*! exports provided: Supervisor */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Supervisor", function() { return Supervisor; });
var Supervisor = /** @class */ (function () {
    function Supervisor(id, name) {
        this.id = '';
        this.name = '';
        this.id = id;
        this.name = name;
    }
    return Supervisor;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build ---prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
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


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! /Users/musamahmud/Desktop/inception/src/main/frontend-allocation/src/main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map