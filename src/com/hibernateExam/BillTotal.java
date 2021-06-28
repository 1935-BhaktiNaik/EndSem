package com.hibernateExam;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="BillTotal")
public class BillTotal 
{
	@Id @GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name = "newGenerator" , strategy = "foreign" , parameters = {@Parameter(value = "customer", name = "property")})
	
	private Integer customer_id;
	private Integer bill_id; 
	private Double total_amount;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	
	private Customer customer;

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public Integer getbill_id() {
		return bill_id;
	}

	public void setbill_id(Integer bill_id) {
		this.bill_id = bill_id;
	}

	public Double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Double total_amount) {
		this.total_amount = total_amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
