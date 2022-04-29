/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.builder.builder;

/**
 *
 * @author https://github.com/cbozan
 */
public class CokOzellikliNesne {
    
    private int p1;
    private String p2;
    private boolean p3;
    
    private CokOzellikliNesne(CokOzellikliNesneBuilder builder){
        this.p1 = builder.p1;
        this.p2 = builder.p2;
        this.p3 = builder.p3;
    }

    public int getP1() {
        return p1;
    }

    public String getP2() {
        return p2;
    }

    public boolean isP3() {
        return p3;
    }

    @Override
    public String toString() {
        return "CokOzellikliNesne{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + '}';
    }
    
    
    public static class CokOzellikliNesneBuilder{
        
        private int p1;
        private String p2;
        private boolean p3;
        
        public CokOzellikliNesneBuilder(int p1){
            this.p1 = p1;
        }

        public CokOzellikliNesneBuilder setP2(String p2) {
            this.p2 = p2;
            return this;
        }

        public CokOzellikliNesneBuilder setP3(boolean p3) {
            this.p3 = p3;
            return this;
        }
        
        public CokOzellikliNesne build(){
            return new CokOzellikliNesne(this);
        }
    }
    
    
}
