package generic;

public class User implements Comparable<User>{

    private int dickSize;
    private String userName;

    public User (int dickSize, String userName) {
        this.userName = userName;
        this.dickSize = dickSize;
    }

    public void setDickSize (int dickSize) {
        this.dickSize = dickSize;
    }

    public int getDickSize() {
        return dickSize;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "dickSize=" + dickSize +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        if(this.dickSize > o.dickSize) return 1;
        if(this.dickSize < o.dickSize) return -1;
        return 0;
    }
}
