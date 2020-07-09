package ch.zli.m223.ksh17a.cedric_fluehler.customer_memos.model.customer;

public class CustomerDto {
	
	public long id;
	public String name;
	
	public CustomerDto() {} // for JPA only
	
	public CustomerDto(Customer customer) {
		
		id = customer.getId();
		name = customer.getName();
	}
}