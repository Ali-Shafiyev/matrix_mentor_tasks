package matrix;

public class MyMath {
     double minumum(int a,int b){
        return (a < b) ? a : b;

    }

    double max(int a,int b){
         return (a>b) ? a:b;
    }

    int arrayMinumum(int [] arr ){
     int min1=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min1){
                min1=arr[i];
            }
        }
        return min1;
    }

    int faktorial(int num){
         int result=1;
        for (int i = 1; i <=num; i++) {
            result*=i;
        }
        return result;
    }

    int power(int num , int power){
         int result=1;
        for (int i = 0; i <power ; i++) {
            result*=num;

        }
        return result;
    }

    boolean isPrime(int a){
         for (int i=2;i<Math.sqrt(a);a++){
             if(a%i==0){
                 return false;
             }
         }
        return true;
    }

    int isPolendrom(int a){
         int originalNum=a;
         int reversedNum=0;
        for( ;a>0;a/=10) {
            int lastNum=a%10;
            reversedNum=reversedNum*10+lastNum;
        }
        if(originalNum==reversedNum){
                System.out.println("polendrom");
            }else {
                System.out.println(" polendrom deyil");
            }
       return a;
    }
    String tekCut(int a){
         if (a%2==0){
             return "eded murekkebdir";
         }
    return "Eded sadedir";
    }
    double calculator(int a , int b, char c){
        int result=0;
        switch (c){
            case '+':
                result=a+b;
                break;
            case '*':
                result=a*b;
                break;
            case '%':
                result= a%b;
                break;

        }
        return result;
    }
}
