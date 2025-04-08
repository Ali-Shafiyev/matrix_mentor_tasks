package matrix;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
//        // char var= "jav"  boyuk herflerele jav sozu cixmalidi
//        char a= 'j';
//        char b= 'a';
//        char c= 'v';
//        char d= 'a';
//        System.out.print(Character.toUpperCase(a));
//        System.out.print(Character.toUpperCase(b));
//        System.out.print(Character.toUpperCase(c));
//        System.out.print(Character.toUpperCase(d));
        //TERNARY OPERATOR
//            int a = 5;
//           String msg = a > 0 ? "Negative" : "Positive";
//            int msg = a<0 ? a : ++a;
//        System.out.println(msg);
//        double a = new Scanner(System.in).nextInt();
//        int b = new Scanner(System.in).nextInt();
//        int max = a>b ? a : b;
//        System.out.println(max);
//        if(a%2==0 && a>0){
//            System.out.println("cut");
//        } else if (a%2==1&& a>0) {
//            System.out.println("tek");
//        }else if(a==0) {
//            System.out.println("0");
//        } else{
//            System.out.println("negative");
//        }
//        int a =1;
//        switch (a) {
//            case  1:
//               int num= ++a;
//                System.out.println(num);
//
//            case 2 :
//                num=++a;
//                System.out.println(num);
//
//            case 3 :
//                num=++a;
//                System.out.println(num);
//
//
//            case 4:
//                num=++a;
//                System.out.println(num);
//
//
//            case 5:
//                num=++a;
//                System.out.println(num);
//
//            default:
//                ayin nomresi verilecek ona uygun hansi feslin oldugunu verecek switch case ile
//                calculator app
//                    int a ve b ededlerinin yerini deyis yeni anin deyeri ile bnin deyerinin yerini deyissin

//             System.out.println("month number 1-12 : ");
//             int date = new Scanner(System.in).nextInt();
//             switch (date) {
//                 case 1,2,3:
//                     System.out.println("Winter");
//                     break;
//                 case 4,5,6:
//                     System.out.println("Spring");
//                     break;
//                 case 7,8,9:
//                     System.out.println("Summer");
//                     break;
//                 case 10,11,12:
//                     System.out.println("Fall");
//                 default:
//                     System.out.println("invalid number");
//             }
//            System.out.println("enter first number");
//                double num1 = new Scanner(System.in).nextDouble();
//            System.out.println("enter second number");
//                double num2 = new Scanner(System.in).nextDouble();
//            System.out.println("Enter operation");
//            char OP= new Scanner(System.in).next().charAt(0);
//            double result =0;
//            switch (OP){
//                case '+':
//                    result = num1+num2;
//                    break;
//                case '-':
//                    result=num1-num2;
//                    break;
//                case '*':
//                    result=num1*num2;
//                    break;
//                case '/':
//                    result=num1/num2;
//                    break;
//                default:
//                    System.out.println("invalid Operation");
//
//            }
//        System.out.println(result);

//        int a = 5;
//        int b = 6;
//        int temp;
//
//        temp = a; // temp indi 5 oldu
//        a = b;    // a indi 6 oldu
//        b = temp; // b indi 5 oldu
//
//        System.out.println("a: " + a); // 6
//        System.out.println("b: " + b); // 5

//        LOOPLAR

//        int num = new Scanner(System.in).nextInt();
//        int faktorial = 1;
//        for(int i =1;i<=num;i++){
//            faktorial*=i;
//
//        }
//        System.out.println(faktorial);
//        if (num %2 == 0) {
//            for (int i = 1; i <= num; i++) {
//                faktorial *= i;
////
////        }
//            }
//            System.out.println(faktorial);
//            }else {
//            System.out.println("error");
//        }
//            int a =555;
//            for(int i =0;i < a;i++){
//                int n1 = a/ 1000%10;
//                int n2=a/100%10;
//                int n3=a/10%10;
//
//            }
        // int a=new Scanner(System.in).nextInt();
        // int b=new Scanner(System.in).nextInt();
        // int c =new Scanner(System.in).nextInt();
        // if((a%2==0 && b%2==0 && c%2==0) || (a%2==1 && b%2==1 && c%2==1)  ){
        //    System.out.println("YES");
        // } else{
        //     System.out.println("no");
        // }
        // Scanner scanner=new Scanner(System.in);
        // int a= scanner.nextInt();
        // int b =scanner.nextInt();
        // int sum=0;
        // for(int i=a;i<b;i++){
        //     if(i%2==1){
        //         sum+=i;
        //     }
        // }
        // System.out.println(sum);
        // Scanner scanner=new Scanner(System.in);
        // int a = scanner.nextInt();
        // int n1 = a/ 1000%10;
        // int n2=a/100%10;
        // int n3=a/10%10;
        // int n4=a%10;
        // System.out.println(n1+n2+n3+n4);
//            Scanner scanner= new Scanner(System.in);
//            int a=scanner.nextInt();
//            int hasil =1;
//            int sum=0;
//            for(;a>0;a/=10){
//                int b=a%10;
//                sum+=b;
//                hasil*=b;
//            }
//
//            System.out.println(sum+hasil);
//            Scanner scanner=new Scanner (System.in);
//            double a=scanner.nextDouble();
//            double b=scanner.nextDouble();
//            double devide=a/b;
//            System.out.printf("%.3f",devide);
//            Scanner scanner= new Scanner(System.in);
//            int a = scanner.nextInt();
//            int faktorial=1;
////            for(int i=1; i<=a;i++){
////                faktorial*=i;
//          }
//
//            int i=a;
//            while(i>1){
//                faktorial*=i;
//                i--;
//            }
//            System.out.println(faktorial);
//            Scanner scanner= new Scanner(System.in);
//            int a= scanner.nextInt();
//            int sum=0;
//            for (int i=1;i<a;i++){
//                if(a%i==0){
//                    sum+=i;
//                }
//            }
//            if(sum==a){
//
//                System.out.println("perfect");
//            }
//            Scanner scanner=new Scanner(System.in);
//            int n=scanner.nextInt();
//            int count=0;
//            while (n!=1){
//                count++;
//                if(n%2!=0){
//                    n+=1;
//                }else{
//                    n/=2;
//                }
//            }
////        System.out.println(count);
//        /// Faktorial
//            Scanner scanner = new Scanner(System.in);
//            int a=scanner.nextInt();
//            int faktorial=1;
//            for(int i=1;i<=a;i++){
//                faktorial*=i;
//            }
//          System.out.println(faktorial);
        ///  polendrom
//            Scanner scanner =new Scanner(System.in);
//            int num = scanner.nextInt();
//            int originalNum =num;
//            int reverseNum=0;
//            for(;num>0;num/=10){
//                int lastNum=num%10;
//                reverseNum=reverseNum*10+lastNum;
//            }
//            if(originalNum==reverseNum){
//                System.out.println("palendrom");
//            }else {
//                System.out.println("not polendrom");
//            }
        /// zer oyunu
//            Scanner scanner=new Scanner(System.in);
//            Random random= new Random();
//        int score1 = 0, score2 = 0;
//        int prevScore1, prevScore2;
//
//        while (true) {
//            prevScore1=score1;
//            int reqem1=random.nextInt(6)+1;
//            score1+=reqem1;
//            System.out.println("Player 1 rolled: "+reqem1+" | score : "+score1);
//            if (score1 == 30) {
//                System.out.println("Player 1 is winner");
//                break;
//            } else if (score1>30) {
//                score1=prevScore1;
//                System.out.println("Player 1's score passed 30,Stocked back to the previous score "+score1
//                );
//            }
//            prevScore2=score2;
//            int reqem2=random.nextInt(6)+1;
//            System.out.println("Player 2's rolled: " +reqem2+" | score: "+reqem2);
//            if(score2==30){
//                score2+=reqem2;
//                System.out.println("Player 1 is winner");
//
//
//            } else if (score2>30) {
//                score2=prevScore2;
//                System.out.println("Player 2's score passed 30,Stocked back to the previous score "+score2);
//
//            }
////
////
//            System.out.println("Davam etmək üçün ENTER basın...");
//            scanner.nextLine();
//
//        }
        /// sade ededler 100-e qeder
//        for(int i=2;i<=100;i++){
//            boolean murekkeb=false;
//            for (int j=2;j<i/2;j++){
//                if(i%j==0){
//                    murekkeb=true;
//                    break;
//                }
//
//            }
//            if(!murekkeb){
//                System.out.println(i+"sade");
//            }
//        }
        /// lesson5 -arrays
//        int [] arr= new int [30];
////        int faktorial=0;
////        for(int i=0;i<100;i++){
////            arr[i]=i+1;
//////            if(arr[i]%3==0){
//////                System.out.println(arr[i]);
//////            }
////            faktorial*=arr[i];
////            System.out.println(faktorial);
//            for (int i =0;i <arr.length;i++){
//                arr[i]=i+1;
//            }
//            for (int i =0; i<arr.length;i++){
//                int factoria =1;
//                for (int j =1; j<=i;j++){
//                    factoria*=j;
//                }
//                System.out.println(factoria);
//            }
      ////      // arrayin min max ededi tapmaq , 2 dene array var birinin olcusu 7 digerinin 8dir ve
        // arrayin ecerisinde butun ededler eynidir 1 ededden basqa onu tapmaq , arrayin icerisinde en kicik 2 ededi qaytaracaq,
        // arrayin daxilindeki reqemleri cemleyende hansi ededlerin cemi minumumdursa onlari cixart,

        /// min max value
//        int [] arr ={1,2,33,4,5};
//        int min=arr[0];
//        int max=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//
//            } else if (arr[i]<min) {
//                min=arr[i];
//            }
//        }
//        System.out.println("Max value of array is :"+max );
//        System.out.println("Min value of array is :"+min);
        /// ferqli kompanenti tapmaq
//        int [] arr1={1,2,3,4,5,6,7};
//        int [] arr2={2,1,8,4,5,3,7,6};
//        for (int i =0; i<arr2.length;i++){
//            if (arr1[i]!=arr2[i]){
//                System.out.println("Different component is : " + arr2[i]);
//
//                break;
//         }
//        }
        /// minimum cem
//      int [] arr={1,3,4,1,6,7};
//      int min1=arr[0];
//      int min2=arr[1];
//      for (int i=1;i< args.length;i++){
//            if(arr[i]<min1){
//                min1=arr[i];
//            } else if (arr[i]<min2) {
//                arr[i]=min2;
//            }
//      }
//        System.out.println(min2+min1);
        /// MENTOR DERSI
        /// fibonachi
//       Scanner  scanner=new Scanner(System.in);
//        System.out.println("input lenght");
//       int lenght =scanner.nextInt();
//       int [] Array = new int[lenght];
//        System.out.println("Input the index 0");
//        Array[0]=scanner.nextInt();
//        System.out.println("Input the first index");
//        Array[1]=scanner.nextInt();
//        for (int i=2;i<Array.length;i++){
//            Array[i]=Array[i-1]+Array[i-2];
//        }
//        System.out.println("Fibonacci Array: " + Arrays.toString(Array));
        /// ferqli eded tapilmasi
//        int [] arr1={1,2,4,5,6};
//        int [] arr2={3,2,5,9,10};
//        for (int i=0;i<arr1.length;i++){
//            if(arr1[i]!=arr2[i]){
//            }else {
//                System.out.println(arr2[i]);
//            }
//        }
        /// ortalamasini tapmaq
//        int [] array={1,2,3,4,5,6};
//        int sum=0;
//        for (int i=0;i< array.length;i++){
//            sum+=array[i];
//        }
//        float average =sum/array.length;
//        System.out.println(average);
        /// ilk elementle son elementin yerlerini deyismek

        /// Tam ədədlər ardıcıllığı verilir(array ile). Ardıcıllığın hər bir mənfi olmayan elementini 2 vahid artırmalı(arrayde qalacaq).
//        int [] array={1,2,-3,5,-6};
//        int num=0;
//        for (int i=0;i< array.length;i++){
//            if (array[i]>=0){
//                array[i]=array[i]+2;
//            }
//        }
//        System.out.println(Arrays.toString(array));
        /// Natural ədədin onluq yazılışında rəqəmləri eyni olan və bu ədədin onluq yazılışının mərkəzinə nəzərən
        ///simmetrik yerləşən cütlüklərin sayını həmin ədədin simmetriya dərəcəsi adlandıracağıq.
        ////Əgər ədəddə hər hansı rəqəm onluq yazılışda ortada yerləşirsə, onu da özü ilə bir cütlük kimi saymaq lazımdır.
        ////n ədədinin simmetriya dərəcəsini tapın.
        ///   1235321
        /// n sayda tam ədədlər üçün 6-ya tam (qalıqsız) bölünən müsbət ədədlərin cəmini və sayını tapın.
        ///(n - arrayin ölçüsüdü Scanner ile daxil edin)
//        Scanner scanner=new Scanner(System.in);
//        int lenght=scanner.nextInt();
//        int [] arr=new int[lenght] ;
//        int num1=arr[0];
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]/6==0){
//
//            }
//        }


        /// uzunlugu 10 olan array var 3
//
//        int[] arr = new int[10];
//        int size = 0;
//        Scanner scanner = new Scanner(System.in);
//
//         System.out.println("input number");
//
//         while (true) {
//         int input = scanner.nextInt();
//
//         if (input < 0){
//             break;
//         }
//         if (size == arr.length) {
//           int newCapacity = (int) (arr.length * 1.5);
//           int[] newArray = new int[newCapacity];
//
//           for (int i = 0; i < arr.length; i++) {
//           newArray[i] = arr[i];
//            }arr = newArray;
//         }
//         arr[size++] = input;
//         }
//         System.out.println("Elements of array:");
//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }

        /// multi dimension array
//        int [] [] arr= { {1,9,3,4,5},{6,7,0,6}};
//        int min1=arr[0][0];
//        int min2=arr[0][1];
//        for (int i = 0; i < arr.length; i++) {
//          for(int j=0;j<arr[i].length;j++){
//              int current=arr[i][j];
//
//          }
//        }
//        System.out.println(min1);
//        System.out.println(min2);
        /// bir arrayimiz var tek olculudu onun icerisindeki minumum ededi tapib onu diger butun ededlerden cixib
        /// alinan ededleri yeni arrayin daxiline yaziriq bunu butun hedler 0 olana qeder davam edirik

//        int[] arr = {34,2, 1, 3, 4, 6,7,8,9,12};
//
//        while (true) {
//            int min =0;
//            boolean num = true;
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] != 0) {
//                    if (min == 0 || arr[i] < min) {
//                        min = arr[i];
//                    }
//                    num = false;
//                }
//            }
//            if (num) {
//                break;
//            }
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] != 0) {
//                    arr[i] = arr[i] - min;
//                }
//            }
//            System.out.println(Arrays.toString(arr));
//        }
        /// OOP
        MyMath myMath = new MyMath();
        Scanner scanner=new Scanner(System.in);
        /// MIN EDED
          //  System.out.println("enter first number");
//        int a= scanner.nextInt();
//            System.out.println("enter second number");
//        int b=scanner.nextInt();
//        System.out.println(" Minimum number is : " + myMath.minumum(a,b));


               //// MAX EDED
//          System.out.println("enter first number");
//        int a= scanner.nextInt();
//         System.out.println("enter second number");
//        int b=scanner.nextInt();
//          System.out.println(" Minimum number is : " + myMath.max(a,b));

        /// ARRAYIN MIN DEYERI
//        int [] arr={1,3,34,45,6};
//         System.out.println(new MyMath().arrayMinumum(arr));

        ///FAKTORIAL
        //System.out.println("enter number");
//        int num =scanner.nextInt();
//        System.out.println(new MyMath().faktorial(num));

        ///EDEDIN QUVVETI

//        System.out.println("Enter number");
//        int num= scanner.nextInt();
//        System.out.println("Enter power");
//        int power= scanner.nextInt();
//        int result;
//        System.out.println(new MyMath().power(num,power));

        ///SADE MUREKKEB

//        System.out.println("Enter number : ");
//        int num= scanner.nextInt();
//
//        if (num <= 1) {
//            System.out.println("1-den boyuk eded daxil edin");
//        } else if (myMath.isPrime(num)) {
//            System.out.println("eded sadedir");
//        }
            ///TEK VE CUT
//            System.out.println("Enter number");
//            int num= scanner.nextInt();
//            System.out.println(new MyMath().tekCut(num));

        /// CALCULATOR
//        System.out.println( "Enter first number");
//        int num1= scanner.nextInt();
//        System.out.println("Enter second number");
//        int num2= scanner.nextInt();
//        System.out.println("Enter operation +,*,%");
//        char op= scanner.next().charAt(0);
//        double result=myMath.calculator(num1,num2,op);
//        System.out.println("Result is : "+ result);

            /// POLENDROM
//            System.out.println("Enter number");
//            int num= scanner.nextInt();
//            System.out.println(new MyMath().isPolendrom(num));

        ///

        

    }
}

     
