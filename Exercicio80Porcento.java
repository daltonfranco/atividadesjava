import java.util.Scanner;

public class Exercicio80Porcento{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int x = 150;
        int soma = 0;
        int y = 0;
        int m3 = 3;
        int m10 = 1;
        int mult = 1;
        int num1;

        //Exercicio 1
        while(x < 301){
            System.out.println(x);
            x++;
        }
        System.out.println();

        System.out.println("Aperte qualquer caractere parar ir ao exercicio 2: ");
        String condicao2 = sc.nextLine();

        System.out.println();

        //Exercicio 2

        while(y < 1001){
            //System.out.println(y);
            soma += y;
            y++;
        }

        System.out.println("A soma entre os numeros de 0 a 1000 é igual a: " + soma);
        System.out.println();

        System.out.println("Aperte qualquer caractere parar ir ao exercicio 3: ");
        String condicao3 = sc.nextLine();

        System.out.println();

        //Exercicio 3

        while(m3 < 100){
            System.out.println(m3);
            m3 += 3;
        }
        System.out.println();

        System.out.println("Aperte qualquer caractere parar ir ao exercicio 4: ");
        String condicao4 = sc.nextLine();

        System.out.println();

        //Exercicio 4

        while(m10 < 11){
            System.out.println(m10);
            mult *= m10;
            m10++;
        }

        
        System.out.println();

        //Exercicio 5

        System.out.println("A multiplicação dos numeros de 1 a 10 é igual a: " + mult);

        System.out.println();

        System.out.println("Aperte qualquer caractere parar ir ao exercicio 5: ");
        String condicao5 = sc.nextLine();

        System.out.println();

        

        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();

        if(num1 % 2 == 0){
            num1 = num1/2;
        }else{
            num1 = (num1 * 3) + 1;
        }

        System.out.println(num1);
    }
}