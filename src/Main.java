import java.util.Arrays;
import java.util.Comparator;

class Student
{
    private String name;
    private int age;
 
    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
 
    @Override
    public String toString()
    {
        return "{" + "name='" + name + '\'' +
                    ", age=" + age + '}';
    }
 
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
 
class Main
{
    public static void main(String[] args)
    {
        Student[] students = { new Student("John", 15), new Student("Sam", 20),
                                new Student("Dan", 20), new Student("Joe", 10) };
 
//        Arrays.sort(students, new Comparator<Student>() {
//            public int compare(Student first, Student second)
//            {
//                if (first.getAge() != second.getAge()) {
//                    return first.getAge() - second.getAge();
//                }
//                return first.getName().compareTo(second.getName());
//                
//                
//                
//                
//            }
//        });
        
        
        Arrays.sort(students, (first, second) -> (first.getAge() != second.getAge()) ?
                (first.getAge() - second.getAge()) :
                (first.getName().compareTo(second.getName())));
 
        System.out.println(Arrays.toString(students));
    }
}


