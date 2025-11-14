import java.util.Scanner;
import java.util.Random;

public class GeradorDeSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
    
    String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
    String numeros = "0123456789";
    String simbolos = "!@#$%&*-;";

    String caracteresPermitidos = "";

    System.out.print( "Tamanho da senha");
    int tamanho = scanner.nextInt();
    scanner.nextLine(); //Limpa o buffer;

    System.out.print("Incluir letras maiúsculas? s/n");
    if (scanner.nextLine().equalsIgnoreCase("s")) {
        caracteresPermitidos += letrasMaiusculas;
    }

    System.out.print("Incluir letras minúsculas? s/n");
    if (scanner.nextLine().equalsIgnoreCase("s")) {
        caracteresPermitidos += letrasMinusculas;
    }

    System.out.print("Incluir números? s/n");
    if (scanner.nextLine().equalsIgnoreCase("s")) {
        caracteresPermitidos += numeros;
    }

System.out.print("Incluir símbolos? s/n");
if (scanner.nextLine().equalsIgnoreCase("n")) {
    caracteresPermitidos += simbolos;
}

if (caracteresPermitidos.isEmpty());
System.out.println("Nenhum tipo de caractere foi selecionado. Encerrando sessão.");
return;
}

StringBuilder senha = new StringBuilder();
for (int i = 0; i < tamanho; i++) {
    int index = random.nextInt(caracteresPermitidos.length());
    senha.append(caracteresPermitidos.charAt(index));
}

System.out.println("Senha gerada: " + senha.toString());   

}