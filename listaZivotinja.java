package zivotinje;
import java.util.Scanner;// koriscenje tekstualnog fajla
import java.io.File;
import java.util.ArrayList;
import zivotinje.Zivotinja;
public class listaZivotinja {
	public static void main(String[] args) {	
		try{//provera da li testualna datoteka postoji i ucitavanje podataka iz nje 
	
		Scanner z = new Scanner(new File("zivotinje.txt"));
		ArrayList<Zivotinja> lista = new ArrayList<Zivotinja>();//kreiranje objekata
		while(z.hasNextLine()){//dok postoje neprazne linije u fajlu vrsi se iscitavanje i dodavanje u listu
			String ime = z.next();
			Zivotinja pom=new Zivotinja(ime);
			lista.add(pom);
		}
		z.close();//zatvaranje tekstualne datoteke
			
			for (int i=0; i<lista.size(); i++){//sortiranje po imenu - selection sort
				for (int j=i+1; j<lista.size(); j++){
					if (lista.get(j).getIme().compareTo(lista.get(i).getIme())<0){ 
						//compareTo vraca negativnu vrednost ako imena nisu u abecednom redosledu - rastuci,
						//vece od nule - opadajuce, nula - isti (razlika po ascii tabeli)
						Zivotinja pom=lista.get(i);
						lista.set(i, lista.get(j));
						lista.set(j, pom);
					}
				}
			}
			System.out.println("Zoo vrt - Spisak zivotinja: ");
			System.out.println("------------------------------");
			for (int i=0; i<lista.size(); i++){//ispis po imenu
				int n = i+1;
				System.out.println(n+". "+lista.get(i).getIme());
			}

		}catch (Exception izuzetak)
		{
			System.out.println(izuzetak.getMessage());
		}	
	}
}
