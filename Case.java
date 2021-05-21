public class Case{

	private int ligne;
	private int colonne;
	private Piece piece;

	public Case(int ligne, int colonne, Piece piece){
		this.piece=piece ;
		this.colonne=colonne ;
		this.ligne=ligne ;
	}	

    public int getLigne(){
        return ligne;
    }

    public void setLigne(int ligne) {
		this.ligne = ligne;
	}

    public int getColonne(){
        return colonne;
    }
    public void setColonne(int colonne) {
		this.colonne = colonne;
	}

    public Piece getPiece(){
        return piece ;
    }

    public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public boolean estVide(){
		return this.piece == null ;
	}
}