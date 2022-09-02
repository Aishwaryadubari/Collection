public class Employee {
    private String name;
    private String lname;
    private String place;

    public Employee(String name, String lname, String place) {
        this.name = name;
        this.lname=lname;
        this.place=place;
    }

    public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getName() {
        return name;
    }

    public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public String toString() {
        return name+" "+lname;
    }
}
