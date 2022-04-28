package com.abc.entity;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Order {
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
@Column(name = "orderId")
private int orderId;
@Column(nullable = false)
private int itemId;
@Column(nullable = false)
private int itemprice;
@Column(nullable = false)
private int NoOfItems;
@Column(nullable = false)
private int userId;
@Column(nullable = false)
private String orderplaceddate;
@Column(nullable = false)
private String orderdeliverydate;
@Column(nullable = false)
private int discount;
@Column(nullable = false)
private int finalprice;

public Order() {
	super();
	// TODO Auto-generated constructor stub

}
public Order(int orderId,int ordertId, int itemprice,int NoOfItems,int userId, String orderdeliverydate, String orderplaceddate, int discount, int finalprice) {
	super();
	this.userId = userId;
	this.orderId = orderId;
	this.itemprice = itemprice;
	this.NoOfItems = NoOfItems;
	this.userId = userId;
	this.orderplaceddate = orderplaceddate;
	this.orderdeliverydate = orderdeliverydate;
	this.discount = discount;
	this.finalprice = finalprice;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public int getItemprice() {
	return itemprice;
}
public void setItemprice(int itemprice) {
	this.itemprice = itemprice;
}
public int getNoOfItems() {
	return NoOfItems;
}
public void setNoOfItems(int noOfItems) {
	NoOfItems = noOfItems;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getOrderplaceddate() {
	return orderplaceddate;
}
public void setOrderplaceddate(String orderplaceddate) {
	this.orderplaceddate = orderplaceddate;
}
public String getOrderdeliverydate() {
	return orderdeliverydate;
}
public void setOrderdeliverydate(String orderdeliverydate) {
	this.orderdeliverydate = orderdeliverydate;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}
public int getFinalprice() {
	return finalprice;
}
public void setFinalprice(int finalprice) {
	this.finalprice = finalprice;
}

}
