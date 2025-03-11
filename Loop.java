
//  1) Sum of n natural numbers.
//  2) Factorial of n natural numbers.
//  3) Table of 2.
//  4) Tables from 2 to 10.
//  5) Factors of a number.
//  6) Palindrome
//  7) Reverse 
//  8) Armstrong
//  9) Power
// 10) Armstrong power calculate karke manually.
// 11) Convert numbers into words
// 12) Perfect number

import java.util.Scanner;
public class Loop{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);


        //two's table

        // int n=2;

        // for(int i=1;i<=10;i++){
        //       System.out.println(i*n);
        // }
       
        // //tables from 2 to 10

        // for(int i=2;i<=10;i++){
        //     for(int j=1;j<=10;j++){
        //         System.out.println(i*j);
        //     }
        // }



        //Factorial of n natural numbers
// int n=6;
// int sum=1;
// for(int i=1;i<=n;i++){
//     sum*=i;
// }
//  System.out.println(sum);
//     }
// }


// Sum of n natural numbers

// int b=5;
// int sum=0;

// for(int i=1;i<=b;i++){
//     sum+=i;
   
// }
// System.out.println(sum);

 //factor

// int a=9;

// for(int i=1;i<a;i++){
//     if(a%i==0){
//      System.out.println(i);
//     }   
// }

//Palindrome:

// int n = 121;
// int ans=n;
// int digit;
// int i=0;
// int rev=0;


// while (n>0){
// digit= n%10;  //1
// rev=(rev*10)+ digit;  
// n=n/10;

// i++;
// }
// if(ans==rev){
//     System.out.println("Palindrome");
// }
// else{
//       System.out.println("Not");
// }






//Reverse:

// int n = 121;
// int digit;
// int i=0;
// int rev=0;


// while (n>0){
// digit= n%10;  //1
// rev=(rev*10)+ digit;  
// n=n/10;

// i++;
// }
//  System.out.println(rev);


//Armstrong:

// int n=153;
// int ans = n;
// int digit1;
// int digit2;
// int digit3;
// int arm=0;
// int i=0;

// while(n>0){

//     digit1 = n%10; //3
//     n=n/10;
//      digit2 = n%10; //5
//     n=n/10;
//      digit3 = n%10; //1
//     n=n/10;
//     arm = (digit1*digit1*digit1) + (digit2*digit2*digit2) + (digit3*digit3*digit3);
//     i++;
// }
// if(arm==ans){
//     System.out.println("Armstrong");
// }
// else{
//     System.out.println("Not");
// }


//Power:

// int n=2;
// int power=4;
// int result=1;

// for(int i=1;i<=power;i++){
//     result=result*n;
// }
// System.out.println(result);

// Armstrong:

// System.out.println("Enter number to check whether it's an armstrong or not:");
// int n = obj.nextInt();
// int ans=n;
// int org=n;
// int power;
// int result=0;
// int digit=0;
// int count=0;

//To find number of digits of a number;

// while(n>0){
//     n=n/10;
//     count++;
// }

// //To find digit.

// while(ans > 0){
//    digit= ans%10; //3
//    power=1;
//    for(int i=1;i<=count;i++){
//     power= power*digit;
//    }
//    result= result+power;
//    ans=ans/10;   
// }       

//  if(result==org){
//     System.out.println("Armstrong");
//  }
//  else{
//      System.out.println("Not an armstrong");
//  }


//Convert number into words:

// int n= 1234;
// int number=0;
// int digit=0;
// int digit2=0;

// for(int i=1;i<=4;i++){
//    digit=n%10;    //4
//    number=digit;
//    n=n/10;

// while(number!=0){
//     number = n%10;

//     String result;
// result = switch(number){
//     case 1 -> "one";
//     case 2 -> "two";
//     case 3 -> "three";
//     case 4 -> "four";
//     case 5 -> "five";
//     case 6 -> "six";
//     case 7 -> "seven";
//     case 8 -> "eight";
//     case 9 -> "nine";
//     case 0 -> "zero";
//     default-> "invalid";


// }
// System.out.println(result);
// n=n/10;
// }
// }



//HCF
//  int hcf=0;
//    System.out.println("Enter 1st number");
  

// int a =obj.nextInt();
//  System.out.println("Enter 2nd number");
// int b =obj.nextInt();


// for(int i=1;i<=a;i++){
//     if(a%i==0 && b%i==0){
//        hcf=i;  
       
//     }
// }
// System.out.println(hcf);
   




// LCM:
// int lcm=0;

// System.out.println("Enter 1 number");
// int a =obj.nextInt();

// System.out.println("Enter 2 number");
// int b =obj.nextInt();

// for(int i=b; ;i=i+b){
// if(i%a==0 && i%b==0){
//     lcm=i;
//     break;
 
    
// }
// }
// System.out.println(lcm);




//Perfect number:

// System.out.println("Enter number:");
// int a =obj.nextInt();

// int sum=0;
// for(int i=1;i<=a-1;i++){
//     if(a%i==0){
//         sum+=i;
//     }
// }

// if(sum==a){
//     System.out.println("Yes");
// }
// else{
//     System.out.println("No");
// }




//Ap series:
//  System.out.println("Enter first term:");
// int first = obj.nextInt();

// System.out.println("Enter common difference:");
// int d = obj.nextInt();

// System.out.println("Enter total number of terms:");
// int n= obj.nextInt();
// int next = 0;

// System.out.println(first);

// for(int i=1;i<n;i++){
//     next= first+d;
//     first=next;

// System.out.println(next);

// }


//GP series:

// int first = 1;
// int n = 5;
// int r = 2;
// int next=0;
// System.out.println(first);

// for(int i=1;i<=n;i++){
   
//    next = first*r;
//    first=next;
//    System.out.println(next);

// }


//nth term series:


// int n= 5;
// int sum=0;

// for(int i=0;i<n;i++){

// sum=sum*10+1;

// System.out.println(sum);

// }

//Right angled Triangle:

// char a='*';
// for(int r=1;r<=5;r++){
// for(int c=1;c<=5;c++){
// if(c<=r){
//         System.out.print(a);
//     }
//     else{
//         System.out.print(" ");
//     }
// }
// System.out.println();
// }


//Left angled triangle:

// for(int r=1;r<=5;r++){
// for(int c=1;c<=5;c++){
// if(c>=6-r){
//         System.out.print(a);
//     }
//     else{
//         System.out.print(" ");
//     }
// }
// System.out.println();
// }


//Inverted right :

// for(int r=1;r<=5;r++){
// for(int c=1;c<=5;c++){
// if(c<=6-r){
//         System.out.print("*");
//     }
//     else{
//         System.out.print(" ");
//     }
// }
// System.out.println();
// }


//Left inverted:

// for(int r=1;r<=5;r++){
// for(int c=1;c<=5;c++){
// if(c>=r){
//         System.out.print("*");
//     }
//     else{
//         System.out.print(" ");
//     }
// }
// System.out.println();
// }


//Pyramid:

// for(int r=1;r<=5;r++){
// for(int c=1;c<=9;c++){
// if(c>=6-r && c<=4+r){
//         System.out.print("*");
//     }
//     else{
//         System.out.print(" ");
//     }
// }
// System.out.println();
// }


//Inverted pyramid:

for(int r=1;r<=5;r++){
for(int c=1;c<=9;c++){
if(c>=r && c<=10-r){
        System.out.print("*");
    }
    else{
        System.out.print(" ");
    }
}
System.out.println();
}


//Diamond:


// int b=0;

// for (int r=1;r<=9;r++){
//     b=(r<=5)?++b: --b;
//     for(int c=1;c<=9;c++){
//         if(c>=6-b && c<=4+b){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();

// }



//Right angled triangle (characters):

// char b='a';
// for(int r=1;r<=5;r++){
// for(int c=1;c<=5;c++){
// if(c<=r){
//         System.out.print(b++);
//     }
//     else{
//         System.out.print(" ");
//     }
// }
// System.out.println();
// }



// char b='a';
// for(int r=1;r<=5;r++){
// for(int c=1;c<=5;c++){
// if(c<=r){
//         System.out.print((char)(b+r-1));
//     }
//     else{
//         System.out.print(" ");
//     }
// }
// System.out.println();
// }


// char b='a';
// for(int r=1;r<=6;r++){
// for(int c=1;c<=6;c++){
// if(c<=r){
//         System.out.print((char)(b+c-1));
//     }
//     else{
//         System.out.print(" ");
//     }
// }
// System.out.println();
// }





//Standardized Pyramid :

// System.out.println("Enter number of rows:");
// int n = obj.nextInt();


// for(int r=1;r<=n;r++){
//     for(int c=1;c<=((n*2)-1);c++){
        
//         if(c>=(n+1)-r && c<=(n-1)+r){
//             System.out.print("*");
//         }
//         else{
//              System.out.print(" ");
//         }
//     }System.out.println();
// }

//Standardized inverted pyramid :

// System.out.println("Enter number of rows:");
// int n = obj.nextInt();

// for(int r=1;r<=n;r++){
//     for(int c=1;c<=((n*2)-1);c++){
//         if(c>=r && c<=(n*2)-r){
//             System.out.print("*");
//         }
//         else{
//              System.out.print(" ");
//         }
//     }System.out.println();
// }


//Right angled triangle (Numbers) :

// int d=1;
// for(int r=1;r<=5;r++){
//     for(int c=1;c<=5;c++){
//         if(c<=r){
//             System.out.print(d++);
//         }
//     }System.out.println();
// }


//Right angled triangle numbers:

// for(int r=1;r<=5;r++){
//     for(int c=1;c<=5;c++){
//         if(c<=r){
//             System.out.print(c);
//         }
//     }System.out.println();
// }


}
}



