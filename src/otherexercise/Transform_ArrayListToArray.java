package otherexercise;

import java.util.ArrayList;

public class Transform_ArrayListToArray {

    ArrayList<String> teacher = new ArrayList<>();

    void transform(){

        teacher.add("Nguyen Dinh Thao");
        teacher.add("Ho Phan Thai Nhan");
        teacher.add("Phan Quoc Huy");

        System.out.println("The origin ArrayList is: \n"+teacher);
        String[] arrteacher = new String[teacher.size()];
        teacher.toArray(arrteacher);
        System.out.println("The new teacher array from ArrayList is: ");

        for(String i:arrteacher){
            System.out.println("Teacher: "+i);
        }
    }
}
