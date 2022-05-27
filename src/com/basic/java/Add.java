package com.basic.java;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

/*public class Add {
    public static void main(String[] args) {
        int a,b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("first no");
        a=sc.nextInt();
        System.out.println("second no");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("addition: " +sum);
    }
}*/
/*public class Add {
    public static void main(String[] args) {
        int len,bre,area,perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.println("length is: ");
        len=sc.nextInt();
        System.out.println("breadth is: ");
        bre=sc.nextInt();
        area=len*bre;
        System.out.println("area is:" +area);
        perimeter=2*(len+bre);
        System.out.println("perimeter is: " +perimeter);
    }
}*/
/*public class Add {
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("first no.");
        a=sc.nextInt();
        System.out.println("second no.");
        b=sc.nextInt();
        if(a>b){
            System.out.println("max is:" +a);
        }else{
            System.out.println("max is:" +b);
        }
    }
}*/
/*public class Add {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc =new Scanner(System.in);
        System.out.println("first");
         a=sc.nextInt();
        System.out.println("second");
        b=sc.nextInt();
        System.out.println("third");
         c=sc.nextInt();
    if(a>b&&a>c){
        System.out.println("max is" +a);
    } else if (b>a&&b>c) {
        System.out.println("max is" +b);
    }else {
        System.out.println("max is" +c);
    }
    }
}*/
/*public class Add {
    public static void main(String[] args) {
        int a;
        Scanner sc =  new Scanner(System.in);
        System.out.println("first no");
        a=sc.nextInt();
        if(a%2==0){
            System.out.println("even" +a);
        }else{
            System.out.println("odd" +a);
        }
    }
}*/
/*public class Add {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        a=sc.nextInt();
        if(a>0){
            System.out.println("no is positive" +a);
        }else{
            System.out.println("no is negative" +a);
        }
    }
}*/
/*public class Add {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("first no");
        a=sc.nextInt();
        System.out.println("second no");
        b=sc.nextInt();
        c=sc.nextInt();
        if(c==1){
            System.out.println("addition" +(a+b));
        } else if (c==2) {
            System.out.println("substraction" +(a-b));
        }else if(c==3){
            System.out.println("multiplication" +(a*b));
        }else{
            System.out.println("invalid choice");
        }
  }
}*/
//crating calculator using switch statement
/*public class Add {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("first no");
        a=sc.nextInt();
        System.out.println("second no");
        b=sc.nextInt();
        ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("addition" +(a+b));
            case 2:
                System.out.println("substraction" +(a-b));
            case 3:
                System.out.println("multiplication" +(a*b));
            default:
                System.out.println("invalid choice");

        }
    }
}*/
/*public class Add {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        for(int j=11;j<=20;j++){
            System.out.println(j);
        }
    }
}*/
//program to print 1 to n numbers
/*public class Add {
    public static void main(String[] args) {
        int i ,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        n=sc.nextInt();
        i=1;
        while (i<=n){
            System.out.println(i);
            i++;
        }
    }
}*/
//addition of 1 to n numbers
/*public class Add {
    public static void main(String[] args) {
        int i,n,add=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no");
        n=sc.nextInt();
        i=1;
        while(i<=n){
            add=add+i;
            i++;
        }
        System.out.println("addition of natural no: " +add);
    }
}*/
//print reverse
/*public class Add {
    public static void main(String[] args) {
        int i,reserve=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        i=sc.nextInt();
        while(i>0) {
            reserve = (reserve * 10) + i % 10;
            i=i/10;
        }

        System.out.println("reverse is" +reserve);
    }
}*/
//add the digits of given no
/*public class Add {
    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        i=sc.nextInt();
        while(i>0){
        sum = sum +(i%10);
        i=i/10;}
        System.out.println("sum of digits of above no is: " +sum);
    }
}*/
//progra to find sum of even and product of odd
/*public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, sum = 0, product = 1, digit;
        System.out.println("enter no.");
        i = sc.nextInt();
        while (i > 0) {
            digit = i % 10;
            if (digit % 2 == 0)
                sum = sum + digit;
            else
                product = product * digit;
                i = i / 10;
        }
        System.out.println("sum of even" + sum + "product of odd" + product);
    }
}*/
//palindrome
/*public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,rev=0,z = 0;
        System.out.println("enter no.");
        i=sc.nextInt();
        i=z;
        while(i>0){
            rev =(rev*10)+i%10;
            i=i/10;
            if(rev==z)
            System.out.println("it is palindrome");
            else
            System.out.println("it is not palindrome");
        }
    }
}*/
//product of digit
/*public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,pro=1;
        System.out.println("enter a no");
        i=sc.nextInt();
        while(i>0){
            pro=pro*i%10;
            i=i/10;
        }
        System.out.println("product of above digit is: " +pro);
    }
}*/
//check whether no is prime or not
/*public class Add {
    public static void main(String[] args) {
        int i,j=1,prime=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        i=sc.nextInt();

        while(j<=i){
            if(j%i==0)
                prime = prime + 1;
                j++;
            }
                    if(prime==2)
                    System.out.println("is prime no");
                    else
                    System.out.println("is not prime");

        }
    }*/
//factorial no
/*public class Add {
    public static void main(String[] args) {
        int i,fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no");
        i = sc.nextInt();
        while (i>0){
            fact= fact*i;
            i=i-1;
        }
        System.out.println("factorial of given no is: " +fact);
    }
}*/
//to printl all prime numbers between 1 to 100
/*public class Add {
    public static void main(String[] args) {
        int i,j,count;
        for( i=1;i<=100;i++){
            count = 0;
            for( j=1;j<=i;j++) {

                if (i % j == 0)
                    count++;
            }
                    if(count==2)
                        System.out.println(i);
            }
        }
    }*/
//print all prime no upto n
/*public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n,count;
        System.out.println("enter no");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0)
                    count++;
            }
            if(count==2)
                System.out.println(i);
        }
    }
}*/
//print a table using for loop
/*public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("enter no");
        n=sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(i*n);
        }
    }
}*/
//print table using while loop
/*public class Add {
    public static void main(String[] args) {
        int i = 0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        n=sc.nextInt();
        while( i<=10){
            System.out.println(i*n);
            i++;
        }
    }
}*/
// print fabonacci series
/*public class Add {
    public static void main(String[] args) {
        int x=0,y=1,z=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        n=sc.nextInt();
        while(z<=n){
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }
    }
}*/
//Amstrong number
/*public class Add {
    public static void main(String[] args) {
        int n,z=0,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        n=sc.nextInt();
        z=n;
        while(z>0){
            count=count+1;
                    z=z/10;

        }
    }
}*/
//print exponential form while loop
/*public class Add {
    public static void main(String[] args) {
        int a,b,pro=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        a=sc.nextInt();
        System.out.println("enter power");
        b=sc.nextInt();
        while(b>0){
            pro=pro*a;
            b--;

        }
        System.out.println(pro);
    }
}*/
//exponential form for loop
/*public class Add {
    public static void main(String[] args) {
        int a,b,pro=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        a=sc.nextInt();
        System.out.println("enter power");
        b=sc.nextInt();
        for(;b>0;b--){
            pro=pro*a;
        }
        System.out.println(pro);
    }
}*/
//use of break statement
/*public class Add {
    public static void main(String[] args) {
        int i=0;
        while(i<=10){
            i++;
            System.out.println(i);
            if(i==5)
                break;
        }
        System.out.println("exuction done  ");

    }
}*/
//using continue statement
/*public class Add {
    public static void main(String[] args) {
        int i=0;
        while(i<=10){
            i++;
            System.out.println(i);
            if(i==9)
                continue;
        }
        System.out.println("exuction done  ");

    }
}*/
//printing stars
/*public class Add {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("no of rows");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.println("*") ;
            }
            System.out.println();
        }
    }
}*/
//printing stars in revers order
/*public class Add {
    public static void main(String[] args) {
        int i,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row no");
        i=sc.nextInt();
        for( ;i>=1;i--){
            for( j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}*/
//printing stars
/*public class Add {
    public static void main(String[] args) {
        int i, j, k, l;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        l = sc.nextInt();
        for (i = 1; i <= l; i++) {
            for (k = 0; k <= l; k++) {
                System.out.println("-");
                for (j = 1; j <= i; j++) {
                    System.out.println("*");
                }
                System.out.println();
            }

        }
    }}*/
//class object,(addition of two no)
/*public class Add {
    int a,b;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no");
        a=sc.nextInt();
        System.out.println("enter second no");
        b=sc.nextInt();
    }
    void putdata(){
        System.out.println("addtion=" +(a+b));
    }

    public static void main(String[] args) {
        Add ad = new Add();
                ad.getdata();
                ad.putdata();
    }
}*/
//reverse
/*public class Add {
    int n ,i;
    void getdata(int n){
        n=i;
    }
    void putdata(){
        int rev =0;
        while(n>0){
            rev=(rev*10)+n%10;
            n=n/10;
        }

    }
}*/
//prime no
/*public class Add {
    int n;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        n=sc.nextInt();
    }
    void putdata(){
        int i,count=0;
        for(i=1;i<=n;i++){
            if(n%i==0)
                count = count+1;
        }
        if(count==2)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }

    public static void main(String[] args) {
        Add ad = new Add();
        ad.getdata();
        ad.putdata();
    }
}*/
//static data member
/*class Add{
    public static void main(String[] args) {
        Main m1 = new Main(11,"jony");
        Main m2 = new Main(13,"buny");
        m1.display();
        m2.display();
        Main.change();
        m1.display();
        m2.display();
    }
}*/
//single inheritance
/*public class Add {
    int a,b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no");
        a=sc.nextInt();
        System.out.println("enter second no");
        b=sc.nextInt();
    }
    void add(){
        System.out.println("add " +(a+b));
    }
    class Main extends Add {
        int c;

        void getdata() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter no");
            c = sc.nextInt();
        }

        void display() {
            System.out.println(a + b + c);
        }

    }}*/
//overloading
/*class Add{
    void mesg(){
        System.out.println("welcome to base class!");
    }
}
class B extends Add{
    void mesg(){
        System.out.println("welcome to derived class!!");
    }
}*/
//find frequency of array
/*public class Add {
    public static void main(String[] args) {
        Add ad = new Add();
        ad.getdata();
    }

    private void getdata() {
    }
}*/
//multilevel inheritance
/*public class Add {
    public static void main(String[] args) {
        c aa = new c();

        aa.getdata();
        aa.add();
    }
}*/
//prime with obj and class
/*public class Add {
    public static void main(String[] args) {
        Main m =new Main();
        m.getdata();
        m.putdata();
    }
}*/
//
/*public class Add {
    public static void main(String[] args) {
        Main m = new Main();
        m.getdata();
        m.putdata();
    }
}*/