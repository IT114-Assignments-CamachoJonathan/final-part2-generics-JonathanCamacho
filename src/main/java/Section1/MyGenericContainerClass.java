/**
 * 
 */
package Section1;

/**
 * @author Jonathan Camacho
 *
 */
public class MyGenericContainerClass<T> implements MyGenericContainerInterface <T>{
	//Attribute "contained"
	private T contained;
	
	public T getContained() {
		// TODO Auto-generated method stub
		return contained;
	}
	//Constructor 
	public MyGenericContainerClass(T _contained) {
		contained = _contained;
	}
	
}
