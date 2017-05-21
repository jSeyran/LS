public class RegUSer{
private String nickname;
private String  name,  lastname, phone,  mail, password, ser,  birthday;





        RegUSer() { }
        public RegUSer(String nickname,String password) {
                this.nickname = nickname;
                this.password = password;

        }

public RegUSer(String nickname, String name, String lastname, String phone, String mail, String password, String ser, String birthday) {
        this.nickname = nickname;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.mail = mail;
        this.password = password;
        this.ser = ser;
        this.birthday = birthday;
        }

public String getNickname() {
        return nickname;
        }

public void setNickname(String nickname) {
        this.nickname = nickname;
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public String getLastname() {
        return lastname;
        }

public void setLastname(String lastname) {
        this.lastname = lastname;
        }

public String getPhone() {
        return phone;
        }

public void setPhone(String phone) {
        this.phone = phone;
        }

public String getMail() {
        return mail;
        }

public void setMail(String mail) {
        this.mail = mail;
        }

public String getPassword() {
        return password;
        }

public void setPassword(String password) {
        this.password = password;
        }

public String getSer() {
        return ser;
        }

public void setSer(String ser) {
        this.ser = ser;
        }

public String getBirthday() {
        return birthday;
        }

public void setBirthday(String birthday) {
        this.birthday = birthday;
        }




        }
