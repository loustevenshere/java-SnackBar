package Snackbar;

public class Customer
{
	private static int maxId;
	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cash = cash;
	}


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

	public double getCash()
	{
		return cash;
	}

	public double setAddCash(double addedCash)
	{
		return cash + addedCash;
	}

	public double setUseCash(int quantity, double cost)
	{
		double totalCost = quantity * cost;
		return cash - totalCost;
	}
}