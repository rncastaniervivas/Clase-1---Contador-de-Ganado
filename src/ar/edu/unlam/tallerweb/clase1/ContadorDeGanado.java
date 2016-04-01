package ar.edu.unlam.tallerweb.clase1;

public class ContadorDeGanado {
	
		private int cantidad = 0; //integer	
		
		public void contar(){
			cantidad= cantidad + 1;
		}
		
		public int mostrarCantidad(){ 	//integer
			return cantidad;
		}

}
