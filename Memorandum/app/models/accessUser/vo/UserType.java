package models.accessUser.vo;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum UserType {
	開発(1), 運用(2);

	private Integer intValue;

	private UserType(Integer intValue) {
		this.intValue = intValue;
	}

	public UserType getUserType(Integer intValue) {
		return toEnum(intValue);
	}

	public static UserType toEnum(Integer num) {
		for (UserType type : UserType.values()) {
			if (num == new Integer(type.intValue)) {
				return type;
			}
		}
		return null;
	}

	public static Map<Integer, String> getUserTypeMap() {
		Map<Integer, String> map = new HashMap<>();
		for (UserType type : UserType.values()) {
			map.put(type.intValue, type.toString());
		}
		return map;
	}
}
