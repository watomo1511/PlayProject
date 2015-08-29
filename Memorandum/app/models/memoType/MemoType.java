package models.memoType;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.experimental.Accessors;
import models.memoType.vo.MemoCategory1;
import play.db.jpa.Model;

@Entity(name = "memoType")
@Getter
@Accessors(fluent = true)
public class MemoType extends Model {

	@Embedded
	private MemoCategory1 memoCategory1;

	public MemoType(MemoCategory1 memoCategory1) {
		this.memoCategory1 = memoCategory1;
	}
}
