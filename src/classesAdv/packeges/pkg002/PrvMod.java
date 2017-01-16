package classesAdv.packeges.pkg002;

//модификатор доступа к классу по умолчанию
class PrvMod {

	private static int prvInt = 16108;
	
	int getPrvInt(){
		return prvInt;
	}
	
	void setPrvInt(int i){
		prvInt = i;
	}
}
