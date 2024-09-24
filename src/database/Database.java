package database;

public class Database {

    public static void main(String[] args) {
        ProgressBar pb = new ProgressBar();
        pb.setVisible(true);
        
        try{
            for(int x=0; x<=100; x++){
                Thread.sleep(50);
                pb.lblloading.setText(Integer.toString(x) + "%");
                pb.jProgressBar1.setValue(x);
            }
            
            DatabaseCon dbcon = new DatabaseCon();
            dbcon.setVisible(true);
            pb.setVisible(false);
        }
        catch (Exception ex){
            
        }
    }
    
}
