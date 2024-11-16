import java.util.Scanner;
import java.util.Random;

class CriaturaMagica {
    String nome;
    int energiaMagica = 50;
    int nivelDeEncantamento = 50;
    int nivel = 1;

    public CriaturaMagica(String nome) {
        this.nome = nome;
    }

    public void alimentar(Scanner scanner) {
        System.out.println("\nEscolha a comida mágica para " + nome + ":");
        System.out.println("1. Feijõezinhos de Todos os Sabores");
        System.out.println("2. Sapo de Chocolate");
        System.out.println("3. Suco de Abóbora");
        System.out.println("4. Pão de Mel de Hogsmeade");
        System.out.println("5. Poção Energizante");

        int escolhaComida = scanner.nextInt();

        switch (escolhaComida) {
            case 1:
                System.out.println(nome + " adora os Feijõezinhos de Todos os Sabores! Energia aumentada.");
                energiaMagica += 10;
                break;
            case 2:
                System.out.println(nome + " saboreia um Sapo de Chocolate! Fica feliz e energizado.");
                nivelDeEncantamento += 10;
                energiaMagica += 5;
                break;
            case 3:
                System.out.println(nome + " fica revitalizado com o Suco de Abóbora!");
                energiaMagica += 8;
                break;
            case 4:
                System.out.println(nome + " não resiste ao Pão de Mel de Hogsmeade! Encantamento elevado.");
                nivelDeEncantamento += 7;
                break;
            case 5:
                System.out.println(nome + " se sente revigorado com a Poção Energizante!");
                energiaMagica += 15;
                break;
            default:
                System.out.println("⚡ Opção inválida. Tente novamente.");
        }

        aumentarNivel();
    }

    public void brincar(Scanner scanner) {
        System.out.println("\nEscolha uma atividade mágica para " + nome + ":");
        System.out.println("1. Brincar com uma varinha mágica (aumenta encantamento).");
        System.out.println("2. Interagir com um elfo doméstico (alegria mágica!).");
        System.out.println("3. Jogar Quadribol (energia e felicidade!).");
        System.out.println("4. Petear uma Hippogriff (encantamento elevado).");

        int escolhaAtividade = scanner.nextInt();

        switch (escolhaAtividade) {
            case 1:
                System.out.println(nome + " agita sua varinha mágica e se sente energizado com feitiços divertidos!");
                nivelDeEncantamento += 12;
                break;
            case 2:
                System.out.println(nome + " faz amizade com um elfo doméstico e se sente mais alegre.");
                nivelDeEncantamento += 8;
                break;
            case 3:
                System.out.println(nome + " voa nas vassouras de Quadribol e se sente empolgado!");
                nivelDeEncantamento += 15;
                break;
            case 4:
                System.out.println(nome + " faz carinho em um Hippogriff e seu encantamento cresce.");
                nivelDeEncantamento += 10;
                break;
            default:
                System.out.println("⚡ O feitiço deu errado! Tente novamente!.");
        }
        aumentarNivel();
    }

    public void verificarStatus() {
        System.out.println("\n🪄 Status atual de " + nome + ": 🪄");
        System.out.println(" Energia Mágica: " + energiaMagica + " pontos");
        System.out.println(" Nível de Encantamento: " + nivelDeEncantamento + " pontos");
        System.out.println(" Nível da Criatura: " + nivel);

        if (energiaMagica > 70) {
            System.out.println(nome + " está cheio de energia mágica! ");
        } else if (energiaMagica > 40) {
            System.out.println(nome + " está razoavelmente energizado, mas precisa de mais magia! ");
        } else {
            System.out.println(nome + " está fraco em energia mágica... talvez uma Poção Energizante ajude! ");
        }

        if (nivelDeEncantamento > 70) {
            System.out.println(nome + " está radiando alegria e encantamento! ");
        } else if (nivelDeEncantamento > 40) {
            System.out.println(nome + " está se sentindo bem, mas poderia estar mais feliz. ");
        } else {
            System.out.println(nome + " parece triste. Uma brincadeira ou comida mágica poderia melhorar! ");
        }
        aumentarNivel();
    }

    public void passarTempo() {
        energiaMagica -= 5;
        if (energiaMagica < 0) energiaMagica = 0;
        nivelDeEncantamento -= 10;
        if (nivelDeEncantamento < 0) nivelDeEncantamento = 0;

        if (energiaMagica < 20) {
            System.out.println(nome + " está começando a se enfraquecer... Talvez seja hora de um pouco de magia extra ou comida mágica para restaurar sua energia! ");
        } else if (energiaMagica < 40) {
            System.out.println(nome + " parece um pouco cansado... um pouco mais de energia mágica seria bem-vindo! ");
        } else {
            System.out.println(nome + " está se sentindo levemente cansado, mas ainda com bastante energia. ");
        }

        if (nivelDeEncantamento < 20) {
            System.out.println(nome + " está começando a perder seu brilho encantado... Talvez algumas brincadeiras possam reverter isso! ");
        } else if (nivelDeEncantamento < 40) {
            System.out.println(nome + " está um pouco entediado. Um pouco de diversão mágica poderia ajudá-lo! ");
        } else {
            System.out.println(nome + " está em ótimo estado de encantamento, radiante como sempre! ");
        }
        aumentarNivel();
    }

    public void duelar() {
        String[] adversarios = {"Basilisco", "Dragão", "Fênix", "Cervo Mágico"};
        Random random = new Random();
        String nomeAdversario = adversarios[random.nextInt(adversarios.length)];

        System.out.println("Você está enfrentando " + nomeAdversario + " em um duelo!");

        if (nivelDeEncantamento > 40) {
            System.out.println(nome + " usou sua magia poderosa e derrotou " + nomeAdversario + "!");
            energiaMagica += 10;
        } else {
            System.out.println(nome + " não conseguiu vencer " + nomeAdversario + ". Melhor sorte na próxima vez!");
            energiaMagica -= 10;
        }

        System.out.println(nome + " agora tem " + energiaMagica + " de energia mágica.");
        System.out.println(nome + " tem " + nivelDeEncantamento + " de nível de encantamento.");
    }

    private void aumentarNivel() {
        if (energiaMagica + nivelDeEncantamento > 160) {
            nivel = 5;
        } else if (energiaMagica + nivelDeEncantamento > 120) {
            nivel = 4;
        } else if (energiaMagica + nivelDeEncantamento > 90) {
            nivel = 3;
        } else if (energiaMagica + nivelDeEncantamento > 60) {
            nivel = 2;
        } else {
            nivel = 1;
        }
    }
}
