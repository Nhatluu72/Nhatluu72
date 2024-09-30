public class Encyclopedia extends Book {
   // TODO: Declare private fields
  
		private String edition;
		private int numPages;
		
		public Encyclopedia() {
			
			edition = "null";
			numPages = 0;
			
		}
   
    // TODO: Define mutator methods - 
   //       setEdition(), setNumPages()
  // TODO: Define accessor methods -
 //       getEdition(), getNumPages()
		public void setEdition(String newEdition) {
			edition = newEdition;
		}
		public String getEdition() {
			return edition;
		}
		public void setNumPages(int newNumPages) {
			if(newNumPages > 0) {
				numPages = newNumPages;
			}
		}
		public int getNumPages() {
			return numPages;
		}
   
   
   // TODO: Define a printInfo() method that overrides 
   //       the printInfo in Book class 
		
		public void printInfo() {
			System.out.println("Book Information: ");
		    System.out.println("   Book Title: " + title);
		    System.out.println("   Author: " + author);
		    System.out.println("   Publisher: " + publisher);
            System.out.println("   Publication Date: " + publicationDate);
            System.out.println("   Edition: " + edition);
            System.out.println("   Number of Pages: " + numPages);
		}
		
   
}