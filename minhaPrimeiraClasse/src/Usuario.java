/*
        Usuario
 */
public class Usuario {

public static void main(String[] args) {
    //CRIA UM OBJETO UTILIZANDO A CLASSE SmartTv
    SmartTv tv1 = new SmartTv();

    //EXIBE AS CARACTERÍSTICAS DO OBJETO CRIADO tv1
    System.out.println("TV ligada? " + tv1.ligada);
    System.out.println("Canal Atual? " + tv1.canal);
    System.out.println("Volume Atual? " + tv1.volume);

    //LIGA E DESLIGA A TV EXIBINDO O ESTADO DESSA CARACTERÍSTICA
    tv1.ligar();
    System.out.println("TV Ligada? " + tv1.ligada);

    tv1.desligar();
    System.out.println("TV Ligada? " + tv1.ligada);


    //AUMENTA E DIMINUI O VOLUME E DEPOIS EXIBE ESSA CARACTERÍSTICA
    tv1.aumentarVolume();
    tv1.aumentarVolume();
    tv1.aumentarVolume();
    tv1.diminuirVolume();

    //EXIBE E DEPOIS MUDA DE CANAL, EXIBINDO NOVAMENTE PORÉM PARA O CANLA SELECIONADO
    System.out.println(tv1.canal);
    tv1.mudarCanal(13);
    System.out.println(tv1.canal);
}
    
}
