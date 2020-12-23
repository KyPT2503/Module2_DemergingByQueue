public class Staff implements Comparable<Staff> {
    private String name;
    private String gender;
    private Birthday birthday;

    public Staff(String name, String gender, Birthday birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getGender(){
        return this.gender;
    }

    @Override
    public int compareTo(Staff o) {
        if(this.birthday.getYear()!=o.birthday.getYear()){
            if(this.birthday.getYear()>o.birthday.getYear()) return -1;
            if(this.birthday.getYear()<o.birthday.getYear()) return 1;
        }
        if(this.birthday.getMonth()!=o.birthday.getMonth()){
            if(this.birthday.getMonth()>o.birthday.getMonth()) return -1;
            if(this.birthday.getMonth()<o.birthday.getMonth()) return 1;
        }
        if(this.birthday.getDay()!=o.birthday.getDay()){
            if(this.birthday.getDay()>o.birthday.getDay()) return -1;
            if(this.birthday.getDay()<o.birthday.getDay()) return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}'+"\n";
    }
}
