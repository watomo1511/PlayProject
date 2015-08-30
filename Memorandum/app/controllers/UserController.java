package controllers;

import java.util.Map;

import models.accessUser.AccessUser;
import models.accessUser.vo.Password;
import models.accessUser.vo.UserName;
import models.accessUser.vo.UserType;
import play.mvc.Controller;

public class UserController extends Controller {

	public static void create() {
		Map<Integer, String> map = UserType.getUserTypeMap();
		render(map);
	}

	public static void insert(String name, String password, String userType) {
		Integer intValue = UserType.toEnum(userType).getIntValue();
		new AccessUser(new UserName(name), new Password(password), intValue)
				.save();
		create();
	}
}
