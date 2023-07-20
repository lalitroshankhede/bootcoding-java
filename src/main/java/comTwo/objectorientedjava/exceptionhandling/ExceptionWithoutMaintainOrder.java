package comTwo.objectorientedjava.exceptionhandling;

public class ExceptionWithoutMaintainOrder {
    public static void main(String[] args) {

        try{
            int a[]=new int[5];
            a[5]=30/0;
        }

//        catch(Exception e)
//        {
//            System.out.println("common task completed");
//        }
//        catch(ArithmeticException e)
//        {                                                 // The Error has been occur because of incorrect order Exceptions
//            System.out.println("task1 is completed");    // Exception is superclass of Arithmetic and ArrayIndexOutofBound exceptions
//        }                                               // so we have to rearrange the order like below
                                                          // 1.ArithmeticExcption
//        catch(ArrayIndexOutOfBoundsException e)         //2. ArrayIndexOutOfBoundException
//        {                                              // 3. Exception
//            System.out.println("task 2 completed");
//        }

        catch (ArithmeticException e) {
            System.out.println("task1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task2 is completed");
        } catch (Exception e) {
            System.out.println("common task completed");
        }



        System.out.println("rest of the code...");

    }
}
