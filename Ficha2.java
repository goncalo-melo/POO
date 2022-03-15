import java.util.Scanner;
import java.lang.System;
import java.util.Arrays;
import java.time.LocalDateTime;

public class Ficha2 {



    public int lerMinimoArrayInteiros(int[] arrayInt){

        int minimo = arrayInt[0];
        for(int i=1; i<arrayInt.length; i++){
            if (arrayInt[i]<minimo) minimo=arrayInt[i];
        }

        return minimo;
    }  

    public int[] subArrayInteiros(int[] arrayInt, int beg, int end){
        
        int subArraySize = end-beg+1;
        int subArray[] = new int[subArraySize];
        for(int j=0; j<subArraySize; j++){
            subArray[j]=arrayInt[beg+j];
        } 
        
        return subArray;     
    }

    public int[] commonIntArray(int[] array1, int[] array2){

        int maxArraySize;
        if (array1.length<array2.length) maxArraySize = array2.length; else maxArraySize = array1.length;
        int[] aux = new int[maxArraySize];
        
        int counter = 0;

        for(int a=0; a<array1.length; a++){
            for(int b=0; b<array2.length; b++){
                if(array1[a]==array2[b] && (Arrays.binarySearch(aux, array1[a])<0)){ // fix me pls ;-;
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

        return commonsIntArray;

    }








    
}