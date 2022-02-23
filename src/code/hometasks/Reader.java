package code.hometasks;

public class Reader {
    private String fio;
    private int ticketNumber;
    private String faculty;
    private String dateBirth;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void takeBook(int numberTakenBooks) {
        System.out.println(fio + " took " + numberTakenBooks + " books");
    }

    public void takeBook(String... nameTakenBooks) {

        String takenBooks = "";
        for (int i = 0; i < nameTakenBooks.length; i++) {
            if(i == nameTakenBooks.length - 1 ){ takenBooks += nameTakenBooks[i];}
            else{
            takenBooks += nameTakenBooks[i] + ",";}

        }
        System.out.println(fio + " took " + takenBooks + " books");
    }

public void takeBook(Book... books){

        String takenBooks = "";
        for(int i = 0 ; i < books.length; i++){
            if(i == books.length - 1 ){ takenBooks += books[i].getNameBook();}
            else{
                takenBooks += books[i].getNameBook() + ",";}

        }
    System.out.println(fio + " took " + takenBooks + " books");

}


public void takeBook(Book book){}













}
