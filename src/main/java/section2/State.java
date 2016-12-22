/**
 * 
 */
package section2;

/**
 * @author Jonathan Camacho
 *
 */
public class State <C extends HasCapital,G extends HasGovernor> implements HasCapital, HasGovernor, HasName{

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void getGovernor() {
		// TODO Auto-generated method stub
		
	}

	public String getGovernorName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void getGCapital() {
		// TODO Auto-generated method stub
		
	}

	public String getGCapitalName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//attributes
	public String name;
	
	public C capital;
	
	public G governor;
	
	//Constructor
	public State(name, capital, governor);

}
