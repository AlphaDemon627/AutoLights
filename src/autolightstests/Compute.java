/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autolightstests;

import AutoLightsUI.DBConnector;
import AutoLightsUI.LogIn;
import static autolightstests.EncryptionTest.DESEDE_ENCRYPTION_SCHEME;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import org.eclipse.persistence.internal.oxm.conversion.Base64;

/**
 *
 * @author Mido Austin
 */
public class Compute {
    private static int id = getnsetId();
    
    public static void main(String args[]) throws Exception{
       String location = "Bunyala - Haile Selassie";
       add12(id,location);
       
    }
    
    private static void add12(int id, String location){
        Connection con = new DBConnector().connect();
       
       String insert1 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-01', 'J"+id+"', '01', 'SWB', '"+location+"');";
       System.out.println(insert1);
       try {
            PreparedStatement pst = con.prepareStatement(insert1);
            pst.executeUpdate();
            System.out.println("done");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }

        String insert2 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-02', 'J"+id+"', '02', 'SNB', '"+location+"');";
        System.out.println(insert2);
        try {
            PreparedStatement pst = con.prepareStatement(insert2);
            pst.executeUpdate();
            System.out.println("done");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }

        String insert3 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-03', 'J"+id+"', '03', 'SEB', '"+location+"');";
        System.out.println(insert3);
        try {
            PreparedStatement pst = con.prepareStatement(insert3);
            pst.executeUpdate();
            System.out.println("done");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }

        String insert4 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-04', 'J"+id+"', '04', 'WNB', '"+location+"');";
        System.out.println(insert4);
        try {
            PreparedStatement pst = con.prepareStatement(insert4);
            pst.executeUpdate();
            System.out.println("done");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }

        String insert5 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-05', 'J"+id+"', '05', 'WEB', '"+location+"');";
        System.out.println(insert5);
        try {
            PreparedStatement pst = con.prepareStatement(insert5);
            pst.executeUpdate();
            System.out.println("done");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }

    String insert6 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-06', 'J"+id+"', '06', 'WSB', '"+location+"');";
           System.out.println(insert6);
           try {
            PreparedStatement pst = con.prepareStatement(insert6);
            pst.executeUpdate();
            System.out.println("done");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }

    String insert7 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-07', 'J"+id+"', '07', 'SEB', '"+location+"');";
           System.out.println(insert7);
           try {
            PreparedStatement pst = con.prepareStatement(insert7);
            pst.executeUpdate();
            System.out.println("done");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }

    String insert8 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-08', 'J"+id+"', '08', 'SNB', '"+location+"');";
           System.out.println(insert8);
           try {
            PreparedStatement pst = con.prepareStatement(insert8);
            pst.executeUpdate();
            System.out.println("done");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }

    String insert9 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-09', 'J"+id+"', '09', 'SWB', '"+location+"');";
           System.out.println(insert9);
           try {
            PreparedStatement pst = con.prepareStatement(insert9);
            pst.executeUpdate();
            System.out.println("done");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }

    String insert10 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-10', 'J"+id+"', '10', 'NEB', '"+location+"');";
           System.out.println(insert10);
           try {
            PreparedStatement pst = con.prepareStatement(insert10);
            pst.executeUpdate();
            System.out.println("done");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }

    String insert11 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-11', 'J"+id+"', '11', 'NWB', '"+location+"');";
           System.out.println(insert11);
           try {
            PreparedStatement pst = con.prepareStatement(insert11);
            pst.executeUpdate();
            System.out.println("done");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }

    String insert12 = "INSERT INTO `movements` (`movement_id`, `intersection`, `movement`, `direction`, `location`) VALUES ('J"+id+"-12', 'J"+id+"', '12', 'NSB', '"+location+"');";
           System.out.println(insert12);
           try {
            PreparedStatement pst = con.prepareStatement(insert12);
            pst.executeUpdate();
            System.out.println("done");
        } catch (SQLException ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
    
    private static int getnsetId(){
        String querry = "SELECT movement_id FROM `movements` ORDER BY movement_id DESC LIMIT 1;";
        Connection con = new DBConnector().connect();
        String idGet="";
        
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(querry);
            ResultSet rs = pst.executeQuery();
                while(rs.next()){
                 idGet = rs.getString("movement_id");
                }
            System.out.println(idGet);
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        id = (Integer.decode(idGet.substring(1, 2)))+1;
        return id;
    }

}
