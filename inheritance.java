// class A {
//     void m1() {
//         System.out.println("m1 in A");
//     }
// }

// class B {
//     void m2() {
//         System.out.println("m2 in B");
//     }
// }

// class inheritance {
//     public static void main(String [] args){
//         B b = new B();
//         b.m1();
//         b.m2();
//     }
// }


// ERROR---------------------

// inheritance.java:16: error: cannot find symbol
//         b.m1();
//          ^
//   symbol:   method m1()
//   location: variable b of type B
// 1 error

// because we make a object for class B but does not connect B class to A by inheritance , so it can not call class A method m1()
//--------------------------------------------------------------------------------

// class A {
//     void m1() {
//         System.out.println("m1 in A");
//     }
// }

// class B extends A{
//     void m2() {
//         System.out.println("m2 in B");
//     }
// }

// class inheritance {
//     public static void main(String [] args){
//         B b = new B();
//         b.m1();
//         b.m2();
//     }
// }


// OUTPUT----------------------------

// m1 in A
// m2 in B

//------------------------------------------------------------------------------------------------------------------

// class A {
//     int regNum = 10;
// }
// class B {
//     int j = 0;
// }
// class inheritance {
//     public static void main(String [] args){
//         B b = new B();
//         A a = new A();
//         System.out.println(b.getClass());
//         System.out.println(a.getClass());
//     }
// }


// OUTPUT----------------
// class B
// class A

//-----------------------------------------------------------------------------------------------------------------


// class A {
//     int regNum = 10;

//     A(){
//         super();
//         System.out.println("A class executed");
//     }
// }
// class B extends A{
//     int j = 0;
//     B(){
//         System.out.println("B class executed");
//     }
// }

// class inheritance {
//     public static void main(String [] args){
//         B b = new B();
//     }
// }

// OUTPUT------------------
// A class executed
// B class executed

//-----------------------------------------------------------------------------------------------------------------------------------

// class A {
//     int i;

//     A(){
//         super();
//         i = 10;
//         System.out.println("A class exceuted");
//     }
// }
// class B extends A {
//     int j;
//     B(){
//         j = 20;
//         System.out.println("B class executed");
//     }
// }

// class inheritance {
//     public static void main(String [] args){
//         new B();                                                   // object call without reference
//         System.out.println(i);
//         System.out.println(j);
//     }
// }

// //OUTPUT--------------------
// Error : cannot find symbol i, j

//----------------------------------------------------------------------------------------

// class A {
//     int i;

//     static A(){                                                      // modifier static not allowed here
//         super();
//         i = 10;
//         System.out.println("A class exceuted");
//     }
// }
// class B extends A {
//     int j;
//     static B(){
//         j = 20;
//         System.out.println("B class executed");
//     }
// }

// class inheritance {
//     public static void main(String [] args){
//         new B();                                                   
//         System.out.println(i);                                           // object call without reference
//         System.out.println(j);                                              // object call without reference
//     }
// }

//-----------------------------------------------------------------------------------------------------

// class A {
//     static int i;

//     A(){
//         super();
//         i = 10;
//         System.out.println("A class exceuted");
//     }
// }
// class B extends A {
//     static int j;
//     B(){
//         j = 20;
//         System.out.println("B class executed");
//     }
// }

// class inheritance {
//     public static void main(String [] args){
//         new B();                                                   
//         System.out.println(A.i);                 // made variable static and call with reference A.i and B.j
//         System.out.println(B.j);
//     }
// }

// OUTPUT--------------------------------------

// A class exceuted
// B class executed
// 10
// 20

//-------------------------------------------------------------------------------------------------------------------

// class A {
//     int i;

//     A(){
//         super();
//         i = 10;
//         System.out.println("A class executed");
//     }
// }
// class B extends A{
//     int j;
//     B(){
//         j = 20;
//         System.out.println("B class executed");
//     }
// }
// class inheritance {
//     public static void main(String [] args){
//         new B();
//         System.out.println(new B().i);
//         System.out.println(new B().j);
//     }
// }

// OUTPUT----------------------------
// A class executed
// B class executed
// A class executed
// B class executed
// 10
// A class executed
// B class executed
// 20

//-------------------------------------------------------

// class A {
//     int i;

//     A(){
//         super();
//         i = 10;
//         System.out.println("A class executed");
//     }
// }
// class B extends A{
//     int j;
//     B(){
//         j = 20;
//         System.out.println("B class executed");
//     }
// }
// class inheritance {
//     public static void main(String [] args){
//         new B();
//     }
// }

// OUTPUT--------------------------
// A class executed
// B class executed

//--------------------------------------------------------------------------

// class Person {
//     String name;

//     Person(){
//         System.out.println("Java is easy");
//     }
// }
// class Doc extends Person {
//     String spec;

//     Doc(String spec, String name){
//         System.out.println("Doc executed");
//         super();
//         this.spec = spec;
//     }
// }
// class inheritance {
//     public static void main(String [] args){
//         Doc d = new Doc("Nuro", "shivi");
//     }
// }


// OUTPUT----------------------------------------
// inheritance.java:279: error: flexible constructors is a preview feature and is disabled by default.
//         super();
//              ^
//   (use --enable-preview to enable flexible constructors)
// 1 error



// because super and this keyword can't be used together in same class
//--------------------------------------------------------------------------------------------

// class Person {
//     String name;

//     Person(){
//         System.out.println("Java is easy");
//     }
// }
// class Doc extends Person {
//     String spec;

//     Doc(String spec, String name){
//         System.out.println("Doc executed");
//         this.spec = spec;
//     }
// }
// class inheritance {
//     public static void main(String [] args){
//         Doc d = new Doc("Nuro", "shivi");
//     }
// }


// OUTPUT----------------------
// Java is easy
// Doc executed

//---------------------------------------------------------------------------

// class Person {
//     String name;

//     Person(){
//         System.out.println("Java is easy");
//     }

//     Person(String s){
//         System.out.println("java is easy 2");
//     }

//     Person(int s){
//         this("java");
//         System.out.println("java is easy 3");
//     }
// }
// class Doc extends Person {
//     String spec;

//     Doc(String spec, String name) {
//         System.out.println("Doc executed");
//         this.spec = spec;
//     }

//     Doc(String spec){
//         this();
//         super(10);
//     }
// }
// class inheritance {
//     public static void main(String [] args){
//         Doc d = new Doc("Nuro", "shivi");
//     }
// }

// OUTPUT-----
// inheritance.java:355: error: no suitable constructor found for Doc(no arguments)
//         this();
//         ^
//     constructor Doc.Doc(String,String) is not applicable
//       (actual and formal argument lists differ in length)
//     constructor Doc.Doc(String) is not applicable
//       (actual and formal argument lists differ in length)
// inheritance.java:356: error: redundant explicit constructor invocation
//         super(10);
//              ^
// 2 errors

//-----------------------------------------------------------------------------------------------

// class Person {
//     String name;

//     Person(){
//         System.out.println("Java is easy");
//     }

//     Person(String s){
//         System.out.println("java is easy 2");
//     }

//     Person(int s){
//         this("java");
//         System.out.println("java is easy 3");
//     }
// }
// class Doc extends Person {
//     String spec;

//     Doc(String spec, String name) {
//         System.out.println("Doc executed");
//         this.spec = spec;
//     }
// }
// class inheritance {
//     public static void main(String [] args){
//         Doc d = new Doc("Nuro", "shivi");
//     }
// }


// OUTPUT----------------
// Java is easy
// Doc executed


//-------------------------------------------------------------------------------------------
// class Person {
//     String name;

//     Person(){
//         System.out.println("Java is easy");
//     }

//     Person(String s){
//         System.out.println("java is easy 2");
//     }

//     Person(int s){
//         this("java");
//         System.out.println("java is easy 3");
//     }
// }
// class Doc extends Person {
//     String spec;

//     Doc(String spec, String s) {
//         super(13);
//         System.out.println("Doc executed");
//         this.spec = spec;
//     }
// }
// class inheritance {
//     public static void main(String [] args){
//         Doc d = new Doc("Nuro", "shivi");
//     }
// }


// OUTPUT-------

// java is easy 2
// java is easy 3
// Doc executed

//-----------------------------------------------------------------------------------------------------

// class Person {
//     String name;

//     Person(){
//         System.out.println("Java is easy");
//     }

//     Person(String s){
//         System.out.println("java is easy 2");
//     }

//     Person(int s){
//         System.out.println("java is easy 3");
//     }
// }
// class Doc extends Person {
//     String spec;

//     Doc(String spec, String s) {
//         super(13);
//         System.out.println("Doc executed");
//         this.spec = spec;
//     }
// }
// class inheritance {
//     public static void main(String [] args){
//         Doc d = new Doc("Nuro", "shivi");
//     }
// }

// OUTPUT-------------
// java is easy 3
// Doc executed

//-------------------------------------------------------------------------------------------


// class A {
//     A(){
//         System.out.println("java is easy in A");
//     }
// }

// class Person extends A {
//     String name;

//     Person(){
//         System.out.println("Java is easy");
//     }

//     Person(String s){
//         System.out.println("java is easy 2");
//     }

//     Person(int s){
//         this("java");
//         System.out.println("java is easy 3");
//     }
// }
// class Doc extends Person {
//     String spec;

//     Doc(String spec, String s) {
//         super("xyz");
//         System.out.println("Doc executed");
//         this.spec = spec;
//     }
// }
// class inheritance {
//     public static void main(String [] args){
//         Doc d = new Doc("Nuro", "shivi");
//     }
// }

// OUTPUT------------
// java is easy in A
// java is easy 2
// Doc executed

//-------------------------------------------------------------------------------------------------------------------

