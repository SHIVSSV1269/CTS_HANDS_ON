import { Component } from '@angular/core';
import { CourseListComponent } from './components/course-list/course-list.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CourseListComponent],
  template: `
    <h1>Student Course Portal</h1>
    <app-course-list></app-course-list>
  `,
})
export class AppComponent {
  title = 'student-course-portal';
}
