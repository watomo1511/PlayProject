package models.accessUser;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.experimental.Accessors;
import models.accessUser.vo.Password;
import models.accessUser.vo.UserName;
import play.db.jpa.Model;

@Entity(name = "accessUser")
@Getter
@Accessors(fluent = true)
public class AccessUser extends Model {

	@Embedded
	private UserName userName;

	@Embedded
	private Password password;

	public AccessUser(UserName userName, Password password) {
		this.userName = userName;
		this.password = password;
	}

}
