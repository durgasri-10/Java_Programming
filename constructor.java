class employee  {
    String name;
    int salary;
    String field;
    employee(String ename,int esalary,String efield) {
        name=ename;
        salary=esalary;
        field=efield;
    }
    void display() {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(field);

    }
}
public class constructor{
    public static void main(String[] args) {
        employee e=new employee("durga",2000,"developer");
        e.display();
    }
}
