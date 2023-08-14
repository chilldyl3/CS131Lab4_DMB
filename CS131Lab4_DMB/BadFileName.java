
//IO TestClass for bad file names
public class BadFileName{
  
  public static void main(String[] args){
    
    FileProcessor fp = new FileProcessor("BadString.txt",10);
		fp.processFile();
  }//end main
  
}//end class
