import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseService } from '../../services/course.service';
import { Course } from '../../models/course';

// Component with data binding, *ngFor, *ngIf and event binding.
@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule],
  template: `
    <h2>Courses</h2>
    <ul>
      <li *ngFor="let course of courses">
        {{ course.title }} ({{ course.credits }} credits)
        <span *ngIf="course.enrolled"> - Enrolled</span>
        <button (click)="toggle(course.id)">
          {{ course.enrolled ? 'Unenroll' : 'Enroll' }}
        </button>
      </li>
    </ul>
    <p>Total enrolled: {{ enrolledCount }}</p>
  `,
})
export class CourseListComponent {
  courses: Course[];

  constructor(private courseService: CourseService) {
    this.courses = this.courseService.getCourses();
  }

  toggle(id: number): void {
    this.courseService.toggleEnroll(id);
  }

  get enrolledCount(): number {
    return this.courses.filter((c) => c.enrolled).length;
  }
}
