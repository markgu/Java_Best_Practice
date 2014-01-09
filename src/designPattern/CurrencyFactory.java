package designPattern;

public class CurrencyFactory {
	// Factory design pattern
	public static Currency createCurrency(String country){
		if(country.equals("Korea")){
			return new Won();
		} else if(country.equals("Australia")){
			return new AUDollar();
		} else if(country.equals("US") ){
			return new USDollar();
		}
		throw new RuntimeException("No such currency");
	}
	
	public static void main(String[] args){
		Currency cr = createCurrency("Korea");
		System.out.println(cr.getSymbol());
		cr = createCurrency("Australia");
		System.out.println(cr.getSymbol());
		cr = createCurrency("US");
		System.out.println(cr.getSymbol());
	}
}

interface Currency{
	String getSymbol();
}

class Won implements Currency{
	@Override
	public String getSymbol(){
		return "Won";
	}
}

class AUDollar implements Currency{
	@Override
	public String getSymbol(){
		return "AUD";
	}
}

class USDollar implements Currency{
	@Override
	public String getSymbol(){
		return "USD";
	}
}
