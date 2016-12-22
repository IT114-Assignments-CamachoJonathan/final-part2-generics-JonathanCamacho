/**
 * 
 */
package section2;

/**
 * @author Jonathan Camacho
 *
 */
public interface HasGovernor <T extends Governor> {
	
	public <T> void getGovernor();

	public String getGovernorName(); 


}
