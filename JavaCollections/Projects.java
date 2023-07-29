public class Projects implements Comparable {
	//Comparable interface declares compareTo() method. This method has to be implemented. The result of this method determines whether the TreeSet
	//Contains elements in Ascending/Descending order. This method is called automatically for every object added to TreeSet.
	int projectID;String projectName;
	public Projects(int projectID, String pName) {
		this.projectID=projectID;	this.projectName=pName;
	}
	@Override	
	public int compareTo(Object o) {
		Projects p=(Projects)o; //Convert to Project type...
		if(this.getProjectID() < p.getProjectID()) 
			return -1;
		else if(this.getProjectID() > p.getProjectID()) 
			return 1;
		else
			return 0;
	}
	public int getProjectID() {
		return projectID;
	}
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String toString()
	{
		return "ProjectID - " + this.getProjectID() + ", ProjectName - " + this.getProjectName();
				
	}
}
