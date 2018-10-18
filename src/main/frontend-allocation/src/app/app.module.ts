import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './header/header.component';

import {NgxPaginationModule} from 'ngx-pagination';

import { environment } from "../environments/environment";
import { AngularFireModule } from 'angularfire2';
import { AngularFireDatabaseModule } from 'angularfire2/database';
import { AngularFireAuthModule } from 'angularfire2/auth';

import {
  MatToolbarModule,
  MatExpansionModule,
  MatButtonModule,
  MatListModule,
  MatCardModule,
  MatInputModule,
  MatFormFieldModule,
  MatTabsModule,
  MatSelectModule
} from '@angular/material';
import { ProjectListComponent } from './projects/project-list/project-list.component';
import { ShortListComponent } from './projects/short-list/short-list.component';
import {AppRoutingModule} from './app-routing.module';
import {SortablejsModule} from 'angular-sortablejs';
import { AllocationComponent } from './projects/allocation/allocation.component';
import {FormsModule} from '@angular/forms';
import {AuthService} from "./auth.service";
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ProjectListComponent,
    ShortListComponent,
    AllocationComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    MatToolbarModule,
    MatExpansionModule,
    MatButtonModule,
    MatListModule,
    MatCardModule,
    MatFormFieldModule,
    MatInputModule,
    MatTabsModule,
    MatSelectModule,
    SortablejsModule.forRoot({animation: 150}),
    NgxPaginationModule,
    FormsModule,
    AngularFireModule.initializeApp(environment.firebase, 'angular-auth-firebase'),
    AngularFireDatabaseModule,
    AngularFireAuthModule
  ],
  providers: [AuthService],
  bootstrap: [AppComponent]
})
export class AppModule { }
