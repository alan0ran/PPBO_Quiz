/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Division;
import Interface.Division;

/**
 *
 * @author Radiv
 */
public class Web implements Division {
    private double writeScore, codeScore, interviewScore;
    
    public Web (double WriteScore, double CodeScore, double InterviewScore) {
        writeScore = WriteScore;
        codeScore = CodeScore;
        interviewScore = InterviewScore;
    }
    
    public double getWriteScore() {
        return writeScore;
    }
    public void setWriteScore(double writeScore) {
        this.writeScore = writeScore;
    }
    public double getCodeScore() {
        return codeScore;
    }
    public void setCodeScore(double codeScore) {
        this.codeScore = codeScore;
    }
    public double getInterviewScore() {
        return interviewScore;
    }
    public void setInterviewScore(double interviewScore) {
        this.interviewScore = interviewScore;
    }
    
    @Override
    public double result() {
        return (writeScore*40/100)+(codeScore*35/100)+(interviewScore*25/100);
    }
    @Override
    public String information(double result) {
        if (result >= 85) {
            return "PASSED";
        }
        
        else {
            return "FAILED";
        }
    }
}
