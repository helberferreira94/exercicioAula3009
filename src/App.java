import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      //FAÇA UM PROGRAMA QUE LE AS DUAS NOTAS PARCIAIS OBTIDAS 
      //POR UM ALUNO NUMA DISCIPLINA AO LONGO DE UM SEMESTRE E 
      //CALCULE SUA MÉDIA.
      
      //inserir a nota
      double nota1;
      double nota2;
      double media;
      String conceito;

      Scanner sc = new Scanner(System.in);
      System.out.println("Digite a primeira nota ");
      nota1 = sc.nextDouble();
      System.out.println("Digite a segunda nota ");
      nota2 = sc.nextDouble();      
      sc.close();

      //calcular a média
      media = (nota1 + nota2) / 2;
      System.out.println("Sua média é " + media);

        //ENTRE 9.0 E 10 CONCEITO A
        //ENTRE 7.5 E 9.0 CONCEITO B
        //ENTRE 6.0 E 7.5 CONCEITO C
        //ENTRE 4.0 E 6.0 CONCEITO D
        //ENTRE 4.0 E ZERO CONCEITO E

        if (media <=10 && media >=9) {
            conceito = "A";
            System.out.println("Seu conceito é: " + conceito);
        }
        else if (media < 9 && media >= 7.5) {
            conceito = "B";
            System.out.println("Seu conceito é " + conceito);
        }
        
        else if (media < 7.5 && media >= 6) {
            conceito = "C";
            System.out.println("Seu conceito é " + conceito);
        }

        else if (media <6 && media >=4){
            conceito = "D";
            System.out.println("Seu conceito é " + conceito);
        }    

        else {
            conceito = "E";
            System.out.println(" Seu conceito é " + conceito);
        }
        
        //verificar se está aprovado

        if (conceito == "A" || conceito == "B"|| conceito == "C" ){
            System.out.println("VOCE ESTÁ APROVADO");
        }
            else {
            System.out.println("VOCE ESTÁ REPROVADO");
        }    

        }

        

        }  


        


