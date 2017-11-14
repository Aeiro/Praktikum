public class Truk {
    
    double muatan;
    double muatanmaks;
    
    public Truk (double beratmaks){
        muatanmaks = beratmaks;
    }
    
    public double getMuatan(){
    
        return muatan;
    }
    
    public double getMuatanMaks(){
    
        return muatanmaks;
    }

    public void tambahMuatan (double berat){

        muatan += berat; //muatan = muatan + Berat

        if (muatan >= muatanmaks){ //1100 >= 1000
            muatan -= berat; //muatan = muatan - berat
        }
    }
        
}