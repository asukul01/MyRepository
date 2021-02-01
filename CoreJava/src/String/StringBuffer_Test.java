package String;

//Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.
public class StringBuffer_Test {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// default 16
		sb.append("Hello");
		System.out.println(sb.capacity());// now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());// now (16*2)+2=34 i.e
											// (oldcapacity*2)+2
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("Hello");
		
		System.out.println("Hashcode of s1 : " + s1.hashCode());
		System.out.println("Hashcode of s1 after concat World : " + (s1.append("World")).hashCode());
		
		System.out.println(s1.equals(s2));//calls the object class equals method which checks for the reference which is not same.
	}
}
