package lab6.CoR;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("A", "B", new Address("aaa", "bbb", "ccc", "111"), "010", "aa@.com");
		Customer c2 = new Customer("D", "E", null, "010", "aa@.com");
		Customer c3 = new Customer("A", "B", new Address("aaa", "bbb", "ccc", "111"), null, "aa@.com");
		
		CallRecord record1 = new CallRecord(c1, null, "aa");
		CallRecord record2 = new CallRecord(c2, null, "bb");
		CallRecord record3 = new CallRecord(c3, null, "cc");
		
		ChainBuilder chainBuilder = new ChainBuilder();
		chainBuilder.buildChain();
		
		chainBuilder.getHandler().process(record1);
		chainBuilder.getHandler().process(record2);
		chainBuilder.getHandler().process(record3);
		
	}

}
