package modelo;

public class Mundo {
private Helicoptero hel;
private Hidroavi�n hid;
private Superman sup;
private Ave ave;
private Jet jet;
private Murci�lagos mur;
private Mariposa mar;
public Mundo() {
	hel = new Helicoptero();
	hid = new Hidroavi�n();
	sup = new Superman();
	ave = new Ave();
	jet = new Jet();
	mur = new Murci�lagos();
	mar = new Mariposa();
}
public Helicoptero getHel() {
	return hel;
}
public void setHel(Helicoptero hel) {
	this.hel = hel;
}
public Hidroavi�n getHid() {
	return hid;
}
public void setHid(Hidroavi�n hid) {
	this.hid = hid;
}
public Superman getSup() {
	return sup;
}
public void setSup(Superman sup) {
	this.sup = sup;
}
public Ave getAve() {
	return ave;
}
public void setAve(Ave ave) {
	this.ave = ave;
}
public Jet getJet() {
	return jet;
}
public void setJet(Jet jet) {
	this.jet = jet;
}
public Murci�lagos getMur() {
	return mur;
}
public void setMur(Murci�lagos mur) {
	this.mur = mur;
}
public Mariposa getMar() {
	return mar;
}
public void setMar(Mariposa mar) {
	this.mar = mar;
}
}