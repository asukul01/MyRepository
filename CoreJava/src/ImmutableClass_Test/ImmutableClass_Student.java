package ImmutableClass_Test;

public final class ImmutableClass_Student {
	private final int id;
	private final String name;
	private Address address;

	public ImmutableClass_Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "ImmutableClass_Student [id=" + id + ", name=" + name + ", address=" + address.toString() + "]";
	}
	
	
}
