package zivotinje;

public class Zivotinja {//klasa zivotinja, koja za svaku zivotinju ima promenljivu ime i metodu getIme
	private String ime;
	
	
	public Zivotinja (String ime){
		this.ime = ime;
		
	}
	
	public String getIme(){//vraca ime zivotinje
		return ime;
	}

}
