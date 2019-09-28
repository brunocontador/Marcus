
public class Valores implements ValoresITF {

	int[] valores = new int[10];
	int indice = 0;

	@Override
	public boolean ins(int v) {
		boolean retorno = false;
		if (v <= 0) {
			return retorno;
		}
		for (int i = 0; i < this.valores.length - 1; i++) {
			if (valores[i] == 0) {
				valores[i] = v;
				System.out.println(valores[i]);

				retorno = true;
				break;
			} else {
				retorno = false;
			}
		}
		return retorno;
	}

	@Override
	public int del(int i) {
		if (valores.length == 0) {
			return -1;
		}
		for (int k = 0; k < this.valores.length - 1; k++) {
			return valores[i];

		}
		return 0;

	}

	@Override
	public int size() {
		return valores.length;
	}

	@Override
	public double mean() {
		double soma = 0;
		double media = 0;
		if (valores.length <= 0) {
			return -1;
		}
		for (int k = 0; k < this.valores.length - 1; k++) {
			soma += valores[k];
		}

		return media = soma / (valores.length - 1);
	}

	@Override
	public int greater() {
		int maior = valores[0];
		for (int i = 0; i < valores.length - 1; i++)
			if (maior < valores[i])
				maior = valores[i];

		return maior;
	}

	@Override
	public int lower() {
		int menor = valores[0];
		for (int i = 0; i < valores.length - 1; i++)
			if (menor > valores[i])
				menor = valores[i];
		return menor;
	}

}