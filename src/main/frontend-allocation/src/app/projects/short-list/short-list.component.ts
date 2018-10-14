import { Component, OnInit } from '@angular/core';
import {Project} from '../project.model';
import {ProjectService} from '../project.service';

@Component({
  selector: 'app-short-list',
  templateUrl: './short-list.component.html',
  styleUrls: ['./short-list.component.css']
})
export class ShortListComponent implements OnInit {
  shortlist: Project[];

  constructor(public projectService: ProjectService) { }

  ngOnInit() {
    this.projectService.getShortlist().subscribe(shortlist => this.shortlist = shortlist);
  }

  remove(project: Project) {
    this.projectService.removeFromShortlist(project);
    project.inShortlist = false;
  }

}
