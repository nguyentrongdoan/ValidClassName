public class ClassRoomTest {
    public static final String[] validAccount = new String[] {"A1234G", "C4567K", "P8977L"};
    public static final String[] invalidAccount = new String[] {"B2334O", "A345M", "P2afgL"};

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();
        for (String classname: validAccount){
            boolean invalid = classRoom.validate(classname);
            System.out.println("class name is" + classname + "is valid" + invalid);
        }
        for (String classname: invalidAccount){
            boolean invalid = classRoom.validate(classname);
            System.out.println("class name is" + classname + "is valid" + invalid);
        }
    }
}
