package nestedClass;

public class OuterClass {

        int outerNum1 =10;
    public InnerA innerA = new InnerA();
    public InnerB innerB = new InnerB();
        public OuterClass(){
        }

        public void outerMethodA(){
            System.out.println("Outer class method A");
            innerA.InnerAMethodA();
            innerB.innerBmethodA();
        }
        //inner class 1
    public class InnerA {
            int innerAnum1=20;
        public InnerA() {

        }
        public void InnerAMethodA(){
            System.out.println("Inner A Method A");
        }
    }///Inner A ends
    //inner class 2
    public class InnerB{
            int innerBnum1 = 20;
            public InnerB(){

            }
            public void  innerBmethodA(){
                System.out.println("Inner b method A");
            }
    }//InnerB ends



}// outerclass ends
