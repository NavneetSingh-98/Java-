package ClassAndObjects.Challenges;

 class Course {

     static int maxCapacity = 100;

    String courseName;
    int  enrollments;

    Course(String courseName){
      this.courseName = courseName;
      this.enrollments=0;
      this.enrolledStudents = new String[maxCapacity];
    }

    String[] enrolledStudents;

  static void setMaxCapicity(int maxCapacity){
    Course.maxCapacity = maxCapacity;

  }
  void enrollStudent(String studentName){
    enrolledStudents[enrollments] = studentName;
  }
  void unEnrolledStudents(String studentName){
    System.out.println("Students removed ");
    enrollments--;
  }
}
