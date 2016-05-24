package Praktikum_GUI;

public abstract class MatKul {

    protected double tugas, quiz, uts, uas, hasil;

    public abstract double getHasil();

    public abstract void setHasil();

    public void setTugas(double t) {
        this.tugas = t;
    }

    public void setQuiz(double q) {
        this.quiz = q;
    }

    public void setUTS(double ut) {
        this.uts = ut;
    }

    public void setUAS(double ua) {
        this.uas = ua;
    }

    public double getTugas() {
        return tugas;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUTS() {
        return uts;
    }

    public double getUAS() {
        return uas;
    }
}