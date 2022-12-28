/**
 * 2) a) Write a program to call default constructor first and then any other constructor in the
class?

 */


class EvenOdd{
    int n;

    EvenOdd(){
        
    }
    void print(){
        System.out.println(n);
    }
    EvenOdd(int num){
        n = num ;
    }
    // void print(){
    //     System.out.println(n);
    // }
}

class constructor{
    public static void main(String[] args) {
        EvenOdd obj1 = new EvenOdd();
        obj1.print();

        EvenOdd obj2 = new EvenOdd(1231321);
        obj2.print();


    }
}
