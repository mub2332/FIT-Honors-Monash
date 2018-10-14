import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ProjectListComponent} from './projects/project-list/project-list.component';
import {ShortListComponent} from './projects/short-list/short-list.component';
import {AllocationComponent} from './projects/allocation/allocation.component';

const routes: Routes = [
  { path: '', redirectTo: '/projects', pathMatch: 'full'},
  { path: 'projects', component: ProjectListComponent},
  { path: 'shortlist', component: ShortListComponent},
  { path: 'allocation', component: AllocationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
