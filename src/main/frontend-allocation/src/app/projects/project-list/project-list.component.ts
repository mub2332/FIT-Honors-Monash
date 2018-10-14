import { Component, OnInit } from '@angular/core';
import {ProjectService} from '../project.service';
import {Project} from '../project.model';

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.css']
})
export class ProjectListComponent implements OnInit {
  // Pagination page indicator
  pageNumber = 1;
  // Items displayed per page
  items = 5;

  projects: Project[] = [];
  // Search term
  term = '';

  constructor(public projectService: ProjectService) { }

  ngOnInit() {
    this.getAll();
  }

  getAll() {
    this.projectService.getProjects().subscribe(projects => this.projects = projects);
  }

  select(project: Project) {
    this.projectService.addToShortlist(project);
    project.inShortlist = true;
  }

  remove(project: Project) {
    this.projectService.removeFromShortlist(project);
    project.inShortlist = false;
  }

  search() {
    let searchResults: Project[] = [];

    for (let project of this.projects) {
      if (project.title.toLowerCase().includes(this.term.toLowerCase())) {
        searchResults.push(project);
      } else if (project.description.toLowerCase().includes(this.term.toLowerCase())) {
        searchResults.push(project);
      } else if (project.aimsAndOutlines.toLowerCase().includes(this.term.toLowerCase())) {
        searchResults.push(project);
      } else if (project.preAndCoReqKnowledge.toLowerCase().includes(this.term.toLowerCase())) {
        searchResults.push(project);
      } else if (project.urlsAndReferences.toString().toLowerCase().includes(this.term.toLowerCase())) {
        searchResults.push(project);
      } else if (project.fieldsOfStudy.toString().toLowerCase().includes(this.term.toLowerCase())) {
        searchResults.push(project);
      } else if (JSON.stringify(project.supervisors).toLowerCase().includes(this.term.toLowerCase())) {
        searchResults.push(project);
      }

    }

    this.projects = searchResults;
    this.term = '';
  }

}
