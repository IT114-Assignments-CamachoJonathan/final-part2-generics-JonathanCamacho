/**
 * 
 */
package Section1;

import java.util.Collection;

/**
 * @author Jonathan Camacho
 *
 */
public class MyGenericStaticMethodUtility {
	
	public static<T> T add2collection(T _e, Collection<T> collection)
	{
		collection.add(_e);
		return _e;
	}

}
