class Date {
    int day;
    int month;
    int year;

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

class Teacher {
    String firstName;
    String lastName;
    Date birthday;
    Date hireDate;

    public Teacher(String fName, String lName, Date bDay, Date hDate) {
        firstName = fName;
        lastName = lName;
        birthday = bDay;
        hireDate = hDate;
    }

    public String toString() {
        return "Teacher Name: " + firstName + " " + lastName + "\n" +
               "Birthday: " + birthday + "\n" +
               "Hire Date: " + hireDate;
    }
}

public class ClassTeacher {
    public static void main(String[] args) {
        Date teacherBday = new Date(15, 8, 1985);
        Date teacherHireDate = new Date(1, 6, 2010);
       
        Teacher myTeacher = new Teacher("Maria", "Santos", teacherBday, teacherHireDate);

        System.out.println(myTeacher);
    }
}