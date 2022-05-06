/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.prototype.example;

import java.util.ArrayList;

/**
 *
 * @author https://github.com/cbozan
 */
public class UserData implements Cloneable {

    ArrayList<String[]> userData;
    ArrayList<String[]> userMetaData;

    public UserData() {
        userData = new ArrayList<>();
        userMetaData = new ArrayList<>();
        getUserDataFromDB();
    }
    
    public UserData(ArrayList<String[]> userData, ArrayList<String[]> userMetaData){
        setUserData(userData);
        setUserMetaData(userMetaData);
    }

    public void getUserDataFromDB() {
        
        // DataBase operations for userData table
        // userData için veri tabanı işlemleri gerçekleştiriliyor (varsayılan)
        userData.add(new String[]{"Row1-col1", "Row1-col2", "Row1-col3"});
        userData.add(new String[]{"Row2-col1", "Row2-col2", "Row2-col3"});
        userData.add(new String[]{"Row3-col1", "Row3-col2", "Row3-col3"});
        
        // DataBase operations for UserMetaData table
        // userMetaData için veri tabanı işlemleri gerçekleştiriliyor (varsayıyoruz)
        userMetaData.add(new String[]{"Row1-col1", "Row1-col2"});
        userMetaData.add(new String[]{"Row2-col1", "Row2-col2"});
        userMetaData.add(new String[]{"Row3-col1", "Row3-col2"});
        
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ArrayList<String[]> tempUserData = new ArrayList<>();
        ArrayList<String[]> tempUserMetaData = new ArrayList<>();
        
        // copy userData
        // userData verilerinin kopyalanması
        for(String[] row : getUserData()){
            tempUserData.add(new String[row.length]);
            for(int i = 0; i < row.length; i++){
                tempUserData.get(tempUserData.size() - 1)[i] = row[i];
            }
        }
        
        // copy userMetaData
        // userMetaData verilerinin kopyalanması
        for(String[] row : getUserMetaData()){
            tempUserMetaData.add(new String[row.length]);
            for(int i = 0; i < row.length; i++){
                tempUserMetaData.get(tempUserMetaData.size() - 1)[i] = row[i];
            }
        }
        
        // create new object without db connection
        // Veri tabanı bağlantısı olmadan yeni nesnesimizi oluşturuyoruz (mevcut verilerle)
        return new UserData(tempUserData, tempUserMetaData);
    }

    public ArrayList<String[]> getUserData() {
        return userData;
    }

    public void setUserData(ArrayList<String[]> userData) {
        this.userData = userData;
    }

    public ArrayList<String[]> getUserMetaData() {
        return userMetaData;
    }

    public void setUserMetaData(ArrayList<String[]> userMetaData) {
        this.userMetaData = userMetaData;
    }

    

    
}
