// for loop


// class loop {
//     public static void main(String [] args){
//         for(int i = 1; i <= 100; i++){
//             System.out.println(i);
//         }
//     }
// }

//--------------------------------------------------------------------

// class loop {
//     public static void main(String [] args){
//         for(int i = 100; i >= 1; i--){
//             System.out.println(i);
//         }
//     }
// }

//-----------------------------------------------------------------

// class loop {
//     public static void main(String [] args){
//         System.out.println("Even number------------------");
//         for(int i = 1; i <= 100; i++){
//             if(i % 2 == 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//-----------------------------------------------------------------------

// class loop {
//     public static void main(String [] args){
//         System.out.println("Odd number------------------");
//         for(int i = 1; i <= 100; i++){
//             if(i % 2 == 1){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//---------------------------------------------------------------------------

// class loop {
//     public static void main(String [] args){
//         for(int i = 0; i < 3; i++){
//             if(i++ == 1){
//                 System.out.println("X");
//             }
//         }
//     }
// }

//-------------------------------------------------------------------------

// class loop {
//     public static void main(String [] args){
//         for(int i = 0; i < 5; i++){
//             if(i == 2 || ++i == 4){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//----------------------------------------------------------------------------

// class loop {
//     public static void main(String [] args){
//         for(int i = 1; i < 5; i++){
//             if(i++ % 2 == 0)
//                 continue;
//                 System.out.println(i);
            
//         }
//     }
// }

//-----------------------------------------------------------------------------

// class loop {
//     public static void main(String [] args){
//         for(int i = 0; i < 4; i++){
//             if(i % 2 == 0 || i++ % 3 == 0)
//                 System.out.println(i);
//         }
//     }
// }

//-----------------------------------------------------------------------------

// class loop {
// 	public static void main(String [] args){
// 		int a = 0;
// 		int b = 1;
// 		int c;
// 		for(int i = 0;  i < 7; i++){
// 			System.out.println(a);
// 			c = a + b;
// 			a = b;
// 			b = c;
// 		}
// 	}
// }

//----------------------------------------------------------------------------

// class loop {
//     public static void main(String [] args){
//         int sum = 0;
//         for(int i = 0; i <= 20; i++){
//             if(i % 2 == 0){
//                 sum = sum + i;
//             }else{
//                 sum = sum + i;
//             }
//         }
//     }
// }

//----------------------------------------------------------------------------------

// import java.util.Scanner;

// class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int original = num;
//         int sum = 0;
//         int digits = String.valueOf(num).length();

//         while (num > 0) {
//             int digit = num % 10;
//             sum += Math.pow(digit, digits);
//             num /= 10;
//         }

//         if (sum == original) {
//             System.out.println(original + " is an Armstrong number.");
//         } else {
//             System.out.println(original + " is NOT an Armstrong number.");
//         }

//         sc.close();
//     }
// }

//--------------------------------------------------------------------------------------

