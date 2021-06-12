/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharaon;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Elshahaby
 */
public class PyramidCsvDao {
    public PyramidCsvDao(){
        
    }
    
public static List <Pyramid> readPyramidCSV(String fileName){
	ArrayList<Pyramid> pyramids = new ArrayList<Pyramid>();
	
	try {
		String [] line;
		Scanner fileInput = new Scanner(new File(fileName));
		//fileInput.useDelimiter("\n");
                fileInput.nextLine();
		while(fileInput.hasNextLine()) {
		
			line = fileInput.nextLine().split(",");
                        Pyramid pyramidInfo=new Pyramid(line[0],line[2],line[4],Double.parseDouble(line[7]));
                        
                        pyramids.add(pyramidInfo);
		}
		fileInput.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
	System.out.println("An error not found file");
	}
	return pyramids;
}

}
