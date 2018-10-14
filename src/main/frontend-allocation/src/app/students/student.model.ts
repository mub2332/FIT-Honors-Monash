import {Project} from '../projects/project.model';

export class Student {
  id = '';
  username = '';
  preferences: Project[] = [];
  allocatedProject: Project = null;

  constructor(id: string, username: string, preferences: Project[]) {
    this.id = id;
    this.username = username;
    this.preferences = preferences;
  }
}
