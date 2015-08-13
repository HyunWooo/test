package test.eleven;

public class User {

	private String 주민번호;

	public User(String 주민번호) {

		this.주민번호 = 주민번호;

	}

	@Override
	public boolean equals(Object o) {

		if (o == null)
			return false;

		if (this.getClass() != o.getClass())
			return false;

		User target = (User) o;

		return this.주민번호.equals(target.주민번호);

	}

}
