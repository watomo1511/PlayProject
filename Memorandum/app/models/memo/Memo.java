package models.memo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.experimental.Accessors;
import models.accessUser.AccessUser;
import models.memo.vo.CreateDate;
import models.memo.vo.MemoContent;
import models.memo.vo.MemoName;
import models.memoType.MemoType;

import org.joda.time.DateTime;

import play.db.jpa.Model;

@Getter
@Accessors(fluent = true)
@Entity(name = "memo")
public class Memo extends Model {

	@ManyToOne
	@JoinColumn(name = "userId")
	private AccessUser accessUser;

	@ManyToOne
	@JoinColumn(name = "memoTypeId")
	private MemoType memoType;

	@Embedded
	private MemoName memoName;

	@Embedded
	private MemoContent memoContent;

	@Embedded
	private CreateDate createDate;

	/* コンストラクタ* */
	public Memo(MemoType memoType, AccessUser accessUser, MemoName memoName,
			MemoContent memoContent) {
		this.memoType = memoType;
		this.accessUser = accessUser;
		this.memoName = memoName;
		this.memoContent = memoContent;
		this.createDate = new CreateDate(new DateTime());
	}
}
