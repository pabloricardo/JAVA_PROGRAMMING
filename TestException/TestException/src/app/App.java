package app;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            //try-block2
            try{     
                //try-block3
                try{
                    int arr[]= {1,2,3,4};
                    /* I'm trying to display the value of
                     * an element which doesn't exist. The
                     * code should throw an exception
                     */
                    int a = 22/0;
                }catch(ArithmeticException e){
                    System.out.print("hgrgsags" + e.getMessage());
                    try {
                        int adfs = 224;
                    } catch (Exception fsa) {
                        System.out.print("hgrgsags" + fsa.getMessage());
                    }
                }
            }
            catch(ArithmeticException e){
               System.out.print("Arithmetic Exception");
               System.out.println(" handled in try-block2");
            }
        }
        catch(ArithmeticException e3){
            System.out.print("Arithmetic Exception");
             System.out.println(" handled in main try-block");
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.print("ArrayIndexOutOfBoundsException");
             System.out.println(" handled in main try-block");
        }
        catch(Exception e4){
            System.out.print("teste");
        }

    }
}