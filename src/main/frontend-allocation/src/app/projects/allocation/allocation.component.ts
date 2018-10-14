import { Component, OnInit } from '@angular/core';
import {Student} from '../../students/student.model';
import {StudentService} from '../../students/student.service';
import {Project} from '../project.model';

@Component({
  selector: 'app-allocation',
  templateUrl: './allocation.component.html',
  styleUrls: ['./allocation.component.css']
})
export class AllocationComponent implements OnInit {
  unallocatedPage = 1;
  allocatedPage = 1;

  allocatedStudents: Student[] = [];
  unallocatedStudents: Student[] = [];

  constructor(public studentService: StudentService) { }

  ngOnInit() {
    this.getAllocatedStudents();
    this.getUnallocatedStudents();
  }

  allocate(student: Student, project: Project, index: number) {
    this.studentService.allocate(student, project);
    this.unallocatedStudents.splice(index, 1);
    this.allocatedStudents.push(student);
  }

  remove(student: Student, index: number) {
    this.studentService.remove(student);
    this.allocatedStudents.splice(index, 1);
    this.unallocatedStudents.push(student);
  }

  getAllocatedStudents() {
    this.studentService.getAllocatedStudents().subscribe(students => this.allocatedStudents = students);
  }

  getUnallocatedStudents() {
    this.studentService.getUnallocatedStudents().subscribe(students => this.unallocatedStudents = students);
  }


}
