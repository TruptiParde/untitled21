package com.basic.java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

/*public class Main {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 1; i <= 10; i++) {  //print table of 8
            System.out.println(i * 8);
            sum = sum + i * 8;
        }
        System.out.println("total addition of 8th table is:" + sum); //print addition of table 8
    }
}*/
//print elements on even position in arrray
/*public class Main{
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 9, 2, 0, 9};
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]); //print elements on even position in arrray
        }
    }*/
// java program to check inputed character is constant or vowel
/*public class Main{
       static void vowle (char ch) {
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
               System.out.println("it is vowel");
           } else
               System.out.println("it is constant");
       }
        public static void main(String[] args){
            vowle('t');
            vowle('r');
            vowle('u');
            vowle('p');
            vowle('i');
           }
    }*/
//print table of 10 in reverse order
/*public class Main {
    public static void main(String[] args) {
        for(int i=10;i>=1;i--){
            System.out.println(i*10);
        }
    }
}*/
//java program to calculate total number of vowels and constants in a string
/*public class Main {
    public static void main(String[] args) {
        String str = ("we are finding total number of vowels and constants in a string: ");
        System.out.println(str);
        int vcount =0,ccount=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
            vcount++;
        }else if(str.charAt(i) >='a' && str.charAt(i)<='z')
             ccount++;
        }
        System.out.println("total no of vowels is: " +vcount);
        System.out.println("total no of constants is: " +ccount);
    }
}*/
//
/*public class Main {
    public static void main(String[] args){
        HashSet<Integer> hash = new HashSet<>();
        hash.add(56);
        hash.add(45);
        hash.add(34);
        hash.add(23);
        System.out.println(hash);
        boolean r1 = hash.contains(34);
        System.out.println(r1);
        boolean r2 = hash.contains(44);
        System.out.println(r2);
        hash.remove(23);
        System.out.println(hash);
        for(int i: hash){
            System.out.println(i);
        }
    }
}*/
//program to sum first n even numbers using while loops
/*public class Main{
    public static void main(String[] args) {
        int sum=0,evenNumber = 2;
        int count = 1;
        while (count <=100){
        sum +=evenNumber;
        evenNumber += 2;
        count++;
        }
        System.out.println("sum of even numbers is : " + sum);
}}*/
//
/*public class Main {
    public static void main(String[] args) {
        int count =1;
        while(count<10){
        System.out.println("count is: " +count);
        count++;
    }
}}*/
/*public class Main{
    public static void main(String[] args) {
        int currentEven=2;
        int sum=0;
        for(int i=1;i<=100;i++){
            sum = sum + currentEven;
            currentEven+=2;
        }
        System.out.println(sum);

    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int evenno =2;
        int sum =0;
        while(evenno<100){
            sum=sum+ evenno;
            evenno+=2;
        }
        System.out.println(sum);
    }
}*/
//write a program to print natural numbers from 100 to 200.
/*public class Main {
    public static void main(String[] args) {
        int i =0;
        for(i=100;i<=200;i++){
            System.out.println("natural numbers from 100 to 200 is :" +i);
        }
    }
}*/
//Program to check whether two arrays are equal or not
/*public class Main {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9,10};
        int[] arr2={2,4,6,7,8};
        boolean isEqual = true;
        if(arr1[]==arr2[]){
            return;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(isEqual);
                }else(arr1[i]=!arr2[j]){
                    System.out.println(isEqual);
                }
            }
        }
    }
}*/
//buffer reader
/*public class Main {
    public static void main(String[] args) throws IOException {
        int a,b,c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("Addition=" +c);
    }
}*/
//reverse
/*public class Main {
    public static void main(String[] args) {
        int m;
        Main aa = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        m=sc.nextInt();
        aa.getdata();
        aa.putdata();
    }

    private void putdata() {
    }

    private void getdata() {
    }

}*/
//static data member
/*public class Main {
    int roll;
    String name;
    static String CLGname="BAMU";

    public Main(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    void display(){
        System.out.println("rollno " + roll +  " name " + name + " CLGname " + CLGname);
    }
    static void change(){
        CLGname="srtmu";
    }
}*/
//default and parameterized constructor
/*public class Main {
    int a;
    int b;
    public Main(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Main() {

    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("first no");
        a=sc.nextInt();
        System.out.println("second no");
        b=sc.nextInt();


    }
    void display(){
        System.out.println("a is" +a +"b is" +b);
    }
    void output(){
        int c;
        c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.display();
        m.input();
        m.output();
        Main m2 = new Main(5,6);
        m2.output();
        m2.input();
        m2.display();
}}*/
//single inheritance
/*public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.input();
        m.getdata();
        m.add();
        m.display();
    }

    private void display() {
    }

    private void input() {
    }

    private void getdata() {
    }

    private void add() {
    }
}*/
//overloading
/*class Main{
    public static void main(String[] args) {
        B b= new B();
        b.mesg();
    }
}*/
//array
/*public class Main {
    public static void main(String[] args) {
        int a[] =new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("enter no");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }
}*/
//write a java program to accept an array from user and find sum of elements of the array
/*public class Main{
    public static void main(String[] args) {

    int a[] = {3,4,5,6};
        int sum=0;
        for(int i = 0; i<a.length; i++){
        sum=sum+a[i];
    }
    System.out.println(sum);

    }}*/
//poduct of array
/*class Main{
    public static void main(String[] args) {
        int a[] = {2,4,6,8,};
        int pro=1;
        for(int i=0;i<a.length;i++){
            pro=pro*a[i];
        }
        System.out.println(pro);
    }
}*/
//find frequncy of array
/*public class Main {
    int a[] = new int[10];
    int key;
    void getdata() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
            System.out.println("enter no");
        }
        System.out.println("enter no to find frquency");
        key = sc.nextInt();
    }
    void count(){

        int count = 0;
        for(int i=0;i<10;i++){
            count=count+1;
            System.out.println(count);
        }
}}*/
//addition of 2d array
/*public class Main{
    public static void main(String[] args) {
        int sum=0;
        int a1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int a2[][]={{0,9,8},{7,6,5},{4,3,2}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum = a1[i][j]+a2[i][j];
            }
            System.out.println("sum of two dimenssional array is " +sum);
        }
    }
}*/
//substraction of 2d array
/*public class Main{
    public static void main(String[] args) {
        int sub =0;
        int a1[][]={{7,8,9},{4,5,6},{3,4,5}};
        int a2[][]={{2,2,2},{1,1,1},{3,3,3}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                sub = a1[i][j] - a2[i][j];
            }
                System.out.println("substraction of two dimenssional is " +sub);

        }
    }
}*/
//java program to count total number of words in a string
/*class Main{
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        int count = 0;
        for(int i=0;i<s.length();i++){

            char c,d;
            c=s.charAt(i);
            d=s.charAt(i+1);
           int count = o;
            if(s.charAt(i)=='' && s.charAt(i+1)!='');
            count++;
        }
        System.out.println("total no of character is " +count);
    }
}*/
//palindrome of string
/*public class Main {
    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        str=sc.nextLine();
        int i=0;
        int j=str.length()-1;
        int flag=0;
        while(i<j && flag==0) {
            if (str.charAt(i) != str.charAt(j))
                flag = 1;
            i = i++;
            j = j--;
        }
            if(flag==0)
                System.out.println("it is palindrome");
            else
                System.out.println("it is not palindrome");
        }
    }*/
//equality function in string
/*public class Main{
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        s1=sc.nextLine();
        System.out.println("enter another string");
        s2=sc.nextLine();
        if(s1.equals(s2))
            System.out.println("strings are equal");
            else
            System.out.println("strings are not equal");
        }
    }*/
//equalsignorecase of string
/*public class Main{
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        s1=sc.nextLine();
        System.out.println("enter another string");
        s2=sc.nextLine();
        if(s1.equalsIgnoreCase(s2))
            System.out.println("strings are equal");
        else
            System.out.println("strings are not equal");
    }
}*/
//compareTo fun in string
/*public class Main {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        s1=sc.nextLine();
        System.out.println("enter second string");
        s2=sc.nextLine();
        if(s1.compareTo(s2)==0)
            System.out.println("two strings are equal");
        else if(s1.compareTo(s2)>0)
            System.out.println("s2 is greater than s1");
        else
            System.out.println("s1 is greater than s2");
    }
}*/
//uppercase of string
/*public class Main{
    public static void main(String[] args) {
        String s1 = new String();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        s1=sc.nextLine();


            System.out.println("string in uppercase " +s1.toUpperCase());
        System.out.println("string in lowercase " +s1.toLowerCase());
    }
}*/
//substring and indexof
/*public class Main{
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String();
        String s3 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("first string");
        s1=sc.nextLine();
        System.out.println("second string");
        s2=sc.nextLine();
        System.out.println("third string");
        s3=sc.nextLine();
        System.out.println(s1.substring(3));
        System.out.println(s1.indexOf("r",4));
    }
}*/
//stringBuffer
/*public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        sb.append(sc.nextLine());
        sb.setCharAt(3,'u');
        System.out.println(sb);
        sb.insert(3,"ABCD");
        System.out.println(sb);
        sb.setLength(20);
        System.out.println(sb);
     }
}*/
//vector
/*public class Main {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("trupti");
        v.add("shruti");
        v.add("swati");
        System.out.println(v);
        v.addElement("mamta");
        v.insertElementAt("ishwar",1 );
        v.removeElement("trupti");
        System.out.println(v);

    }
}*/
//multithreading
/*public class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}*/
//yield stop sleep
/*public class Main {
    public static void main(String[] args) {
        A thread1 = new A();
        A thread2 = new A();
        A thread3 = new A();
        thread1.start();
        System.out.println("thread1" +thread1);
        thread1.start();
        System.out.println("thread1" +thread2);
        thread1.start();
        System.out.println("thread1" +thread3);

    }
}
class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            if(i==1)
                yield();
            System.out.println("thread1 " +i);
        }
        System.out.println();
    }
    class B extends Thread{
        public void run(){
            for(int j=0;j<5;j++){
                if(j==3)
                    stop();
                }
            System.out.println("end of B");
            }
            class C extends Thread{
            public void run(){
                for(int k=0;k<5;k++){
                    System.out.println(k);
                    if(k==2)
                        try {
                            sleep(1000);
                        }catch(Exception e){}
                }
                System.out.println("end of C");
            }
        }
    }
}*/
//priority
/*public class Main {
    public static void main(String[] args) {
        A aa = new A();
        A bb = new A();
        A cc = new A();
        aa.setPriority(Thread.MAX_PRIORITY);
        bb.setPriority(aa.getPriority()+1);
        cc.setPriority(Thread.MIN_PRIORITY);
        System.out.println("thread aa is started");
        aa.start();
        System.out.println("thread bb is started");
        bb.start();
        System.out.println("thread cc is started");
        cc.start();
        System.out.println("Main thread is ended");
    }
}
class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("thread aa is end");
    }


    class B extends Thread {
        public void run() {
            for (int j = 0; j <= 5; j++) {
                System.out.println(j);
            }
            System.out.println("thread bb is end");
        }

        class C extends Thread {
            public void run() {
                for (int k = 0; k <= 5; k++) {
                    System.out.println(k);
                }
                System.out.println("thread cc is end");
            }
        }
    }
}*/
//multilevel inheritance
/*public class Main{

        int a;
        Void input;{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter no ");
            a=sc.nextInt();
        }
    }
    class B extends Main{
        int b;
        void getdata(){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter no ");
            b=sc.nextInt();
        }
    }
    class c extends B{

        void add(){

            System.out.println("addition is" +(a+b));
        }
    }*/
//prime number with class object
/*public class Main {
    int n;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no ");
        n=sc.nextInt();
    }
    void putdata(){
        int i,count=0;
        for(i=1;i<n;i++){
            if(i%n==0)
                count = count +1;
        }
        if(count==1)
            System.out.println("no is prime");
        else
            System.out.println("no is not prime");
    }
}*/
//simple prime no program
/*public class Main{
    public static void main(String[] args) {
        int a=19;
        int i;
        boolean isPrime= true;
        for(i=1;i<a;i++){
            if(a%i==0){
                isPrime=false;
            }
        }
        if(isPrime) {
            System.out.println("it is prime no: ");
        }else{
            System.out.println("it is not a prime no: ");
        }
    }
}*/
//check whether no is odd or even
/*public class Main {
    public static void main(String[] args) {
        int a =11;

            if(a%2==0)
                System.out.println("no is even");
            else
                System.out.println("no is odd");
        }
    }*/
//even odd with class object
/*public class Main{
    int a ;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        a=sc.nextInt();
    }
    void putdata(){

            if(a%2==0)
                System.out.println("it is prime");
            else
                System.out.println("it is not prime");

        }
    }*/
//armstrong no
/*public class Main {
    public static void main(String[] args) {
        int i, n, z, count = 0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        n = sc.nextInt();
        z = n;
        while (z > 0) {
            count = count + 0;
            z = z / 10;
        }
    int digit,pro;
    z=n;
    while(z>0){
        digit = z%10;pro=1;
        for(i=1;i<=count;i++)
            pro=pro*digit;
        sum = sum + pro;
        z=z/10;
    }
    if(z==n)
        System.out.println("no is armstrong");
    else
        System.out.println("no is not armstrong");

    }
}*/
//reverse string
public class Main{
    public static void main(String[] args) {
        String str = "Trupti", shru = "";
        char ch;

        System.out.println("Original word is: " + str);
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            shru = ch + shru;
        }

        System.out.println("reverse of string is : " + shru);

    }
}
