package com.mycompany.jogo_das_linguas;

import java.util.*;
import java.time.LocalTime;


public class Jogo_das_linguas {

    public static final String[] PALAVRAS_PORTUGUES_FACIL = new String[]{"Casa", "Gato", "cão", "Amor", "Feliz", "Triste", "Comida", "Água", "Sol", "Chuva", "Livro", "Praia",
        "Família", "Amigo", "Rua", "Escola", "Computador", "Televisão", "Música", "Cozinha", "Radio", "Anel", "Arte", "Beleza", "Esperança", "Coragem",
        "Liberdade", "Cabeça", "Paz", "Saúde", "Dinheiro", "Trabalho", "Sonho", "Céu", "Cheiro", "Texto", "Idioma", "Universidade", "Ciência", "Tecnologia",
        "Natureza", "Folha", "Floresta", "Montanha", "Mãe", "Pai", "Mar", "Lua", "Estrela", "Universo"};

 

    public static final String[] PALAVRAS_INGLES_FACIL = {"House", "Cat", "Dog", "Love", "Happy", "Sad", "Food", "Water", "Sun", "Rain", "Book", "Beach", "Family", "Friend",
        "Street", "School", "Computer", "Television", "Music", "Kitchen", "Radio", "Ring", "Art", "Beauty", "Hope", "Courage", "Freedom", "Head", "Peace", "Health", "Money",
        "Work", "Dream", "Sky", "Smell", "Text", "Language", "University", "Science", "Technology", "Nature", "Leaf", "Forest", "Mountain", "mother", "father",
        "Sea", "Moon", "Star", "Universe"};

 

    public static final String[] PALAVRAS_PORTUGUES_MEDIO = new String[]{"Cerveja", "Macaco", "Leão", "Tigre", "Livro", "Comprimidos", "Rinoceronte", "Roda", "Pássaro",
        "Borboleta", "Cobra", "Aranha", "Formiga", "Peixe", "Tubarão", "Baleia", "Espada", "Lobo", "Urso", "Esquilo", "Coelho", "Degrau", "Coruja","Lagarto", "Abelha", "Manta",
        "Árvore", "Rim", "Ovelha", "Porco", "Cavalo", "Galinha", "Pato", "Peru", "Cordeiro", "Cabra", "Fechadura", "Selva", "Piada","Martelo", "Pisca", "Sapatilha", "Gravata",
        "Ombro", "Pantufa", "Cotovelo", "Ganso", "Avestruz", "Cisne", "Pulmão", "Cano"};

 

    public static final String[] PALAVRAS_INGLES_MEDIO = {"Beer", "Monkey", "Lion", "Tiger", "Book", "Pills", "Rhinoceros", "Wheel", "Bird", "Butterfly", "Snake", "Spider",
        "Ant", "Fish", "Shark", "Whale", "Sword", "Wolf", "Bear", "Squirrel", "Rabbit", "Step", "Owl", "Lizard", "Bee", "Blanket", "Tree", "Kidney", "Sheep", "Pig", "Horse", 
        "Cicken", "Duck", "Turkey", "Lamb", "Goat", "Lock", "Jungle", "Joke", "Hammer", "Twinkle", "Sneaker", "Tie", "Shoulder", "Slipper", "Elbow", "Goose", "Ostrich", "Swan",
        "Lung", "Pipe"};
    

    public static final String[] PALAVRAS_PORTUGUES_DIFICIL = new String[]{"Romã", "Paradigma", "Efémero", "Procrastinar", "Borbulha", "Mausoléu", "Alquimia",
        "Alperce", "Sagaz", "Intrínseco", "Tenente", "Intangível", "Haltere", "Abacate", "Anacrónico", "Auspicioso", "Ausência", "Apreensão", "Gaveta",
        "Resiliente", "Aniquilar", "Magnânimo", "Insólito", "Paradoxo", "Besouro", "Alce", "Idiossincrasia", "Falcão", "Inóspito", "Dromedário", "Eficácia",
        "Framboesa", "Supositório", "Deplorável", "Fútil", "Ventoinha", "Reticente", "Azedo", "Borracha", "Veleiro", "Canoagem", "Bexiga", "Mamute", "Seda",
        "Lareira", "Orvalho", "Granizo", "Insecticida", "Solene", "Electrão"};


    public static final String[] PALAVRAS_INGLES_DIFICIL = {"Pomegranate", "Paradigm", "Ephemeral", "Procrastinate", "Pimple", "Mausoleum", "Alchemy", "Apricot", "Sagacious", 
        "Intrinsic", "Lieutenant", "Intangible", "Dumbbell", "Avocado", "Anachronistic", "Auspicious", "Absence", "Apprehension", "Drawer", "Resilient",
        "Annihilate", "Magnanimous", "Unusual", "Paradox", "Beetle", "Moose", "Idiosyncrasy", "Hawk", "Inhospitable", "Dromedary", "Effectiveness",
        "Raspberry", "Suppository", "Deplorable", "Futile", "Fan", "Reluctant", "Sour", "Rubber", "Sailboat", "Canoeing", "Bladder", "Mammoth", "Silk",
        "Fireplace", "Dew", "Hail", "Insecticide", "Solemn", "Electron"};
    
    
    public static final String[] PALAVRAS_PORTUGUES_EXPERT = new String[] {"Aberração", "Abominar", "Aquiescer", "Marmelo", "Embelezamento", "Apaziguar",
          "Nêspera", "Avareza", "Descarado", "Aquisitividade", "Difusão", "Cordialidade", "Vivacidade", "Ansiedade", "Acordo", "Marcadamente", "Espanto", 
          "Perseverança", "Acariciar", "Lisonjeiro", "Caloso", "Insurgente", "Andorinha", "Piolho", "Circunspecto", "Coerente", "Complacência", "Confidente", "Clandestinamente",
          "Intemperança", "Coentros", "Enxávido", "Desprezo", "Diligente", "Perseverante", "Exultantemente", "Eloquente", "Desfalcar", "Fraudulentamente", "Inimizade", 
          "Zaragatoa", "Estorninho", "Glutão", "Estreitamente", "Inato", "Espantalho", "Botica", "Gregário", "Ostensivo", "Embora"};

 

    public static final String[] PALAVRAS_INGLES_EXPERT = {"Aberration", "Abhor", "Acquiesce", "Quince", "Embellishment", "Appease", "Loquat", "Avarice", "Brazen", "Aquisitiveness",
          "Diffusion", "Cordiality", "Liveliness", "Anxiety", "Agreement", "Markedly", "Astonishment", "Preserverance", "Caress", "Flattering", "Callous", "Insurgent", "Swallow", 
          "Lice", "Circumspect", "Coherent", "Complacency", "Confidant", "Clandestinely", "Intemperance", "Coriander", "Soaked", "Contempt", "Diligent", "Persevering", 
          "Exultantly", "Eloquent", "Embezzle", "Fraudulently", "Enmity", "Swab", "Starling", "Glutton", "Narrowly", "Innate", "Scarecrow", "Apothecary", "Gregarious", "Ostentatious", "Although"};
          

   

    public static List PALAVRAS_USADAS = new LinkedList<Integer>();
    public static boolean jogoContinua = true;

    public static String pedirNome() {
    String nome;
    Scanner input = new Scanner(System.in);
    System.out.println("Bem vindo(a) ao jogo das linguas!!");
    System.out.println("***Regras do jogo***");
    System.out.println("O jogo é composto por 4 niveis: Fácil -> Médio -> Dificil -> Nativo");
    System.out.println("Tem que acertar 5 palavras para completar cada nivel. Cada palavra certa vale 1 ponto");
    System.out.println("Tem sempre 3 tentativas para acertar uma palavra. Caso esgote as tentativas, o jogo termina e fica com os pontos conquistados.");

    do {
        System.out.println("Insira o seu nome:");
        nome = input.nextLine().trim();
    } while (nome.isEmpty());
    return nome;
}


    public static void cumprimentarJogador(String nome) {

        LocalTime horaAtual = LocalTime.now();
        int horaDoDia = horaAtual.getHour();

        if (horaDoDia >= 6 && horaDoDia < 12) {
            System.out.println("Bom dia " + nome + ". Vamos jogar!");
        } else if (horaDoDia >= 12 && horaDoDia < 18) {
            System.out.println("Boa tarde " + nome + ". Vamos jogar!");
        } else {
            System.out.println("Boa noite " + nome + ". Vamos jogar!");
        }

    }

    
    public static void nivel_1(String nome, int acertos) {

        int tentativas = 0;
        String palavra_ing;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            int rnd = new Random().nextInt(PALAVRAS_PORTUGUES_FACIL.length);

            while (PALAVRAS_USADAS.contains(rnd)) {
                rnd = new Random().nextInt(PALAVRAS_PORTUGUES_FACIL.length);
            }

            System.out.println("Escreva a palavra em inglês: ");
            System.out.println(PALAVRAS_PORTUGUES_FACIL[rnd]);
            PALAVRAS_USADAS.add(rnd);

            boolean acertou = false;
            while (!acertou && tentativas < 3) {
                palavra_ing = input.nextLine();
                tentativas++;

                if (palavra_ing.equalsIgnoreCase(PALAVRAS_INGLES_FACIL[rnd])) {
                    System.out.println("Resposta certa");
                    acertos++;
                    acertou = true;
                } else if (tentativas == 3) {
                    System.out.println("Resposta errada. O jogo terminou.");
                    System.out.println("Pontuação: " + acertos + "pts");
                    System.out.println("A resposta correta era: " + PALAVRAS_INGLES_FACIL[rnd]);
                    jogoContinua = false;
                    return;
                } else {
                    System.out.println("Resposta errada. tente novamente");

                }
            }

            tentativas = 0;
        }

        System.out.println("Parabéns " + nome + ", você acertou " + acertos + " palavras! Completou o nível fácil.");
        System.out.println("Pontuação: " + acertos + "pts");
    }

    public static int desejaContinuarJogo(String mensagem) {
        Scanner input = new Scanner(System.in);
        int op;
        System.out.println(mensagem);
        op = input.nextInt();
        input.nextLine();

        while (op != 1 && op != 2) {
            System.out.println("Instrução inválida");
            System.out.println(mensagem);
            op = input.nextInt();
            input.nextLine();
        }
        return op;
    }

    public static void nivel_2(String nome) {

        int acertos = 5;
        int tentativas = 0;
        String palavra_ing;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            int rnd = new Random().nextInt(PALAVRAS_PORTUGUES_MEDIO.length);

            while (PALAVRAS_USADAS.contains(rnd)) {
                rnd = new Random().nextInt(PALAVRAS_PORTUGUES_MEDIO.length);
            }

            System.out.println("Escreva a palavra em inglês: ");
            System.out.println(PALAVRAS_PORTUGUES_MEDIO[rnd]);
            PALAVRAS_USADAS.add(rnd);

            boolean acertou = false;
            while (!acertou && tentativas < 3) {
                palavra_ing = input.nextLine();
                tentativas++;

                if (palavra_ing.equalsIgnoreCase(PALAVRAS_INGLES_MEDIO[rnd])) {
                    System.out.println("Resposta certa");
                    acertos++;
                    acertou = true;
                } else if (tentativas == 3) {
                    System.out.println("Resposta errada. O jogo terminou.");
                    System.out.println("Pontuação final: " + acertos + "pts");
                    System.out.println("A resposta correta era: " + PALAVRAS_INGLES_MEDIO[rnd]);
                    jogoContinua = false;
                    return;
                } else {
                    System.out.println("Resposta errada. tente novamente");

                }
            }

            tentativas = 0;
        }

        System.out.println("Parabéns " + nome + ", você acertou " + acertos + " palavras! Completou o nível médio.");
        System.out.println("Pontuação: " + acertos + "pts");
    }

    public static void nivel_3(String nome) {
        int acertos = 10;
        int tentativas = 0;
        String palavra_ing;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            int rnd = new Random().nextInt(PALAVRAS_PORTUGUES_DIFICIL.length);

            while (PALAVRAS_USADAS.contains(rnd)) {
                rnd = new Random().nextInt(PALAVRAS_PORTUGUES_DIFICIL.length);
            }

            System.out.println("Escreva a palavra em inglês: ");
            System.out.println(PALAVRAS_PORTUGUES_DIFICIL[rnd]);
            PALAVRAS_USADAS.add(rnd);

            boolean acertou = false;
            while (!acertou && tentativas < 3) {
                palavra_ing = input.nextLine();
                tentativas++;

                if (palavra_ing.equalsIgnoreCase(PALAVRAS_INGLES_DIFICIL[rnd])) {
                    System.out.println("Resposta certa");
                    acertos++;
                    acertou = true;
                } else if (tentativas == 3) {
                    System.out.println("Resposta errada. O jogo terminou.");
                    System.out.println("Pontuação final: " + acertos + "pts");
                    System.out.println("A resposta correta era: " + PALAVRAS_INGLES_DIFICIL[rnd]);
                    jogoContinua = false;
                    return;
                } else {
                    System.out.println("Resposta errada. tente novamente");

                }
            }

            tentativas = 0;
        }

        System.out.println("Parabéns " + nome + ", você acertou " + acertos + " palavras! Completou o nível dificil.");
        System.out.println("Pontuação: " + acertos + "pts");

    }

    public static void nivel_4(String nome) {

        int acertos = 15;
        int tentativas = 0;
        String palavra_ing;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            int rnd = new Random().nextInt(PALAVRAS_PORTUGUES_EXPERT.length);

            while (PALAVRAS_USADAS.contains(rnd)) {
                rnd = new Random().nextInt(PALAVRAS_PORTUGUES_EXPERT.length);
            }

            System.out.println("Escreva a palavra em inglês: ");
            System.out.println(PALAVRAS_PORTUGUES_EXPERT[rnd]);
            PALAVRAS_USADAS.add(rnd);

            boolean acertou = false;
            while (!acertou && tentativas < 3) {
                palavra_ing = input.nextLine();
                tentativas++;

                if (palavra_ing.equalsIgnoreCase(PALAVRAS_INGLES_EXPERT[rnd])) {
                    System.out.println("Resposta certa");
                    acertos++;
                    acertou = true;
                } else if (tentativas == 3) {
                    System.out.println("Resposta errada. O jogo terminou.");
                    System.out.println("Pontuação final: " + acertos + "pts");
                    System.out.println("A resposta correta era: " + PALAVRAS_INGLES_EXPERT[rnd]);
                    jogoContinua = false;
                    return;
                } else {
                    System.out.println("Resposta errada. tente novamente");

                }
            }

            tentativas = 0;
        }

        System.out.println("Muitos Parabéns " + nome + ", você acertou " + acertos + " palavras! Completou o nível nativo, chegando ao fim do jogo.");
        System.out.println("Pontuação final: " + acertos + "pts");
        System.exit(0);
    }
    

    public static void main(String[] args) {

        String nome;
        int op, acertos = 0;

        nome = pedirNome();
        cumprimentarJogador(nome);
        while (jogoContinua) {
            nivel_1(nome, acertos);
            if (!jogoContinua) {
                break;
            }
            op = desejaContinuarJogo("Deseja continuar para o nível médio? (1 - SIM / 2 - NÃO)");

            if (op == 2) {
                System.out.println("Até á próxima!");
                return;
            }
            while (jogoContinua) {
                nivel_2(nome);
                if (!jogoContinua) {
                    break;
                }
                op = desejaContinuarJogo("Deseja continuar para o nível dificil? (1 - SIM / 2 - NÃO)");

                if (op == 2) {
                    System.out.println("Até á próxima!");
                    return;
                }
                while (jogoContinua) {
                    nivel_3(nome);
                    if (!jogoContinua) {
                        break;
                    }
                    op = desejaContinuarJogo("Está preparado para continuar para o nível nativo? (1 - SIM / 2 - NÃO)");
                    if (op == 2) {
                        System.out.println("Até á próxima!");
                        return;
                    }
                    while (jogoContinua) {
                        nivel_4(nome);
                        if (!jogoContinua) {
                            break;
                        }
                    }
                }
            }
        }
    }
}



