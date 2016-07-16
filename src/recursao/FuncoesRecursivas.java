package recursao;

public class FuncoesRecursivas {

	public static void main(String[] args) {
		System.out.println(fatorialRecursivo(5));
		System.out.println(fatorialIterativo(5));
		System.out.println(finonatiRecursivo(5));
		System.out.println(finonatiIterativo(5));
	}

	private static int fatorialIterativo(int x) {
		int fatorial = 1;
		for (int i = x; i >= 1; i--) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}

	public static int fatorialRecursivo(int x) {
		if (x == 1) {
			return 1;
		} else {
			return fatorialRecursivo(x - 1) * x;
		}
	}

	public static int finonatiRecursivo(int m) {
		if (m == 0 || m == 1) {
			return 1;
		} else {
			return finonatiRecursivo(m - 1) + finonatiRecursivo(m - 2);
		}
	}

	public static int finonatiIterativo(int m) {
		int atual = 0;
		int anterior = 0;
		for (int i = 1; i <= m+1; i++) {
			if (i == 1) {
				atual = 1;
				anterior = 0;
			} else {
				atual = atual + anterior;
				anterior = atual - anterior;
			}
		}
		return atual;
	}
}
