package kr.or.bit;

public class TeamQuiz {
	private String[] arr = new String[5];
	private String name;
	private String genre;
	private String director;
	private String actor;
	private String year;
	
	public TeamQuiz(String name) {
		this.name=name;
	}
	public void arr() {
		arr[0]=name;
		arr[1]=genre;
		arr[2]=actor;
		arr[3]=director;
		arr[4]=year;
	}
	public void MoiveInfo() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	}


