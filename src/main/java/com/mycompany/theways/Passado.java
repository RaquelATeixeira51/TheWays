package com.mycompany.theways;

public class Passado {
    Estrutura estrutura = new Estrutura();
    Historia historia = new Historia();

    public void PrimeiroAto() {
        estrutura.cabecalho("PRIMEIRO ATO");
        estrutura.cabecalho("CENÁRIO ATUAL");
            System.out.println("você está no passado");
            System.out.println("Sempre fui uma mulher moderna e descolada, que nunca deixei que pré me\n julgassem pelos meus cabelos ruivos e meu corpo tatuado, Sempre busquei ter o destaque\n em tudo que faço não é atoa que me tornei uma das melhores biotécnicas do mundo tão\njovem, Mesmo tendo que cuidar do meu sobrinho cujo a mãe\nfaleceráAntes da morte de minha irmã eu era muito distanciada da minha família pensando\napenas em mim mesma, o meu futuro sempre foi uma prioridade para mim me levando\nassim a uma vida de solidão, após a chegada do Hugo TUDO MUDOU!! e percebi que\nhavia abandonado o meu bem mais precioso que era minha família.");
        estrutura.qualquerCoisaParaContinuar();
            System.out.println("Determinada a mudar essa situação decidi ir ao encontro do meu avô, então segui\ndiretamente para o seu refúgio (Laboratório) onde me deparo com tudo revirado como se\n houvesse passado um furacão,percebo a ausência do meu avô e um alarme ensurdecedor\nvindo de sua máquina e me aproximo e não pode ser AHHHH");

        estrutura.qualquerCoisaParaContinuar();
            System.out.println("De repente desperto em uma praça feia e sombria com algumas pessoas estranhas\n e “fora de moda” a minha volta me observando e alguns comentários me julgando como\n praticante de bruxaria, levanto assustada e tentando entender o que houvera acontecido;");

        estrutura.qualquerCoisaParaContinuar();
            boolean jogoSegue=false;

            while(!jogoSegue){
                System.out.println("O que devo fazer?");
                System.out.println("[1] Questionar (onde estou? o que está acontecendo??.");
                System.out.println("[2] Sair correndo.");
                System.out.println("[3] Pegar o celular.");

                int input = estrutura.leiaInput("->", 3);

                switch(input){
                    case 1:
                    System.out.println("Estamos em Sallen em 1619, e você apenas surgiu aqui do nada como se fosse bruxaria!");
                    SegundoAto();
                    jogoSegue=true;
                    break;
                    case 2:
                    System.out.println("Sua ação gerou revolta na população que começou a lhe apedrejar causando sua morte. \nGAME OVER.");
                    break;
                    case 3:
                    System.out.println("Sua ação assustou a população que com seus “gadanhos” a mutilaram.\nGAME OVER.");
                    break;
            }
            
        }
    }

    public void SegundoAto() {
        estrutura.cabecalho("SEGUNDO ATO");
        System.out.println("Suas mãos e pés foram amarradas e vc foi arrastada ate a cadeia.");
        estrutura.qualquerCoisaParaContinuar();
        System.out.println("Você foi presa se encontra numa cela:)observa que contém .");
        System.out.println("● uma cama\n● uma pia\n● um espelho\n● e um sanitário");
        System.out.println("Você precisa agir rapido para fugir antes que a levem para ser queimada em praça publica.");
        boolean jogoSegue=false;

        while(!jogoSegue){
            System.out.println("O que devo fazer?");
            System.out.println("[1] Gritar");
            System.out.println("[2] Quebrar o espelho.");
            System.out.println("[3] Esconder-se em baixo da cama.");

            int input = estrutura.leiaInput("->", 3);

            switch(input){
                case 1:
                System.out.println("(vem o guarda sem entender as gírias e algumas palavras gritado pela moça, acredita que está sendo amaldiçoado e para impedi-la corta sua garganta com a espada.\nGAME OVER.");
                break;
                case 2:
                System.out.println("vc recolhe um grande pedaço de vidro, o guarda surge com o barulho ao entrar na cela para verificar vc o golpeia com o vidro e foge.");
                TerceiroAto();
                jogoSegue=true;
                break;
                case 3:
                System.out.println("(após algum tempo um guarda percebe sua ausência e desesperado ele vai averiguar a cela,depois de minutos se assustando com a aparição repentina seguida de uma tentativa de fuga o guarda a golpeia no rosto perfurando seu olho com uma espada\nGAME OVER!");
               
                break;
            }
        }
    }

    public void TerceiroAto() {
        estrutura.cabecalho("TERCEIRO ATO");
        System.out.println("Ao sair da cadeia e ir o mais distante possível encontra uma pacata loja de roupas e tem a ideia de se afeiçoar as pessoas e esconder suas tatuagens");
        estrutura.qualquerCoisaParaContinuar();
        System.out.println("Ao entrar na loja se surpreende com a variedade de roupas e precisa decidir qual irá escolher:. ");
        estrutura.qualquerCoisaParaContinuar();
        boolean jogoSegue=false;

        while(!jogoSegue){
            System.out.println("O que devo fazer?");
            System.out.println("[1] Vestido de mangas curtas e cheias,bota de cano baixo e chapéu alto ou largo com abas e Rufo.");
            System.out.println("[2] Uma saia amassada com mangas longas e penduradas e gola de renda, uma coifa decorada com pena e aba virada.");
            System.out.println("[3] Uma calça larga,uma camisa com renda e colarinho com farrapos,casaco com gola alta e um chapéu de feltro largo, e botas de punho altos..");

            int input = estrutura.leiaInput("->", 3);

            switch(input){
                case 1:
                System.out.println("Você deixou seus braços a mostra, iram ver suas tatuagens\nTENTE NOVAMENTE.");
                break;
                case 2:
                System.out.println("Você escolheu vestimentas que não correspondem com o seu gênero e idade, coifa só era utilizado por crianças e idosos,você seria descoberta\nTENTE NOVAMENTE");
                break; 
                case 3:
                System.out.println("Ótima escolha!! Você se vestiu a caráter,devido aos maus olhos da sociedade,você conseguiu cobrir suas tatuagens e se afeiçoar as pessoas da época");
                jogoSegue=true;
                break;
            }
        }
       
        System.out.println("Durante a camuflagem encontra o celular que havia com você escondido, sai andando distraída pela multidão, quando esbarra numa mulher que andava apressadamente,que acaba a identificando:");
        estrutura.qualquerCoisaParaContinuar();
         
        System.out.println("Você é a mulher que diz vir do futuro?? você precisa vir comigo, eu preciso da sua ajuda!!");
        
        boolean jogoSegue2=false;

        while(!jogoSegue2){
            System.out.println("Devo ajuda-lá?");
            System.out.println("[1] Sim .");
            System.out.println("[2] Não.");
          
            int input = estrutura.leiaInput("->", 3);
        switch(input){
                case 1:
                System.out.println("me acompanhe, após um periodo de caminhada elas chegam numa humilde cabana onde passam a conversar percebendo que já era tarde da noite desconhecida enfatiza “ohhh meu Deus, precisamos dormir que amanhã você entenderá tudo!!)");
                jogoSegue=true;
                break;
                case 2:
                System.out.println("(Continua vagando sem rumo, ao anoitecer se depara com um grupo de homens que na tentativa de rouba-la a ferem e vc morre agonizando perdendo sangue (Continua vagando sem rumo, ao anoitecer se depara com um grupo de homens\n que na tentativa de rouba-la a ferem e vc morre agonizando perdendo sangue \ngame over");
                break;
            }
        }
               System.out.println("Se sentindo segura pela primeira vez, com o cansaço cai em sono profundo");
               estrutura.qualquerCoisaParaContinuar();
               System.out.println("De repente, escuta gritos e sente um cheiro forte de\n queimado, ainda sonolenta percebe que a casa está pegando fogo e que diversas pessoas\n estavam a gritar “queimem a bruxa!! queimem a bruxa!!” ,desesperada ela tem que tomar\n uma decisão rápida");


        boolean jogoSegue3=false;

        while(!jogoSegue3){
            System.out.println("O que devo fazer?");
            System.out.println("[1] Acorde a desconhecida e fuja pela janela.");
            System.out.println("[2] Acorde a desconhecida bloqueie as saídas e entre no porão.");
            System.out.println("[3] Acorde a desconhecida e tente confrontar os revoltados.");
           
            int input = estrutura.leiaInput("->", 3);

            switch(input){
                case 1:
                System.out.println("(saiu pela janela e foi alvejada por flechas flamejantes\nGAME OVER.");
                break;
                case 2:
                System.out.println("vc passa um tempo no porão a cabana é consumida pelo fogo e desmorona sobre\n vc, ocasionando seu soterramento\nGAME OVER");
                break;
                case 3:
                System.out.println("você se arma com um castiçal e sai para o confronto, porém são muitos revoltados\n que a capturam-na e a queimam.\nGAME OVER.");
                estrutura.qualquerCoisaParaContinuar();
                historia.Final();
                break;
            }
        }

    }


}
