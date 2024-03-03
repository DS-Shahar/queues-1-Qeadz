
public class Wolter {
	private String id;
	private int cc;
	
	public Wolter(String id, int cc){
		this.cc  = cc;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Wolter [id=" + id + ", cc=" + cc + "]";
	}
	
}
