import {Project} from '../projects/project.model';

export class Supervisor {
  id = '';
  name = '';
  projectsSupervising: Project[];

  constructor(id: string, name: string) {
    this.id = id;
    this.name = name;
  }
}
