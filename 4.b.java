
package javaexp4;
interface printable{
    void print();
}
class rectangle implements printable{
int x;
int y;
int z;

    rectangle (int x,int y) {
       
    this.x =x;
    this.y =y;
    z=x*y;
    }
    

    @Override
    public void print() {
           
        System.out.println("length:"+x);
        System.out.println("breadth:"+y);
        System.out.println("area:"+z);
    }
}
class racecar implements printable{
    String brand;
    int price;
    int model;
    racecar(String brand,int model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    @Override
    public void print() {
        System.out.println("brand:"+brand);
        System.out.println("model:"+model);
        System.out.println("price:"+price);
        
        
    }
    
}


class manager implements printable{
    String name;
    int empid;
    int salary;
    int age;
    manager (String name,int empid,int salary,int age){
    this.age=age;
    this.empid=empid;
    this.salary=salary;
    this.name=name;
    }
    
    @Override
    public void print(){
        System.out.println("name:"+name);
        System.out.println("employee id:"+empid);
        System.out.println("age:"+age);
        System.out.println("salary:"+salary);
        
    } 
}

class Javaexp4 {

  
    public static void main(String[] args) {

     //int x,y,z;
     rectangle r= new rectangle(10,12);
     r.print();
     System.out.println("\n");
     manager m=new manager("gowtham",1000,10000,19);
     m.print();
     System.out.println("\n");
     racecar c=new racecar("FORD",2002,90000);
     c.print();
     System.out.println("\n");
     
    }
    
}
