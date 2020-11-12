package ast;

public class Corchetes extends EBin{
    public Corchetes (E opnd1, E opnd2, boolean asignable, int fila, int columna) {
	     super(opnd1,opnd2, "([ ])", asignable); 
	     this.fila = fila;
		 this.columna = columna;
	   }     
	public TipoE tipo() {return TipoE.CORCHETES;}
}