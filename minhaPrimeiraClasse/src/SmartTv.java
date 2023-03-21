public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //FUNÇÃO MUDAR CANAL

        public void mudarCanal(int novoCanal) {
            canal = novoCanal;
        }


    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal++;
    }
    
    

    //FUNÇÃO AUMENTA E DIMINUI VOLUME
    public void aumentarVolume() {
        volume++;
        System.out.println("Volume atual " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume atual " + volume);
    }

    //FUNÇÃO LIGA E DESLIGA
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
