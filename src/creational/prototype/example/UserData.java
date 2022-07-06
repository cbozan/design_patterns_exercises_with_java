/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.prototype.example;

/**
 *
 * @author https://github.com/cbozan
 */
public class UserData extends Data{
    
    int normalUserId, taskId;
    
    public UserData(){}
    
    public UserData(int normaluserId, int taskId){
        this.normalUserId = normaluserId;
        this.taskId = taskId;
    }
    
    public UserData(UserData userData){
        super(userData);
        this.normalUserId = userData.normalUserId;
        this.taskId = userData.taskId;
    }
    
    @Override
    public Data clone() {
        return new UserData(this);
    }

    @Override
    public String toString() {
        return super.toString() + " | UserData{" + "normalUserId=" + normalUserId + ", taskId=" + taskId + '}';
    }
    
}
