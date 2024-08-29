public class TipeDataString {
    public static void main(String[] args) {
        // perbedaan primitive dan non primitive
        // null itu value bkn tipe data

        String firstName = "Rosintan";
        String lastName = "Sitinjak";

        //concat
        // String fullName = firstName + " " + lastName;
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);
    }
}
