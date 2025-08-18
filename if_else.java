// class if_else {
//     public static void main(String [] args){
//         int unit = 378;
// 		int bill = 0;
// 		if(unit >= 0 && unit <= 100){
// 			System.out.println(bill);
// 		}else if(unit > 100 && unit <= 200){
// 			int result = (unit-100)*7 + 0;
// 			System.out.println(result);
// 		}else if(unit > 200 && unit <= 300){
// 			int result = (unit-200)*8 + 100*7 + 0;
// 			System.out.println(result);
// 		}else if (unit > 300){
// 			int result = (unit-300)*10 + 100*8 + 100*7 + 0;
// 			System.out.println(result);
//  		}
//     }
// }

// //----------------------------------------------------------------------------------------------------

// class if_else {
// 	public static void main(String [] args){
// 		int a = 10;
// 		if(a < 18)
// 			if(a > 20)
// 				if(a == 18)
// 					System.out.println("Eligible");
// 			else{
// 				System.out.println("Not Eligible");
// 			}
// 	}
// }

// //----------------------------------------------------------------------------------------------------------

// class if_else {
// 	public static void main(String [] args){
// 		int c= 20;
// 		if(c> 18){
// 			System.out.println("Eligible");
// 			System.out.println("Can Vote");
// 			System.out.println("Go to center for voting");
// 			System.out.println("Can also elect");
// 		}
// 	}
// }

// //-----------------------------------------------------------------------------------------------------------

// class if_else {
//     static int x = 0;
//     int y = 0;

//     public static void main(String [] args){
//         if_else a = new if_else();
//         if_else b = new if_else();

//         a.x = 5;
//         a.y = 10;
//         b.x = 20;
//         b.y = 30;

//         if(a.x == b.x){
//             System.out.println(a.x);
//         }else {
//             System.out.println(a.x + "," + b.x);
//         }
//         if(a.y == b.y){
//             System.out.println(a.y);
//         }else {
//             System.out.println(a.y + "," + b.y);
//         }
//     }
// }

//----------------------------------------------------------------------------------------------------------------------

// class if_else {
//     public static void main(String [] args){
//         int a= 18;
//         if(a >= 18){
//             System.out.println("can vote");
//         }else{
//             System.out.println("play pubg");
//         }
//     }
// }

//---------------------------------------------------------------------------------------------------------------------


// class if_else {
//     public static void main(String []args){
//         int a = 0;
//         int b = -1;
//         if(a > 0)
//             if(b > 0)
//                 System.out.println("a & b is positive");
//             else
//             System.out.print("b is not positive");
//     }
// }

//---------------------------------------------------------------------------------------------------------------------------



// class if_else {
//     public static void main(String []args){
//         int a = 10;
//         if(a == 10)
//             System.out.println("I am vivek");
//         else
//             System.out.println("I am rahul");
//     }
// }

//---------------------------------------------------------------------------------------------------------------------



// class if_else {
//     public static void main(String []args){
//         int a = 10;
//         boolean flag = true;
//         if(flag = false)
//             System.out.println("i am vivek");
//         else
//             System.out.println("i am rahul");
//     }
// }


//-----------------------------------------------------------------------------------------------------------------


// class if_else {
//     public static void main(String []args){
//         int x = 5;
//         if(x++ > 5)
//             System.out.println("A");
//         else    
//             System.out.println("B");
//     }
// }

//--------------------------------------------------------------------------------------------------------------



// class if_else {
//     public static void main(String []args){
//         int x = 5;
//         if(++x == 6 && x++ == 6)
//             System.out.println(x);
//         else
//             System.out.println("Fail");
//     }
// }

//-----------------------------------------------------------------------------------------------------------


// class if_else {
//     public static void main(String []args){
//         int x = 3, y = 4;
//         if (x > 2 || ++y > 4)
//             System.out.println(y);
//     }
// }

//--------------------------------------------------------------------------------------------------------

// class if_else {
//     public static void main(String [] args){
//         int x = 10;
//         if (x-- > 10)
//             System.out.println("First");
//         else if (++x == 10)
//             System.out.println("Second");
//         else
//             System.out.println("Third");
//     }
// }

//---------------------------------------------------------------------------------------------------------

// class if_else {
//     public static void main(String [] args){
//         int x = 10;
//         if (x-- > 10)
//             System.out.println("First");
//         else if (++x == 10)
//             System.out.println("Second");
//         else
//             System.out.println("Third");
//     }
// }

//-----------------------------------------------------------------------------------------------------------

// class if_else {
//     public static void main(String [] args){
//         int a = 5;
//         if (a++ == 5 && ++a == 7)
//             System.out.println(a);
//         else
//             System.out.println("No Match");
//     }
// }

//-----------------------------------------------------------------------------------------------------------

// class if_else {
//     public static void main(String [] args){
//         int x = 0;
//         if (x++ == 0 || x++ == 1)
//             System.out.println(x);
//     }
// }

//-------------------------------------------------------------------------------------------------

// class if_else {
//     public static void main(String [] args){
//         int x = 5;
//         if (x++ > 5 || ++x > 6)
//             System.out.println(x);

//     }
// }

//----------------------------------------------------------------------------------------------------

// class if_else {
//     public static void main(String [] args){
//         int x = 2;
//         int y = 3;
//         if (++x == 3 && y-- == 3)
//             System.out.println(x + y);
//         else
//             System.out.println("Else");
//     }
// }

//--------------------------------------------------------------------------------------------------

// class if_else {
// 	public static void main(String [] args){
// 		int a = 301;
// 		int ans = 0;
// 		int op;
		
// 		if (a<=100){
// 			System.out.print(ans);
// 		}
// 		else if (a>100 && a<=200){
// 			op = ((a-100)*7) + (ans);
// 			System.out.print(op);
// 		}
// 		else if (a>200 && a<=300){
// 			int b = a-200;
// 			op = (b*8) + (100*7) + (ans);
// 			System.out.print(op);
// 		}
// 		else if (a>300){
// 			int c = a-300;
// 			op = (c*10) + (100*8) + (100*7) + (ans);
// 			System.out.print(op);
// 		}
// 	}
// }
			
//---------------------------------------------------------------------------------------

// import java.util.Scanner;

// class if_else {
// 	public static void main(String [] args){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter your amount: ");
// 		int amount = sc.nextInt();
// 		System.out.println("Enter your time in years: ");
// 		int time = sc.nextInt();  // in years


// 		if(amount <= 10000){
// 			int interest = (amount * 10/100) * time;
// 			System.out.println(interest);
// 		}else if(amount > 5000 && amount < 10000){
// 			int interest = (amount * 8/100) * time;
// 			System.out.println(interest);
// 		}else if(amount < 5000){
// 			int interest = (amount * 5/100) * time;
// 			System.out.println(interest);
// 		}
// 	}
// }

			

// //----------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// class if_else {
// 	public static void main(String [] args){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter your first subject marks out of 100: ");
// 		int sub1 = sc.nextInt();
// 		System.out.println("Enter your second subject marks out of 100: ");
// 		int sub2 = sc.nextInt();
// 		System.out.println("Enter your third subject marks out of 100: ");
// 		int sub3 = sc.nextInt();
// 		System.out.println("Enter your fourth subject marks out of 100: ");
// 		int sub4 = sc.nextInt();
// 		System.out.println("Enter your fifth subject marks out of 100: ");
// 		int sub5 = sc.nextInt();

// 		int obtained_marks = sub1 + sub2 + sub3 + sub4 + sub5;
// 		System.out.println("------------------------------------------------------------------------");
// 		System.out.println(obtained_marks);
// 		double total_percentage = (obtained_marks/500.0) * 100;
// 		System.out.println("------------------------------------------------------------------------");
// 		System.out.println(total_percentage);

// 		System.out.println("------------------------------------------------------------------------");
// 		if(total_percentage >= 90){
// 			System.out.println("Ex");
// 		}else if(total_percentage >= 80){
// 			System.out.println("A");
// 		}else if(total_percentage >= 60){
// 			System.out.println("B");
// 		}else if(total_percentage >= 40){
// 			System.out.println("C");
// 		}else if(total_percentage < 40){
// 			System.out.println("F");
// 		}
// 	}
// }
