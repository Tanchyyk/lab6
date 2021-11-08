package user;

public class UniqueId {
    private static long idCounter = 0;

    public String generateUniqueId(){
        return String.valueOf(idCounter++);
    }

}
