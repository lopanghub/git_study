package ex.practice.Mar14th;

public class Thread10 {
	public static void main(String[] args) {
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");

		grp1.setMaxPriority(3);
		Thread th1 = new Thread(grp1, "th1");
	}
}
