import java.util.*;

/*
 * A naive algorithm for sorting an array based on the order of another array
 * */

class Lab1 {

	// Sort carInventory based on the order in promotionOrder
	public static String[] sortCarInventory(String[] carInventory, String[] promotionOrder) {

		String[] sortedCarInventory = new String[carInventory.length];

		int index = 0;

		// Loop for each item in the promotion order
		for (int pIndex = 0; pIndex < promotionOrder.length; pIndex++) {
			// loop for each car in the carInventory list
			for (String c : carInventory) {
				if (c.equals(promotionOrder[pIndex])) {
					sortedCarInventory[index] = c;
					index++;
				}
			}
		}
		return sortedCarInventory;
	}

	public static void main(String[] args) {

		// get promotion order from command line arguments
		ArrayList<String> promotionOrderFromArgs = new ArrayList<String>();
		for (int i = 0; i < args.length; i++) {
			promotionOrderFromArgs.add(args[i]);
		}

		// Test sorting car inventory based on a promotion order
		String[] carInventory = { "mz", "my", "my", "mx", "mz", "mx", "my", "mz", "mx" };

		String[] sortedList = {};
		String[] promotionOrder = { "mz", "mx", "my" }; // default promotion order
		if (!promotionOrderFromArgs.isEmpty()) {
			promotionOrder = promotionOrderFromArgs.toArray(new String[0]);
			sortedList = Lab1.sortCarInventory(carInventory, promotionOrder);
		} else {
			sortedList = Lab1.sortCarInventory(carInventory, promotionOrder);
		}

		System.out.print("Car promotion order: ");
		for (String s : promotionOrder) {
			System.out.print(s + " ");
		}

		System.out.print("\n");

		System.out.print("Car inventory before sorting: ");
		for (String s : carInventory) {
			System.out.print(s + " ");
		}

		System.out.print("\n");

		System.out.print("Car inventory after sorting based on promotion: ");
		for (String s : sortedList) {
			System.out.print(s + " ");
		}
	}

}