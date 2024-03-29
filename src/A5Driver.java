
public class A5Driver {

	public static void main(String[] args) {
		A5Cuckoo<Integer> hashTable = new A5Cuckoo<>(1);//force tables to start at size 2, total of 4 spaces
		hashTable.insert(0);
		hashTable.insert(1);
		System.out.println(hashTable);
		hashTable.insert(2);//should perform rehash because more than half full
		//You will need to continue to insert values that cause collisions to fully test your insert
		//depending on how you write the hashForTable1/hashForTable2 methods, you may need to try several different numbers to cause collisions
		System.out.println(hashTable);

		System.out.println(hashTable.contains(3));
		System.out.println(hashTable.contains(2));
		System.out.println(hashTable.get(2));
		System.out.println(hashTable.get(3));
		System.out.println(hashTable.remove(2));
		System.out.println(hashTable.remove(3));
		System.out.println(hashTable.contains(3));
		System.out.println(hashTable.contains(2));
		hashTable.makeEmpty();
		System.out.println(hashTable);
	}

}
