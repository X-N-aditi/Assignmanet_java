// class Bike {
//     static int regNum = 9898;
//     String color;
//     String bikemode;
//     String vietype;

//     Bike(String color, String bikemode, String vietype){
//         System.out.println("thanks for shop" + regNum);
//         regNum++;
//         this.color = color;
//         this.bikemode = bikemode;
//         this.vietype = vietype;
//     }

//     void display(){
//         System.out.println(regNum);
//     }
// }

// class construct {
//     public static void main(String [] args){
//         Bike b1 = new Bike("black", "S1", "petrol");
//         Bike b2 = new Bike("white", "S1", "petrol");

//         b1.display();
//         b2.display();
//     }
// }

//---------------------------------------------------------------------------------------------------------------------

// construct with no parameter

// class Student {
//     String name;

//     void printname(){
//         System.out.println(this.name);
//     }

//     Student(){
//         System.out.println("constructor called");
//     }
// }

// class construct {
//     public static void main(String [] args){
//         Student s1 = new Student();
//         s1.name = "akansha";
//         s1.printname();
//     }
// }

//------------------------------------------------------------------

// constuctor with parameter 

// class Student {
//     String name;

//     void printname(){
//         System.out.println(this.name);
//     }

//     Student(String name){
//         this.name = name;
//         System.out.println("constructor called");
//     }
// }

// class construct {
//     public static void main(String [] args){
//         Student s1 = new Student("akansha");
//         s1.printname();
//     }
// }

//--------------------------------------------------------------------------------------------------

// copy constructor

// class Bike {
//     String color;

//     Bike(){}

//     Bike(String color){
//         this.color = color;
//     }
// }
// class Garage {
//     void change_color(Bike b){
//         b.color = "Black";
//         System.out.println("Changes--------------------------");
//     }
// }

// class construct {
//     public static void main(String [] args){
//         Bike b = new Bike("red");
//         System.out.println(b.color);

//         Garage g = new Garage();
//         g.change_color(b);
//         System.out.println(b.color);
//     }
// }


//----------------------------------------------------------------------------------------------------------------------

// class C {
//     int i;
    
//     C(int i){
//         this.i = i;
//     }

//     void display(C c){
//         System.out.println(i + "  ");
//         System.out.println(c.i);
//         System.out.println("---------------------------------------------------");
//     }
// }

// class construct {
//     public static void main(String [] args){
//         C c = new C(10);
//         C c1 = new C(20);
//         C c2 = new C(30);

//         c.display(c1);
//         c1.display(c2);
//         c2.display(c1);
//         c2.display(c2);
//     }
// }

//---------------------------------------------------------------------------------------------------

// class rect {
//     int len;
//     int bre;

//     rect(int l, int b) {
//         len = l;
//         bre = b;
//     }

//     rect() {}  

//     rect(rect r){
//         len = r.len;
//         bre = r.bre;
//     }

//     void display(){
//         System.out.println("[" + len + "," + bre + "]");
//         System.out.println("--------------------------------------------");
//     }
// }

// class construct {
//     public static void main(String [] args){
//         rect r = new rect(10, 20);
//         rect r1 = r;
//         rect r2 = new rect(r);
//         rect r3 = new rect(30, 40);
//         rect r4 = new rect(r3);

//         r.display();
//         r1.display();
//         r2.display();
//         r3.display();
//         r4.display();
//     }
// }

//------------------------------------------------------------------------------------------------

// class A {
//     int i;
//     int j;
//     int k;

//     A(int i, int j, int k){
//         this.i = i;
//         this.j = j;
//         this.k = k;
//     }

//     A(){}

//     A(A a){
//         this(a.i, a.j, a.k);
//     }

//     void display(){
//         System.out.println("[" + i + "," + j + "," + k + "]");
//         System.out.println("-----------------------------------------------");
//     }
// }

// class construct {
//     public static void main(String [] args){
//         A a = new A(10, 20, 30);
//         A a1 = new A(a);
//         a.display();
//         a1.display();
//         a.k = 50;
//         a1.display();
//     }
// }

//-----------------------------------------------------------------------------------------

// class A {
//     int i;
//     int j;
//     static int k;

//     A(int i, int j, int k){
//         this.i = i;
//         this.j = j;
//         this.k = k;
//     }

//     A(){}

//     A(A a){
//         this(a.i, a.j, a.k);
//     }

//     void display(){
//         System.out.println("[" + i + "," + j + "," + k + "]");
//         System.out.println("-----------------------------------------------");
//     }
// }

// class construct {
//     public static void main(String [] args){
//         A a = new A(10, 20, 30);
//         A a1 = new A(a);
//         a.display();
//         a1.display();
//         a.k = 50;
//         a1.display();
//     }
// }

//----------------------------------------------------------------------------------------------------------------------------------