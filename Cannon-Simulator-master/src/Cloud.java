package cannonsimulator;

import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Random;

	-size:int
	-x:double
	-y:int
	-speed:double
	-rand:Random
	
	//----------------------------------------------------------//
	
	+Cloud()
	+draw(Graphics2D g):Graphics2D 
	 +update()
	-resetCloud()