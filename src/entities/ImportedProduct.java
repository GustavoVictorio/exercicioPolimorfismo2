package entities;

public class ImportedProduct extends Product {

	private Double customFree;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFree) {
		super(name, price);
		this.customFree = customFree;
	}

	public Double getCustomFree() {
		return customFree;
	}

	public void setCustomFree(Double customFree) {
		this.customFree = customFree;
	}
	
	
	
	
	
}
