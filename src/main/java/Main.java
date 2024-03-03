class Main {
   public static void main(String[] args) {
	      Queue<Wolter> q = new Queue<Wolter>();
	      q.insert(new Wolter("paturi", 5));
	      q.insert(new Wolter("paturi2", 4));
	      q.insert(new Wolter("paturon5", 7));
        q.insert(new Wolter("paturi4", 3));
        q.insert(new Wolter("paturon1", 8));

	      int cc = 6;
	      System.out.println(q);
	      String ID = find(q, cc);
	      System.out.println(ID);
	      System.out.println(q);
   }
	  
	public static String find(Queue<Wolter> q, int cc) {
		q.insert(null); String ID = "Not Found";
		boolean flag = true;
		while(q.head() != null) {
			if(cc <= q.head().getCc() && flag) {
				ID = q.head().getId();
				flag = false;
				q.remove();
			}
			else
				q.insert(q.remove());
		}
		q.remove();
		return ID;
	}
}

}
