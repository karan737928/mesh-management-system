import java.io.Serializable;
public class Student implements Serializable{
    private int id;
    private String name;
    private int age;
    private String department;
    private String month;
    private double fees;
    public Student(int id, String name, int age, String department, String
            month, double fees) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.month = month;
        this.fees = fees;
    }
    public int getId(){ // to return the value
        return id;
    }
    public void setId(int id){ // to modify the value
        this.id = id; // current object ko refer karega
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public double getFees(){
        return fees;
    }
    public void setFees(double fees){
        this.fees = fees;
    }
    public String getMonth(){
        return month;
    }
    public void setMonth(String month){
        this.month = month;
    }
    public String toString(){
        return "Student [id=" + id + ", name=" + name +", age=" + age + ", department=" + department + ", month=" + month + ", fees=" + fees +"]";
    }
}

