import java.util.Scanner;

public class mentorTasks {
    /**
 * @param args
 */
public static void main(String[] args) {
    //      int a=new Scanner(System.in).nextInt();
    //     int b=new Scanner(System.in).nextInt();
    //     int c =new Scanner(System.in).nextInt();
    //     if((a%2==0 && b%2==0 && c%2==0) || (a%2==1 && b%2==1 && c%2==1)  ){
    //        System.out.println("YES");
    //     } else{
    //         System.out.println("no");
    //     }


    //     Scanner scanner=new Scanner(System.in);
    //     int a= scanner.nextInt();
    //     int b =scanner.nextInt();
    //     int sum=0;
    //     for(int i=a;i<b;i++){
    //         if(i%2==1){
    //             sum+=i;
    //         }
    //     }
    //     System.out.println(sum);



    //     Scanner scanner=new Scanner(System.in);
    //     int a = scanner.nextInt();
    //     int n1 = a/ 1000%10;
    //     int n2=a/100%10;
    //     int n3=a/10%10;
    //     int n4=a%10;
    //     System.out.println(n1+n2+n3+n4);


    //        Scanner scanner= new Scanner(System.in);
    //        int a=scanner.nextInt();
    //        int hasil =1;
    //        int sum=0;
    //        for(;a>0;a/=10){
    //            int b=a%10;
    //            sum+=b;
    //            hasil*=b;
    //        }
            // System.out.println(sum+hasil);


    //        Scanner scanner=new Scanner (System.in);
    //        double a=scanner.nextDouble();
    //        double b=scanner.nextDouble();
    //        double devide=a/b;
    //        System.out.printf("%.3f",devide);
    //        Scanner scanner= new Scanner(System.in);
    //        int a = scanner.nextInt();
    //        int faktorial=1;
    //        for(int i=1; i<=a;i++){
    //            faktorial*=i;
    //      }

    //        int i=a;
    //        while(i>1){
    //            faktorial*=i;
    //            i--;
    //        }
    //        System.out.println(faktorial);



    //        Scanner scanner= new Scanner(System.in);
    //        int a= scanner.nextInt();
    //        int sum=0;
    //        for (int i=1;i<a;i++){
    //            if(a%i==0){
    //                sum+=i;
    //            }
    //        }
    //        if(sum==a){

    //            System.out.println("perfect");
    //        }
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
//        System.out.println(count);
        
                ///REVERS NUMBERS
                
        //     Scanner scanner=new Scanner(System.in);
        //     System.out.println("enter number");
        //     int num=scanner.nextInt();
        //    int reverse=0;
        //    while (num!=0) {
        //     int digit =num%10;
        //     reverse=reverse*10+digit;
        //     num/=10;
        //    }
        //    System.out.println(reverse);

        ///FIND SECOND DIGIR OF NUMBER
        /// FIBONACHI SIRASI
        /// 
        /// FIQURLAR
        // for(int i=1;i<7;i++){
        //    for(int j=0;j<i;j++){
        //         System.out.print("*");
        //    }
        //    System.out.println(" ");
        // }
//        for(int i=1;i<6;i++){
//         for(int k=5;i<k;k--){
//                 System.out.print(" ");
//         }
//         for(int j=0;j<i;j++){
//                 System.out.print("*");
//         }
//         System.out.println("");
//        }
        // for(int i=1;i<6;i++){
        //         for(int k=6;k>i;k--){
        //                 System.out.print(" ");
        //         }
        //         for(int j=0;j<(2*i-1);j++){
        //                 System.out.print("*");
        //         }
        //         System.out.println("");
        // }
        for(int i=1;i<6;i++){
                for(int k=6;k>i;k--){
                        System.out.print(" ");
                }
                for(int j=0;j<(2*i-1);j++){
                        System.out.print("*");
                }
                System.out.println("");
                
        }
        for(int i=1;i<2;i++){
                for(int k=6;k>i;k--){
                        System.out.print(" ");
                }
                System.out.print("*");
        }
      }
    } 

