/*
 * class holds variables for vehicles counted
 * holds veriables for time/duration a traffic lights will remain green
 * decides which light will open first and longest
 */
package Compute;

public class TrafficLightSet {
                                    //(timeId,juncId)
    SelectCounts select;
    
    //variables that hold number of vehicles
    int carsAt1;
    int carsAt2;
    int carsAt3;
    int carsAt4;
    
    //variables that hold allocated time slot
    public int timeFor1;
    public int timeFor2;
    public int timeFor3;
    public int timeFor4;
    
    //fixed timed slots available
    final int timeLongest = 24;//reps 2mins
    final int timeLong = 18;//reps 1min 30secs
    final int timeMed = 12;//reps 1min
    final int timeShort = 6;//reps 30 secs
    
    
    public TrafficLightSet(int junction){
    select = new SelectCounts(53, junction);
        
    //set number of cars
    carsAt1 = select.VehIn1();
    carsAt2 = select.VehIn2();
    carsAt3 = select.VehIn3();
    carsAt4 = select.VehIn4();
    
        //if 1 2 3 4
        if (carsAt1>carsAt2 && carsAt2>carsAt3 && carsAt3>carsAt4 ){
            timeFor1 = timeLongest;
            timeFor2 = timeLong;
            timeFor3 = timeMed;
            timeFor4= timeShort;
        }
        //if 4 1 2 3
        if (carsAt2>carsAt3 && carsAt3>carsAt4 && carsAt4>carsAt1 ){
            timeFor2 = timeLongest;
            timeFor3= timeLong;
            timeFor4 = timeMed;
            timeFor1 = timeShort;
        }
        //if 3 4 1 2
        if (carsAt3>carsAt4 && carsAt4>carsAt1 && carsAt1>carsAt2 ){
            timeFor3 = timeLongest;
            timeFor4 = timeLong;
            timeFor1 = timeMed;
            timeFor2 = timeShort;
        }
        //if 2 3 4 1
        if (carsAt4>carsAt1 && carsAt1>carsAt2 && carsAt2>carsAt3 ){
            timeFor4 = timeLongest;
            timeFor1 = timeLong;
            timeFor2 = timeMed;
            timeFor3 = timeShort;
        }
        //if 4 3 2 1
        if (carsAt4>carsAt3 && carsAt3>carsAt2 && carsAt2>carsAt1 ){
            timeFor4 = timeLongest;
            timeFor3 = timeLong;
            timeFor2 = timeMed;
            timeFor1 = timeShort;
        }
        //if 3 2 1 4
        if (carsAt3>carsAt2 && carsAt2>carsAt1 && carsAt1>carsAt4 ){
            timeFor3 = timeLongest;
            timeFor2 = timeLong;
            timeFor1 = timeMed;
            timeFor4 = timeShort;
        }
        //if 2 1 4 3
        if (carsAt2>carsAt1 && carsAt1>carsAt4 && carsAt4>carsAt3 ){
            timeFor2 = timeLongest;
            timeFor1 = timeLong;
            timeFor4 = timeMed;
            timeFor3 = timeShort;
        }
        //if 1 4 3 2
        if (carsAt1>carsAt4 && carsAt4>carsAt3 && carsAt3>carsAt2 ){
            timeFor1 = timeLongest;
            timeFor4 = timeLong;
            timeFor3 = timeMed;
            timeFor2 = timeShort;
        }
        //if 1 2 4 3
        if (carsAt1>carsAt2 && carsAt2>carsAt4 && carsAt4>carsAt3 ){
            timeFor1 = timeLongest;
            timeFor2 = timeLong;
            timeFor4 = timeMed;
            timeFor3 = timeShort;
        }
        //if 3 1 4 2
        if (carsAt2>carsAt4 && carsAt4>carsAt1 && carsAt1>carsAt3 ){
            timeFor2 = timeLongest;
            timeFor4 = timeLong;
            timeFor1 = timeMed;
            timeFor3 = timeShort;
        }
        //if 4 3 1 2
        if (carsAt3>carsAt4 && carsAt4>carsAt2 && carsAt2>carsAt1 ){
            timeFor3 = timeLongest;
            timeFor4 = timeLong;
            timeFor2 = timeMed;
            timeFor1 = timeShort;
        }
        //if 2 4 1 3
        if (carsAt3>carsAt1 && carsAt1>carsAt4 && carsAt4>carsAt2 ){
            timeFor3 = timeLongest;
            timeFor1 = timeLong;
            timeFor4 = timeMed;
            timeFor2 = timeShort;
        }//end of "if" time set
    }//end of constructor
    
    public static void main (String args[]){
        TrafficLightSet TLS = new TrafficLightSet(1);
        
        System.out.println(TLS.carsAt1);
        System.out.println(TLS.carsAt2);
        System.out.println(TLS.carsAt3);
        System.out.println(TLS.carsAt4);
        
        System.out.println(TLS.timeFor1);
        System.out.println(TLS.timeFor2);
        System.out.println(TLS.timeFor3);
        System.out.println(TLS.timeFor4);
    }
}
/*if (carsAt>carsAt && carsAt>carsAt && carsAt>carsAt ){
            timeFor = 12000;
            timeFor = 9000;
            timeFor = 6000;
            timeFor = 3000;
        }*/