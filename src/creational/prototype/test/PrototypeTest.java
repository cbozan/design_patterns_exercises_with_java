/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.prototype.test;

import creational.prototype.example.UserData;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author https://github.com/cbozan
 */
public class PrototypeTest {
    
    
    public static void main(String[] args) throws CloneNotSupportedException {
        
        //ilk nesne oluşturulma aşaması veri tabanı bağlantısı sağlanacak
        // initial object creation (will use the db connection)
        UserData userDataOriginal = new UserData();
        
        // clone original
        UserData userDataCopy1 = (UserData) userDataOriginal.clone();
        userDataCopy1.getUserData().add(new String[]{"added later copy1", "added later copy1"});
        userDataCopy1.getUserData().add(new String[]{"added later copy1", "added later", "added later", "added later"});
        
        // clone copy1
        UserData userDataCopy2 = (UserData) userDataCopy1.clone();
        
        // delete last element (array)
        // listedeki son elemanı (diziyi) sil
        userDataCopy2.getUserData().remove(userDataCopy2.getUserData().size() - 1); 
        userDataCopy2.getUserMetaData().add(new String[]{"added later copy2", "akdsjfkj"});
        
        System.out.println("Original data\n");
        myPrint(userDataOriginal);
        
        System.out.println("\n\nCopy-1 data\n\n");
        myPrint(userDataCopy1);
        
        System.out.println("\n\nCopy-2 data\n\n");
        myPrint(userDataCopy2);
        
        System.out.println("\n\n");
        
    }
    
    public static void myPrint(UserData userData){
        
        System.out.println("\tuserData\n");
        for(String[] row : userData.getUserData()){
            System.out.print("\t\t");
            for(int col = 0; col < row.length; col++){
                System.out.print(row[col] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.println("\tuserMetaData\n");
        for(String[] row : userData.getUserMetaData()){
            System.out.print("\t\t");
            for(int col = 0; col < row.length; col++){
                System.out.print(row[col] + "\t");
            }
            System.out.println();
        }
        
    }
    
    
    
    
    
}
