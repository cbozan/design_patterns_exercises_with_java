/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.prototype.example;

/**
 *
 * @author https://github.com/cbozan
 */
public abstract class Data {
    
    public int dataNo, dataCategory;
    
    public Data(){}
    
    public Data(int dataNo, int dataCategory){
        this.dataCategory = dataCategory;
        this.dataNo = dataNo;
    }
    
    public Data(Data data){
        this(data.dataNo, data.dataCategory);
    }
    
    public abstract Data clone();
    
     @Override
    public String toString() {
        return "Data{" + "dataNo=" + dataNo + ", dataCategory=" + dataCategory + '}';
    }
    
    
    
}
