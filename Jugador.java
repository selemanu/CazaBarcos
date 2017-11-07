/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cazabarcos;

/**
 *
 * @author user
 */
public class Jugador {
    Rejilla r1,r2;
    Barco p[];
    public Jugador(){
     r1 = new Rejilla();
     r2 = new Rejilla();
     
     
    }
    
   public void RejillaD(int a, int al){
       r1.CrearRejilla(a, al);
       r2.CrearRejilla(a, al);
   }
   
   public void BarcosD(int por,int sub,int f,int v){
      this.p=new Barco[por+sub+f+v];
      if(por>0){
          for(int i=0;i<por;i++){
             p[i]=new Barco();
          }
      }
      if(sub>0){
          for(int i=por;i<(sub+por);i++){
             p[i]=new Barco();
          }
      }
      if(f>0){
         for(int i=sub;i<(sub+f);i++){
             p[i]=new Barco();
          } 
      }
      if(v>0){
          for(int i=f;i<(f+v);i++){
             p[i]=new Barco();
          }
      }
      
   }
}
