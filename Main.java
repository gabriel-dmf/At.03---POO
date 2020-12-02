package poo_comeco;

public class Main {

	public static void main(String[] args) {
		
		Piramide pira = new Piramide();
		
		pira.setAb(13.89);
		pira.setH(41.87);
		pira.setTipo(3);
		
		double al, area_tr, area_b, area_T, litros, latas, preco, volume, x;
		
		al = Math.sqrt((Math.pow(pira.getH(), 2) + Math.pow(pira.getAb(), 2)));
		area_tr = (2* pira.getAb()) * al / 2;
		area_b = (2 * pira.getAb()) * (2 * pira.getAb());
		area_T = (4 * area_tr) + area_b;
		litros = area_T / 4.76;
		latas = litros / 18;
		x = Math.round(latas);
		if(x < latas)
			x = x + 1;
		volume = area_b * 1/3 * pira.getH();
		
		if(pira.getTipo() == 1)
			preco = 127.90;
		else if(pira.getTipo() == 2)
			preco = 258.98;
		else
			preco = 344.34;
		
		System.out.println("ab: " + pira.getAb());
		System.out.println("h: " + pira.getH());
		System.out.println("al: " + al);
		System.out.println("Área Triângulo: " + area_tr);
		System.out.println("Área Base: " + area_b);
		System.out.println("Área Total: " + area_T);
		System.out.println("Tipo de Tinta: " + pira.getTipo());
		System.out.println("Litros: " + litros);
		System.out.println("Latas: " + x);
		System.out.println("Preço: " + (preco * x));
		System.out.println("Volume: " + volume);
	}

}
