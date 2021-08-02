
public class Televisao {
	private static int volumeSom = 20;
	private static int canal = 7;
	
	public static int getVolume() {
		return volumeSom;
	}
	public static int getCanal() {
		return canal;
	}
	public static void setVolume(int vol) {
		if (vol == 1) {
			volumeSom++;
		}
		else if (vol == 0) {
			volumeSom--;
		}
	}
	public static void setCanal(int can) {
		if (can == 1) {
			canal++;
		}
		else if (can == 0) {
			canal--;
		}
	}
	public static void numeroCanal(int numero) {
		canal = numero;
	}
	public static void main(String args[]) throws Exception
	{
		System.out.printf("volume:");
		ControleRemoto.verVolume();
		System.out.println("aumentando volume: +");
		ControleRemoto.potenciaVolume("+");
		System.out.println("ver volume:");
		ControleRemoto.verVolume();
		System.out.println("Diminuindo volume: -");
		ControleRemoto.potenciaVolume("-");
		System.out.println("ver volume:");
		ControleRemoto.verVolume();
		
		System.out.printf("%ncanal:");
		ControleRemoto.vercanal();
		System.out.println("aumentando canal: +");
		ControleRemoto.canalUnidade("+");
		System.out.println("ver canal:");
		ControleRemoto.vercanal();
		System.out.println("Diminuindo canal: -");
		ControleRemoto.canalUnidade("-");
		System.out.println("ver canal:");
		ControleRemoto.vercanal();
		System.out.println("trocando para canal: 13");
		ControleRemoto.trocarCanal(13);
		System.out.println("ver canal:");
		ControleRemoto.vercanal();
	}
}
