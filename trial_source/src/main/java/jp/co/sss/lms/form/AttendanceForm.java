package jp.co.sss.lms.form;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import lombok.Data;

/**
 * 勤怠フォーム
 * 
 * @author 東京ITスクール
 */
@Data
public class AttendanceForm {

	/** LMSユーザーID */
	private Integer lmsUserId;
	/** グループID */
	private Integer groupId;
	/** 年間計画No */
	private String nenkanKeikakuNo;
	/** ユーザー名 */
	private String userName;
	/** 退校フラグ */
	private Integer leaveFlg;
	/** 退校日 */
	private String leaveDate;
	/** 退校日（表示用） */
	private String dispLeaveDate;
	/** 中抜け時間(プルダウン) */
	private LinkedHashMap<Integer, String> blankTimes;
	/** 出勤時間(時)(プルダウン) */
	private LinkedHashMap<Integer, String> trainingStartTimeHour;
	/** 出勤時間(分)(プルダウン) */
	private LinkedHashMap<Integer, String> trainingStartTimeMinute;
	/** 出勤時間(時)(プルダウン) */
	private LinkedHashMap<Integer, String> trainingEndTimeHour;
	/** 出勤時間(分)(プルダウン) */
	private LinkedHashMap<Integer, String> trainingEndTimeMinute;
	/** 日次の勤怠フォームリスト */
	private List<DailyAttendanceForm> attendanceList;
	/** エラー */
	private Set<String> ErrorList;
}
