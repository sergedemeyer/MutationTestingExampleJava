package CoursesTutorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

public class CourseTest {
    @Test
    public void ConstructorTest() {
        Course course = new Course(10, "SENG");
        assertEquals("SENG", course.getCourseName());
        assertEquals(10, course.getMAX_STUDENTS());
    }

    @Test
    public void AddStudent() {
        Course course = new Course(1, "SENG");
        LocalDate dt = LocalDate.parse("2001-01-01");
        assertTrue(course.addStudent(new Student("Nurcan", "Kurt", dt)));
    }

    @Test
    public void NotAddStudent() {
        Course course = new Course(1, "SENG");
        course.addStudent(new Student("Sema", "Altinisik", LocalDate.parse("2001-01-01")));
        assertFalse(course.addStudent(new Student("Nurcan", "Kurt", LocalDate.parse("2001-01-01"))));
    }

    @Test
    public void SetMaxTest() {
        Course course = new Course(10, "SENG");
        course.setMAX_STUDENTS(15);
        assertEquals(15, course.getMAX_STUDENTS());

    }

    @Test
    public void SetMaxTestZero() {
        Course course = new Course(10, "SENG");
        assertThrows(IllegalArgumentException.class, () -> course.setMAX_STUDENTS(0));

    }

    @Test
    public void studentsInCourseTest() {
        Course course = new Course(4, "SENG303");
        course.addStudent(new Student("Sema", "Altinisik", LocalDate.parse("2001-01-01")));
        course.addStudent(new Student("Nurcan", "Kurt", LocalDate.parse("2001-01-01")));
        course.addStudent(new Student("sena", "demir", LocalDate.parse("2000-02-02")));
        assertEquals(3, course.studentsInCourse());
    }

    @Test
    public void SetMaxIllegalExceptionTest() {
        Course course = new Course(10, "SENG");
        assertThrows(IllegalArgumentException.class, () -> course.setMAX_STUDENTS(-20));

    }

    @Test
    public void StudentCopyTest() {
        Student student1 = new Student("can", "berk", LocalDate.parse("2000-01-01"));
        Student student2 = new Student("sena", "demir", LocalDate.parse("2000-02-02"));

        Course course = new Course(2, "SENG303");
        course.addStudent(student1);
        course.addStudent(student2);
        List<Student> copyList = course.getStudentsCopy();
        assertTrue(copyList.contains(student1));
        assertTrue(copyList.contains(student2));
        //   assertThat(copyList, hasItems(new Student("can", "berk", LocalDate.parse("2000-01-01")), new Student("sena", "demir", LocalDate.parse("2000-02-02"))));
    }

    @Test
    public void CourseCopyTest() {
        Student student1 = new Student("can", "berk", LocalDate.parse("2000-01-01"));
        Student student2 = new Student("sena", "demir", LocalDate.parse("2000-02-02"));

        Course course = new Course(2, "SENG303");
        course.addStudent(student1);
        course.addStudent(student2);
        Course copied = course.copyOf();
        assertEquals("SENG303", copied.getCourseName());
        assertEquals(2, copied.getMAX_STUDENTS());
        assertTrue(copied.getStudents().contains(student1));
        assertTrue(copied.getStudents().contains(student2));
        //    assertThat(copied.getStudents(), hasItems(new Student("can", "berk", LocalDate.parse("2000-01-01")), new Student("sena", "demir", LocalDate.parse("2000-02-02"))));
    }


}