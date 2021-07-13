package reference;

public class Subject {
	
	String subjectName;		//과목 (국어, 수학, 영어, etc)
	int scorePoint;			//점수 (국어 점수, 수학 점수, 영어 점수, etc)

	public void setKorea (String name, int score) {
		subjectName = name;
		scorePoint = score;
	}
	
	public void setMath (String name, int score) {
		subjectName = name;
		scorePoint = score;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}

}
