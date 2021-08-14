package advancedbasic;

import java.util.Scanner;

public class Manage {

    void manage(){

        System.out.println("---------- Student_0 ----------");
        Students stu0 = new Students(99999, "Nguyen Toan", 9.5F, 10);
        stu0.toString();

        System.out.println("---------- Student_1 ----------");
        Students stu1 = new Students();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student_1 ID: ");
        stu1.setStudentID(sc.nextInt());sc.nextLine();
        System.out.print("Input student_1 full name: ");
        stu1.setFullName(sc.nextLine());
        System.out.print("Input student_1 theory point: ");
        stu1.setTheoryPoint(sc.nextFloat());
        System.out.print("Input student_1 practice point: ");
        stu1.setPracticePoint(sc.nextFloat());

        System.out.println("---------- Student_2 ----------");
        Students stu2 = new Students();
        System.out.print("Input student_2 ID: ");
        stu2.setStudentID(sc.nextInt());sc.nextLine();
        System.out.print("Input student_2 full name: ");
        stu2.setFullName(sc.nextLine());
        System.out.print("Input student_2 theory point: ");
        stu2.setTheoryPoint(sc.nextFloat());
        System.out.print("Input student_2 practice point: ");
        stu2.setPracticePoint(sc.nextFloat());
        System.out.println();

        System.out.println("---------- Student_3 ----------");
        Students stu3 = new Students();
        System.out.print("Input student_3 ID: ");
        stu3.setStudentID(sc.nextInt());sc.nextLine();
        System.out.print("Input student_3 full name: ");
        stu3.setFullName(sc.nextLine());
        System.out.print("Input student_3 theory point: ");
        stu3.setTheoryPoint(sc.nextFloat());
        System.out.print("Input student_3 practice point: ");
        stu3.setPracticePoint(sc.nextFloat());
        System.out.println();

        // Print students list.
        System.out.printf("%1s  %10s %20s %10s %10s \n","Student ID"," Full Name",
                "Theory Point","Practice Point","Average Point");
        stu1.displayStu();
        stu2.displayStu();
        stu3.displayStu();
    }
}
