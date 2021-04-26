
public class Main {

	public static void main(String[] args) {
		Kurs kurs1= new Kurs(1,"C# + Angular","Engin Demirog");
		Kurs kurs2= new Kurs(2,"Java + React","Engin Demirog");
		KursManager kursManager = new KursManager();
		OdevManager odevManager = new OdevManager();
		
		kursManager.addKurs(kurs1.name);
		kursManager.addKurs(kurs2.name);
		odevManager.odevBitir();
		odevManager.odevBitir();
		

	}

}
