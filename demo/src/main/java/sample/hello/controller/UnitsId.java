package sample.hello.controller;

public class UnitsId {
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tekitou [arm=" + arm + ", rear=" + rear + ", leg=" + leg + ", sub=" + sub + "]";
	}
	private Integer arm;
	private Integer rear;
	private Integer leg;
	private Integer sub;
	/**
	 * @return arm
	 */
	public Integer getArm() {
		return arm;
	}
	/**
	 * @param setArm セットする arm
	 */
	public void setArm(Integer setArm) {
		arm = setArm;
	}
	/**
	 * @return rear
	 */
	public Integer getRear() {
		return rear;
	}
	/**
	 * @param setRear セットする rear
	 */
	public void setRear(Integer setRear) {
		rear = setRear;
	}
	/**
	 * @return leg
	 */
	public Integer getLeg() {
		return leg;
	}
	/**
	 * @param setLeg セットする leg
	 */
	public void setLeg(Integer setLeg) {
		leg = setLeg;
	}
	/**
	 * @return sub
	 */
	public Integer getSub() {
		return sub;
	}
	/**
	 * @param setSub セットする sub
	 */
	public void setSub(Integer setSub) {
		sub = setSub;
	}
}