package com.mycompany.theways;

public class Futuro{
    Estrutura estrutura = new Estrutura();
    Historia historia = new Historia();
    Jogador jogador = new Jogador(estrutura.jogador.nome);

    // Escolhas dos usuários fase 01
    public void decisao1_1() {

        System.out.println("--------------------------");
        System.out.println("(1) - Aceitar a ajuda");
        System.out.println("(2) - Recusar ajuda");
        System.out.println("--------------------------");
        System.out.print("Aceita a ajuda da criança? ");
        int ajuda = estrutura.leiaInput("->", 2);

        switch (ajuda) {
        case 1:
            System.out.println("Ok, aceito sua ajuda.");
            System.out.println("\nAceito a ajuda da criança, o que? Espere… não é uma  criança!");
            System.out.println(
                    "\nA criança mostra sua verdadeira forma se apresentando como um agente do FBI do futuro camuflado, no qual o objetivo é eliminar os seres humanos que sejam uma possível ameaça ao espaço tempo ...");
            System.out.println("GAME OVER! Tente outra opção...");
            System.out.println("");
            estrutura.qualquerCoisaParaContinuar();
            System.out.println("");
            decisao1_1();
            break;

        case 2:
            System.out.println("Agradeço sua ajuda, mas devo continuar sozinho");
            System.out.println("----------------------------------------------");
            System.out.println(
                    "\nDeixo a criança para trás e sigo meu caminho, não existem motivos para confiar em um totalmente estranho, mesmo que seja uma criança.");
            estrutura.qualquerCoisaParaContinuar();
            break;
        }

    }

    public void decisao1_2() {
        System.out.println(
                "\nA criança mostra que era apenas um holograma, assim vejo aquele pequeno garoto se transformar em sua real forma, na qual surge um homem alto com uma arma em sua cintura vestindo um terno preto com uma logo em seu peito.");
        System.out.println("--------- O que farei?--------- ");
        System.out.println("1 - Corro do agente mesmo sabendo das minhas condições físicas?");
        System.out.println("2 - Decido enfrentar o agente?");
        System.out.println("3 - Devo me camuflar na multidão?");
        System.out.println("-------------------------------");
        System.out.println("Qual é a sua escolha? ");
        int escolha1 = estrutura.leiaInput("->", 3);

        switch (escolha1) {
        case 1:
            System.out.println(
                    "\nEm alerta, corro do agente. Entro em meio a multidão com toda a velocidade que consigo. Isso infelizmente acaba não sendo o suficiente para escapar e o agente do tempo consegue me alcançar.");
            System.out.println("GAME OVER! Tente outra opção...");
            System.out.println("");
            estrutura.qualquerCoisaParaContinuar();
            System.out.println("");
            decisao1_2();
            break;

        case 2:
            System.out.println(
                    "\nPor um momento de coragem decido que está na hora de enfrentar o adversário. Observo seus movimentos com atenção, a fim de descobrir os motivos da perseguição, então o questiono:");

            System.out.println(
                    "\n - O que eu fiz para você? Não me recordo de conhecê-lo. O agente expressa uma risada sarcástica em seu rosto como se esperasse por isso");

            System.out.println(
                    "\n- Você causou diversos problemas com a sua invenção, destruiu até mesmo sua família. Você é literalmente uma bomba relógio que deve ser desativada o quanto antes. Por isso estou aqui, para acabar com os problemas da sociedade.");

            System.out.println(
                    "\nMais veloz que o tempo, sinto um tiro atingido meu peito. De repente tudo fica escuro...");
            System.out.println("GAME OVER! Tente outra opção...");
            System.out.println("");
            estrutura.qualquerCoisaParaContinuar();
            System.out.println("");
            decisao1_2();
            break;

        case 3:
            System.out.println(
                    "\nConsigo despistar o agente e após conseguir uma certa distância de nosso último local de encontro começo a procurar onde estaria o meu laboratório...");
            break;

        }

    }

    // Escolhas dos usuários fase 02
    public void decisao2_1() {
        System.out.println("------- o que posso fazer?------- ");
        System.out.println("1 - Comida");
        System.out.println("2 - Roupas");
        System.out.println("3 - Celular");
        System.out.println("---------------------------");
        System.out.println("Qual é a sua escolha? ");

        int opcao = estrutura.leiaInput("->", 3);
        switch (opcao) {
        case 1:
            System.out.println("Vou economizar, não sei quando irei precisar de mais.");
            System.out.println("");
            estrutura.qualquerCoisaParaContinuar();
            System.out.println("");
            decisao2_1();

            break;

        case 2:
            System.out.println("Huum item interessante. Eventualmente pode ser útil.");
            System.out.println("");
            estrutura.qualquerCoisaParaContinuar();
            System.out.println("");
            decisao2_1();
            break;

        case 3:
            System.out.println(
                    "Ligo o celular e  abro o GPS, procuro a distância entre meu lugar atual e onde seria a rua"
                            + "\nde meu laboratório, sei que ele ainda existe. Vejo que está na mesma região, porém, visto como um lugar"
                            + "\ninterditado e controlado pelo FBI. Só me resta uma opção: conheço todas as rotas de fuga do prédio, chegou"
                            + "\na hora de usar esses conhecimentos.");
            estrutura.qualquerCoisaParaContinuar();
            break;

        }
    }

    public void decisao2_2() {
        System.out.println("------- Thomas anda por 40 minutos até avistar seu laboratório. "
                + "\nDecide que deve arrumar uma maneira de entrar no local, como ele deve fazer isso?------- ");
        System.out.println("1 -  Tento entrar pela porta da frente disfarçado com as roupas adquiridas na loja.");
        System.out.println("2 - Subo as escadas de incêndio do local. ");
        System.out.println("3 -  Entrada do esgoto.");
        System.out.println("---------------------------");
        System.out.println("Qual é a sua escolha? ");
        int opcao = estrutura.leiaInput("->", 3);
        switch (opcao) {
        case 1:
            System.out.println("Thomas é fuzilado por todos os agentes do local, pois, na entrada havia um"
                    + "\nscanner biométrico que revelou sua identidade.");
            System.out.println("");
            System.out.println("GAME OVER! Tente outra opção...");
            System.out.println("");
            decisao2_2();

            break;

        case 2:
            System.out.println(
                    "Thomas já andou muito e não se alimentou, perdendo as forças acaba caindo de uma certa"
                            + "\naltura da escada e morrendo espatifado no chão.");
            System.out.println("");
            System.out.println("GAME OVER! Tente outra opção...");
            System.out.println("");
            decisao2_2();
            break;

        case 3:
            System.out.println(
                    "Sigo pelos esgotos do laboratório. Os caminhos que seguiam mais pareciam um labirinto e somente"
                            + "\neu conhecia o trajeto. O esgoto termina em uma porta que serve como acesso aos corredores, porém, não tenho"
                            + " a chave…");

            estrutura.qualquerCoisaParaContinuar();

            System.out.println(
                    "Procuro a chave rebatendo minhas mãos em meu corpo, percebo que elas estão em minhas roupas antigas"
                            + "\nque havia trocado. Ao substituir as roupas novas acabei deixando as antigas na loja, o que me irrita, como um"
                            + "\ncientista brilhante pode cometer tamanha burrice, grr!!!!");
            estrutura.qualquerCoisaParaContinuar();
            break;

        }

    }

    public void decisao2_3() {
        System.out.println("------- O que devo fazer?------- ");
        System.out.println("1 - Tentar arrombar a porta");
        System.out.println("2 - Volto para loja e pego a chave");
        System.out.println("---------------------------");

        int opcao = estrutura.leiaInput("->", 2);
        switch (opcao) {
        case 1:
            System.out.println("Fiz muito barulho, essa não… escuto os agentes descendo. Vou me esconder.\n"
                    + "\nOs agentes abrem a porta e rodam o esgoto me procurando. Como nunca tiveram naquele lugar, ao se separarem "
                    + "\nconsigo atravessar a porta e corro até meu laboratório.");
            System.out.println("");
            estrutura.qualquerCoisaParaContinuar();
            System.out.println("");

            break;

        case 2:
            System.out.println("No caminho de volta Thomas é pego pelos agentes.");
            System.out.println("");
            System.out.println("GAME OVER! Tente outra opção...");
            System.out.println("");
            decisao2_3();
            break;

        }

    }

    // Escolhas dos usuários fase 03
    public void decisao3_1() {
        System.out.println("Fecho a porta do laboratório e empurro um armário com toda a força que o me resta, enquanto tento descobrir como voltar para o tempo e arrumar tudo.");

        System.out.println("O que ele deve fazer?");
        System.out.println("1 - Combate direto");
        System.out.println("2 - Se esconder dos agentes");
        System.out.println("3 - Chutar a máquina de novo");
        int escolha = estrutura.leiaInput("->", 3);

        switch (escolha) {
        case 1:
            break;

        case 2:
            System.out.println("Tento me esconder atrás de algo o mais rápido possível. ");
            System.out.println(
                    "Mesmo com a minha velocidade, em menos de um minuto os agentes arrombaram e entraram no laboratório e conseguiram me achar.");
            System.out.println("- Droga, vocês não podem fazer isso comigo! AAAAAAAAAAH");
            System.out.println(
                    "Os agentes jogam Thomas no buraco de minhoca e o vêem ser destroçado em mil pedaços se perdendo pelo tempo.");
            System.out.println("");
            System.out.println("GAME OVER! Tente outra opção...");
            System.out.println("");
            estrutura.qualquerCoisaParaContinuar();
            System.out.println("");
            decisao3_1();
            break;

        case 3:
            System.out.println(
                    "Mas que porcaria eu não quero morrer, AAAAAAH que se dane essa porcaria, BUUUUUM!\nThomas ao chutar a máquina a sobrecarrega e não apenas se mata como leva o quarteirão inteiro a ser sugado pelo buraco de minhoca.");
            System.out.println("");
            System.out.println("GAME OVER! Tente outra opção...");
            System.out.println("");
            estrutura.qualquerCoisaParaContinuar();
            System.out.println("");
            decisao3_1();
            break;

        }

    }

    public void CombateFinal() {
        System.out.println(
                "Deparo com três agentes do tempo e mais para frente noto uma arma que se assemelha a um blaster. Impossível não lembrar das referências pop dos anos 80. Corro em direção ao armamento com a intenção de atingir meus adversários. Consigo pegar o blaster a tempo e sinto um dos agentes referindo um ataque em minhas costas. ");

        System.out.println("O que devo fazer?");
        System.out.println(
                "1 - Revido dando um soco no agente e saio correndo.\n 2 - Tento dar um tiro de blaster.\n 3 -  Tento enfrentá los todos de uma vez");
        int opcao = estrutura.leiaInput("->", 3);

        int dano = 0;

        // Dano 01
        if (opcao == 1 || opcao == 01) {
            System.out.println("sofro muito dano e acabo morrendo.");

            dano = jogador.hp - 150;
            System.out.println("TOTAL: " + dano + " HP");
            System.out.println("");
            System.out.println("GAME OVER! Tente outra opção...");
            System.out.println("");CombateFinal();
            

        }

        else if (opcao == 02 || opcao == 2) {
            System.out.println("Consequência:  porém, ele está muito perto e me atingi também.");
            dano = jogador.hp - 50;
            
            System.out.println("TOTAL: " + dano + " HP");
        }

        else if (opcao == 3 || opcao == 03) {
            System.out.println(
                    "Consequência: A morte total de Thomas. Ele não tem condicionamento físico o suficiente.");
            dano = jogador.hp - 150;
            System.out.println("TOTAL: " + dano + " HP");
            System.out.println("");
            System.out.println("GAME OVER! Tente outra opção...");
            System.out.println("");
            CombateFinal();

        }


    }

    public void PrimeiroAto() {
        estrutura.cabecalho("PRIMEIRO ATO");
        estrutura.cabecalho("CENÁRIO ATUAL");
        System.out.println("você está no futuro");

        // Prólogo
        System.out.println(
                "\nDurante a minha longa vida, trabalhei como cientista renomado para diversas intuições de ciência do mundo. Isso me propiciou alguns prêmios e reconhecimentos de contribuições para física moderna. Também me casei e tive duas netas, mas uma delas infelizmente veio a falecer aos 21 anos. Tudo isso contribuiu para a solidão que eu vivo agora, já que só me resta descobrir uma maneira de viajar no tempo e achar formas de solucionar problemas da sociedade.");

        System.out.println(
                "\nNo meu laboratório encaro a máquina que criei. Grande, cinza e inútil, esses são os melhores adjetivos que posso dar para uma máquina de viagem no tempo que não funciona.\nJá testei todas as possibilidades possíveis e até Einstein não teve tantas ideias para viagem no tempo. Gostaria que ao menos ligasse.");

        System.out.println(
                "\nCansado, realizei uma última  tentativa de verificar as engrenagens  da máquina. Um surto de frustração e raiva passou pela minha mente, NADA, ABSOLUTAMENTE NADA! Até mesmo a lua se escondeu nas nuvens após esse fracasso. Com toda a força que eu tive chutei a máquina e para minha surpresa ela ligou...");

        estrutura.qualquerCoisaParaContinuar();

        // Chegando no futuro
        System.out.println("\nEm alguns segundos já não estava no laboratório...");

        System.out.println(
                "\nEntão eu finalmente entendi, havia conseguido o que estava buscando. Como meus colegas cientistas irão reagir? Será que ficariam felizes com a nova descoberta? Em um primeiro momento provavelmente me chamariam de louco. Não muito fora do normal, estava acostumado com esse tipo de “apelido” nada amigável.  O que importava é que havia conquistado a maior façanha de todos os tempos.");

        System.out.println(
                "\nDeterminado a conhecer o lugar, caminho pelas ruas da cidade. Luzes automáticas, carros voadores, prédios futuristas, robôs, telões e crianças com roupas peculiares em todas as partes. Aquele sem dúvidas é o futuro.");

        System.out.println("Liberto dos meus pensamentos quando uma voz de uma criança me chama:");

        System.out.println(
                "\n - Boa tarde, senhor! Gostaria de ajuda para conhecer a cidade? - A criança que me chamava tinha voz doce e sorriso contagiante, lembrava muito o meu bisneto.\n - Bem, acredito que não precise de ajuda. - É claro que eu necessitava  de ajuda, não conhecia nada do lugar que eu estava,  mas pedir ajuda de uma criança não parecia ser a escolha mais viável.\nA criança me olhou de cima a baixo, como se soubesse que eu era um velho louco perdido na cidade grande. Quando terminou de examinar meu rosto, retrucou:\n -Eu tenho certeza que você precisa de ajuda. Olha para suas roupas estranhas! Fora  que desde de que você chegou está aí parado olhando para tudo. Posso te levar pela cidade se deseja, ainda te mostro um lugar para você comprar roupas novas.");

        // Decisão do usuário 01
        decisao1_1();

        // Loja de itens

        System.out.println(
                "Caminho pelas ruas da cidade até encontrar algo que fosse interessante e me deparo com uma loja de itens. Entro em busca de itens que possam ajudar na minha trajetória pela cidade futurista.");

        System.out.println("------- Observo os sequintes itens: -------");
        System.out.println("1 - Roupa nova");
        System.out.println("2 - Aparelho eletrônico  desconhecido");
        System.out.println("3 - Alimentos para viagem");
        System.out.println("--------------------------------------------");

        System.out.println(
                "\nApós escolher os itens, percebo um pequeno detalhe… Estou sem dinheiro. Levando em consideração minha atual situação, não tenho escolha senão roubar os itens da loja e sair o mais rápido possível.\nMe escondo para que ninguém perceba o furto que acabo de cometer. Ao encontrar um lugar seguro, noto que estou sendo observado. Aquela mesma criança de manhã cedo estava me olhando do outro lado da rua, seus olhos ficam fibrados em cada movimento que eu possa fazer. Em meio ao desespero reparo o perigo, aquele jovem não queria apenas fazer companhia");

        // Decisão 02
        decisao1_2();

        estrutura.qualquerCoisaParaContinuar();
        SegundoAto();
    }

    public void SegundoAto() {
        estrutura.cabecalho("SEGUNDO ATO");
        estrutura.qualquerCoisaParaContinuar();
        System.out.println(
                "\n Após caminhar horas pela cidade, decidi descansar. Após um tempo abro minha mochila e vejo meus itens.");

        estrutura.qualquerCoisaParaContinuar();

        decisao2_1();

        decisao2_2();

        decisao2_3();

        TerceiroAto();
    }

    public void TerceiroAto() {
        estrutura.cabecalho("TERCEIRO ATO");
        estrutura.qualquerCoisaParaContinuar();

        // inicio fase 03
        System.out.println(
                "Finalmente entro em meu laboratório e noto algumas diferenças. Um grande buraco de minhoca está estabilizado na máquina do tempo. Reparo que os agentes estavam utilizando a máquina que criei como um artifício para viajar no tempo como se fosse propriedade deles, isso me enoja.\nComeço a ouvir barulhos de passos próximos a mim. Olho ao redor e sinto a presença próxima dos agentes.");


        // Decisão 04
        decisao3_1();

        // Sistema de combate
        CombateFinal();

        //Final história
        System.out.println ("Finalmente em “paz” leio minhas anotações. Percebo onde estava errando esse tempo todo: Havia esquecido uma vincular na conta. Se fosse em outros tempos com certeza ficaria revoltado, mas neste momento estou feliz de encontrar uma solução para tratar meu problema.\nApós ligar, entro na máquina com um sorriso no rosto. Logo estaria com a minha família, veria Hugo e Alex após muito tempo. Quem sabe agora teria tempo para viajar com eles e conhecer o mundo inteiro. Poderia ver a evolução dos dois em meus últimos dias de vida…\nDe repente sinto minha cabeça doendo, seria apenas uma consequência da viajar? Essa dor se intensifica até que eu durma.\nAcordo no outro dia com meu bisneto chamado… Ele repetia várias vezes de uma moça chamada Alex. Nunca conheci alguém com esse nome. Deixo ele falando e vou até meu laboratório, preciso fazer minha máquina do tempo funcionar.");


        historia.Final();

    }

}

