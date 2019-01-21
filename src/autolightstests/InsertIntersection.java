/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autolightstests;

/**
 *
 * @author Mido Austin
 */
public class InsertIntersection {
    
    public static void main(String args[]){
        int id = 1;
        String location = "Haille Selassie Rnd-Abt";
    
    String insert1 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-01', 'J"+id+"', '01', 'SWB', '"+location+"');";
       System.out.println(insert1);
	   
    String insert2 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-02', 'J"+id+"', '02', 'SNB', '"+location+"');";
           System.out.println(insert2);

    String insert3 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-03', 'J"+id+"', '03', 'SEB', '"+location+"');";
           System.out.println(insert3);

    String insert4 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-04', 'J"+id+"', '04', 'WNB', '"+location+"');";
           System.out.println(insert4);

    String insert5 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-05', 'J"+id+"', '05', 'WEB', '"+location+"');";
           System.out.println(insert5);

    String insert6 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-06', 'J"+id+"', '06', 'WSB', '"+location+"');";
           System.out.println(insert6);

    String insert7 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-07', 'J"+id+"', '07', 'SEB', '"+location+"');";
           System.out.println(insert7);

    String insert8 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-08', 'J"+id+"', '08', 'SNB', '"+location+"');";
           System.out.println(insert8);

    String insert9 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-09', 'J"+id+"', '09', 'SWB', '"+location+"');";
           System.out.println(insert9);

    String insert10 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-10', 'J"+id+"', '10', 'NEB', '"+location+"');";
           System.out.println(insert10);

    String insert11 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-11', 'J"+id+"', '11', 'NWB', '"+location+"');";
           System.out.println(insert11);

    String insert12 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-12', 'J"+id+"', '12', 'NSB', '"+location+"');";
           System.out.println(insert12);
    }
}
