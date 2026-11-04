public class MyRun implements Runnable{

    private final String text;

    MyRun(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for (int i = 5; i > 0; i--) {
            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + text);
            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted!");
            }

        }
    }
}
