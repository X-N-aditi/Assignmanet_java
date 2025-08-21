// class phone {
//     void call(){
//         System.out.println("calling");
//     }
// }
// class Iphone extends phone {
//     void call(){
//         System.out.println("calling from phone");
//     }
// }
// class Samsung extends phone {
//     void call(){
//         System.out.println("callng from Samsung");
//     }
// }
// class overriding {
//     public static void main(String [] args){
//         Samsung s = new Samsung();
//         s.call();

//         Iphone i = new Iphone();
//         i.call();
//     }
// }

// OUTPUT------
// callng from Samsung
// calling from phone

//----------------------------------------------------------------------------------------------------

// class phone {
//     void call(){
//         System.out.println("calling");
//     }
// }
// class Iphone extends phone {
//     void call(){
//         System.out.println("calling from phone");
//     }
// }
// class Samsung extends phone {
//     public void call(){
//         System.out.println("callng from Samsung");
//     }
// }
// class overriding {
//     public static void main(String [] args){
//         Samsung s = new Samsung();
//         s.call();
//     }
// }

// OUTPUT----------
// callng from Samsung

//------------------------------------------------------------------------------------------------

// class phone {
//     void call(){
//         System.out.println("calling");
//     }
// }
// class Iphone extends phone {
//     void call(){
//         System.out.println("calling from phone");
//     }
// }
// class Samsung extends phone {
//     static void call(){
//         System.out.println("callng from Samsung");
//     }
// }
// class overriding {
//     public static void main(String [] args){
//         Samsung s = new Samsung();
//         s.call();
//     }
// }


// OUTPUT--------
// error

//---------------------------------------------------------------------------------------------------

// class phone {
//     void call(){
//         System.out.println("calling");
//     }
// }
// class Iphone extends phone {
//     void call(){
//         System.out.println("calling from phone");
//     }
// }
// class Samsung extends phone {
//     final void call(){
//         System.out.println("callng from Samsung");
//     }
// }
// class overriding {
//     public static void main(String [] args){
//         Samsung s = new Samsung();
//         s.call();
//     }
// }

// OUTPUT--------------
// callng from Samsung

//------------------------------------------------------------------------------------------------

// class phone {
//     void calling(){
//         System.out.println("calling");
//     }
// }
// class Iphone extends phone {
//     final void calling(){
//         System.out.println("calling from iphone");
//     }
// }
// class Iphone12 extends Iphone {
//     void calling(){
//         System.out.println("calling from iphone12");
//     }
// }
// class overriding {
//     public static void main(String [] args){
//         Iphone12 i = new Iphone12();
//         i.calling();
//     }
// }

// OUTPUT--------
// overriding.java:125: error: calling() in Iphone12 cannot override calling() in Iphone
//     void calling(){
//          ^
//   overridden method is final
// 1 error

//-------------------------------------------------------------------------------------------------------------------


// class Car {
// }
// class BMW extends Car{}
// class Audi extends Car{}
// class Lamb extends Car{}
// class Mahin extends Car{}
// class Driver {
//     void drive(Car c){
//         System.out.println("Driver is called");
//     }
// }
// class overriding {
//     public static void main(String [] args){
//         Driver d = new Driver();
//         Car c = new BMW();
//         d.drive(c);
//         d.drive(new Audi());
//         d.drive(new Lamb());
//         d.drive(new Mahin());
//     }
// }

// OUTPUT-----
// Driver is called
// Driver is called
// Driver is called
// Driver is called

//------------------------------------------------------------------------------------------------------------

// class Car {
// }
// class BMW extends Car{}
// class Audi extends Car{}
// class Lamb extends Car{}
// class Mahin extends Car{}
// class Driver {
//     Car drive(Car c){
//         System.out.println("Driver is called");
//         return c;
//     }
// }
// class overriding {
//     public static void main(String [] args){
//         Driver d = new Driver();
//         Car c = new BMW();
//         d.drive(c);
//         d.drive(new Audi());
//         d.drive(new Lamb());
//         d.drive(new Mahin());
//     }
// }


// OUTPUT------
// Driver is called
// Driver is called
// Driver is called
// Driver is called

//------------------------------------------------------------------------------------------

// class Car {
// }
// class BMW extends Car{}
// class Audi extends Car{}
// class Lamb extends Car{}
// class Mahin extends Car{}
// class Driver {
//     Car drive(Car c){
//         System.out.println("Driver is called");
//     }
// }
// class overriding {
//     public static void main(String [] args){
//         Driver d = new Driver();
//         Car c = new BMW();
//         d.drive(c);
//         d.drive(new Audi());
//         d.drive(new Lamb());
//         d.drive(new Mahin());
//     }
// }


// OUTPUT----------
// overriding.java:155: error: missing return statement
//     }
//     ^
// 1 error

// Car method created but there is no return type , and also it is user defined method so return type is necessay ,
//  'static', 'void' are buit-in so there is no need to write return type

//--------------------------------------------------------------------------------------------------------------------------------------

// class A {
//     void m1(){
//         System.out.println("m1 is executed");
//     }
// }
// class B extends A {
//     void m1(){
//         System.out.println("m2 is executed");
//     }
// }
// class C extends A {
//     void m1(){
//         System.out.println("m3 is executed");
//     }
// }
// class overriding {
//     public static void main(String [] args){
//         A a = new B();
//         a.m1();
//         a = new C();
//         a.m1();
//     }
// }

// OUTPUT-----
// m2 is executed
// m3 is executed


//---------------------------------------------------------------------------------

// class A {
//     void m1(){
//         System.out.println("m1 is executed");
//     }
// }
// class B extends A {

//     B(){

//     }

//     B(int i){
//         this();
//     }

//     void m1(){
//         System.out.println("m2 is executed");
//     }
// }
// class C extends A {
//     void m1(){
//         System.out.println("m3 is executed");
//     }
// }
// class overriding {
//     public static void main(String [] args){
//         A a = new B(10);
//         a.m1();
//         a = new C();
//         a.m1();
//     }
// }


// OUTPUT----------
// m2 is executed
// m3 is executed

//------------------------------------------------------------------------------------------------------------

// class A {
//     int i = 10;
// }
// class B extends A {
//     int i = 20;
// }
// class C extends A {
//     int i = 30;
// }
// class overriding {
//     public static void main(String [] args){
//         A a = new B();
//         System.out.println(a.i);
//         a = new C();
//         System.out.println(a.i);
//     }
// }

// OUTPUT---------
// 10
// 10

//---------------------------------------------------------------------------------------------

// class A {
//     static void m1(){
//         System.out.println("static of A is executed");
//     }
// }
// class B extends A {
//     static void m1(){
//         System.out.println("static of B is executed");
//     }
// }
// class C extends A {
//     static void m1(){
//         System.out.println("static of C is executed");
//     }
// }
// class overriding {
//     public static void main(String [] args){
//         A a = new B();
//         a.m1();
//         a = new C();
//         a.m1();
//     }
// }

// OUTPUT-----------------
// static of A is executed
// static of A is executed

//--------------------------------------------------------------------------------------------------

// class A {
//     static void m1(){
//         System.out.println("static of A is executed");
//     }
// }
// class B extends A {
//     static void m1(){
//         System.out.println("static of B is executed");
//     }
// }
// class C extends A {
//     static void m1(){
//         System.out.println("static of C is executed");
//     }
// }
// class overriding {
//     public static void main(String [] args){
//         A a = new B();
//         a.m1();
//         a = new C();
//         a.m1();
//     }
// }

// OUTPUT-----------------
// static of A is executed
// static of A is executed

//----------------------------------------------------------------------------------------------------------