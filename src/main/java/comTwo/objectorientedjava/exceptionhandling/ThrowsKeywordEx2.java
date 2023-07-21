package comTwo.objectorientedjava.exceptionhandling;

import java.io.IOException;

public class ThrowsKeywordEx2 {

        void method()throws IOException,ClassNotFoundException,RuntimeException {
            throw new IOException("device error");

        }
    }
  class Testthrows2{
        public static void main(String args[]){
            try{
                ThrowsKeywordEx2 m=new ThrowsKeywordEx2();
                m.method();
            }catch(Exception e){System.out.println("exception handled");}

            System.out.println("normal flow...");
        }
    }
