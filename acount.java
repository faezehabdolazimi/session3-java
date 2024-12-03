package ir.isc;

	public class acount implements Comparable<acount>{

		private int balanc;
		private String name;
		private int branch;
			
		public acount(int balanc, String name, int branch) {
			super();
			this.balanc = balanc;
			this.name = name;
			this.branch = branch;
		}

		public int getBalanc() {
			return balanc;
		}

		public void setBalanc(int balanc) {
			this.balanc = balanc;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getBranch() {
			return branch;
		}

		public void setBranch(int branch) {
			this.branch = branch;
		}

		public String toString() {
			return " balanc=" + balanc + ", name=" + name + ", branch=" + branch ;
		}

		public int compareTo(acount o) {
			return o.getBalanc()-this.getBalanc();
		}
	}


