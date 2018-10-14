import {Supervisor} from '../supervisors/supervisor.model';
import {Student} from '../students/student.model';

export class Project {
  title = '';
  description = '';
  aimsAndOutlines = '';
  preAndCoReqKnowledge = '';

  creditPoints: number[];

  supervisors: Supervisor[];

  urlsAndReferences: string[];
  fieldsOfStudy: string[];

  inShortlist = false;

  preferredByStudents: Student[];
  allocatedStudent: Student;

  constructor(title: string,
              description: string,
              aimsAndOutlines: string,
              preAndCoReqKnowledge: string,
              creditPoints: number[],
              supervisors: Supervisor[],
              urlsAndReferences: string[],
              fieldsOfStudy: string[]) {

    this.title = title;
    this.description = description;
    this.aimsAndOutlines = aimsAndOutlines;
    this.preAndCoReqKnowledge = preAndCoReqKnowledge;
    this.creditPoints = creditPoints;
    this.supervisors = supervisors;
    this.urlsAndReferences = urlsAndReferences;
    this.fieldsOfStudy = fieldsOfStudy;
  }
}
