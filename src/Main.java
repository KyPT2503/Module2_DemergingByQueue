import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Staff[] staffs = new Staff[4];
        staffs[0] = new Staff("Ryu", "Male", new Birthday(25, 3, 1999));
        staffs[1] = new Staff("James", "Male", new Birthday(10, 12, 1991));
        staffs[2] = new Staff("Gens", "Female", new Birthday(18, 12, 1999));
        staffs[3] = new Staff("Marry", "Female", new Birthday(25, 3, 1999));
        System.out.println(Arrays.toString(staffs));
        Arrays.sort(staffs);
        System.out.println(Arrays.toString(staffs));

        /**/
        ArrayDeque<Staff> maleStaffs = new ArrayDeque<>();
        ArrayDeque<Staff> femaleStaffs = new ArrayDeque<>();
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i].getGender() == "Male") {
                maleStaffs.addFirst(staffs[i]);
            } else {
                femaleStaffs.addFirst(staffs[i]);
            }
        }
        for (int i = 0; i < staffs.length; i++) {
            if(!maleStaffs.isEmpty()){
                staffs[i]=maleStaffs.removeLast();
                continue;
            }
            staffs[i]=femaleStaffs.removeLast();
        }
        System.out.println(Arrays.toString(staffs));
    }
}
