import java.util.Scanner;


public class TestePrograma{


    public static void main(String[] args){
        Ficha1 ficha1 = new Ficha1();
        Ficha2 ficha2 = new Ficha2();
        //Ficha3 ficha3 = new Ficha3();

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza a ficha: ");
        String ficha = sc.next();

        switch(ficha){

            // --- FICHA 1 ---
            case "1":     
            System.out.print("Introduza o número do exercício: ");
            int exercicio1 = sc.nextInt();

            switch(exercicio1){

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
                    System.out.println("O tempo gasto foi: "+timeSpent +" milisegundos");
                    break;
            }
            break;

            // --- FICHA 2 ---
            case "2":     
            
            System.out.print("Introduza o número do exercício: ");
            int exercicio2 = sc.nextInt();

            System.out.print("Introduza a alínea: ");
            String alinea2 = sc.next();

            // número do exercício da ficha 2
            switch(exercicio2){

                case 1:
                    // alínea do exercício 1 da ficha 2
                    switch(alinea2){

                        case "a":
                            int minimo = ficha2.lerMinimoArrayInteiros(buildArrayInt());
                            System.out.println("O menor elemento do array é "+minimo);
                            break;
                        
                        case "b":
                            int[] arrayInt = buildArrayInt();
                            System.out.print("índice de início: ");
                            int beg = sc.nextInt(); // erro nesta linha ; fix me pls ;-;
                            System.out.print("índice de término: ");
                            int end = sc.nextInt();
                            
                            int[] subArray = ficha2.subArrayInteiros(arrayInt, beg, end);

                            System.out.print("O subarray entre os dois índices é: ");
                            for(int i=0; i<subArray.length; i++){
                                System.out.print(subArray[i]+" ");
                            }
                            System.out.print("\n");
                            break;
                        case "c":
                            System.out.println("Construa o primeiro array:");
                            int[] array1 = buildArrayInt();
                            System.out.println("Construa o segundo array:");
                            int[] array2 = buildArrayInt();

                            int[] commonIntArray = ficha2.commonIntArray(array1, array2);
                            System.out.print("O array com os elementos comuns é: ");
                            for(int i=0; i<commonIntArray.length; i++){
                                System.out.print(commonIntArray[i]+" ");
                            }
                            System.out.print("\n");
                            break;
                    }

                case 2:
                    switch(alinea2){

                        case "a":
                           
                            break;
                        
                        case "b":
                           
                            break;
                        case "c":
                            
                            break;
                    }


            }
            
            // --- CIRCULO ---
            case "Círculo":
            Ponto centro = new Ponto();
            Circulo c = new Circulo(centro, 0);
            
            System.out.println(c);
            centro.setX(1);
            centro.setY(1);
            System.out.println(c);
            break;

            // --- LINHA DE ENCOMENDA ---
            case "LinhaDeEncomenda":

            LinhaDeEncomenda linhaDeEncomenda = new LinhaDeEncomenda("abc", "linha fixe", 59.90, 2, 0.23, 0.10);
            
            String l = linhaDeEncomenda.toString();
            double valorEncomenda = linhaDeEncomenda.calculaValorLinhaEnc();
            double valorPoupado = linhaDeEncomenda.calculaValorDesconto();

            System.out.println(l);
            System.out.println("O valor da encomenda é: "+valorEncomenda);
            System.out.println("O dinheiro poupado na encomenda foi: "+valorPoupado);
            break;

            case "Encomenda":

            break;



        }
        sc.close();
    }


    //auxiliary functions
    public static int[] buildArrayInt(){      
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos pretende colocar no array? ");
        int n = sc.nextInt();
        int arrayInt[] = new int[n];
        
        for(int i=0; i<n; i++){
            System.out.print("Elemento para inserir no array: ");
            int elem = sc.nextInt();
            arrayInt[i] = elem;
        }
        //sc.close();
        return arrayInt;
    }
}
