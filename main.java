import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class main {
    public static double sum(double a,double b){
        return a+b;
    }
    public static double hasil(double a, double b){
        return a*b;
    }
    public static double devide(double a,double b){
        return a%b;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Choose opreation"+"operation 1 +" +"operation 2 */n" +"operation 3 %"+"operation 4 exit" );
            int op=scanner.nextInt();
            if(op==4){
                break;
            }
            System.out.println("enter number");
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            switch (op){
                case 1:
                    System.out.println("Result is :"+sum(a,b));
                    break;

                case 2:
                    System.out.println("Result is :"+hasil(a,b));
                    break;

                case 3:
                    System.out.println("Result is :"+devide(a,b));
            }
        }

//      /// fibonachi
//       Scanner  scanner=new Scanner(System.in);
//        System.out.println("input lenght");
//       int lenght =scanner.nextInt();
//       int [] array = new int[lenght];
//        System.out.println("Input the index 0");
//        array[0]=scanner.nextInt();
//        System.out.println("Input the first index");
//        array[1]=scanner.nextInt();
//        for (int i=2;i<array.length;i++){
//            array[i]=array[i-1]+array[i-2];
//        }
////        System.out.println("Fibonacci array: " + Arrays.toString(array));
//    /// ferqli eded tapilmasi
//        int [] arr1={1,2,4,5,6};
//        int [] arr2={3,2,5,9,10};
//        for (int i=0;i<arr1.length;i++){
//            if(arr1[i]!=arr2[i]){
//            }else {
//                System.out.println(arr2[i]);
//            }
//        }
//    /// ortalamasini tapmaq
//        int [] array={1,2,3,4,5,6};
//        int sum=0;
//        for (int i=0;i< array.length;i++){
//            sum+=array[i];
//        }
//        float average =sum/array.length;
//        System.out.println(average);

///        ilk elementle son elementin yerlerini deyismek
//        int [] arr={1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));
//        int temp=arr[0];
//        arr[0] = arr[arr.length - 1];
//        arr[arr.length - 1] = temp;
//        System.out.println(Arrays.toString(arr));
        /// Tam ədədlər ardıcıllığı verilir(array ile). Ardıcıllığın hər bir
        ///mənfi olmayan elementini 2 vahid artırmalı(arrayde qalacaq).
//        int [] arr={1,2,3,4,5,6,-3,-4};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= 0) {
//                arr[i] = arr[i + 2];
//            }}
//
        /// Natural ədədin onluq yazılışında rəqəmləri eyni olan və bu ədədin onluq yazılışının
//        mərkəzinə nəzərən simmetrik yerləşən cütlüklərin sayını həmin ədədin simmetriya
//        dərəcəsi adlandıracağıq. Əgər ədəddə hər hansı rəqəm onluq yazılışda ortada yerləşirsə,
//       onu da özü ilə bir cütlük kimi saymaq lazımdır. n ədədinin simmetriya dərəcəsini tapın.

        /// n sayda tam ədədlər üçün 6-ya tam (qalıqsız) bölünən müsbət ədədlərin cəmini və sayını tapın.
        ///(n - arrayin ölçüsüdü Scanner ile daxil edin)
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("input size");
//        int size= scanner.nextInt();
//        int [] arr=new int[size];
//        int i=0;
//        while (i<size){
//            System.out.println("Input number");
//            int num= scanner.nextInt();
//            if (num%6==0){
//                arr[i]=num;
//                i++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
////     array-də qiyməti 2.5-dən böyük olmayan ilk elementini taparaq index-ni ve deyerini ekrana çıxarın. (double ola biler)
//        double [] arr={1,2,3,2.6};
//        for(int i=0;i< arr.length;i++){
//            if (arr[i]>2.5){
//                System.out.println("arr [" +i +"]" +" = "+ arr[i]);
//            }
//        }
        /// Arrayin elementlerinden basqa digerleri ile hasilini yeni arrayde yazmaq.
        /// (1 2 3 4  ->  24 12 8 6)(meselen 2-nin yerine ozunden basqa diger 3 elementi bir birine vurub yaziriq
//        int [] arr={1,2,3};
//        int[] result = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            int product = 1;
//            for (int j = 0; j < arr.length; j++) {
//                if (i != j) {
//                    product *= arr[j];
//                }
//            }
//            result[i] = product;
//        }
//
//        System.out.println("Nəticə: " + Arrays.toString(result));

        /// bouble sort
//        int [] arr={5,3,4,6,36,265,1};
//        for (int i = 0; i < arr.length-1 ; i++) {
//            for (int j = 0; j < arr.length-1-i ; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//            System.out.println(Arrays.toString(arr));
//        }
//        System.out.println(Arrays.toString(arr));
        ///

    }

}
