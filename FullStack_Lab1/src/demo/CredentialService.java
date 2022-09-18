package demo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.RandomStringUtils;

public class CredentialService {
	String email;
	String passWord;

	public void generatePassword() {
		String smallLetters = RandomStringUtils.random(2, 97, 122, true, true);
		String capitalLetters = RandomStringUtils.random(2, 65, 90, true, true);

		String numbers = RandomStringUtils.randomNumeric(2);
		String specials = RandomStringUtils.random(2, 33, 47, false, false);
		String totalChars = RandomStringUtils.randomAlphanumeric(2);
		String finalPwd = smallLetters + capitalLetters + numbers + specials + totalChars;
		List<Character> pwdChars = finalPwd.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		Collections.shuffle(pwdChars);
		this.passWord = pwdChars.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.toString();

	}

	public void generateEmailAddress(Employee e, String string) {
		email = e.firstName + e.lastName + string + ".abc.com";
	}

	public void showCredentials() {
		System.out.println("Email --->" + email);
		System.out.println("PassWord --->" + passWord);
	}

}
