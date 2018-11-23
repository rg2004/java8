/**
 * Created by rohit on 8/1/2017.
 */
public class EvenOddPrinter {

    public static void main(String[] args) {
        SharedNumber sharedNumber = new SharedNumber(1);
        Thread evenNumber = new Thread(new EvenPrintingThread(sharedNumber));
        Thread oddNumber = new Thread(new OddPrintingThread(sharedNumber));

        evenNumber.start();
        oddNumber.start();
    }
}

class EvenPrintingThread implements Runnable{

    SharedNumber cnt;

    EvenPrintingThread(SharedNumber cnt)
    {
       this.cnt = cnt;
    }

    @Override
    public void run() {

        while(cnt.getCount()<=10)
        {
            synchronized (cnt){
                try {
                    if(cnt.getCount()%2==0) {
                        System.out.println("printing even" + cnt.getCount());
                        cnt.incrementCount();
                        cnt.notify();
                    }
                    else
                        cnt.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}

class OddPrintingThread implements Runnable{

    SharedNumber cnt;

    OddPrintingThread(SharedNumber cnt)
    {
        this.cnt = cnt;
    }
    @Override
    public void run() {
        while(cnt.getCount()<=10)
        {
            synchronized (cnt){
                try {
                    if(cnt.getCount()%2!=0) {
                        System.out.println("printing odd" + cnt.getCount());
                        cnt.incrementCount();
                        cnt.notify();

                    }
                    else
                        cnt.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class SharedNumber {

    int count = 0;

    SharedNumber(int count)
    {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        this.count = count+1;
    }
}