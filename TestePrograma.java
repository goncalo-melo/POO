import java.util.Scanner;
import Ficha1.ficha1;
import Ficha2.ficha2;

public class TestePrograma{
    public static void main(String[] args){
        //Ficha1 ficha1 = new Ficha1();
        Ficha2 ficha2 = new Ficha2();

        Scanner sc = new Scanner(System.in);

        //System.out.print("Introduza o número da classe de exercícios: ");
        //int numExercicios = sc.nextInt();
        System.out.print("Introduza o número do exercício: ");
        int exercicio = sc.nextInt();

        switch(exercicio){

            case 1:
                System.out.print("Introduza a alínea: ");
                String alinea1 = sc.next();
                switch(alinea1){

                    case "a":
                        int minimo = ficha2.lerMinimoArrayInteiros();
                        System.out.println("O menor elemento do array é "+minimo);
                        break;
                    
                    case "b":
                        int[] subArray = ficha2.subArrayInteiros();
                        System.out.print("O subarray entre os dois índices é: ");
                        for(int i=0; i<subArray.length; i++){
                            System.out.print(subArray[i]+" ");
                        }
                        System.out.print("\n");
                        break;
                    case "c":
                        int[] commonIntArray = ficha2.commonIntArray();
                        System.out.print("O array com os elementos comuns é: ");
                        for(int i=0; i<commonIntArray.length; i++){
                            System.out.print(commonIntArray[i]+" ");
                        }
                        System.out.print("\n");
                        break;

            case 2:
                System.out.print("Introduza a alínea: ");
                String alinea2 = sc.next();
                switch(alinea2){

                    case "a":
                        
                        break;
                    
                    case "b":       


        /*switch(numExercicios){

            case 1:

            switch(exercicio){

               // case 1:
                 
            }

            case 2:{

                switch(exercicio){

                    case 1:
                        System.out.print("Introduza a temperatura em graus: ");
                        double temp = sc.nextDouble();
                        double result1 = ficha1.celsiusParaFarenheit(temp);
                        System.out.println("Temperatura em Farenheit: " + result1 );
                        break;
                    case 2:
                        System.out.print("Introduza o primeiro número: ");
                        int a = sc.nextInt();
                        System.out.print("Introduza o segundo número: ");
                        int b = sc.nextInt();
                        int max = ficha1.maximoNumeros(a, b);
                        System.out.println("O maior dos dois números é: " + max );
                        break;
                    case 3:
                        System.out.print("Introduza o seu nome: ");
                        String nome = sc.next();
                        System.out.print("Introduza o seu saldo: ");
                        double saldo = sc.nextDouble();
                        String descricao = ficha1.criaDescricaoConta(nome, saldo);
                        System.out.println(descricao);
                        break;
                    case 4:
                        System.out.print("Introduza o valor em euros: ");
                        double euros = sc.nextDouble();
                        System.out.print("Introduza a taxa de conversão: ");
                        double taxaConversao = sc.nextDouble();
                        double libras = ficha1.eurosParaLibras(euros, taxaConversao);
                        System.out.println("Valor em libras: " +  libras);
                        break;
                    case 5:
                        String string = ficha1.lerInteirosMedia();
                        System.out.println(string);
                        break;
                    case 6:
                        System.out.print("Introduza um número inteiro: ");
                        int num = sc.nextInt();
                        long factorial = ficha1.factorial(num);
                        System.out.println("O fatorial do número introduzido é: "+factorial);
                        break;
                    case 7:
                        long timeSpent = ficha1.tempoGasto();
                        System.out.println("O tempo gasto foi: "+timeSpent);
                        break;
                }

            }
        }
       */
        sc.close();


    }
}
