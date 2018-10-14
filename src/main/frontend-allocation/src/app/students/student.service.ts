import { Injectable } from '@angular/core';
import {Observable, of} from 'rxjs';
import {Student} from './student.model';
import {Project} from '../projects/project.model';
import {students} from '../projects/shared/mockdata';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor() { }

  getStudents(): Observable<Student[]> {
    return of(students);
  }

  allocate(student: Student, project: Project) {
    if (student.preferences.includes(project)) {
      student.allocatedProject = project;
    }
  }

  remove(student: Student) {
    student.allocatedProject = null;
  }

  getAllocatedStudents(): Observable<Student[]> {
    return of(students.filter(student => student.allocatedProject !== null));
  }

  getUnallocatedStudents(): Observable<Student[]> {
    return of(students.filter(student => student.allocatedProject === null));
  }
}
