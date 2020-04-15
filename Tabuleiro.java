package trabalho;
public class Tabuleiro {
    Pecas p[][] = new Pecas[7][7];
    //o primeiro numero da matriz indica a linha e o segundo, a coluna
    public Tabuleiro(){
        Pecas p1 = new Pecas();
        Pecas p2 = new Pecas();
        Pecas p3 = new Pecas();
        Pecas p4 = new Pecas();
        Pecas p5 = new Pecas();
        Pecas p6 = new Pecas();
        Pecas p7 = new Pecas();
        Pecas p8 = new Pecas();
        Pecas p9 = new Pecas();
        Pecas p10 = new Pecas();
        Pecas p11 = new Pecas();
        Pecas p12 = new Pecas();
        Pecas p13 = new Pecas();
        Pecas p14 = new Pecas();
        Pecas p15 = new Pecas();
        Pecas p16 = new Pecas();
        Pecas p17= new Pecas();
        Pecas p18 = new Pecas();
        Pecas p19 = new Pecas();
        Pecas p20 = new Pecas();
        Pecas p21 = new Pecas();
        Pecas p22 = new Pecas();
        Pecas p23 = new Pecas();
        Pecas p24= new Pecas();
        Pecas p25 = new Pecas();
        Pecas p26 = new Pecas();
        Pecas p27 = new Pecas();
        Pecas p28 = new Pecas();
        Pecas p29 = new Pecas();
        Pecas p30= new Pecas();
        Pecas p31 = new Pecas();
        Pecas p32 = new Pecas();
        Pecas p33 = new Pecas();
        Pecas p34 = new Pecas();
        Pecas p35 = new Pecas();
        Pecas p36 = new Pecas();
        Pecas p37 = new Pecas();
        Pecas p38 = new Pecas();
        Pecas p39 = new Pecas();
        Pecas p40 = new Pecas();
        Pecas p41 = new Pecas();
        Pecas p42 = new Pecas();
        Pecas p43 = new Pecas();
        Pecas p44 = new Pecas();
        Pecas p45 = new Pecas();
        Pecas p46 = new Pecas();
        Pecas p47 = new Pecas();
        Pecas p48 = new Pecas();
        Pecas p49 = new Pecas();
        //-----------------------------
        this.p[0][0] = p1; 
        this.p[0][1] = p2; 
        this.p[0][2] = p3; 
        this.p[0][3] = p4; 
        this.p[0][4] = p5; 
        this.p[0][5] = p6; 
        this.p[0][6] = p7; 
        this.p[1][0] = p8; 
        this.p[1][1] = p9; 
        this.p[1][2] = p10; 
        this.p[1][3] = p11; 
        this.p[1][4] = p12; 
        this.p[1][5] = p13; 
        this.p[1][6] = p14; 
        this.p[2][0] = p15; 
        this.p[2][1] = p16; 
        this.p[2][2] = p17; 
        this.p[2][3] = p18; 
        this.p[2][4] = p19; 
        this.p[2][5] = p20; 
        this.p[2][6] = p21;
        this.p[3][0] = p22; 
        this.p[3][1] = p23; 
        this.p[3][2]= p24; 
        this.p[3][3] = p25; 
        this.p[3][4] = p26; 
        this.p[3][5] = p27; 
        this.p[3][6] = p28;
        this.p[4][0] = p29; 
        this.p[4][1] = p30; 
        this.p[4][2] = p31; 
        this.p[4][3] = p32; 
        this.p[4][4] = p33; 
        this.p[4][5] = p34; 
        this.p[4][6] = p35;
        this.p[5][0] = p36; 
        this.p[5][1] = p37; 
        this.p[5][2]= p38; 
        this.p[5][3] = p39; 
        this.p[5][4] = p40; 
        this.p[5][5]= p41; 
        this.p[5][6] = p42; 
        this.p[6][0] = p43; 
        this.p[6][1] = p44; 
        this.p[6][2] = p45; 
        this.p[6][3] = p46; 
        this.p[6][4] = p47; 
        this.p[6][5] = p48; 
        this.p[6][6] = p49;
        //-------------------------------
        this.p[0][0].emjogo = -1; 
        this.p[0][1].emjogo = -1; 
        this.p[0][2].emjogo = 1; 
        this.p[0][3].emjogo = 1; 
        this.p[0][4].emjogo = 1; 
        this.p[0][5].emjogo = -1; 
        this.p[0][6].emjogo = -1; 
        //-------------------------------
        this.p[1][0].emjogo = -1; 
        this.p[1][1].emjogo = -1; 
        this.p[1][2].emjogo = 1; 
        this.p[1][3].emjogo = 1; 
        this.p[1][4].emjogo = 1; 
        this.p[1][5].emjogo = -1; 
        this.p[1][6].emjogo = -1; 
        //-------------------------------
        this.p[2][0].emjogo = 1; 
        this.p[2][1].emjogo = 1; 
        this.p[2][2].emjogo = 1; 
        this.p[2][3].emjogo = 1; 
        this.p[2][4].emjogo = 1; 
        this.p[2][5].emjogo = 1; 
        this.p[2][6].emjogo = 1;
        //-------------------------------
        this.p[3][0].emjogo = 1; 
        this.p[3][1].emjogo = 1; 
        this.p[3][2].emjogo = 1; 
        this.p[3][3].emjogo = 0; 
        this.p[3][4].emjogo = 1; 
        this.p[3][5].emjogo = 1; 
        this.p[3][6].emjogo = 1;
        //-------------------------------
        this.p[4][0].emjogo = 1; 
        this.p[4][1].emjogo = 1; 
        this.p[4][2].emjogo = 1; 
        this.p[4][3].emjogo = 1; 
        this.p[4][4].emjogo = 1; 
        this.p[4][5].emjogo = 1; 
        this.p[4][6].emjogo = 1;
        //-------------------------------
        this.p[5][0].emjogo = -1; 
        this.p[5][1].emjogo = -1; 
        this.p[5][2].emjogo = 1; 
        this.p[5][3].emjogo = 1; 
        this.p[5][4].emjogo = 1; 
        this.p[5][5].emjogo = -1; 
        this.p[5][6].emjogo = -1; 
        //-------------------------------
        this.p[6][0].emjogo = -1; 
        this.p[6][1].emjogo = -1; 
        this.p[6][2].emjogo = 1; 
        this.p[6][3].emjogo = 1; 
        this.p[6][4].emjogo = 1; 
        this.p[6][5].emjogo = -1; 
        this.p[6][6].emjogo = -1;
    }
    void imprimirtabuleiro(){
        int linha = 6, coluna = 0;
        while(linha >= 0){
                if(linha == 6){
                    System.out.print("7 ");
                 }
                if(linha == 5){
                    System.out.print("6 ");
                 }
                if(linha == 4){
                    System.out.print("5 ");
                 }
                if(linha == 3){
                    System.out.print("4 ");
                 }
                if(linha == 2){
                    System.out.print("3 ");
                 }
                if(linha == 1){
                    System.out.print("2 ");
                 }
                if(linha == 0){
                    System.out.print("1 ");
                 }
                while(coluna <= 6){
                    System.out.print(this.p[linha][coluna].checar());
                    coluna ++;
                    System.out.print(" ");
                }
                System.out.print("\n");
                coluna = 0;
                linha --;
        }
        System.out.println("  a b c d e f g");   
    }
}
