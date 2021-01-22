package Jan21;

class object2{
	
	String name;
	String mj;
	double score;
	int rank;



	public Student(String name, String mj, double score, int rank) {
	super();
	this.name = name;
	this.mj = mj;
	this.score = score;
	this.rank = rank;
}

	@Override
	public String toString() {
		return "[";
	}

	public static void main(String[] args) {
		
		Student kim = new Student("홍길", "컴퓨터공학", 4.5, 10);
				
		System.out.println(kim);		

	}

}
