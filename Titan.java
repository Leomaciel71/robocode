package titan2;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Titan - a robot by (your name here)
 */
public class Titan extends Robot
{
	/**
	 * run: Titan's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
	 {
			// Replace the next 4 lines with any behavior you would like
			double distance = Math.random()*300;
            double angle = Math.random()*45;
            turnRight(angle);
            ahead(distance);
            ahead(100);
            turnGunRight(90);
            back(100);
           
        }
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
   public void onScannedRobot(ScannedRobotEvent e){
    double distance = e.getDistance(); //get the distance of the scanned robot
    if(distance > 800)        fire(5);
    else if(distance > 600 && distance <= 800)
        fire(4);
    else if(distance > 400 && distance <= 600)
        fire(3);
    else if(distance > 200 && distance <= 400)
        fire(2);
    else if(distance < 200)
        fire(1);
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
   while(true){
    ahead(100); //Go ahead 100 pixels
    turnGunRight(360); //scan
    back(75); //Go back 75 pixels
    turnGunRight(360); //scan

    }

    /**
     * onHitWall: What to do when you hit a wall
     */
   public void onHitWall(HitWallEvent e){
    double bearing = e.getBearing(); //get the bearing of the wall
    turnRight(-bearing); //This isn't accurate but release your robot.
    ahead(100); //The robot goes away from the wall.
}
  
     }
}
