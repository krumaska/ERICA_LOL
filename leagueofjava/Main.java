import Interface.IFRW;
import ClassSet.ReadWriter.RW;

import java.io.File;

import ClassSet.Content.UserContent;
public class Main {
    public static void main(String[] args){
        File userFile = new File("../leagueofjava/content/data/userdata.gdata");
        UserContent user1 = new UserContent(userFile);
        user1.loadUserList();
        System.out.println(user1.getUserList());
        user1.loadDB();
        System.out.println(user1.getUserData("gold"));
    }
}