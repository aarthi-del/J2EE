package springcon;

public class address {
         private int aid;
         private String state;
         private String district;
         private String street;
         
         
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		@Override
		public String toString() {
			return "address [aid=" + aid + ", state=" + state + ", district=" + district + ", street=" + street + "]";
		}
         
}
