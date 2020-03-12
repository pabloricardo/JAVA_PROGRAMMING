package enums;

public enum Foods {
	RICE("Arroz"),
	Bean("Feijão"),
	MEAT("Carne");
	
	private String food;
	
	Foods(String food){
		this.food = food;
	}
	
	public String getFood(){
		return this.food;
	}
}
