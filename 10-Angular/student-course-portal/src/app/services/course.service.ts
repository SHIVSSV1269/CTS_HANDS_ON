import { Injectable } from '@angular/core';
import { Course } from '../models/course';

// Service (dependency injection) that supplies course data.
@Injectable({ providedIn: 'root' })
export class CourseService {
  private courses: Course[] = [
    { id: 1, title: 'Angular Fundamentals', credits: 4, enrolled: false },
    { id: 2, title: 'Java Full Stack', credits: 5, enrolled: true },
    { id: 3, title: 'Data Structures', credits: 3, enrolled: false },
  ];

  getCourses(): Course[] {
    return this.courses;
  }

  toggleEnroll(id: number): void {
    const course = this.courses.find((c) => c.id === id);
    if (course) course.enrolled = !course.enrolled;
  }
}
