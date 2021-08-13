public class Exercicio50Porcento{
    public static void main(String[] args){
        int janeiroGasto = 15000;
        int fevereiroGasto = 23000;
        int marcoGasto = 17000;

        int gastoTrimestral = janeiroGasto + fevereiroGasto + marcoGasto;

        System.out.println("O gasto trimestral dessa empresa é igual a: " + gastoTrimestral + " reais");

        int mediaMensal = gastoTrimestral/3;

        System.out.println("A média mensal da empresa é igual a: " + mediaMensal + " reais");
    }
}