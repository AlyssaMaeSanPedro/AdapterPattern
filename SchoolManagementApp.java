public class SchoolManagementApp {

    public static void main(String[] args){

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        ManageSystem attendance = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem  gradingSystem  = new GradingSystem();
        ManageSystem grading = new GradingSystemAdapter(gradingSystem);

        LibrarySystem  librarySystem = new LibrarySystem();
        ManageSystem library = new LibrarySystemAdapter(librarySystem);

        System.out.println(attendance.integrateSystem());
        System.out.println(grading.integrateSystem());
        System.out.println(library.integrateSystem());

        System.out.println();

    }
}