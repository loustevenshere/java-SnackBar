package Snackbar;

public class Snack
{

	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	// getters and setters - check these


	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	public int getVendingMachineId()
	{
		return vendingMachineId;
	}

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;

	}

	// Any way to keep the state of quantity for when I do the following methods

	// public int setAddQuantity(int addQuantity)
	// {
	// 	return quantity + addQuantity;
	// }

	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}

	public void subtractQuantity(int quantity) {
    this.quantity -= quantity;
}

	public double getTotalCost(int quantity)
	{
		double totalCost = this.cost * quantity;
		return totalCost;
	}




}