public class Student  {

    String name="ranjita";
    int age=19;
    String month;
    int date;
    int year;

    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
        public Student(int date,String month,int year){
             this.date=date;
             this.month=month;
             this.year=year;
        }

        public void read(){
            System.out.print("Date of birth of the Student is ");
            System.out.print( date +"/" + month+"/"+year);
        }

        public static void main(String[] args){
            Student s=new Student(15,"Feb", 2005);
            s.display();
            s.read();
           
        }
    
    
}
