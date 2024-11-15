import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🪄 Seja bem-vindo, jovem bruxo ou bruxa! 🪄");
        System.out.println("Uma criatura mágica misteriosa foi confiada a você. Ela precisa de seus cuidados, atenção e, é claro, um toque de magia!");
        System.out.println("Dê um nome à sua nova criatura encantada e prepare-se para explorar os segredos do mundo mágico:");
        System.out.println("Digite o nome da sua criatura mágica: ");

        String nomeCriatura = scanner.nextLine();

        CriaturaMagica criatura = new CriaturaMagica(nomeCriatura);

        while (true) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Alimentar " + nomeCriatura);
            System.out.println("2. Brincar com " + nomeCriatura);
            System.out.println("3. Verificar o status de " + nomeCriatura);
            System.out.println("4. Duelo ");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    criatura.alimentar(scanner);
                    break;
                case 2:
                    criatura.brincar(scanner);
                    break;
                case 3:
                    criatura.verificarStatus();
                    break;
                case 4:
                    criatura.duelar();
                    break;
                case 5:
                    System.out.println("🪄 Sua jornada com a criatura mágica chegou ao fim... por enquanto. Até breve, guardião da magia!");
                    return;
                default:
                    System.out.println("⚡ Opção inválida. O feitiço parece ter dado errado, tente novamente!");
            }

            criatura.passarTempo();
        }
    }
}
