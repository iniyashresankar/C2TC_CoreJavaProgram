//Program to demonstrate method overriding - Runtime Polymorphism
package DaySeven.DaySeven.overriding;

//subclass
public class SBI extends RBI {
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}

	public SBI getObject() {
		return this;
	}
}
