package jdbc;

public class StudentTo {
	
		private String sid;
		private String sname;
		private String city;
		
		
		public StudentTo(String sid, String sname, String city) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.city = city;
		}

		public StudentTo() {
			super();
		}

		public String getSid() {
			return sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public String toString() {
			return "StudentTo [sid=" + sid + ", sname=" + sname + ", city=" + city + "]";
		}
		
	}

