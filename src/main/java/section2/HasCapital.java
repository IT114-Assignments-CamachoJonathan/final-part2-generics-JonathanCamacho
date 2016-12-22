/**
 * 
 */
package section2;

/**
 * @author Jonathan Camacho
 *
 */
public interface HasCapital <T extends Capital> {
	
	public <T> void getCapital();

	public String getCapitalName(); 

}


