package br.com.devinhouse.folhadepagamento.util;

public class Data {

	private static final int MAIOR_IDADE_PERMITIDA = 130;
	private static final String DATA_PADRAO = "01/01/1900";

	public static String validarData(String data) {
		data = data.trim();
		if ((data.length() != 10) || (data.indexOf("/") != 2) || (data.lastIndexOf("/") != 5)) {
			return DATA_PADRAO;
		} else {
			int diaAtual = Integer.parseInt(DataAtual.retornarDataAtual(0));
			int mesAtual = Integer.parseInt(DataAtual.retornarDataAtual(1));
			int anoAtual = Integer.parseInt(DataAtual.retornarDataAtual(2));

			String splitedData[] = data.split("/");
			int dia = Integer.parseInt(splitedData[0]);
			int mes = Integer.parseInt(splitedData[1]);
			int ano = Integer.parseInt(splitedData[2]);

			if (((dia > 31) || (mes > 12)) || ((mes == 2) && (dia > 29))
					|| (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && (dia > 30))
					|| (((anoAtual - ano) > MAIOR_IDADE_PERMITIDA) || (ano > anoAtual))) {
				return DATA_PADRAO;
			} else if (ano == anoAtual) {
				if (mes > mesAtual) {
					data = DATA_PADRAO;
				} else if (mes == mesAtual) {
					if (dia > diaAtual) {
						data = DATA_PADRAO;
					}
				}
			}
		}
		return data;
	}

}