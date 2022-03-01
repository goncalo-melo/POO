import java.time.LocalDateTime;
import java.util.Scanner;

public class Ficha1{

//EXERCÍCIOS I

  /*  public String classificacoes(){

        System.out.print("Insira o número de classificações: ");
        n = sc.nextInt();

        double classificacoes[] = new double[n];
        double zeroCinco[] = new double[n];
        double cincoDez[] = new double[n];
        double dezQuinze[] = new double[n];
        double quinzeVinte[] = new double[n];

        int counter1=0;
        int counter2=0;
        int counter3=0;
        int counter4=0;

        for(int i=0; i<n-1; i++){
            if(classificacoes[i]>=0 && classificacoes[i]<5){
                zeroCinco[counter1] = classificacoes[i];
                counter1++;
            } 
            if(classificacoes[i]>=5 && classificacoes[i]<10){
                cincoDez[counter2] = classificacoes[i];
                counter2++;
            }
            if(classificacoes[i]>=10 && classificacoes[i]<15){
                dezQuinze[counter3] = classificacoes[i];
                counter3++;
            }
            if(classificacoes[i]>=15 && classificacoes[i]<20){
                quinzeVinte[counter4] = classificacoes[i];
                counter4++;
            }
        }
        String 

    }
*/





//EXERCÍCIOS II

    public double celsiusParaFarenheit(double graus){
        return 1.8*graus+32;
    }

    public int maximoNumeros(int a, int b){
        int max = a;
        if(b>a) max = b;
        return max;
    }

    public String criaDescricaoConta(String nome, double saldo){
        String descricao = "Nome: " + nome + "\nSaldo: " + saldo;
        return descricao;
    }

    public double eurosParaLibras(double valor, double taxaConversao){
        double libras = valor*taxaConversao;
        return libras;
    }

    public String lerInteirosMedia(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Introduza o segundo número: ");
        int b = sc.nextInt();
        double media = (a+b)/2;
        int maior = a;
        int menor = b;
        if(a<b){
            maior=b;
            menor=a;
        }
        String string = "Números por ordem decrescente: " + maior +" "+ menor + "\nA média dos dois números é: " + media;
        sc.close();
        return string;
    }

    public long factorial(int num){
        long factorial = 1;
        while(num!=0){
            factorial = num*factorial;
            num--;
        }
        return factorial;
    }

    public long tempoGasto(){
        LocalDateTime start = LocalDateTime.now();
        long startTime = start.getNano();
        long factorialResult = factorial(5000);
        LocalDateTime end = LocalDateTime.now();
        long endTime = end.getNano();
        return (endTime - startTime)/1000000;
    }
//----------------------------------------------------------------------------

}

//<>
