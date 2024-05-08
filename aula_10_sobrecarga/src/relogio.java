public class relogio {
    private int hora;
    private int minuto;
    private int segundo;

    //construtor 1 vazio
    public relogio () {

    }

    // construtor 2 (inserindo apenas hora)
    public relogio (int hora){
        this.hora = hora;
        this. minuto = 0;
        this.segundo = 0;
    }

    // construtor 3 (inserindo apenas hora e minuto)
    public relogio (int hora, int minuto){
        this.hora = hora;
        this. minuto = minuto;
        this.segundo = 0;
    }

    // construtor 4 (inserindo todos os atributos)
    public relogio (int hora, int minuto, int segundo){
        this.hora = hora;
        this. minuto = minuto;
        this.segundo = segundo;
    }
    
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
