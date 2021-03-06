package cn.bean;

public class User {

	/*
	 * create table tbl_admin(             
admin_id int primary key,
username varchar2(50) not null,
pwd varchar2(50) not null,
mail varchar2(50),
phone varchar2(15),
wechat varchar2(50),
invatenum int,
score int default 0,
grade_id int,
foreign key (invatenum) references tbl_admin(admin_id),
foreign key (grade_id) references tbl_grade(grade_id)
);
	 */
	private int admin_id;

	private String username;
	private String pwd;
	private String mail;
	private String phone;
	private String wechat;
	private int invatenum;
	private int score;
	private int grade_id;
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public int getInvatenum() {
		return invatenum;
	}
	public void setInvatenum(int invatenum) {
		this.invatenum = invatenum;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getGrade_id() {
		return grade_id;
	}
	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}
	@Override
	public String toString() {
		return "User [admin_id=" + admin_id + ", username=" + username + ", pwd=" + pwd + ", mail=" + mail + ", phone="
				+ phone + ", wechat=" + wechat + ", invatenum=" + invatenum + ", score=" + score + ", grade_id="
				+ grade_id + "]";
	}
	
	
}
