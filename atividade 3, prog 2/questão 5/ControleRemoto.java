
public class ControleRemoto {
	static void potenciaVolume(String aumDim) {
		if (aumDim == "+") {
			Televisao.setVolume(1);
		}
		else if (aumDim == "-") {
			Televisao.setVolume(0);
		}
	}
	static void canalUnidade(String aumDim) {
		if (aumDim == "+") {
			Televisao.setCanal(1);
		}
		else if (aumDim == "-") {
			Televisao.setCanal(0);
		}
	}
	static void trocarCanal(int canal) {
		Televisao.numeroCanal(canal);;
	}
	static void verVolume() {
		System.out.println(Televisao.getVolume());
	}
	static void vercanal() {
		System.out.println(Televisao.getCanal());
	}
}
