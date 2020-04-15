package trabalho;
public class Pecas {
    int emjogo;
//se emjogo = 1, a peça está em jogo, caso emjogo = 0, a peça está fora de jogo
//se emjogo = -1, a peça representa uma casa que não pode ser acessada
    void tirarpeca(Pecas p){
        p.emjogo = 0;
    }
    char checar(){
        if(this.emjogo == 0){
            return '-';
        }
        if(this.emjogo == 1){
            return 'P';
        }
        if(this.emjogo == -1){
            return ' ';
        }
        return '@';
    }
    public Pecas(){
        this.emjogo = 1;
    }
}
