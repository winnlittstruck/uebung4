
public class RobotAdapter implements Spieler{
	private Robot roboter;

	public RobotAdapter() {
		roboter = new Robot();
		
	}
	
	public int geheNachLinks(int a)
	{
		double x = roboter.getX() - (double) a;
		roboter.rolleNach(x, roboter.getY());
	   return (int) roboter.getX();
	}
	public int geheNachRechts(int a)
	{
		double x = roboter.getX() + (double) a;
		roboter.rolleNach(x, roboter.getY());
		return (int) roboter.getX();
	}
	
	public int geheNachOben(int a)
	{
		double y = roboter.getY() + (double) a;
		roboter.rolleNach(roboter.getX(),y);
		return (int) roboter.getY();
	}
	public int geheNachUnten(int a)
	{
		double y = roboter.getY() - (double) a;
		roboter.rolleNach(roboter.getX(),y);
		return (int) roboter.getY();
	}
	
}
