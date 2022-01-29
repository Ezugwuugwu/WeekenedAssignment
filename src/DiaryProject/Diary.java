package DiaryProject;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String ownerName;
    private ArrayList <Gist> gists = new ArrayList<>();
    private String password;

    public Diary(String password, String ownerName){
        if (password == null){
            throw new IllegalArgumentException("invalid password");
        }
        this.password = password;
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<Gist> getGists(String userPassword) {
        if(userPassword.equals(password)) {
            return gists;
        }
        throw new IllegalArgumentException("invalid password");
    }

    public void setGists(ArrayList<Gist> gists) {

        this.gists = gists;
    }


    public void setPassword(String password) {
        if (password == null && checkPassword(password) )
            this.password = password;
        if (password != null) this.password = password;

    }

    public String getPassword() {
        return password;
    }

    private boolean checkPassword(String passWord){
        return (password.length() > 3 && password.length() < 12)
                && !(password.contains(" "));
    }

    public void addNewGist(String title, String gistProper,String secretKey) {
        if (secretKey.equals(password)){
            Gist gist = new Gist(title,gistProper);
            gists.add(gist);
        }
        else {
            throw new IllegalArgumentException("invalid password");
        }
    }

    public Gist findGistByTitle(String gistTitle){
        for (Gist gist: gists) {
            if (gist.getTitle().equalsIgnoreCase(gistTitle))
                return  gist;
        }
        throw new IllegalArgumentException("Gist not found");
    }

    public void getAllEntry(){
        for (Gist gist : gists){
            System.out.println(gist);
        }
    }
}
