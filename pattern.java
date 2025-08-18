// class pattern {
//     public static void main(String [] args){
//         for(int i = 1; i < 7; i++){
//             System.out.print("*");
//         }
//     }
// }

// // ******

//-------------------------------------------------------------------------------------------------------------------

// class pattern {
//     public static void main(String [] args){
//         for(int i = 1; i < 7; i++){
//             System.out.println("*");
//         }
//     }
// }

// *
// *
// *
// *
// *
// *



//-----------------------------------------------------------------------------------------------

// class pattern {
//     public static void main(String [] args){
//         for(int i = 1; i < 7; i++){
//             System.out.println(i);
//         }
//     }
// }

// 1
// 2
// 3
// 4
// 5
// 6

//--------------------------------------------------------------------------------------------

// class pattern {
//     public static void main(String [] args){
//         for(int i = 1; i < 7; i++){
//             System.out.print(i);
//         }
//     }
// }

// 123456

//--------------------------------------------------------------------------------------------

// class pattern {
//     public static void main(String [] args){
//         for(int i = 1; i < 7; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }System.out.println(" ");
//         }
//     }
// }

// * 
// ** 
// *** 
// **** 
// ***** 
// ****** 

//----------------------------------------------------------------------------------

// class pattern {
//     public static void main(String [] args){
//         for(int i = 1; i <= 5; i++){
//             for(int j = 5; j >= i; j--){
//                 System.out.print("*");
//             }System.out.println(" ");
//         }
//     }
// }

// ***** 
// **** 
// *** 
// ** 
// * 

//----------------------------------------------------------------------------------

// class pattern {
//     public static void main(String [] args){
//         for(int i = 1; i <= 5; i++){
//             for(int j = 5; j >= 1; j--){
//                 System.out.print("* ");
//             }System.out.println(" ");
//         }
//     }
// }

// * * * * *  
// * * * * *  
// * * * * *  
// * * * * *  
// * * * * *  

//-------------------------------------------------------------------------------------

// class pattern {
//     public static void main(String [] args){
//         for(int i = 1; i <= 5; i++){
//             for(int j = i; j < 5; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }System.out.println();
//         }
//     }
// }

//     *
//    **
//   ***
//  ****
// *****

//----------------------------------------------------------------------------------------


// class pattern {
//     public static void main(String [] args){
//         for(int i = 5; i >= 0; i--){
//             for(int j = 0; j < 5 - i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 0; j <= i; j++){
//                 System.out.print("*");
//             }System.out.println();
//         }
//     }
// }

// ******
//  *****
//   ****
//    ***
//     **
//      *

//------------------------------------------------------------------------------------

// class pattern {
//     public static void main(String [] args){
//         for(int i = 1; i <= 5; i++){
//             for(int j = i; j < 5; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("* ");
//             }System.out.println();
//         }
//     }
// }

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 


//--------------------------------------------------------------

// class pattern {
//     public static void main(String [] args){
//         for(int i = 5; i >= 1; i--){
//             for(int j = 5; j > i; j--){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("* ");
//             }System.out.println();
//         }
//     }
// }

// * * * * *
//  * * * * 
//   * * * 
//    * * 
//     * 

//---------------------------------------------------------------------------

// class pattern {
//     public static void main(String [] args){
//         for(int i = 1; i <= 5; i++){
//             for(int j = i; j < 5; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("* ");
//             }System.out.println();
//         }
//         for(int i = 5 - 1; i >= 1; i--){
//             for(int j = 5; j > i; j--){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++){
//                 System.out.print("* ");
//             }System.out.println();
//         }
//     }
// }

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 

//---------------------------------------------------------------------------------

// class pattern {
//     public static void main(String [] args){
//         for(int i = 0; i <= 5; i++){
//             for(int j = 0; j < 5; j++){
//                 if(i == 0 || i == 5 || j == 0 || j == 5-1){
//                     System.out.print("* ");
//                 }else {
//                     System.out.print("  ");
//                 }
//             }System.out.println();
//         }
//     }
// }

// * * * * * 
// *       * 
// *       * 
// *       * 
// *       * 
// * * * * * 

//-------------------------------------------------------------------------------------

