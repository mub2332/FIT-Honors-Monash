import { Injectable } from '@angular/core';
import {Project} from './project.model';
import {Observable, of} from 'rxjs';

import {projects} from './shared/mockdata';

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  shortlist: Project[] = [];

  constructor() { }

  getProjects(): Observable<Project[]> {
    return of(projects);
  }

  addToShortlist(project: Project) {
    if (!this.shortlist.includes(project)) {
      this.shortlist.push(project);
    }
  }

  removeFromShortlist(project: Project) {
    for (let i = this.shortlist.length - 1; i >= 0; i--) {
      if (project.title === this.shortlist[i].title) {
        this.shortlist.splice(i, 1);
      }
    }
  }

  getShortlist(): Observable<Project[]> {
    return of(this.shortlist);
  }

}
