package sorting;

public class Students implements Comparable<Students> {

	private String id;
	
	private String name;
	
	private int marks;
	
	private String total;

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + ", total=" + total + "]";
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public Students(String id, String name, int marks, String total) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.total = total;
	}

	public int compareTo(Students o) {
		if(marks > o.getMarks())
		{
			return 1;
		}
		return -1;
	}

}
