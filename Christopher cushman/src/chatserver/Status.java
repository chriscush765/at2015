package chatserver;

public enum Status {
	EXIT, NAME_ACCEPTED, REQUEST_NAME;

	@Override
	public String toString() {
		return "STATUS::"+this.name();
	}
}