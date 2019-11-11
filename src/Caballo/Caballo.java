package Caballo;

public class Caballo {
    private int[][] chessboard;
    private Coordenada pos;

    public Caballo(int size,int x, int y){
        this.chessboard = new int[size][size];
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size ; j++) {
                this.chessboard[i][j] = 0;
            }
        }
        this.pos = new Coordenada(x,y);
        this.chessboard[this.pos.getX()][this.pos.getY()]= 1;
    }

    public Coordenada[] posibleSiguienteMovimiento(Coordenada pos){
        Coordenada[] aux = new Coordenada[8];
        for (int i = 0; i < 8 ; i++) {
            switch(i){
                case 0:
                    aux[i] = new Coordenada(pos.getX()-1,pos.getY()-2);
                    break;
                case 1:
                    aux[i] = new Coordenada(pos.getX()-2,pos.getY()-1);
                    break;
                case 2:
                    aux[i] = new Coordenada(pos.getX()-2,pos.getY()+1);
                    break;
                case 3:
                    aux[i] = new Coordenada(pos.getX()-1,pos.getY()+2);
                    break;
                case 4:
                    aux[i] = new Coordenada(pos.getX()+1,pos.getY()+2);
                    break;
                case 5:
                    aux[i] = new Coordenada(pos.getX()+2,pos.getY()+1);
                    break;
                case 6:
                    aux[i] = new Coordenada(pos.getX()+2,pos.getY()-1);
                    break;
                case 7:
                    aux[i] = new Coordenada(pos.getX()+1,pos.getY()-2);
                    break;
            }
        }
        return aux;
    }
    
    public boolean validarMovimiento(Coordenada pos){
        if (
                pos.getX() < this.chessboard.length && pos.getX() >= 0 &&
                pos.getY() < this.chessboard.length && pos.getY() >= 0 &&
                this.chessboard[pos.getX()][pos.getY()] == 0
        )
            return true;
        return false;
    }
    
    public int recorrido( ){
        int moves = 1;
        int maxMoves = this.chessboard.length * this.chessboard.length;
        Coordenada aux []; // Movimientos apartir de posiciones

        boolean exit = true;
        while (moves < maxMoves && exit){
            exit = false;
            aux= posibleSiguienteMovimiento(this.pos);
            int minNext= 8;
            Coordenada sigMov = new Coordenada(0,0);
            for (int i = 0; i < 8 ; i++) {
                if(validarMovimiento(aux[i])){
                    exit= true;
                    Coordenada[] pos= posibleSiguienteMovimiento(aux[i]); // Movimientos apartir de posibles pos
                    int cont=0;
                    for (int j = 0; j < 8 ; j++) {
                        if(validarMovimiento(pos[j])){
                            cont++;
                        }
                    }
                    if(minNext >= cont){
                        minNext= cont;
                        sigMov=aux[i];
                    }
                }
            }
            this.setPos(sigMov);
            moves++;
            this.chessboard[this.pos.getX()][this.pos.getY()]=moves;
        }
        return moves;
    }

    public int[][] getChessboard() {
        return chessboard;
    }

    public void setChessboard(int[][] chessboard) {
        this.chessboard = chessboard;
    }

    public Coordenada getPos() {
        return pos;
    }

    public void setPos(Coordenada pos) {
        this.pos = pos;
    }
}
