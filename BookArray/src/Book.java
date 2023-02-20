class Book { 
    public String title; 
    public String type; 

    public Book(String title, String type) {
        this.title = title; 
        this.type = type; 
    }
    
    public String toString() {
        return String.format("Title: %s, Type: %s", this.title, this.type);
    } 
}