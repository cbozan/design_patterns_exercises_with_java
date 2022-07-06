/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.prototype.example;

/**
 *
 * @author https://github.com/cbozan
 */
public class SuperUserData extends Data{
    
    int superUserId, branchId;
    
    public SuperUserData(){}
    
    public SuperUserData(int superUserId, int branchId){
        this.superUserId = superUserId;
        this.branchId = branchId;
    }
    
    public SuperUserData(SuperUserData superUserData){
        super(superUserData);
        this.branchId = superUserData.branchId;
        this.superUserId = superUserData.superUserId;
    }
    
    @Override
    public Data clone() {
        return new SuperUserData(this);
    }

    @Override
    public String toString() {
        return super.toString() + " | SuperUserData{" + "superUserId=" + superUserId + ", branchId=" + branchId + '}';
    }
    
    
  
}
