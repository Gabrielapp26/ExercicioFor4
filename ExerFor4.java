//Imprima os fatoriais de 1 a 10
public class ExerFor4{
    public static void main(String[] args){
        int resultado = 1;
        int fatorial = 10;
        for(int n=1; n<=fatorial; n++){
            resultado *= n;
           /* if (n>fatorial){
                for(fatorial = 1; n<=10; n++){
                    fatorial = fatorial +1;
                    resultado *= n;*/
                    System.out.println("O Fatorial de "+ n +" é: "+ resultado);
                
            
        }
}}           