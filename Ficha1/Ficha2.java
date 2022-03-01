import java.time.LocalDateTime;
import java.util.Scanner;

public class Ficha2 {
 
    public int lerMinimoArrayInteiros(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos pretende colocar no array? ");
        int n = sc.nextInt();
        int arrayInt[] = new int[n];
        
        for(int i=0; i<n; i++){
            System.out.print("Elemento para inserir no array: ");
            int elemento = sc.nextInt();
            arrayInt[i] = elemento;
        }

        int minimo = arrayInt[0];
        for(int i=0; i<n; i++){
            if (arrayInt[i]<minimo) minimo=arrayInt[i];
        }

        sc.close();
        return minimo;
    }  

    public int[] subArrayInteiros(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos pretende colocar no array? ");
        int n = sc.nextInt();
        int arrayInt[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Elemento para inserir no array: ");
            int elemento = sc.nextInt();
            arrayInt[i] = elemento;
        }

        
        System.out.print("índice de início: ");
        int beg = sc.nextInt();
        System.out.print("índice de término: ");
        int end = sc.nextInt();
        int subArraySize = end-beg+1;
        int subArray[] = new int[subArraySize];
        for(int j=0; j<subArraySize; j++){
            subArray[j]=arrayInt[beg+j];
        } 
        sc.close();
        return subArray;     
    }

    public int[] commonIntArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos pretende colocar no primeiro array? ");
        int n1 = sc.nextInt();
        int array1[] = new int[n1];
        for(int i=0; i<n1; i++){
            System.out.print("Elemento para inserir no array: ");
            int elemento1 = sc.nextInt();
            array1[i] = elemento1;
        }

        System.out.print("Quantos elementos pretende colocar no segundo array? ");
        int n2 = sc.nextInt();
        int array2[] = new int[n2];
        for(int j=0; j<n2; j++){
            System.out.print("Elemento para inserir no array: ");
            int elemento2 = sc.nextInt();
            array2[j] = elemento2;
        }

        int maxArraySize;
        if (n1<n2) maxArraySize = n2; else maxArraySize = n1;
        int[] aux = new int[maxArraySize];

        int counter = 0;

        for(int a=0; a<n1; a++){
            for(int b=0; b<n2; b++){
                if(array1[a]==array2[b]){
                    aux[counter]=array1[a];
                    counter++;
                } 
            }
        }

        int[] commonsIntArray = new int[counter]; 
        for(int c=0; c<counter; c++){
            commonsIntArray[c] = aux[c];
        }

        
        //still need to fix giving multiple equal values

        sc.close();
        return commonsIntArray;

    }



    
}