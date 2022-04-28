package com.abc.entity;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Plant implements Comparable<Plant> {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int plantId;
	private int cost;
	private int stock;
	private String name;
	private String type;
	public Plant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public  Plant (int plantId,int cost,int stock,String name,String type) {
		super();
		this.plantId=plantId;
		this.cost = cost;
		this.stock = stock;
		this.name=name;
		this.type=type;
	}
	/**
	 * @return the plantId
	 */
	public int getPlantId() {
		return plantId;
	}
	/**
	 * @param plantId the plantId to set
	 */
	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}
	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + plantId;
		result = prime * result + stock;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Plant other = (Plant) obj;
		if (cost != other.cost) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (plantId != other.plantId) {
			return false;
		}
		if (stock != other.stock) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Plant o) {
		// TODO Auto-generated method stub
		return this.plantId-o.plantId;
	}
	}
	
	
	
