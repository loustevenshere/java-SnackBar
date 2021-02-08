package Snackbar;

public class Main 
{
	private static void workWithSnackData()
	{
		System.out.println("Hello from Snack Bar");

		// public Snack(String name, int quantity, double cost, int vendingMachineId)
		Snack chips = new Snack("Chips", 5, 2.00, 1);
		// public Customer(String name, double cash)
		Customer lou = new Customer("Louis", 50);

		// System.out.println();
		// System.out.println(chips.getName());
		// System.out.println();
		// System.out.println(chips.setAddQuantity(2));
		// System.out.println(chips.subtractQuantity(3));
		// System.out.println(chips.getCost(4));
		// System.out.println(lou.getId());
		// System.out.println(lou.setAddCash(5));
		// System.out.println(lou.setUseCash(2, chips.getCost()));
		chips.addQuantity(5);
		System.out.println(chips.getQuantity());
		chips.subtractQuantity(3);
		System.out.println(chips.getQuantity());

		System.out.println(lou.getName() + " cash on hand " + lou.getCash());
		System.out.println("Quanity of " + chips.getName() + " is " + chips.getQuantity());

		System.out.println(lou.getName() + " cash on hand " + lou.setUseCash(1, chips.getCost()));

	}

	public static void main(String[] args)
	{
		workWithSnackData();
	}
}