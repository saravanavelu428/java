public abstract class Teacher {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.teaching();
        stu.writing();
        
        
    }
    void teaching(){
        System.out.println("staff is teaching");
    }
    abstract void quespaper();

    }

