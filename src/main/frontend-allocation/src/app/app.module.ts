import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './header/header.component';

import {NgxPaginationModule} from 'ngx-pagination';

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

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ProjectListComponent,
    ShortListComponent,
    AllocationComponent
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
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
